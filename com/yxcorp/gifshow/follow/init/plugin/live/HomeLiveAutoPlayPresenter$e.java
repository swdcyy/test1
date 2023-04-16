package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$e;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import java.lang.Object;
import o17.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v99.a;
import ba9.a;
import kotlin.jvm.internal.a;
import im8.f;
import s99.m;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;

public final class HomeLiveAutoPlayPresenter$e implements RefreshLayout$h	// class@0010c1
{
    public final HomeLiveAutoPlayPresenter a;

    public void HomeLiveAutoPlayPresenter$e(HomeLiveAutoPlayPresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       i.a(this, p0, p1, p2);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter$e.class, "1")) {
          return;
       }
       i.d(this);
       HomeLiveAutoPlayPresenter$e ta = this.a;
       if (ta.p != 1) {
          return;
       }
       if (HomeLiveAutoPlayPresenter.R8(ta).f(HomeLiveAutoPlayPresenter.P8(this.a))) {
          HomeLiveAutoPlayPresenter.R8(this.a).v("page_refresh", HomeLiveAutoPlayPresenter.P8(this.a));
       }
       HomeLiveAutoPlayPresenter t = this.a.T;
       if (t == null) {
          a.S("mAutoPlayConfigRef");
       }
       m om = t.get();
       if (om != null) {
          om.d(this.a.W8());
       }
       return;
    }
    public void pullToRefresh(){
       i.b(this);
    }
    public void refreshComplete(){
       i.c(this);
    }
    public void releaseToRefresh(){
       i.e(this);
    }
}
