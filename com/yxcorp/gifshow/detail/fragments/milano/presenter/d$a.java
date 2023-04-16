package com.yxcorp.gifshow.detail.fragments.milano.presenter.d$a;
import qvb.q;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import sy6.a;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.View;

public class d$a implements q	// class@001520
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, d$a.class, "1")) {
          return;
       }
       List list = this.b.q.e0();
       if (p0 && (q.f(list) || r1.r3(list.get(0).getEntity()))) {
          this.b.t.setVisibility(8);
       }
       return;
    }
}
