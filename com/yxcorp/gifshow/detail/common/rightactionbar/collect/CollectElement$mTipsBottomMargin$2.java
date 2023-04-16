package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$mTipsBottomMargin$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import android.app.Activity;
import com.yxcorp.gifshow.util.Edge2EdgeHelper;
import lnc.a1;
import uh5.e;
import java.lang.Integer;

public final class CollectElement$mTipsBottomMargin$2 extends Lambda implements a	// class@0014a0
{
    public final CollectElement this$0;

    public void CollectElement$mTipsBottomMargin$2(CollectElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CollectElement$mTipsBottomMargin$2 obj = PatchProxy.apply(objArray, this, CollectElement$mTipsBottomMargin$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, CollectElement.class, "8");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): (Edge2EdgeHelper.c(obj.Q) + a1.d(0x7f07034b)) + e.c();
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
