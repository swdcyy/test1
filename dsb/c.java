package dsb.c;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dsb.d;
import java.util.Objects;
import android.content.Intent;
import android.net.Uri;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import ekd.j0;
import dsb.b;
import ok.h;
import je5.c;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import dsb.e;

public final class c implements ActivityContext$b	// class@00251c
{

    public void c(){
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       d e = d.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(p0, e, d.class, "13") && p0 != null) {
          Intent intent = p0.getIntent();
          if (intent != null) {
             Uri data = intent.getData();
             if (data != null) {
                Boolean uBoolean = Boolean.valueOf(data.isHierarchical());
                Uri uri = null;
                if (!uBoolean.booleanValue()) {
                   uBoolean = uri;
                }
                if (uBoolean != null) {
                   uBoolean.booleanValue();
                   intent = p0.getIntent();
                   String str = "activity.intent";
                   a.o(intent, str);
                   data = intent.getData();
                   if (data != null) {
                      Intent intent1 = p0.getIntent();
                      a.o(intent1, str);
                      a.o(data, "it");
                      Objects.requireNonNull(e);
                      Object obj = PatchProxy.applyTwoRefs(intent1, data, e, d.class, "14");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else if(j0.g(intent1, "provider")){
                         if (!e.k(data)) {
                            intent1 = PatchProxy.applyOneRefs(data, e, d.class, "16");
                            if (intent1 != PatchProxyResult.class) {
                               uri = intent1;
                            }else {
                               String str1 = c.b(data, "1", b.b);
                               if (str1 != null) {
                                  uri = Uri.parse(str1);
                               }
                            }
                            if (!e.k(uri)) {
                            label_009b :
                               if (!TextUtils.n(String.valueOf(4), x0.a(data, "backHomeTabId"))) {
                                  b = false;
                               }
                            }
                         }
                      }else {
                         goto label_009b ;
                      }
                      b = true;
                      if (b) {
                         d.b(8);
                      }
                   }
                }
             }
          }
       }
    label_00b6 :
       return;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       a.e(this);
       d e = d.e;
       d.a(e).b(8);
       e uoe = d.a(e);
       uoe.a(e.e());
       d.b(512);
       return;
    }
    public void onForeground(){
       a.f(this);
    }
}
