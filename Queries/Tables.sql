
CREATE TABLE Teachers (
	TeacherID int PRIMARY KEY NOT NULL,
	DutyTeacher varchar(60) NOT NULL,
	TeacherEmail varchar(120) NOT NULL,
	TeacherGroup varchar(3) NOT NULL
);

CREATE TABLE Classes (
	ClassID int IDENTITY(1,1) PRIMARY KEY NOT NULL,
	YearGroup int NOT NULL,
	LevelTier varchar(8) NOT NULL,
	ClassSubject varchar(45) NOT NULL,
	ClassDate date NOT NULL,
	ClassDay varchar(9) NOT NULL,
	ClassPeriod int NOT NULL,
	TeacherID int FOREIGN KEY REFERENCES Teachers(TeacherID) NOT NULL
);

CREATE TABLE Assessment (
	ClassID int IDENTITY(1,1) PRIMARY KEY NOT NULL,
	FOREIGN KEY (ClassID) REFERENCES Classes(ClassID),
	UseMWBTrafficLight bit NOT NULL,
	TrackersFilled bit NOT NULL,
	UseOfSC bit NOT NULL,
	PeerAssessment bit NOT NULL,
	TeacherAssessment bit NOT NULL,
	SubjectSpecificDocument bit NOT NULL,
	PastPapers bit NOT NULL,
	TeacherAssessmentFolders bit NOT NULL,
	FeedbackResponse bit NOT NULL,
	AComments varchar(280)
);

CREATE TABLE PersonalOrganisationBookFolderEtiquette (
	ClassID int IDENTITY(1,1) PRIMARY KEY NOT NULL,
	FOREIGN KEY (ClassID) REFERENCES Classes(ClassID),
	Covered bit NOT NULL,
	HandwritingNeat bit NOT NULL,
	Underlined bit NOT NULL,
	SheetsNeat bit NOT NULL,
	CorrectPen bit NOT NULL,
	POBFEComments varchar(280)
);

CREATE TABLE PersonalOrganisationPlanners (
	ClassID int IDENTITY(1,1) PRIMARY KEY NOT NULL,
	FOREIGN KEY (ClassID) REFERENCES Classes(ClassID),
	Neat bit NOT NULL,
	WOWReadingBookFilled bit NOT NULL,
	Signed bit NOT NULL,
	PrepDate bit NOT NULL,
	NoGaps bit NOT NULL,
	POPComments varchar(280)
);

CREATE TABLE LearningBehaviour (
	ClassID int IDENTITY(1,1) PRIMARY KEY NOT NULL,
	FOREIGN KEY (ClassID) REFERENCES Classes(ClassID),
	StudentPosture bit NOT NULL,
	StudentSilence bit NOT NULL,
	StudentEngaged bit NOT NULL,
	StudentFocus bit NOT NULL,
	StudentListening bit NOT NULL,
	StudentRespect bit NOT NULL,
	StudentCoatHatOff bit NOT NULL,
	NoPhone bit NOT NULL,
	LBComments varchar(280)
);

CREATE TABLE PersonalOrganisationEssentialStudyandFolderEtiquette (
	ClassID int IDENTITY(1,1) PRIMARY KEY NOT NULL,
	FOREIGN KEY (ClassID) REFERENCES Classes(ClassID),
	NotesSystem bit NOT NULL,
	FolderNeat bit NOT NULL,
	ESSystem bit NOT NULL,
	POESFEComments bit NOT NULL,
);




