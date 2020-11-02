package com.github.soygustavo.mvptemplateargenprop.services

import com.intellij.openapi.project.Project
import com.github.soygustavo.mvptemplateargenprop.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
