package com.kuaishou.merchant.dynamicpendant.mount.litelive.delegate.bottombubble.LiteBottomBubbleAreaMountDelegate$a;
import ew3.c;
import com.kuaishou.merchant.dynamicpendant.mount.litelive.delegate.bottombubble.LiteBottomBubbleAreaMountDelegate;
import android.view.View;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.String;
import f93.e;
import f93.b;
import n93.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ew3.b;
import android.content.Context;
import com.yxcorp.utility.n;
import kotlin.jvm.internal.a;

public final class LiteBottomBubbleAreaMountDelegate$a extends c	// class@00169a
{
    public final LiteBottomBubbleAreaMountDelegate a;
    public final View b;
    public final PendantMountInfo c;
    public final String d;

    public void LiteBottomBubbleAreaMountDelegate$a(LiteBottomBubbleAreaMountDelegate p0,View p1,PendantMountInfo p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public a a(e p0,b p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiteBottomBubbleAreaMountDelegate$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       LiteBottomBubbleAreaMountDelegate$a ta = this.a;
       LiteBottomBubbleAreaMountDelegate$a tb = this.b;
       LiteBottomBubbleAreaMountDelegate$a tc = this.c;
       LiteBottomBubbleAreaMountDelegate$a td = this.d;
       Context context = tb.getContext();
       float f = (this.c.getHeight() > 0)? (float)this.c.getHeight(): 0;
       b uob = new b(tb, tc, td, ta, n.c(context, f));
       ta.i(v6);
       b uob1 = this.a.h();
       if (uob1 != null) {
          uob1.j = p1;
       }
       uob1 = this.a.h();
       a.m(uob1);
       return uob1;
    }
}
