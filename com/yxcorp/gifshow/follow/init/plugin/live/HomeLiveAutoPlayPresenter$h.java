package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$h;
import com.yxcorp.gifshow.follow.init.plugin.live.d$a;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import oha.t;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import k2b.e0;

public final class HomeLiveAutoPlayPresenter$h implements d$a	// class@0010c4
{
    public final HomeLiveAutoPlayPresenter a;

    public void HomeLiveAutoPlayPresenter$h(HomeLiveAutoPlayPresenter p0){
       this.a = p0;
       super();
    }
    public final void a(QPhoto p0,int p1){
       HomeLiveAutoPlayPresenter$h oh = HomeLiveAutoPlayPresenter$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "1")) {
          return;
       }
       oh = this.a;
       HomeLiveAutoPlayPresenter p = oh.p;
       if (p != 3) {
          if (p != 5) {
             t.b(p0, p1);
          }else {
             t.c(oh.X8(), p0, p1);
          }
       }else {
          t.a(oh.X8(), p0, p1);
       }
       return;
    }
}
