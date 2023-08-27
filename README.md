dependencyResolutionManagement
실제로 의존성을 불러오는 것은 아니고 경로만 설정한다. 
### repositories
- look in remote repository to potentially find the component there

### includeBuild
- include other gradle build 

pluginManagement
plugin 관련 설정 
### includeBuild
- should write local plugin

rootProject.name
give name to project, default is directory name

![img.png](img.png)

build.gradle
plugins
- should always have a plugin block in the top 
- 