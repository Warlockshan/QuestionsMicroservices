#
FROM public.ecr.aws/amazonlinux/amazonlinux:2023
RUN dnf install -y java-21-amazon-corretto-devel \
    && dnf clean all
WORKDIR /app
COPY ./target/QuestionService-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "QuestionService-0.0.1-SNAPSHOT.jar"]