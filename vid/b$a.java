package vid.b$a;
import com.tencent.mmkv.MMKVHandler;
import java.lang.Object;
import com.tencent.mmkv.MMKVLogLevel;
import java.lang.String;
import vid.b$b;
import java.lang.Enum;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;
import com.tencent.mmkv.MMKVRecoverStrategic;
import vid.b;
import com.yxcorp.utility.SystemUtil;

public final class b$a implements MMKVHandler	// class@0026bd
{

    public void b$a(){
       super();
    }
    public void mmkvLog(MMKVLogLevel p0,String p1,int p2,String p3,String p4){
       int i = b$b.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   System.err.println("KwaiSharedPreferences.e: "+p3+" "+p4);
                }
             }else {
                System.out.println("KwaiSharedPreferences.w: "+p3+" "+p4);
             }
          }else {
             System.out.println("KwaiSharedPreferences.i: "+p3+" "+p4);
          }
       }else {
          System.out.println("KwaiSharedPreferences.d: "+p3+" "+p4);
       }
       return;
    }
    public MMKVRecoverStrategic onMMKVCRCCheckFail(String p0){
       b.d(p0, "CRCCheckFail");
       return MMKVRecoverStrategic.OnErrorDiscard;
    }
    public MMKVRecoverStrategic onMMKVFileLengthError(String p0){
       b.d(p0, "FileLengthError");
       return MMKVRecoverStrategic.OnErrorDiscard;
    }
    public boolean wantLogRedirecting(){
       return SystemUtil.K();
    }
}
