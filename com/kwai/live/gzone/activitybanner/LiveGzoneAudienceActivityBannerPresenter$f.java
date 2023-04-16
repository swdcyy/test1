package com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$f;
import w37.b;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.RelativeLayout;
import w37.a;
import java.util.Set;
import lp3.e;
import lp3.c;
import lp3.b;
import java.lang.Number;
import uxc.e;
import java.lang.Integer;

public class LiveGzoneAudienceActivityBannerPresenter$f implements b	// class@000c57
{
    public final LiveGzoneAudienceActivityBannerPresenter b;

    public void LiveGzoneAudienceActivityBannerPresenter$f(LiveGzoneAudienceActivityBannerPresenter p0){
       this.b = p0;
       super();
    }
    public boolean Ae(){
       boolean b;
       LiveGzoneAudienceActivityBannerPresenter$f obj = PatchProxy.apply(null, this, LiveGzoneAudienceActivityBannerPresenter$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj.S == 2) {
          LiveGzoneAudienceActivityBannerPresenter x = obj.x;
          if (x != null && !x.getVisibility()) {
             b = true;
          label_0028 :
             return b;
          }
       }
       b = false;
       goto label_0028 ;
    }
    public boolean V1(){
       return this.b.H;
    }
    public void W3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceActivityBannerPresenter$f.class, "2")) {
          return;
       }
       this.b.Q.add(p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public int d3(){
       LiveGzoneAudienceActivityBannerPresenter obj = PatchProxy.apply(null, this, LiveGzoneAudienceActivityBannerPresenter$f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.Z0;
       if (obj != null) {
          return obj.d3();
       }
       return 0;
    }
    public void destroy(){
       b.b(this);
    }
    public void h5(int p0){
       LiveGzoneAudienceActivityBannerPresenter$f uof = LiveGzoneAudienceActivityBannerPresenter$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "4")) {
          return;
       }
       LiveGzoneAudienceActivityBannerPresenter z0 = this.b.Z0;
       if (z0 != null) {
          z0.h5(p0);
       }
       return;
    }
    public int so(){
       return this.b.W0;
    }
    public void x2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceActivityBannerPresenter$f.class, "3")) {
          return;
       }
       this.b.Q.remove(p0);
       return;
    }
}
