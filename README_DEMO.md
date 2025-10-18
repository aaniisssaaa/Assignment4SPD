Patterns demo (Observer + Strategy)

What this is:
- Small Java demo showing the Observer pattern (notifiers) combined with the Strategy pattern (message formatters).
- Focus on Clean Code: small well-named methods, single responsibility, clear package structure and simple tests via running the main.

How to build and run (Windows PowerShell):

1) Compile all .java files under src:

   javac -d out -sourcepath src src/patterns/demo/DemoMain.java

2) Run the demo:

   java -cp out patterns.demo.DemoMain

Notes:
- No external dependencies are required.
- The demo prints notifications to the console and simulates email sending.
