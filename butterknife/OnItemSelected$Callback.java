package butterknife.OnItemSelected$Callback;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class OnItemSelected$Callback extends Enum	// class@000b93
{
    public static final OnItemSelected$Callback[] $VALUES;
    public static final OnItemSelected$Callback ITEM_SELECTED;
    public static final OnItemSelected$Callback NOTHING_SELECTED;

    static {
       OnItemSelected$Callback uCallback = new OnItemSelected$Callback("ITEM_SELECTED", 0);
       OnItemSelected$Callback.ITEM_SELECTED = uCallback;
       OnItemSelected$Callback uCallback1 = new OnItemSelected$Callback("NOTHING_SELECTED", 1);
       OnItemSelected$Callback.NOTHING_SELECTED = uCallback1;
       OnItemSelected$Callback[] uCallbackArr = new OnItemSelected$Callback[]{uCallback,uCallback1};
       OnItemSelected$Callback.$VALUES = uCallbackArr;
    }
    public void OnItemSelected$Callback(String p0,int p1){
       super(p0, p1);
    }
    public static OnItemSelected$Callback valueOf(String p0){
       return Enum.valueOf(OnItemSelected$Callback.class, p0);
    }
    public static OnItemSelected$Callback[] values(){
       return OnItemSelected$Callback.$VALUES.clone();
    }
}
