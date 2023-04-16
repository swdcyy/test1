package com.yxcorp.gifshow.ad.detail.presenter.log.a$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.log.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.e;
import wkd.b;
import mxb.f0;
import com.kwai.framework.model.feed.BaseFeed;

public class a$b extends a	// class@00165d
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       if (!e.d(this.b.p)) {
          b.a(-762347696).o1(this.b.p.mEntity, "played_info_counter");
       }
       a$b tb = this.b;
       tb.v = 0;
       tb.w = false;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a$b tb = this.b;
       b.a(-762347696).r1(tb.p.mEntity, "played_info_counter", tb.z);
       return;
    }
}
