package com.example.minimarket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//    CORS 설정: 글로벌한 CORS 정책을 설정.
//    정적 리소스 핸들링: 정적 파일의 위치와 접근 경로 설정.
//    인터셉터 등록: 요청을 가로채고 전처리/후처리 작업을 수행하는 인터셉터 설정.
//    뷰 리졸버 설정: 뷰 파일의 경로와 접두사, 접미사 설정.
//    메시지 컨버터 추가: JSON, XML 등을 위한 컨버터 설정.
//    포맷터/컨버터 등록: 데이터 변환을 위한 커스텀 포맷터나 컨버터 추가.
//    다국어 지원: 기본 Locale을 설정하여 다국어 지원 가능.

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 경로에 대해 CORS 설정 적용
                .allowedOrigins("http://localhost:3000") // React 개발 서버의 URL을 허용
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 허용할 HTTP 메서드 지정
                .allowedHeaders("*") // 모든 헤더 허용
                .allowCredentials(true); // 쿠키나 인증 정보 사용을 허용
    }

    // 정적 리소스 핸들링 설정
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }

    // 메시지 컨버터 설정 (현재 사용하지 않으므로 주석 처리)
    /*
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter());
    }
    */

    // 포맷터 및 컨버터 등록 (현재 사용하지 않으므로 주석 처리)
    /*
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToLocalDateConverter());
    }
    */

    // 인터셉터 등록 (현재 사용하지 않으므로 주석 처리)
    /*
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomInterceptor())
                .addPathPatterns("/**") // 모든 요청에 대해 인터셉터 적용
                .excludePathPatterns("/login", "/error"); // 특정 경로 제외
    }
    */


}
