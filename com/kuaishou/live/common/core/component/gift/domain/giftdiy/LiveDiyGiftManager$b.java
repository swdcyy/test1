package com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$b;
import aj1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager;
import java.lang.Object;
import cj1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import cj1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager;
import bj1.d;
import com.yxcorp.gifshow.models.Gift;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$b$a;
import rw1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import msd.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$b$b;
import cj1.c;
import bj1.c$a;
import bj1.c;

public final class LiveDiyGiftManager$b implements a	// class@001237
{
    public final LiveDiyGiftManager a;

    public void LiveDiyGiftManager$b(LiveDiyGiftManager p0){
       this.a = p0;
       super();
    }
    public void a(b p0,int p1){
       LiveDiyGiftManager$b uob = LiveDiyGiftManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       uob = this.a;
       uob.h = null;
       Iterator iterator = uob.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void b(int p0){
       LiveDiyGiftManager$b uob = LiveDiyGiftManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       Iterator iterator = this.a.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDiyGiftManager$b.class, "3")) {
          return;
       }
       a.p(p0, "diyInputInfo");
       this.a.f.c(p0.a(), new a(p0.e()));
       Iterator iterator = this.a.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public void d(b p0,int p1){
       LiveDiyGiftManager$b uob = LiveDiyGiftManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "5")) {
          return;
       }
       a.p(p0, "diyInputInfo");
       Iterator iterator = this.a.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0, p1);
       }
       return;
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDiyGiftManager$b.class, "1")) {
          return;
       }
       a.p(p0, "diyInputInfo");
       int i = 1;
       if (this.a.b().b(p0.c(), i)) {
          b.Z(this.a.c, "[onSendGiftBtnClick] isNotSufficientToSendGift, open rechargePanel");
          this.a.b().a("LIVE_ROOM_EXPAND_GIFT_DIALOG_SEND_GIFT", new LiveDiyGiftManager$b$a(this, p0));
       }else {
          b.Z(this.a.c, "[onSendGiftBtnClick] sendGiftToAnchor");
          String str = (TextUtils.x(p0.e()))? p0.b(): p0.e();
          this.a.f(i);
          this.a.q.invoke();
          this.a.n.a(p0.c(), 1, str, p0.f, new LiveDiyGiftManager$b$b(this, p0));
       }
       Iterator iterator = this.a.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0);
       }
       return;
    }
}
