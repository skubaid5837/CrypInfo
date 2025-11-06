# CrypInfo

CrypInfo is an Android application built using Kotlin and Clean Architecture (MVVM) that provides real-time information about cryptocurrencies.  
It demonstrates best practices in Android development with a layered architecture, Jetpack libraries, and a modern UI design.

---

## Features

- Real-time Cryptocurrency Data — View live prices and market changes.
- Search Functionality — Quickly find details about any cryptocurrency.
- Market Trends — Track top gainers, losers, and market performance.
- Clean Architecture — Clear separation between data, domain, and presentation layers.
- Offline Support (if implemented) — Cache crypto data locally.
- Modern UI — Built using Jetpack Compose or Material Design components.
- API Integration — Fetches live data from a public crypto API.

---

## Project Architecture

The project follows Clean Architecture + MVVM, ensuring:
- Scalability
- Testability
- Maintainability

```
app/
 ├── data/
 │   ├── model/          # Data models (DTOs)
 │   ├── remote/         # Retrofit services and API handling
 │   ├── repository/     # Repository implementations
 │
 ├── domain/
 │   ├── model/          # Domain models (used in use-cases)
 │   ├── repository/     # Repository interfaces
 │   ├── use_case/       # Business logic
 │
 ├── presentation/
 │   ├── ui/             # Compose UI or XML layouts
 │   ├── viewmodel/      # ViewModels (state management)
 │
 ├── di/                 # Dependency Injection (Hilt/Koin)
 └── utils/              # Helper classes and extensions
```

---

## Tech Stack

| Category | Technology |
|-----------|-------------|
| Language | Kotlin |
| Architecture | Clean Architecture (MVVM) |
| Networking | Retrofit |
| Dependency Injection | Hilt |
| Coroutines | Kotlin Coroutines + Flow |
| UI | Jetpack Compose |
| Navigation | Jetpack Navigation |

---

## API Used

- [CoinGecko API](https://www.coingecko.com)

---

## Learning Highlights

This project demonstrates:
- Modular and clean code structure.
- Reactive state management with Kotlin Flow.
- Repository pattern and use-case separation.
- Proper dependency management using Hilt.
- Error handling and network state management.
- Following Android development best practices.

---

## Contributing

Contributions, issues, and feature requests are welcome.  
Feel free to open a pull request or report bugs in the [Issues](https://github.com/skubaid5837/CrypInfo/issues) section.

---

## Author

Ubaidur Rahman Shaikh  
Android Developer (Kotlin | Java)
Email: sk.ubaid.connect@gmail.com  
