package com.kuaishou.merchant.home2.home.presenter.FeedMonitorPresenter$a;
import ow3.d;
import com.kuaishou.merchant.home2.home.presenter.FeedMonitorPresenter;
import java.lang.Object;
import ow3.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public final class FeedMonitorPresenter$a implements d	// class@0017d4
{
    public final FeedMonitorPresenter a;

    public void FeedMonitorPresenter$a(FeedMonitorPresenter p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedMonitorPresenter$a.class, "1")) {
          return;
       }
       this.a.t.add(p0);
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedMonitorPresenter$a.class, "2")) {
          return;
       }
       this.a.t.remove(p0);
       return;
    }
}
