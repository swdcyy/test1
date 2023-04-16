package com.yxcorp.gifshow.activity.share.presenter.h0$a;
import lq.l;
import com.yxcorp.gifshow.activity.share.presenter.h0;
import java.lang.Object;
import lq.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq.i;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import lq.j;
import java.util.Collection;

public class h0$a implements l	// class@0013e8
{
    public final h0 a;

    public void h0$a(h0 p0){
       this.a = p0;
       super();
    }
    public void a(l$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0$a.class, "1")) {
          return;
       }
       if (i.m().G() instanceof ShareActivity) {
          this.a.P8();
          this.a.S8(p0);
       }
       return;
    }
    public void b(i p0,boolean p1){
       j.c(this, p0, p1);
    }
    public void c(){
       j.b(this);
    }
    public void d(i p0){
       j.d(this, p0);
    }
    public void e(i p0,Collection p1){
       j.e(this, p0, p1);
    }
}
