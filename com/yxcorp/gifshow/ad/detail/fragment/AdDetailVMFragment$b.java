package com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment$b;
import joc.b0;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import jz8.n;
import java.lang.Integer;

public final class AdDetailVMFragment$b implements b0	// class@001554
{
    public final AdDetailVMFragment a;

    public void AdDetailVMFragment$b(AdDetailVMFragment p0){
       this.a = p0;
       super();
    }
    public final boolean a(MotionEvent p0,boolean p1){
       if (PatchProxy.isSupport(AdDetailVMFragment$b.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, AdDetailVMFragment$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       AdDetailVMFragment l = this.a.L;
       a.m(l);
       n n = l.n;
       boolean b = (n == null || n.intValue())? true: false;
       return b;
    }
}
