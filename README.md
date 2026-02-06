# java-ac4y-service-common

Common service domain classes - request/response types, session, user, bulk operations, and generated base classes.

## Maven Dependency

```xml
<dependency>
    <groupId>ac4y</groupId>
    <artifactId>ac4y-service-common</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Overview

Provides common service domain types:
- **Request types:** ByGUIDRequest, ByPersistentIDRequest, WhereRequest, FilenameRequest, PathRequest
- **Response types:** CountResponse, GUIDResponse, FloatResultResponse, PersistentIDResponse, BulkProcessResponse
- **Session/User:** Ac4ySession, Ac4yUser
- **Generated base classes:** GAc4yResponse, GAc4ySession, GAc4yUser, etc.

## Dependencies

- `ac4y:ac4y-base:1.1.0`
- `ac4y:ac4y-context:1.0.0`
- `ac4y:ac4y-service-domain:1.0.0`

## Build

```bash
mvn clean install
```

## Origin

Extracted from `IJAc4yServiceModule/Ac4yServiceCommon` module.

---
**Version:** 1.0.0
