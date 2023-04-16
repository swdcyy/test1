package m3a.v;
import fp5.a;
import m3a.v$a;
import nsd.u;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.c;
import k2b.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.log.b;
import android.content.ComponentName;
import android.content.Intent;
import java.lang.Throwable;
import android.content.Context;
import o56.f;
import java.lang.Boolean;
import m3a.x;

public class v implements a	// class@002f26
{
    public static final v$a b;

    static {
       v.b = new v$a(null);
    }
    public void v(){
       super();
    }
    public void Jt(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "5")) {
          return;
       }
       if (p0 != null) {
          o oo = o.C();
          String str = "restoreToPreActivity "+p0.getClass().getName();
          Object[] objArray = new Object[0];
          try{
             oo.w("SmallWindowPluginImpl", str, objArray);
             List list = PatchProxy.apply(null, null, u1.class, "19");
             if (list != PatchProxyResult.class) {
             }else {
                list = b.a(0x4b316083).g0();
             }
             if (list.size() > 1) {
                b uob = list.get((list.size() - 2));
                a.o(uob, "activityStack");
                uob = uob.c();
                if (uob != null) {
                   ComponentName uComponentNa = uob.H();
                   if (uComponentNa != null) {
                      Object[] objArray2 = new Object[0];
                      o.C().w("SmallWindowPluginImpl", "pre Activity "+uComponentNa.getClassName(), objArray2);
                      Intent intent = new Intent();
                      intent.setComponent(uComponentNa);
                      intent.setFlags(0x20020000);
                      p0.startActivity(intent);
                   }
                }
             }
          }catch(java.lang.Exception e7){
             Object[] objArray1 = new Object[0];
             o.C().u("SmallWindowPluginImpl", e7, objArray1);
          }
       }
    }
    public void Nd(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       boolean b = false;
       try{
          if (f.b(p0)) {
             if (p0 != null) {
                p0.moveTaskToBack(b);
             }
          }else if(p0 != null){
             p0.finishAndRemoveTask();
          }
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[b];
          o.C().u("SmallWindowPluginImpl", e4, objArray);
       }
       return;
    }
    public void YO(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "4")) {
          return;
       }
       if (p0 != null) {
          Object[] objArray = new Object[0];
          o.C().w("SmallWindowPluginImpl", "restoreToFullScreen "+p0.getClass().getName(), objArray);
          Intent intent = new Intent(p0, p0.getClass());
          intent.setFlags(0x20000);
          p0.startActivity(intent);
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void nd(Activity p0){
       String name;
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "3")) {
          return;
       }
       int i = 0;
       try{
          o oo = o.C();
          StringBuilder str = "finishActivity ";
          if (p0 != null) {
             name = p0.getClass().getName();
          label_0028 :
             Object[] objArray1 = new Object[i];
             oo.w("SmallWindowPluginImpl", str+name, objArray1);
             if (p0 != null) {
                p0.finishAndRemoveTask();
             }
          }else {
             name = null;
             goto label_0028 ;
          }
       }catch(java.lang.Exception e6){
          Object[] objArray = new Object[i];
          o.C().u("SmallWindowPluginImpl", e6, objArray);
       }
       return;
    }
    public boolean s0(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (x.b.b() && (p0 != null && p0.isInPictureInPictureMode() == true)) {
          b = true;
       }
    label_0026 :
       return b;
    }
}
