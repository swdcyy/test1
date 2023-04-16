package aegon.chrome.base.Callback$Helper;
import java.lang.Object;
import aegon.chrome.base.Callback;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Runnable;

public abstract class Callback$Helper	// class@000131
{

    public void Callback$Helper(){
       super();
    }
    public static void onBooleanResultFromNative(Callback p0,boolean p1){
       p0.onResult(Boolean.valueOf(p1));
    }
    public static void onIntResultFromNative(Callback p0,int p1){
       p0.onResult(Integer.valueOf(p1));
    }
    public static void onObjectResultFromNative(Callback p0,Object p1){
       p0.onResult(p1);
    }
    public static void onTimeResultFromNative(Callback p0,long p1){
       p0.onResult(Long.valueOf(p1));
    }
    public static void runRunnable(Runnable p0){
       p0.run();
    }
}
