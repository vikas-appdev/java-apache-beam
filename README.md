### Apache Beam

##### Constructing a Beam Pipeline
_Designing the workflow graph is the first step in every Apache Beam job. Let's define the steps of a word count task._

- Read the text from a source
- Split the text into a list of words.
- Lowercase all words
- Trim punctuations.
- Filter stop-words.
- Count each unique words.

To achieve this, we'll need to convert the above steps into a single Pipeline using **PCollection** and **PTransform** abstractions.

##### Dependencies

- Before we can implement our workflow graph, We should add [Apache Beam's core dependency](https://mvnrepository.com/artifact/org.apache.beam/beam-sdks-java-core) to our project 
- Beam Pipeline Runners rely on a distributed processing backend to perform tasks. Let's add a [Direct Runner](https://mvnrepository.com/artifact/org.apache.beam/beam-runners-direct-java) as a runtime dependencies.

```xml
    <dependency>
        <groupId>org.apache.beam</groupId>
        <artifactId>beam-sdks-java-core</artifactId>
        <version>2.55.1</version>
    </dependency>

    <dependency>
        <groupId>org.apache.beam</groupId>
        <artifactId>beam-runners-direct-java</artifactId>
        <version>2.55.1</version>
        <scope>runtime</scope>
    </dependency>
```

Unlike other Pipeline Runners, DirectRunner doesn't need any additional setup, which makes it a good choice for a starter.

