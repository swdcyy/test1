package com.facebook.react.modules.core.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a$a;
import android.view.Choreographer$FrameCallback;

public class a	// class@00129a
{
    public Handler a;
    public Choreographer b;
    public static a c;

    public void a(){
       super();
       Choreographer uChoreograph = PatchProxy.apply(null, this, a.class, "5");
       if (uChoreograph != PatchProxyResult.class) {
       }else {
          uChoreograph = Choreographer.getInstance();
       }
       this.b = uChoreograph;
       return;
    }
    public static a a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       UiThreadUtil.assertOnUiThread();
       if (a.c == null) {
          a.c = new a();
       }
       return a.c;
    }
    public void b(a$a p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       Choreographer$FrameCallback uFrameCallba = p0.b();
       if (!PatchProxy.applyVoidOneRefs(uFrameCallba, this, uoa, "6")) {
          this.b.postFrameCallback(uFrameCallba);
       }
       return;
    }
}
