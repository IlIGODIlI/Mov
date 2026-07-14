# Contributing Guidelines

Thank you for choosing to contribute to the Bus Transport Management System! Below are the guidelines and best practices for creating bug reports, proposing feature extensions, and submitting pull requests.

---

## Code of Conduct

By participating in this project, you agree to abide by our **[Code of Conduct](file:///C:/Users/aryan/Project_Mov_jav/CODE_OF_CONDUCT.md)**. Please report any unacceptable behavior to the project maintainers.

---

## How Can I Contribute?

### 1. Reporting Bugs
- Search existing issues to ensure the bug hasn't already been reported.
- If it's new, use the **Bug Report Template** to file a detailed ticket.
- Include steps to reproduce, actual vs. expected behavior, logs, and screenshots if applicable.

### 2. Suggesting Enhancements
- Check our development **[Roadmap](file:///C:/Users/aryan/Project_Mov_jav/docs/ROADMAP.md)** to see if the feature is already planned.
- Open a feature request ticket detailing the use case, mockups or APIs if applicable, and why this extension would benefit the project.

### 3. Pull Requests (PRs)
Follow these steps to submit a pull request:
1. Fork the repository and create your branch from `main`:
   ```bash
   git checkout -b feature/my-cool-feature
   ```
2. Write clean, modular, and well-documented code. Make sure to adhere to the existing folder and package organization.
3. Ensure the project builds successfully and all tests pass:
   ```bash
   # Inside transport/
   .\mvnw.cmd clean test
   ```
4. Commit your changes using descriptive commit messages following the Conventional Commits specification (e.g. `feat: add bcrypt password hashing`).
5. Push to your fork and submit a PR to the `main` branch.
6. A maintainer will review your code shortly. Address any comments or requested edits directly on your PR branch.
