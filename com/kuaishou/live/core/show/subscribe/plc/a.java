package com.kuaishou.live.core.show.subscribe.plc.a;
import sfc.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.common.base.b;
import java.io.IOException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zb6.a;
import aegon.chrome.net.NetworkException;
import javax.net.ssl.SSLException;
import java.lang.CharSequence;
import e17.i;
import java.lang.IllegalArgumentException;

public class a extends a	// class@00115a
{
    public final Context c;

    public void a(){
       super(a.a().a());
    }
    public void a(Context p0){
       super();
       this.c = p0;
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       try{
          Throwable throwable = b.c(p0);
          if (p0 instanceof IOException) {
             Object obj = PatchProxy.applyOneRefs(throwable, this, uoa, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(!a.g(throwable) && (throwable instanceof NetworkException || throwable instanceof SSLException)){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                i.d(R.style.arg_RES_7f11066a, "Çë¼ì²éÍøÂç");
             }else {
             label_0041 :
                super.b(p0);
             }
          }else {
             goto label_0041 ;
          }
       }catch(java.lang.IllegalArgumentException e0){
          e0.printStackTrace();
          super.b(p0);
       }
       return;
    }
}
