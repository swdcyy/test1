package androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class WidgetRun$RunType extends Enum	// class@000693
{
    public static final WidgetRun$RunType[] $VALUES;
    public static final WidgetRun$RunType CENTER;
    public static final WidgetRun$RunType END;
    public static final WidgetRun$RunType NONE;
    public static final WidgetRun$RunType START;

    static {
       WidgetRun$RunType runType = new WidgetRun$RunType("NONE", 0);
       WidgetRun$RunType.NONE = runType;
       WidgetRun$RunType runType1 = new WidgetRun$RunType("START", 1);
       WidgetRun$RunType.START = runType1;
       WidgetRun$RunType runType2 = new WidgetRun$RunType("END", 2);
       WidgetRun$RunType.END = runType2;
       WidgetRun$RunType runType3 = new WidgetRun$RunType("CENTER", 3);
       WidgetRun$RunType.CENTER = runType3;
       WidgetRun$RunType[] runTypeArray = new WidgetRun$RunType[]{runType,runType1,runType2,runType3};
       WidgetRun$RunType.$VALUES = runTypeArray;
    }
    public void WidgetRun$RunType(String p0,int p1){
       super(p0, p1);
    }
    public static WidgetRun$RunType valueOf(String p0){
       return Enum.valueOf(WidgetRun$RunType.class, p0);
    }
    public static WidgetRun$RunType[] values(){
       return WidgetRun$RunType.$VALUES.clone();
    }
}
