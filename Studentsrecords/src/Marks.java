public class Marks {
    private String subjectName;
    private int marksObtained;

    public Marks(String subjectName, int marksObtained) {
        this.subjectName = subjectName;
        this.marksObtained = marksObtained;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }
}
