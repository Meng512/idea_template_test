package com.github.meng512.ideatemplatetest.services

import com.intellij.openapi.project.Project
import com.github.meng512.ideatemplatetest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
