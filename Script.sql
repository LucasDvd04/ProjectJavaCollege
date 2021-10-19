
CREATE TABLE administrador (
codigoADM INT(11) PRIMARY KEY,
nomeADM VARCHAR(40)
);

CREATE TABLE aluno (
matriculaAluno INT(11) PRIMARY KEY,
nomeAluno VARCHAR(40),
email VARCHAR(40),
idade INT(11),
codigoCurso INT(11),
codigoTurma INT(11),
codigoNotas INT(11)
);

CREATE TABLE curso (
codigoCurso INT(11) PRIMARY KEY,
nomeCurso VARCHAR(40)
);

CREATE TABLE disciplina (
codigoDisciplina INT(11) PRIMARY KEY,
nomeDisciplina VARCHAR(40),
cargaHoraria INT(11),
sala INT(11),
codigoTurma INT(11)
);

CREATE TABLE usuario (
usuario VARCHAR(40),
senha VARCHAR(40),
codigoADM INT(11),
matriculaAluno INT(11),
matriculaProfessor INT(11),
FOREIGN KEY(codigoADM) REFERENCES administrador (codigoADM),
FOREIGN KEY(matriculaAluno) REFERENCES aluno (matriculaAluno)
);

CREATE TABLE notas (
codigoNotas INT(11) PRIMARY KEY,
a1 FLOAT(0.2),
a2 FLOAT(0.2),
mediaF FLOAT(0.2)
);

CREATE TABLE professor (
matriculaProfessor INT(11) PRIMARY KEY,
nomeProfessor VARCHAR(40),
email VARCHAR(40),
idade FLOAT(0.2),
codigoDisciplina INT(11),
FOREIGN KEY(codigoDisciplina) REFERENCES disciplina (codigoDisciplina)
);

CREATE TABLE turma (
codigoTurma INT(11) PRIMARY KEY,
nomeTurma VARCHAR(40)
);

ALTER TABLE aluno ADD FOREIGN KEY(codigoCurso) REFERENCES curso (codigoCurso);
ALTER TABLE aluno ADD FOREIGN KEY(codigoTurma) REFERENCES turma (codigoTurma);
ALTER TABLE aluno ADD FOREIGN KEY(codigoNotas) REFERENCES notas (codigoNotas);
ALTER TABLE disciplina ADD FOREIGN KEY(codigoTurma) REFERENCES turma (codigoTurma);
ALTER TABLE usuario ADD FOREIGN KEY(matriculaProfessor) REFERENCES professor (matriculaProfessor);
