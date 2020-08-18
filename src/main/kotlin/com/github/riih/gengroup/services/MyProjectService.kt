package com.github.riih.gengroup.services

import com.intellij.openapi.project.Project
import com.github.riih.gengroup.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
