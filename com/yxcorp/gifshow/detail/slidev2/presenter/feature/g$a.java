package com.yxcorp.gifshow.detail.slidev2.presenter.feature.g$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import bo5.a;
import co5.a;
import androidx.fragment.app.Fragment;
import zq6.p;
import as6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import e8a.s;
import erd.g;

public class g$a extends a	// class@001943
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "2")) {
          return;
       }
       b9.a(this.b.u);
       g r = this.b.r;
       if (r != null) {
          a.a(r, a.o, a.b);
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, g$a.class, str)) {
          return;
       }
       g$a tb = this.b;
       g r = tb.r;
       if (r != null) {
          p o = a.o;
          QPhoto mEntity = tb.q.mEntity;
          a uoa = PatchProxy.applyOneRefs(mEntity, objArray, a.class, str);
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new a(mEntity);
          }
          a.a(r, o, uoa);
       }
       if (this.b.r.getParentFragment() != null) {
          tb = this.b;
          tb.u = tb.r.getParentFragment().n1().subscribe(new s(this));
       }
       return;
    }
}
