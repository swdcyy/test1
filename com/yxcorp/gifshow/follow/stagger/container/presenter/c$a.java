package com.yxcorp.gifshow.follow.stagger.container.presenter.c$a;
import qvb.q;
import com.yxcorp.gifshow.follow.stagger.container.presenter.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import wkd.b;
import com.yxcorp.gifshow.w;
import uv8.e1;
import androidx.fragment.app.Fragment;
import gb5.a;
import java.lang.StringBuilder;
import qvb.p;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.d;
import java.util.Objects;
import z0b.c;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import jb5.a;
import hb5.d;
import com.yxcorp.gifshow.follow.stagger.container.presenter.a;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;

public class c$a implements q	// class@00115e
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       w ow = b.a(-1343064608);
       if (ow != null && p0) {
          ow.z().N(this.b.q, p1);
          b.a(0x8708467).log("onDataFetchFailed HomeItemPresenter tab: "+this.b.w);
       }
       return;
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
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       w ow = b.a(-1343064608);
       if (ow != null && p0) {
          ow.z().D(this.b.q, p1);
          RxBus.f.b(new d());
       }
       c$a tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tb, uoc, "5") && (tb.q.C0().getItemCount() > 0 && !tb.p.h2()))) {
          if (tb.w != 2 && p0) {
             d.b("pull_down", 1, 0, 8, 801, null, "REFRESH");
          }
          Kgi.c(a.b);
       }
    label_0083 :
       return;
    }
}
