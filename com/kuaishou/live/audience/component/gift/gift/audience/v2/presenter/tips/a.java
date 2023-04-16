package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a;
import android.view.ViewGroup;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a$b;
import wk1.b;
import java.lang.String;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$ComboBatchSendGiftConfig;
import ql1.d$b;
import java.lang.Object;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a$a;
import ql1.c;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.models.Gift;
import mk1.w;
import java.util.Objects;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.LiveGiftBoxBatchTipsView;
import androidx.constraintlayout.widget.Group;
import android.view.View;
import d61.h;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$BatchCountEntranceRes;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n01.b;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import qkd.b;
import android.widget.ImageView;
import n01.e;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import msd.l;
import com.kuaishou.live.common.core.basic.tools.l;
import bh1.a;

public class a	// class@000b64
{
    public final ViewGroup a;
    public final a$b b;
    public final String c;
    public final b d;
    public final LiveTimeConsumingUserStatusResponse$ComboBatchSendGiftConfig e;
    public final d$b f;
    public LiveGiftBoxBatchTipsView g;
    public final c h;

    public void a(ViewGroup p0,a$b p1,b p2,String p3,LiveTimeConsumingUserStatusResponse$ComboBatchSendGiftConfig p4,d$b p5){
       super();
       a$a uoa = new a$a(this);
       this.h = uoa;
       this.a = p0;
       this.b = p1;
       this.c = p3;
       this.d = p2;
       this.e = p4;
       this.f = p5;
       p5.K2(uoa);
    }
    public final boolean a(GiftPanelItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       int i = (p0 != null && (p0.getGift() != null && w.l(p0.getGift()) > 1))? 1: 0;
       int i1 = (p0 != null && p0.mRecoBatchSize > 1)? 1: 0;
       a te = this.e;
       te = (te != null && te.mRecoBatchConfig != null)? 1: 0;
       if (i && (i1 && te)) {
          b = true;
       }
    label_0045 :
       return b;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       a tg = this.g;
       if (tg != null) {
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoid(objArray, tg, LiveGiftBoxBatchTipsView.class, "3")) {
             tg.F.setVisibility(8);
          }
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       if (this.g == null) {
          a ta = this.a;
          if (ta != null) {
             this.g = h.f(ta, 0x7f0a1d2c, 0x7f0a3446);
          }
       }
       return;
    }
    public void d(int p0){
       LiveTimeConsumingUserStatusResponse$BatchCountEntranceRes uBatchCountE;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       this.c();
       a tg = this.g;
       String str = "9";
       if (PatchProxy.isSupport(uoa)) {
          uBatchCountE = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, str);
          if (uBatchCountE != patchProxyRe) {
          }else {
          label_0033 :
             uoa = this.e;
             if (uoa != null && uoa.mResList != null) {
                int i = 0;
                while (true) {
                   if (i < this.e.mResList.size()) {
                      LiveTimeConsumingUserStatusResponse$BatchCountEntranceRes uBatchCountE1 = this.e.mResList.get(i);
                      if (uBatchCountE1 != null && uBatchCountE1.mBatchCount == p0) {
                         uBatchCountE = uBatchCountE1.mResKey;
                      }else {
                         i = i + 1;
                      }
                   }
                }
             }
             uBatchCountE = null;
          }
       }else {
          goto label_0033 ;
       }
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(uBatchCountE, tg, LiveGiftBoxBatchTipsView.class, "7")) {
          if (!TextUtils.x(uBatchCountE)) {
             String str1 = PatchProxy.applyOneRefs(uBatchCountE, null, b.class, "3");
             if (str1 != patchProxyRe) {
             }else {
                str1 = LiveResourceFileUtil.k("live_gift_box_effect_res")+File.separator+uBatchCountE;
             }
             if (b.S(LiveResourceFileUtil.j(LiveResourceFileUtil$LiveResourceFileType.LIVE_GIFT_BOX_EFFECT, str1))) {
                tg.D.setVisibility(0);
                if (!PatchProxy.applyVoid(null, tg, LiveGiftBoxBatchTipsView.class, str) && tg.G == null) {
                   tg.G = new e(tg);
                }
                tg.removeCallbacks(tg.G);
                l.b(tg.D, str1, 0, new e(tg), b.b);
                tg.postDelayed(tg.G, 900);
                a.b("3");
             }else {
                a.a("3", "res_failed");
             }
          }else {
             a.a("3", "data_empty");
          }
       }
       return;
    }
}
