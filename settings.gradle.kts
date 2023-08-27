dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        maven {
            url = uri("https://my.location/repo")
            credentials.username = "user"
            credentials.password = "password"
        }
    }

    includeBuild("../my-other-project")
}

include("app")
include("business-logic")
include("data-model")
