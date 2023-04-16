package com.kuaishou.live.liteend.baseinfo.LiveLiteEndBaseInfoPresenter;
import b93.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.liteend.baseinfo.a;
import ae3.f;
import or5.d;
import java.lang.Runnable;
import com.kuaishou.live.liteend.framework.LiteEndLayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import com.kuaishou.live.liteend.baseinfo.c;
import id3.h;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import c93.b;
import d93.a;

public class LiveLiteEndBaseInfoPresenter extends d	// class@000bbb
{
    public d v;
    public n w;
    public h x;
    public LiveLiteRecommendSideBarService y;

    public void LiveLiteEndBaseInfoPresenter(){
       super();
    }
    public static void c9(LiveLiteEndBaseInfoPresenter p0){
       Objects.requireNonNull(p0);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEndBaseInfoPresenter.class, "3")) {
          return;
       }
       super.F8();
       this.w.c(LiteEndLayoutViewType.Background, new a(this.v, new f(this)));
       this.w.c(LiteEndLayoutViewType.BaseInfo, new c(this.v, this.x, this.y, new f(this)));
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndBaseInfoPresenter.class, "1")) {
          return;
       }
       this.v = p0.a(d.class);
       this.x = p0.a(h.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndBaseInfoPresenter.class, "2")) {
          return;
       }
       this.w = p0.a(n.class);
       this.y = p0.a(LiveLiteRecommendSideBarService.class);
       return;
    }
}
