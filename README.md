# gradle-cucumber

A sample project, how to set up and use a 
`gradle` project together with `cucumber`

## Install plugins for IntelliJ

To have cucumber support in intellij follow the 
first four steps here: https://www.jetbrains.com/help/idea/enabling-cucumber-support-in-project.html#cucumber-plugin

## Run the tests

    $ gradle cucumber

## Configuration

Be sure that the `--glue` is set correctly in `build.gradle`. To the package name,
where the implementations are found.

    args = ['--plugin', 'pretty', '--glue', 'com.icconsult.examples.cucumber', 'src/test/resources']

