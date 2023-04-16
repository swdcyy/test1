package bra.c;
import w4.j;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cra.w;
import q87.c;

public final class c implements j	// class@00042e
{
    public final UnmuteTipView a;
    public final String b;

    public void c(UnmuteTipView p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
       }else {
          w.C().e("VolumeTipView", "unable to load animation", p0);
          this.a.setMLoadError(true);
          PatchProxy.onMethodExit(c.class, "1");
       }
       return;
    }
}
