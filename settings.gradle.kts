File("services").walk()
    .filter { it -> it.isDirectory }
    .forEach {
    include(it.name)
    project(":${it.name}").projectDir  = it
}