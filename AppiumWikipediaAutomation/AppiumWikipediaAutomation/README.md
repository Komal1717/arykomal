# Appium Android Automation (UIAutomator2 + Java)

## Overview
This project automates the Wikipedia open-source Android app using Appium, Java, and the UiAutomator2 driver.

## Prerequisites
- Java 8 or above
- Maven
- Android Studio (for emulator)
- Appium Server Desktop
- Node.js (for Appium CLI, optional)

## Setup Instructions

### 1. Clone Repository
```bash
git clone https://github.com/your-username/appium-wikipedia-automation.git
cd appium-wikipedia-automation
```

### 2. Download Wikipedia APK
- Visit: https://f-droid.org/en/packages/org.wikipedia/
- Place the APK inside `resources/` folder.

### 3. Start Emulator
```bash
# Create an AVD if not already done
$ANDROID_HOME/emulator/emulator -list-avds
$ANDROID_HOME/emulator/emulator -avd <your-avd-name>
```

### 4. Start Appium Server
- Either via Appium Desktop or CLI:
```bash
appium
```

### 5. Run Tests
```bash
mvn clean test
```

## Folder Structure
```
src/main/java
├── base
│   └── DriverFactory.java
└── tests
    └── WikipediaTest.java
resources/
└── Wikipedia.apk
```

## Notes
- Ensure the AVD is online or connect your Android device with USB debugging.
- Update `DEVICE_NAME` in `DriverFactory.java` based on your emulator/device.
- You can expand test cases for login, onboarding, etc.

---
Happy Testing 🚀