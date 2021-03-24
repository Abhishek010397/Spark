\***\*\*\*\*\*\*\***SPARK WITH SCALA****\*\*****\*\*****\*\*****

RDD was the primary user-facing API in Spark since its inception. At the core, an RDD is an immutable distributed collection of elements of your data, partitioned across nodes in your cluster that can be operated in parallel with a low-level API that offers transformations and actions.

Reasons to use RDD:-

    1.You want low-level transformation and actions and control on your dataset;
    2.Your data is unstructured, such as media streams or streams of text;
    3.You want to manipulate your data with functional programming constructs than domain specific expressions;
    4.You don’t care about imposing a schema, such as columnar format while processing or accessing data attributes by name or column; and
    5.You can forgo some optimization and performance benefits available with DataFrames and Datasets for structured and semi-structured data.

![alt-text]()
