import React from 'react';
import {BrowserRouter as Router, Link, Route, Routes} from 'react-router-dom';
import './App.css';
import Home from './pages/Home';
import Products from './pages/Products';
import About from './pages/About';
import Contact from './pages/Contact';

function App() {
    const handleTestButtonClick = async () => {
        try {
            const response = await fetch('http://localhost:8080/test');
            const data = await response.json();
            console.log('백엔드에서 가져온 데이터:', data);
        } catch (error) {
            console.error('API 요청 중 에러가 발생했습니다:', error);
        }
    };

    return (
        <Router>
            <div className="App">
                {/* Header */}
                <header className="App-header">
                    <h1>Mini Market</h1>
                    <nav>
                        <ul>
                            <li><Link to="/">Home</Link></li>
                            <li><Link to="/products">Products</Link></li>
                            <li><Link to="/about">About Us</Link></li>
                            <li><Link to="/contact">Contact</Link></li>
                        </ul>
                    </nav>
                    <button onClick={handleTestButtonClick}>백엔드 테스트 요청</button>
                </header>

                {/* Main Content */}
                <main>
                    <Routes>
                        <Route path="/" element={<Home />} />
                        <Route path="/products" element={<Products />} />
                        <Route path="/about" element={<About />} />
                        <Route path="/contact" element={<Contact />} />
                    </Routes>
                </main>

                {/* Footer */}
                <footer className="App-footer">
                    <p>&copy; 2024 Mini Market. All rights reserved.</p>
                </footer>
            </div>
        </Router>
    );
}

export default App;
