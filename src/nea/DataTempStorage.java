
package nea;


public class DataTempStorage {
    
    public static void StoreData(){
        
    }
    
    public static void RetrieveData(){
        
    }
    
    //Learning Behaviour
    private static boolean StudentPosture;
    private static boolean StudentSilence;
    private static boolean StudentEngaged;
    private static boolean StudentFocus;
    private static boolean StudentListening;
    private static boolean StudentRespect;
    private static boolean StudentCoatHatOff;
    private static boolean NoPhone;
    private static String LBComment;
    
    public static void LearningBehaviourStore(boolean Posture, boolean Silence, boolean Engaged, boolean Focus, boolean Listening, boolean Respect, boolean CoatHatOff, boolean Phone, String Comment) {
        StudentPosture = Posture;
        StudentSilence = Silence;
        StudentEngaged = Engaged;
        StudentFocus = Focus;
        StudentListening = Listening;
        StudentRespect = Respect;
        StudentCoatHatOff = CoatHatOff;
        NoPhone = Phone;
        LBComment = Comment;
    }
    
    
    
    //Personal Organisation Planners
    private static boolean Neat;
    private static boolean WowReadingBookFilled;
    private static boolean Signed;
    private static boolean PrepDate;
    private static boolean NoGaps;
    private static String POPComment;
    
    public static void POPStore(boolean neat, boolean WowFill, boolean signed, boolean Prep, boolean Gap, String Comment) {
        Neat = neat;
        WowReadingBookFilled = WowFill;
        Signed = signed;
        PrepDate = Prep;
        NoGaps = Prep;
        POPComment = Comment;
    }
    
    
    
    //Personal Organisation Book/Folder Etiquette
    private static boolean Covered;
    private static boolean HandwritingNeat;
    private static boolean Underlined;
    private static boolean SheetsNeat;
    private static boolean CorrectPen;
    private static String POBFEComment;
    
    public static void POBFEStore(boolean covered, boolean handwriting, boolean underlined, boolean sheets, boolean pen, String Comment) {
        Covered = covered;
        HandwritingNeat = handwriting;
        Underlined = underlined;
        SheetsNeat = sheets;
        CorrectPen = pen;
        POBFEComment = Comment;
    }
    
    
    
    //Assessment
    private static boolean UseMWBTrafficLight;
    private static boolean TrackersFilled;
    private static boolean UseOfSC;
    private static boolean PeerAssessment;
    private static boolean TeacherAssessment;
    private static boolean SubjectSpecificDocument;
    private static boolean PastPapers;
    private static boolean TeacherAssessmentFolders;
    private static boolean FeedbackResponse;
    private static String AComment;
    
    public static void AssessmentStore(boolean TrafficLight, boolean Tracker, boolean SC, boolean Peer, boolean Teacher, boolean SubSpecDoc, boolean Papers, boolean TeacherFolder, boolean Feedback, String Comment) {
        UseMWBTrafficLight = TrafficLight;
        TrackersFilled = Tracker;
        UseOfSC = SC;
        PeerAssessment = Peer;
        TeacherAssessment = Teacher;
        SubjectSpecificDocument = SubSpecDoc;
        PastPapers = Papers;
        TeacherAssessmentFolders = TeacherFolder;
        FeedbackResponse = Feedback;
        AComment =  Comment;
    }
}


class ClassDetailStorage extends DataTempStorage{
    private static int YearGroup;
    private static int ClassSet;
    private static String Level;
    private static String Subject;
    private static String ClassDate;
    private static String ClassDay;
    private static int ClassPeriod;
    private static String DutyTeacher;
    private static String TeacherGroup;
    
    static void StoreData(int YrGrp, int Set, String Lvl, String Sub, String InputDate, String InputDay, int Period, String DutyT, String TeacherGrp) {
        YearGroup = YrGrp;
        ClassSet = Set;
        Level = Lvl;
        Subject = Sub;
        ClassDate = InputDate;
        ClassDay = InputDay;
        ClassPeriod = Period;
        DutyTeacher = DutyT;
        TeacherGroup = TeacherGrp;
    }
    
    public static void RetrieveData() {
        
    }
}