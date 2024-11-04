# Mini Market - 쇼핑몰 프로젝트

Mini Market은 간단한 쇼핑몰 웹 애플리케이션입니다. 이 프로젝트는 React와 Spring Boot를 연동하여 프론트엔드와 백엔드 간의 테스트 통신을 구현하고, 기본적인 쇼핑몰 메인 페이지를 제공하는 것을 목표로 합니다.

## 주요 기능
- **홈 페이지**: 쇼핑몰의 소개 및 메인 배너를 포함한 홈 페이지입니다.
- **상품 목록**: 쇼핑몰에 등록된 상품들을 카드 형식으로 나열합니다.
- **백엔드 테스트 통신**: 백엔드와 통신을 테스트할 수 있는 버튼이 포함되어 있습니다.
- **네비게이션**: `Home`, `Products`, `About Us`, `Contact`와 같은 페이지로 이동할 수 있는 네비게이션 메뉴를 제공합니다.

## 기술 스택
- **프론트엔드**: React, JavaScript, HTML, CSS
- **백엔드**: Spring Boot
- **라우팅**: React Router
- **HTTP 통신**: `fetch`를 사용하여 백엔드와의 통신 구현

## 설치 및 실행 방법

### 1. 백엔드 (Spring Boot)
1. Java 11 이상과 Maven이 설치되어 있어야 합니다.
2. 프로젝트 디렉토리로 이동한 후, 다음 명령어를 사용하여 백엔드를 실행합니다:

   ```sh
   mvn spring-boot:run
   ```
3. 기본적으로 `http://localhost:8080`에서 실행됩니다.

### 2. 프론트엔드 (React)
1. Node.js가 설치되어 있어야 합니다.
2. 프로젝트의 `client` 디렉토리로 이동하여 필요한 패키지를 설치합니다:

   ```sh
   npm install
   ```
3. 개발 서버를 시작합니다:

   ```sh
   npm start
   ```
4. 기본적으로 `http://localhost:3000`에서 실행됩니다.

## 폴더 구조
- `src/pages`: 각 페이지에 대한 컴포넌트 (`Home`, `Products`, `About`, `Contact`)를 포함합니다.
- `public/index.html`: React 애플리케이션의 루트 HTML 파일입니다.
- `src/App.js`: 주요 애플리케이션 컴포넌트로, 페이지 라우팅 및 기본 레이아웃을 정의합니다.

## 사용된 주요 라이브러리
- **React Router**: 페이지 간 라우팅을 위해 사용됩니다.
  ```sh
  npm install react-router-dom
  ```
- **Spring Boot**: 백엔드 서버를 생성하여 API를 제공합니다.

## 페이지 설명
- 
- 
- 
-

## CORS 설정
프론트엔드와 백엔드의 로컬 서버가 서로 다른 포트를 사용하므로 CORS 설정이 필요합니다. Spring Boot 백엔드에 다음과 같은 설정을 추가하여 CORS 문제를 해결했습니다:

```java
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
```

## 실행
1. `npm start` 명령어로 프론트엔드 개발 서버를 실행하고 `http://localhost:3000`으로 이동


## 향후 개선 사항
- 
- 
- 

