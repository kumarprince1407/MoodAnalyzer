import com.bridgelabz.mood_analyzer.MoodAnalyzer;
import javax.lang.model.type.ErrorType;

public class MoodAnalysisException extends Exception{
    private ErrorType errorType;

    public MoodAnalysisException(ErrorType errorType){
        this.errorType=errorType;
    }
    public ErrorType getErrorType(){
        return errorType;
    }
    public enum ErrorType {
        EMPTY_OR_NULL_MOOD
    }
}
