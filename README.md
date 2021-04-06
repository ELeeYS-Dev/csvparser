# CSV Parser

This application is used to parse CSV into JSON files which can be then used for inputs to other projects.

## Directions

1. Change the `input.csv` file into the csv file that you want to parse
2. Update the `builder/Model.java` file to the model that is expected.
    - Note: The constructor is the most important to populate the values.
3. Perform `./gradlew run` to build and parse the `.csv` file.
4. Result file will be created as `src/main/resources/result.json`