package com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LiveAudienceGiftBoxPreviewManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import z1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LiveAudienceGiftBoxPreviewManager$a;
import aj1.b;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LiveAudienceGiftBoxPreviewManager$c;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LiveAudienceGiftBoxPreviewManager$b;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LivePreviewEffectInfo;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import mi1.b;
import mi1.b$a;
import cj1.a;

public final class LiveAudienceGiftBoxPreviewManager extends LifecycleManager	// class@001240
{
    public final c c;
    public final b d;
    public GiftPanelItem e;
    public final LiveAudienceGiftBoxPreviewManager$c f;
    public final LiveAudienceGiftBoxPreviewManager$b g;
    public final k h;
    public final k i;
    public final LiveDiyGiftManager j;
    public final a k;

    public void LiveAudienceGiftBoxPreviewManager(LifecycleOwner p0,k p1,k p2,LiveDiyGiftManager p3,a p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "liveStreamPackage");
       a.p(p3, "diyGiftManager");
       a.p(p4, "isLandscape");
       super(p0);
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.c = LiveAudienceGiftBoxPreviewManager$a.b;
       this.d = new b(p2);
       this.f = new LiveAudienceGiftBoxPreviewManager$c();
       LiveAudienceGiftBoxPreviewManager$b uob = new LiveAudienceGiftBoxPreviewManager$b(this);
       this.g = uob;
       Objects.requireNonNull(p3);
       if (PatchProxy.applyVoidOneRefs(uob, p3, LiveDiyGiftManager.class, "4")) {
       }else {
          a.p(uob, "listener");
          p3.d.add(uob);
       }
       return;
    }
    public final void b(LivePreviewEffectInfo p0){
       LiveAudienceGiftBoxPreviewManager liveAudience = LiveAudienceGiftBoxPreviewManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveAudience, "5")) {
          return;
       }
       if (p0 == null) {
          b.Z(this.c, "[tryShowSelectedPreviewEffect] previewEffectInfo is null");
          this.j.e("tryShowSelectedPreviewEffect-previewEffectInfo is null");
          return;
       }else {
          LivePreviewEffectInfo commonEffect = p0.commonEffectInfo;
          if (p0.needPreviewEffect != null && !TextUtils.x(commonEffect)) {
             a.m(commonEffect);
             LiveCommonEffectInfo liveCommonEf = PatchProxy.applyOneRefs(commonEffect, this, liveAudience, "6");
             if (liveCommonEf != PatchProxyResult.class) {
             }else if(commonEffect == null){
                b.Z(this.c, "[parseLiveCommonEffectInfo] infoBase64 is null");
             }else {
                byte[] uobyteArray = b.a.b(commonEffect);
                if (uobyteArray != null) {
                   liveCommonEf = LiveCommonEffectInfo.parseFrom(uobyteArray);
                }
             }
             liveCommonEf = null;
             if (liveCommonEf != null) {
                this.j.d(liveCommonEf, null);
             }
          }else {
             this.j.e("tryShowSelectedPreviewEffect");
          }
          return;
       }
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxPreviewManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       LiveAudienceGiftBoxPreviewManager tj = this.j;
       LiveAudienceGiftBoxPreviewManager tg = this.g;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoidOneRefs(tg, tj, LiveDiyGiftManager.class, "5")) {
          a.p(tg, "listener");
          tj.d.remove(tg);
       }
       return;
    }
}
