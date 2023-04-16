package com.kuaishou.live.lite.debuginfo.LiteDebugInfoAudiencePresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import com.kuaishou.live.lite.debuginfo.c;
import ds5.a;
import ga1.e;
import or5.d;
import ga1.d;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import c93.b;
import d93.a;

public class LiteDebugInfoAudiencePresenter extends d	// class@0008cf
{
    public a v;
    public d w;
    public e x;
    public d y;
    public n z;

    public void LiteDebugInfoAudiencePresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiteDebugInfoAudiencePresenter.class, "3")) {
          return;
       }
       super.F8();
       this.z.c(LayoutViewType.PlayerDebugInfo, new c(this.v, this.x, this.w, this.y));
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteDebugInfoAudiencePresenter.class, "1")) {
          return;
       }
       this.v = p0.a(a.class);
       this.w = p0.a(d.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteDebugInfoAudiencePresenter.class, "2")) {
          return;
       }
       this.z = p0.a(n.class);
       this.x = p0.a(e.class);
       this.y = p0.a(d.class);
       return;
    }
}
