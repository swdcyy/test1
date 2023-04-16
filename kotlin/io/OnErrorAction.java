package kotlin.io.OnErrorAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class OnErrorAction extends Enum	// class@001886
{
    public static final OnErrorAction[] $VALUES;
    public static final OnErrorAction SKIP;
    public static final OnErrorAction TERMINATE;

    static {
       OnErrorAction onErrorActio1;
       OnErrorAction[] onErrorActio = new OnErrorAction[]{onErrorActio1,onErrorActio1};
       onErrorActio1 = new OnErrorAction("SKIP", 0);
       OnErrorAction.SKIP = onErrorActio1;
       onErrorActio1 = new OnErrorAction("TERMINATE", 1);
       OnErrorAction.TERMINATE = onErrorActio1;
       OnErrorAction.$VALUES = onErrorActio;
    }
    public void OnErrorAction(String p0,int p1){
       super(p0, p1);
    }
    public static OnErrorAction valueOf(String p0){
       return Enum.valueOf(OnErrorAction.class, p0);
    }
    public static OnErrorAction[] values(){
       return OnErrorAction.$VALUES.clone();
    }
}
