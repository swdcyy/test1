package bra.e;
import w4.j;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cra.w;
import q87.c;

public final class e implements j	// class@000430
{
    public final UnmuteTipView a;
    public final String b;

    public void e(UnmuteTipView p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
       }else {
          w.C().e("VolumeTipView", "unable to load animation", p0);
          this.a.setMLoadError(true);
          PatchProxy.onMethodExit(e.class, "1");
       }
       return;
    }
}
