FROM bellsoft/liberica-openjdk-alpine

COPY ./src ./sourceMyContainer

RUN javac -sourcepath ./sourceMyContainer -d out sourceMyContainer/Main.java

CMD java -classpath ./out Main