# Spring boot starter
Spring Boot : 3.1.5  
logging, junit 5, profiles, folder structure

### Packages
starter-web, devtools, lombok


### ISSUE: VSCode OpenJDK 64-Bit Server VM warning
```
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
```
### Solution
```javascript
// Add the following to your settings.json
"java.test.config": {
        "vmArgs": [
            "-Xshare:off"
        ]
    },
```
