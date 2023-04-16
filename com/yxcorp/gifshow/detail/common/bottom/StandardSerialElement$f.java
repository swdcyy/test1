package com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$f;
import erd.g;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9a.b;

public final class StandardSerialElement$f implements g	// class@00139e
{
    public final StandardSerialElement b;

    public void StandardSerialElement$f(StandardSerialElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StandardSerialElement$f.class, "1")) {
       }else {
          p0 = this.b;
          p0.A.a(p0.s0(), StandardSerialElement.n0(this.b), "AUTOMATIC");
          this.b.x0();
       }
       return;
    }
}
