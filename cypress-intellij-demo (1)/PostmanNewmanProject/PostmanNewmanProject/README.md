# API Testing with Postman + Newman

## Overview
This project demonstrates how to run API tests using Postman and Newman (Postman's CLI tool), integrated with GitHub Actions for continuous testing.

## Tools Used
- Postman (for creating API collections)
- Newman (to run collections from CLI)
- GitHub Actions (for CI integration)

## APIs Tested
- [ReqRes API](https://reqres.in)

## Setup & Run Locally

### 1. Install Newman
```bash
npm install -g newman
```

### 2. Run Tests
```bash
newman run postman/dummy-api-collection.json
```

## GitHub Actions Integration

GitHub Actions workflow is triggered on every push to the main branch. It installs Newman and runs the collection.

## Directory Structure
```
postman/
└── dummy-api-collection.json

.github/workflows/
└── run-newman-tests.yml
```

---
Happy API Testing!