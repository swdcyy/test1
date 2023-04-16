package aj9.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camerasdk.recorder.b;
import java.lang.String;
import java.lang.Object;
import com.kwai.camerasdk.ErrorCode$Result;
import java.lang.Exception;
import v16.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.Throwable;
import v16.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import v16.d;
import lnc.p3;
import w46.b;

public final class e implements Runnable	// class@0000df
{
    public final b b;
    public final int c;
    public final String d;

    public void e(b p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       SharedPreferences sharedPrefer;
       SharedPreferences$Editor uEditor;
       SharedPreferences$Editor uEditor1;
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       if (tb.g != null && tc == ErrorCode$Result.kEncodeVideoBlockError.getCode()) {
          Exception uException = new Exception(td);
          b uob = b.class;
          Object[] obj = null;
          if (!PatchProxy.applyVoidOneRefs(uException, obj, uob, "21")) {
             String str = PatchProxy.applyOneRefs(uException, obj, uob, "19");
             if (str != PatchProxyResult.class) {
             }else {
                try{
                   StringWriter stringWriter = new StringWriter();
                   uException.printStackTrace(new PrintWriter(stringWriter));
                   str = stringWriter.toString();
                }catch(java.lang.Exception e0){
                   str = "bad getErrorInfoFromException";
                }
             }
          }
       }
    label_0087 :
       tb.m(true);
       tb.d(tc);
       return;
    }
}
