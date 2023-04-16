package nh9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;

public final class a	// class@003183
{

    public static final boolean a(b p0){
       int b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       GifshowActivity obj = PatchProxy.applyOneRefs(p0, null, uoa, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isFromIM");
       obj = PatchProxy.applyOneRefs(p0, null, uoa, "2");
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          a.p(p0, "$this$isFromImCapture");
          obj = p0.a();
          if (obj != null) {
             Intent intent1 = obj.getIntent();
             if (intent1 != null) {
                b1 = j0.b(intent1, "camera_page_source", 0);
                if (b1 == 19 || b1 == 21) {
                   b1 = true;
                }
             }
          }
          b1 = false;
       }
       if (!b1) {
          Object obj1 = PatchProxy.applyOneRefs(p0, null, uoa, "1");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else {
             a.p(p0, "$this$isFromImTakeSame");
             GifshowActivity gifshowActiv = p0.a();
             if (gifshowActiv != null) {
                Intent intent = gifshowActiv.getIntent();
                if (intent != null && j0.b(intent, "camera_page_source", 0) == 20) {
                   b2 = true;
                }
             }
             b2 = false;
          }
          if (!b2) {
             b = false;
          }
       }
       return b;
    }
}
