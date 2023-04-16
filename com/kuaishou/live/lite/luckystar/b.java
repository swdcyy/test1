package com.kuaishou.live.lite.luckystar.b;
import z1.k;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarAbnormalEnd;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarStarted;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.luckystar.b$a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import n91.f;
import java.lang.Long;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import bc3.l;
import bc3.k;
import erd.g;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.yxcorp.gifshow.model.CDNUrl;
import bc3.h;
import ekd.k1;

public class b	// class@000a33
{
    public final k a;
    public final k b;
    public final MutableLiveData c;
    public b d;

    public void b(k p0,k p1){
       super();
       this.c = new MutableLiveData();
       this.a = p0;
       this.b = p1;
    }
    public static void a(b p0,LiveLuckyStarMessages$SCLuckyStarAbnormalEnd p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, b.class, "8")) {
       }else {
          b.S(LiveLiteLogTag.LIVE_LITE_LUCKY_STAR.appendTag("LiveLiteLuckyStarModelManager"), "handleLuckyStarAbnormalEnd", "luckyStarId", p1.luckyStarId);
          p0.d();
          p0.c();
       }
       return;
    }
    public static void b(b p0,LiveLuckyStarMessages$SCLuckyStarStarted p1){
       LiveLuckyStarMessages$SCLuckyStarStarted luckyStarId;
       boolean b;
       LiveLuckyStarMessages$SCLuckyStarStarted openDeadline;
       b uob = p0;
       Object obj = p1;
       Objects.requireNonNull(p0);
       b uob1 = b.class;
       if (PatchProxy.applyVoidOneRefs(obj, uob, uob1, "7")) {
       }else {
          LiveLiteLogTag lIVE_LITE_LU = LiveLiteLogTag.LIVE_LITE_LUCKY_STAR;
          lIVE_LITE_LU.appendTag("LiveLiteLuckyStarModelManager");
          String str = "luckyStarId";
          b.S(lIVE_LITE_LU, "handleLuckyStarStarted", str, obj.luckyStarId);
          if (!TextUtils.x(obj.luckyStarId)) {
             luckyStarId = obj.luckyStarId;
             Object obj1 = PatchProxy.applyOneRefs(luckyStarId, uob, uob1, "14");
             b = false;
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(!TextUtils.n(luckyStarId, uob.c.getValue().e)){
                b = a.t().u("SOURCE_LIVE").d("EnableSkipLuckyStarStartWhenIdIsSame", b);
             }
             if (!b) {
                long l = obj.openDeadline - uob.b.get().s();
                long l1 = 0;
                if (l - l1 <= 0) {
                   lIVE_LITE_LU.appendTag("LiveLiteLuckyStarModelManager");
                   b.S(lIVE_LITE_LU, "openDeadline  is already , skip", str, obj.luckyStarId);
                }else {
                   p0.d();
                   openDeadline = obj.openDeadline;
                   if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(openDeadline), uob, uob1, "9")) {
                      b9.a(uob.d);
                      uob.d = t.interval(l1, 500, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new l(uob, openDeadline), new k(uob));
                   }
                   b$a uoa = new b$a(obj.luckyStarId, 1, h.a(obj.liteAuthorInfoAreaIcon), h.a(obj.staticIcon), l);
                   uob.c.setValue(uob1);
                }
             }
          }
          lIVE_LITE_LU.appendTag("LiveLiteLuckyStarModelManager");
          b.S(lIVE_LITE_LU, "receive the same lucky start id, skip", str, obj.luckyStarId);
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       this.c.setValue(b$a.a());
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       k1.n(this);
       this.e();
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b9.a(this.d);
       return;
    }
}
