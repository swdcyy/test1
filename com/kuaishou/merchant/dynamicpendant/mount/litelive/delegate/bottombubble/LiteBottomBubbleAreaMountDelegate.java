package com.kuaishou.merchant.dynamicpendant.mount.litelive.delegate.bottombubble.LiteBottomBubbleAreaMountDelegate;
import com.kwaishou.merchant.daccore.mount.delegate.base.BaseMountDelegate;
import f93.c;
import java.lang.String;
import android.view.View;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import kotlin.Pair;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.dynamicpendant.mount.litelive.delegate.bottombubble.LiteBottomBubbleAreaMountDelegate$a;
import f93.a;
import f93.e;
import com.kuaishou.live.lite.benefitcard.LiveLiteBenefitCardType;
import f93.f;
import nsd.u;
import java.util.Locale;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.dynamicpendant.mount.litelive.delegate.bottombubble.LiteBottomBubbleAreaMountDelegate$addComponent$2;
import msd.l;
import f93.c$a;
import java.lang.Boolean;
import ew3.b;
import f93.b;

public final class LiteBottomBubbleAreaMountDelegate extends BaseMountDelegate	// class@00169d
{
    public b b;
    public c c;

    public void LiteBottomBubbleAreaMountDelegate(c p0){
       super();
       this.c = p0;
    }
    public Pair d(String p0,View p1,PendantMountInfo p2){
       String str3;
       LiteBottomBubbleAreaMountDelegate liteBottomBu = this;
       String str = p0;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiteBottomBubbleAreaMountDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       liteBottomBu.c.b(new LiteBottomBubbleAreaMountDelegate$a(liteBottomBu, p1, p2, str));
       e uoe = new e(LiveLiteBenefitCardType.MERCHANT_DY, "", new f(null, 1, null));
       LiteBottomBubbleAreaMountDelegate c = liteBottomBu.c;
       obj = p2.getPendantCode();
       String str1 = "MERCHANT_DYNAMIC_BOTTOM_BUBBLE";
       String str2 = (obj != null)? obj: str1;
       obj = p2.getPendantCode();
       if (obj != null) {
          obj = obj.toUpperCase(Locale.getDefault());
          a.o(obj, "\(this as java.lang.String\).toUpperCase\(locale\)");
          if (obj != null) {
             str3 = obj;
          label_005e :
             c$a.a(c, uoe, str2, str3, p2.getShowMills(), 0, 0, LiteBottomBubbleAreaMountDelegate$addComponent$2.INSTANCE, null, 128, null);
             return new Pair(str, Boolean.TRUE);
          }
       }
       str3 = str1;
       goto label_005e ;
    }
    public boolean g(Object p0,String p1,PendantMountInfo p2){
       boolean b;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiteBottomBubbleAreaMountDelegate.class, "2");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else {
          p0 = this.b;
          if (p0 != null && !PatchProxy.applyVoid(null, p0, b.class, "2")) {
             p0 = p0.j;
             if (p0 != null) {
                p0.dismiss();
             }
          }
          b = true;
       }
       return b;
    }
    public final b h(){
       return this.b;
    }
    public final void i(b p0){
       this.b = p0;
    }
}
