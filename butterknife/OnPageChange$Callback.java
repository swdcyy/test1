package butterknife.OnPageChange$Callback;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class OnPageChange$Callback extends Enum	// class@000b96
{
    public static final OnPageChange$Callback[] $VALUES;
    public static final OnPageChange$Callback PAGE_SCROLLED;
    public static final OnPageChange$Callback PAGE_SCROLL_STATE_CHANGED;
    public static final OnPageChange$Callback PAGE_SELECTED;

    static {
       OnPageChange$Callback uCallback = new OnPageChange$Callback("PAGE_SELECTED", 0);
       OnPageChange$Callback.PAGE_SELECTED = uCallback;
       OnPageChange$Callback uCallback1 = new OnPageChange$Callback("PAGE_SCROLLED", 1);
       OnPageChange$Callback.PAGE_SCROLLED = uCallback1;
       OnPageChange$Callback uCallback2 = new OnPageChange$Callback("PAGE_SCROLL_STATE_CHANGED", 2);
       OnPageChange$Callback.PAGE_SCROLL_STATE_CHANGED = uCallback2;
       OnPageChange$Callback[] uCallbackArr = new OnPageChange$Callback[]{uCallback,uCallback1,uCallback2};
       OnPageChange$Callback.$VALUES = uCallbackArr;
    }
    public void OnPageChange$Callback(String p0,int p1){
       super(p0, p1);
    }
    public static OnPageChange$Callback valueOf(String p0){
       return Enum.valueOf(OnPageChange$Callback.class, p0);
    }
    public static OnPageChange$Callback[] values(){
       return OnPageChange$Callback.$VALUES.clone();
    }
}
