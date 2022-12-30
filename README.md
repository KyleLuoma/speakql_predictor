## SpeakQL Parser and Next Token Predictor

Provides a command line interface to parse SpeakQL queries and get a list of next valid
tokens for partial SpeakQL queries.

## Command Line Options:

Note: This is a simple program that only accepts one command line argument per 
execution.

-predict "\<partial query\>" 
print a list of valid next tokens to the console

-predict-select "\<partial select expression\>"
print a list of valid next tokens to the console for a select expression

-predict-where "\<partial where expression\>"

-predict-table "\<partial table expression\>"

-predict-modifier "\<partial modifier expression\>"

-tokenize "\<query\>"
print query as an array of tokens to the console

-parse "\<query\>"
Print a lisp style AST to the console

-parse-select "\<partial select expression\>"
Print a lisp style AST for a partial query (select expression)

-parse-table "\<partial table expression\>"

-parse-where "\<partial where expression\>"

-parse-modifier "\<partial modifier expression\>"

-server
Start a simple http server with parse and predict endpoints

## Server details:

Port: 6789 (Currently hard coded only)

Prediction request format:
{"rule": "\<rule\>", "query": "query"}

The rule indicates whether you are passing a full query (START), or a partial query indicated
by the type of query using the values below.

Rule values:
"START"
"SELECT"
"TABLE"
"WHERE"
"MODIFIER"

Example for partial select query:
url: http://localhost:6789/predict
body: {"rule": "SELECT", "query": "SELECT BUILDINGNAME, "}

