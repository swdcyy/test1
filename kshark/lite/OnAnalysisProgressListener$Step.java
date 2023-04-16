package kshark.lite.OnAnalysisProgressListener$Step;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class OnAnalysisProgressListener$Step extends Enum	// class@001bb2
{
    public static final OnAnalysisProgressListener$Step[] $VALUES;
    public static final OnAnalysisProgressListener$Step BUILDING_LEAK_TRACES;
    public static final OnAnalysisProgressListener$Step COMPUTING_NATIVE_RETAINED_SIZE;
    public static final OnAnalysisProgressListener$Step COMPUTING_RETAINED_SIZE;
    public static final OnAnalysisProgressListener$Step EXTRACTING_METADATA;
    public static final OnAnalysisProgressListener$Step FINDING_DOMINATORS;
    public static final OnAnalysisProgressListener$Step FINDING_PATHS_TO_RETAINED_OBJECTS;
    public static final OnAnalysisProgressListener$Step FINDING_RETAINED_OBJECTS;
    public static final OnAnalysisProgressListener$Step INSPECTING_OBJECTS;
    public static final OnAnalysisProgressListener$Step PARSING_HEAP_DUMP;
    public static final OnAnalysisProgressListener$Step REPORTING_HEAP_ANALYSIS;

    static {
       OnAnalysisProgressListener$Step[] stepArray = new OnAnalysisProgressListener$Step[10];
       OnAnalysisProgressListener$Step step = new OnAnalysisProgressListener$Step("PARSING_HEAP_DUMP", 0);
       OnAnalysisProgressListener$Step.PARSING_HEAP_DUMP = step;
       stepArray[0] = step;
       step = new OnAnalysisProgressListener$Step("EXTRACTING_METADATA", 1);
       OnAnalysisProgressListener$Step.EXTRACTING_METADATA = step;
       stepArray[1] = step;
       step = new OnAnalysisProgressListener$Step("FINDING_RETAINED_OBJECTS", 2);
       OnAnalysisProgressListener$Step.FINDING_RETAINED_OBJECTS = step;
       stepArray[2] = step;
       step = new OnAnalysisProgressListener$Step("FINDING_PATHS_TO_RETAINED_OBJECTS", 3);
       OnAnalysisProgressListener$Step.FINDING_PATHS_TO_RETAINED_OBJECTS = step;
       stepArray[3] = step;
       step = new OnAnalysisProgressListener$Step("FINDING_DOMINATORS", 4);
       OnAnalysisProgressListener$Step.FINDING_DOMINATORS = step;
       stepArray[4] = step;
       step = new OnAnalysisProgressListener$Step("INSPECTING_OBJECTS", 5);
       OnAnalysisProgressListener$Step.INSPECTING_OBJECTS = step;
       stepArray[5] = step;
       step = new OnAnalysisProgressListener$Step("COMPUTING_NATIVE_RETAINED_SIZE", 6);
       OnAnalysisProgressListener$Step.COMPUTING_NATIVE_RETAINED_SIZE = step;
       stepArray[6] = step;
       step = new OnAnalysisProgressListener$Step("COMPUTING_RETAINED_SIZE", 7);
       OnAnalysisProgressListener$Step.COMPUTING_RETAINED_SIZE = step;
       stepArray[7] = step;
       step = new OnAnalysisProgressListener$Step("BUILDING_LEAK_TRACES", 8);
       OnAnalysisProgressListener$Step.BUILDING_LEAK_TRACES = step;
       stepArray[8] = step;
       step = new OnAnalysisProgressListener$Step("REPORTING_HEAP_ANALYSIS", 9);
       OnAnalysisProgressListener$Step.REPORTING_HEAP_ANALYSIS = step;
       stepArray[9] = step;
       OnAnalysisProgressListener$Step.$VALUES = stepArray;
    }
    public void OnAnalysisProgressListener$Step(String p0,int p1){
       super(p0, p1);
    }
    public static OnAnalysisProgressListener$Step valueOf(String p0){
       return Enum.valueOf(OnAnalysisProgressListener$Step.class, p0);
    }
    public static OnAnalysisProgressListener$Step[] values(){
       return OnAnalysisProgressListener$Step.$VALUES.clone();
    }
}
