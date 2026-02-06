# java-ac4y-service-common - Architektúra Dokumentáció

## Áttekintés

Közös service domain osztályok gyűjteménye. Request/response típusok, session, user és generált alap osztályok.

**Verzió:** 1.0.0
**Java verzió:** 1.8
**Szervezet:** ac4y-auto

## Fő Komponensek

### Request típusok
- `ByGUIDRequest` - GUID alapú keresés
- `ByPersistentIDRequest` - Persistent ID alapú keresés
- `WhereRequest` - WHERE feltétel
- `FilenameRequest` - Fájlnév alapú kérés
- `PathRequest` - Útvonal alapú kérés

### Response típusok
- `CountResponse` - Számláló válasz (default: -2)
- `GUIDResponse` - GUID válasz
- `FloatResultResponse` - Float eredmény
- `PersistentIDResponse` - Persistent ID válasz
- `BulkProcessResponse` - Tömeges feldolgozás eredménye

### Session/User
- `Ac4ySession` - Session entitás
- `Ac4yUser` - User entitás
- `Ac4yBulkProcessResult` - Tömeges eredmény (total/success/failed/nothingHappened)

### Generált osztályok (`generated` csomag)
- `GAc4yResponse` - Alap válasz (message, description, code, threadID)
- `GAc4yServiceEnvelope` - Service boríték (threadID, service)
- `GAc4yServiceMessageCommon` - Közös üzenet alap
- `GAc4yServiceRequestCommon` - Közös request alap
- `GAc4yServiceResponseCommon` - Közös response alap
- `GAc4ySession` - Session alap (user-rel)
- `GAc4yUser` - User alap

## Függőségek

- `ac4y-base` - Ac4y, Ac4yNoId alap osztályok
- `ac4y-context` - Ac4yContext DB kapcsolathoz
- `ac4y-service-domain` - Ac4yServiceResponse, Ac4yServiceRequest

## AI Agent Használati Útmutató

### Gyors Döntési Fa

1. **GUID-dal keresés** → `ByGUIDRequest`
2. **ID-val keresés** → `ByPersistentIDRequest`
3. **WHERE feltétel** → `WhereRequest`
4. **Tömeges feldolgozás** → `Ac4yBulkProcessResult` + `BulkProcessResponse`
5. **Session kezelés** → `Ac4ySession` + `Ac4yUser`

## Eredetileg

`IJAc4yServiceModule/Ac4yServiceCommon` modulból kiemelve.

---
**Utolsó frissítés:** 2026-02-06
