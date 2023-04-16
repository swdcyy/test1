package com.kuaishou.live.core.show.statistics.a$a;
import xq5.c;
import com.kuaishou.live.core.show.statistics.a;
import java.lang.Object;
import xq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import f12.d;
import tj3.e;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bk2.a;
import java.lang.Runnable;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class a$a implements c	// class@001094
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void P(){
       b.a(this);
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       a q = tb.q;
       if (q != null && q.mPhoto != null) {
          if (tb.p == null) {
             int i = tb.P8().c();
             int i1 = 3;
             if (i == 1) {
                this.b.v = 2;
             }else if(i == 2){
                this.b.v = i1;
                i1 = 2;
             }else {
                i1 = 1;
             }
             this.b.t.o(i1);
          }
          tb = this.b;
          tb.p = false;
          if (!r1.u3(tb.q.mPhoto)) {
             this.b.m8().post(new a(this));
          }
       }
    label_005a :
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
