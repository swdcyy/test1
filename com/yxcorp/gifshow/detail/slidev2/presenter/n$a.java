package com.yxcorp.gifshow.detail.slidev2.presenter.n$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;

public class n$a extends a	// class@0019c8
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void F1(){
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("AdapterLoggerPresenter", "attached: "+this.b.r.getCaption(), objArray);
       this.b.P8();
       return;
    }
}
