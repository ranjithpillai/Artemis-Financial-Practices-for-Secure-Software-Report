# Artemis-Financial-Practices-for-Secure-Software-Report

Artemis Financial is a consulting company that develops individualized financial plans for their customers. 
The financial plans include savings, retirement, investments, and insurance. They want to modernize their operations and use most current and effective software security. 
Software security is important for a company's success. It affects their integrity and customer's information. Secure coding is one way of achieving software security. 
Vulnerability assessment using OWASP Dependency-Check Maven plugin is very useful in finding vulnerabilities in third party libraries and upgrade them before any attacks. 
It is very useful to check for any new vulnerabilities after refactoring the code. This plugin is definitely a great tool for any projects.

To increase the security layers, we assess and improve different areas of security listed in Vulnerability Assessment Process Flow Diagram. 
Cryptography, secure API, secure coding, secure error handling etc are few areas we improved in this project. 
In this assignment, we used industry standard SHA-256 secure cipher algorithm to generate a secure checksum for the content. 
We also avoid hard coding sensitive information in application.properties and instead they are fetched from environment variables. 
Another thing is secure error handling using exceptions to handle and log errors in business use-cases gracefully and securely. 


