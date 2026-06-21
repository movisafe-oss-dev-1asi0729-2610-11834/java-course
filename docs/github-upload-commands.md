# Comandos para subir el repositorio a GitHub

Cambiar `usuario` y `java-fundamentals-course-nombre-equipo` por los datos reales del equipo.

```bash
git init
git add .
git commit -m "docs: add initial course structure"
git branch -M main
git remote add origin https://github.com/usuario/java-fundamentals-course-nombre-equipo.git
git push -u origin main
```

## Commits sugeridos por integrante

Cada integrante debe realizar al menos un commit propio para evidenciar su aporte.

```bash
git add starter-files/lesson-01 completed-examples/lesson-01 scripts/lesson-01-script.md
git commit -m "feat: add lesson 01 java introduction"
```

```bash
git add starter-files/lesson-02 completed-examples/lesson-02 scripts/lesson-02-script.md
git commit -m "feat: add lesson 02 variables and operators"
```

```bash
git add starter-files/lesson-03 completed-examples/lesson-03 scripts/lesson-03-script.md
git commit -m "feat: add lesson 03 control structures"
```

```bash
git add starter-files/lesson-04 completed-examples/lesson-04 scripts/lesson-04-script.md
git commit -m "feat: add lesson 04 methods and scanner"
```

```bash
git add starter-files/lesson-05 completed-examples/lesson-05 scripts/lesson-05-script.md
git commit -m "feat: add lesson 05 oop final project"
```
