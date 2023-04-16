package butterknife.OnTextChanged$Callback;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class OnTextChanged$Callback extends Enum	// class@000b98
{
    public static final OnTextChanged$Callback[] $VALUES;
    public static final OnTextChanged$Callback AFTER_TEXT_CHANGED;
    public static final OnTextChanged$Callback BEFORE_TEXT_CHANGED;
    public static final OnTextChanged$Callback TEXT_CHANGED;

    static {
       OnTextChanged$Callback uCallback = new OnTextChanged$Callback("TEXT_CHANGED", 0);
       OnTextChanged$Callback.TEXT_CHANGED = uCallback;
       OnTextChanged$Callback uCallback1 = new OnTextChanged$Callback("BEFORE_TEXT_CHANGED", 1);
       OnTextChanged$Callback.BEFORE_TEXT_CHANGED = uCallback1;
       OnTextChanged$Callback uCallback2 = new OnTextChanged$Callback("AFTER_TEXT_CHANGED", 2);
       OnTextChanged$Callback.AFTER_TEXT_CHANGED = uCallback2;
       OnTextChanged$Callback[] uCallbackArr = new OnTextChanged$Callback[]{uCallback,uCallback1,uCallback2};
       OnTextChanged$Callback.$VALUES = uCallbackArr;
    }
    public void OnTextChanged$Callback(String p0,int p1){
       super(p0, p1);
    }
    public static OnTextChanged$Callback valueOf(String p0){
       return Enum.valueOf(OnTextChanged$Callback.class, p0);
    }
    public static OnTextChanged$Callback[] values(){
       return OnTextChanged$Callback.$VALUES.clone();
    }
}
