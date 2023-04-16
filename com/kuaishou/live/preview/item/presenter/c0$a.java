package com.kuaishou.live.preview.item.presenter.c0$a;
import d6a.a;
import com.kuaishou.live.preview.item.presenter.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Boolean;
import pp.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import q87.c;
import dl3.z0;
import java.lang.Runnable;
import ekd.k1;
import rf5.m;

public class c0$a extends a	// class@000e17
{
    public final c0 b;

    public void c0$a(c0 p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, c0$a.class, "3")) {
          return;
       }
       if (this.b.r.get().booleanValue()) {
          Object[] objArray = new Object[0];
          a.C().w("LiveSimplePlayStatusPre", "removeItem   "+this.b.q.mEntity.getId(), objArray);
          k1.r(new z0(this), 0);
       }
       return;
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, c0$a.class, "2")) {
          return;
       }
       c0 z = this.b.z;
       if (z != null) {
          z.a(false, 3);
          this.b.z.a(false, 4);
       }
       this.b.P8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, c0$a.class, "1")) {
          return;
       }
       c0$a tb = this.b;
       if (tb.B == true) {
          tb.S8();
       }
       tb = this.b;
       c0 z = tb.z;
       if (z == null) {
          return;
       }else {
          c0 b = tb.B;
          if (b == true) {
             z.a(true, 4);
          }else if(b != 2){
             z.a(true, 3);
          }
          return;
       }
    }
}
