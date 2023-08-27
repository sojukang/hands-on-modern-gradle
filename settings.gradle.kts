pluginManagement {
    repositories {
        gradlePluginPortal()
//        mavenCentral()
//        mavenLocal()
//        maven {
//            url = uri("https://my.location/repo")
//            credentials.username = "user"
//            credentials.password = "password"
//        }
    }

//    includeBuild("gradle/plugins")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
//        mavenLocal()
//        maven {
//            url = uri("https://my.location/repo")
//            credentials.username = "user"
//            credentials.password = "password"
//        }
    }

//    includeBuild("../my-other-project")
}

rootProject.name = "hands-on-modern-gradle"

include("app")
include("business-logic")
include("data-model")
