package com.kuaishou.live.lite.player.LiteColdStartFinishReporter;
import com.kuaishou.live.lite.player.LiteColdStartFinishReporter$enableColdStartResultMonitor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.player.LiteColdStartFinishReporter$logTag$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.entity.QPhoto;
import kc3.a;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import wkd.b;
import gb5.a;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class LiteColdStartFinishReporter	// class@000a5f
{
    public static final p a;
    public static final a b;
    public static boolean c;
    public static final LiteColdStartFinishReporter d;

    static {
       LiteColdStartFinishReporter.d = new LiteColdStartFinishReporter();
       LiteColdStartFinishReporter.a = s.c(LiteColdStartFinishReporter$enableColdStartResultMonitor$2.INSTANCE);
       LiteColdStartFinishReporter.b = LiteColdStartFinishReporter$logTag$1.INSTANCE;
    }
    public void LiteColdStartFinishReporter(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, LiteColdStartFinishReporter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = LiteColdStartFinishReporter.a.getValue();
       }
       return obj.booleanValue();
    }
    public final void b(Fragment p0,QPhoto p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiteColdStartFinishReporter.class, "5")) {
          return;
       }
       if (!this.a()) {
          return;
       }
       if (LiteColdStartFinishReporter.c) {
          return;
       }
       LiteColdStartFinishReporter.c = true;
       a b = LiteColdStartFinishReporter.b;
       if (b != null) {
          b = new a(b);
       }
       b.Z(b, "reportFirstFrameError, "+p1.getPhotoId());
       b.a(0x8708467).l(p0, true, p1, new RuntimeException(p2));
       return;
    }
}
