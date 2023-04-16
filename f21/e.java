package f21.e;
import x61.c;
import android.content.Context;
import android.app.Activity;
import t02.a0;
import ok.x;
import mrd.c;
import hg2.e;
import lp3.i;
import om1.a;
import xp5.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import f21.b;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import z61.b;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import java.util.Objects;
import f21.b$a;
import java.util.List;
import java.lang.Runnable;
import f21.e$a;

public final class e	// class@0022a3
{
    public b a;
    public final MutableLiveData b;
    public f c;
    public final c d;
    public final Context e;
    public final Activity f;
    public final a0 g;
    public final x h;
    public final x i;
    public final c j;
    public final e k;
    public final i l;
    public final a m;
    public final g n;

    public void e(c p0,Context p1,Activity p2,a0 p3,x p4,x p5,c p6,e p7,i p8,a p9,g p10){
       a.p(p0, "liveBottomBarService");
       a.p(p3, "livePlayCallerContext");
       a.p(p4, "giftGuideInfoSupplier");
       a.p(p5, "giftGuideGiftSupplier");
       a.p(p7, "liveAudienceSendGiftRealActionService");
       a.p(p8, "liveServiceManager");
       a.p(p9, "liveSendGiftTraceService");
       a.p(p10, "liveInfoManager");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.j = p6;
       this.k = p7;
       this.l = p8;
       this.m = p9;
       this.n = p10;
       this.a = new b();
       this.b = new MutableLiveData();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       e ta = this.a;
       ta.mIsVisible = Boolean.FALSE;
       ta.k(false);
       this.b.setValue(this.a);
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       a.p(p0, "giftToken");
       String str = "[LiveMultiLineBottomBarController][tryShowBottomBarGiftItem]";
       if (this.h.get() == null || this.h.get().mEnableLiveExplicitGift == null) {
          b.c0(LiveLogTag.Live_LINE_GIFT_BATTLE, str, "giftConfig", this.h.get());
          return;
       }else {
          Gift gift = null;
          if (this.i.get() == null) {
             b.c0(LiveLogTag.Live_LINE_GIFT_BATTLE, str, "gift", gift);
             return;
          }else {
             Gift gift1 = this.i.get();
             if (gift1 != null) {
                gift = a.a(gift1.mId);
             }
             if (gift != null) {
                gift1 = gift.mImageUrl;
                if (gift1 != null) {
                   e ta = this.a;
                   Objects.requireNonNull(ta);
                   if (!PatchProxy.applyVoidOneRefs(gift1, ta, b.class, "2")) {
                      a.p(gift1, "cdnUrls");
                      ta.a(new b$a(ta, gift1));
                   }
                }
             }
             e ta1 = this.a;
             ta1.mIsVisible = Boolean.TRUE;
             ta1.k(true);
             ta1 = this.a;
             ta1.mClickCallback = new e$a(this, p0);
             this.b.setValue(ta1);
             return;
          }
       }
    }
}
