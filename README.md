# 🚗 Vehicle Telematics & Diagnostics Emulator

A Java-based simulation of a vehicle telematics system that generates real-time vehicle sensor data, processes telemetry information, and applies diagnostic rules to detect abnormal vehicle conditions such as overspeeding and engine overheating.

## 📌 Overview

Modern vehicles continuously collect and analyse sensor data to improve safety, performance, and maintenance. This project emulates a basic telematics system by simulating vehicle sensors and processing their data using a rule-based diagnostic engine.

The application demonstrates object-oriented programming principles and modular software design using Java.

---

## ✨ Features

- Simulates real-time vehicle sensor data
- Generates vehicle speed and engine temperature readings
- Processes telemetry using a diagnostic processor
- Rule-based detection of abnormal conditions
- Console-based monitoring system
- Modular package structure following OOP principles

---

## 🏗️ Project Structure

```
VehicleTelematics/
│
├── src/
│   ├── main.java
│   ├── model/
│   │   └── VehicleData.java
│   ├── processor/
│   │   └── DiagnosticProcessor.java
│   ├── rule/
│   │   └── RuleEngine.java
│   └── sensor/
│       ├── SpeedSensor.java
│       └── TemperatureSensor.java
```

---

## ⚙️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Packages
- Random Data Generation
- Rule-Based Processing

---

## 🚀 How It Works

1. Sensor modules generate simulated vehicle data.
2. The generated data is stored in a VehicleData object.
3. The Diagnostic Processor receives the telemetry data.
4. The Rule Engine evaluates predefined conditions.
5. Alerts are displayed when abnormal conditions are detected.

---

## 📋 Example Output

```
Vehicle Telematics Monitoring

Speed        : 117 km/h
Temperature  : 108°C

Status:
CRITICAL
- Overspeed Detected
- Engine Overheating

----------------------------------------
```

---

## 📖 Diagnostic Rules

| Condition | Alert |
|-----------|-------|
| Speed > 100 km/h | Overspeed Warning |
| Temperature > 100°C | Engine Overheating |
| Both conditions | Critical Alert |

---

## 🎯 Learning Outcomes

This project demonstrates:

- Java programming fundamentals
- Object-Oriented Programming (OOP)
- Package organisation
- Modular software architecture
- Rule-based decision making
- Simulation of real-time telemetry systems

---

## 🔮 Future Enhancements

- GPS location simulation
- Fuel level monitoring
- Engine RPM simulation
- Battery health monitoring
- Live dashboard using JavaFX
- CSV/JSON log generation
- REST API integration
- Database storage
- MQTT/Socket-based telemetry transmission

---

## 👨‍💻 Author

**Hemanth Raj D**

- GitHub: https://github.com/hemanthrajd-cyber
- LinkedIn: https://www.linkedin.com/in/hemanthraj-devan

---
