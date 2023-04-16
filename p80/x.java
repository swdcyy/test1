package p80.x;
import java.lang.Runnable;
import p80.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p80.v;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.framework.exceptionhandler.ExceptionClues;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class x implements Runnable	// class@0028e3
{
    public final q b;

    public void x(q p0){
       this.b = p0;
       super();
    }
    public final void run(){
       l1 a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, x.class, "1")) {
          return;
       }
       x tb = this.b;
       if (!PatchProxy.applyVoidOneRefs(tb, objArray, v.class, "12")) {
          try{
             JsonElement jsonElement = a.a.x(tb);
             Log.b("KsWebView", "kswebview switches info "+jsonElement);
             a.o(jsonElement, "infoJson");
             ExceptionClues.c.c("kswebview_switches", jsonElement);
             a = l1.a;
          }catch(java.lang.Exception e0){
             Log.d("KsWebView", "Failed to set kswebview switches info: "+e0);
             a = l1.a;
          }
       }
    }
}
