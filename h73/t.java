package h73.t;
import android.app.Activity;
import e93.c;
import e93.a;
import xa3.a;
import pg1.e;
import vq5.d;
import jm1.a;
import jm1.c;
import ip3.a;
import xp5.i;
import java.lang.Object;
import com.kuaishou.live.lite.adapter.component.fansgroup.http.LiveLiteFansGroupJoinResponse;
import z1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import k73.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import android.content.Context;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import s93.s;
import u93.a;
import java.util.Objects;
import u93.b;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kuaishou.live.common.core.component.fansgroup.joindialog.LiveAudienceJoinFansGroupDialog;
import com.yxcorp.retrofit.model.KwaiException;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import l95.c;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import crd.b;
import lnc.b9;
import h73.f;
import h73.g;
import g73.a;
import va1.f;
import xp5.g;
import com.kwai.component.fansgroup.FansGroupSourceType;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import lnc.i3;
import d61.e0;
import brd.t;
import t45.d;
import brd.z;
import qj1.h;
import erd.o;
import cjd.e;
import erd.g;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupJoinButtonInfo;
import java.lang.Number;
import h73.k;
import h73.o;
import lnc.a1;
import h73.b;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import rw1.a;
import e17.i;

public class t	// class@002cc1
{
    public LiveAudienceJoinFansGroupDialog a;
    public final c b;
    public final a c;
    public final a d;
    public final e e;
    public final d f;
    public final a g;
    public final c h;
    public final i i;
    public final a j;
    public b k;
    public final Activity l;

    public void t(Activity p0,c p1,a p2,a p3,e p4,d p5,a p6,c p7,a p8,i p9){
       super();
       this.l = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.j = p8;
       this.i = p9;
    }
    public final void a(LiveLiteFansGroupJoinResponse p0,a p1){
       String str;
       Gift gift;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "4")) {
          return;
       }
       t tf = this.f;
       LiveLiteFansGroupJoinResponse mJoinTicketG = p0.mJoinTicketGiftId;
       Boolean tRUE = Boolean.TRUE;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          str = PatchProxy.applyTwoRefs(Integer.valueOf(mJoinTicketG), tRUE, null, uoa, "2");
          if (str != PatchProxyResult.class) {
          label_0065 :
             tf.r4(str, null);
             if (a.a(p0.mJoinTicketGiftId) != null) {
                s os = this.j.get();
                if (os != null) {
                   gift = a.a(p0.mJoinTicketGiftId);
                   Objects.requireNonNull(gift);
                   os.b(new a(gift.mName));
                }
             }
             p1.accept(p0);
             d.a(0x630bc993).d1().f();
             return;
          }
       }
       b.S(LiveLiteLogTag.LITE_FANS_GROUP.appendTag("FansGroupLiveTaskRouterHelper"), "mock gift slot msg", "giftId", Integer.valueOf(mJoinTicketG));
       str = "kwailive://sendallgiftstoanchor"+"?giftids="+mJoinTicketG+"&giftcounts=1"+"&shouldonlydisplayinslot="+a.g(tRUE, tRUE);
       goto label_0065 ;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, t.class, "10")) {
          return;
       }
       this.c();
       x.E(this.a);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, t.class, "11")) {
          return;
       }
       t ta = this.a;
       if (ta != null) {
          ta.wh();
       }
       return;
    }
    public final boolean d(int p0){
       boolean b = (p0 == 2)? true: false;
       return b;
    }
    public final void e(String p0,String p1,KwaiException p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, t.class, "20")) {
          return;
       }
       if (FansGroupKswitchUtil.b()) {
          if (p2 == null) {
             return;
          }else {
             b uob = new b(true, p0, "REQUEST_JOIN");
             uob.g(p1);
             uob.f(404);
             p0 = (TextUtils.x(p2.getMessage()))? "join fail": p2.getMessage();
             uob.c(p0);
             c.a(uob);
          }
       }
       return;
    }
    public final void f(String p0,long p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, ot, "19")) {
          return;
       }
       if (FansGroupKswitchUtil.b()) {
          b uob = new b(true, p0, "REQUEST_JOIN");
          uob.f(404);
          uob.c("lack coin");
          HashMap hashMap = new HashMap();
          hashMap.put("need", String.valueOf(p1));
          hashMap.put("currKcoin", String.valueOf(d.a(0x630bc993).d1().q()));
          uob.d(hashMap);
          c.a(uob);
       }
       return;
    }
    public final void g(a p0,a p1,a p2,String p3){
       int this;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, t.class, "13")) {
          return;
       }
       b9.a(this.k);
       f uof = new f(this, p0, p2);
       g og = new g(this, p0, p2, p1);
       Object obj = f.a(a.class);
       String str = this.c.d();
       this = FansGroupSourceType.LITE.getType();
       String liveStreamId = this.c.getLiveStreamId();
       Object[] objArray = null;
       String str1 = PatchProxy.apply(objArray, this, t.class, "14");
       if (str1 != PatchProxyResult.class) {
       }else if(this.c.j0() != null){
          objArray = new LiveStreamFeedWrapper(this.c.j0());
       }
       i3 oi3 = i3.f();
       oi3.d("exp_tag", e0.a(objArray));
       str1 = oi3.toString();
       Object obj1 = str1;
       this.k = obj.b(str, this, liveStreamId, obj1, p3).subscribeOn(d.b).observeOn(d.a).retryWhen(new h()).map(new e()).subscribe(uof, og);
       return;
    }
    public void h(User p0,LiveFansGroupJoinButtonInfo p1,String p2,String p3,a p4,a p5){
       int i2;
       String str1;
       t ot = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(t.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,oobject3,p5};
          if (PatchProxy.applyVoid(objArray, this, t.class, "3")) {
             return;
          }
       }
       String obj = PatchProxy.applyOneRefs(oobject1, this, t.class, "8");
       if (obj != PatchProxyResult.class) {
          i2 = obj.intValue();
       }else if(oobject1 == null){
          i = 1;
       label_0054 :
          o oo = new o(this, i, p2, new k(this, oobject3), p5, p3);
          String str = PatchProxy.applyOneRefs(oobject1, this, t.class, "7");
          if (str != PatchProxyResult.class) {
          }else {
             str = a1.p(R.string.arg_RES_7f1008f6);
             obj = " ";
             i = 0x7f10011c;
             if (oobject1 == null) {
                str = a1.p(i)+obj+i1+str;
             }else if(this.d(oobject1.mJoinType)){
                if (TextUtils.x(oobject1.mContent)) {
                   str = a1.p(R.string.arg_RES_7f10106f);
                }else {
                   str = oobject1.mContent;
                }
             }else if(TextUtils.x(oobject1.mContent)){
                str1 = a1.p(i);
             }else {
                str1 = oobject1.mContent;
             }
             LiveFansGroupJoinButtonInfo mPrice = oobject1.mPrice;
             if (mPrice > null) {
                i1 = mPrice;
             }
             str = str1+obj+i1+str;
          }
          Object obj1 = str;
          LiveAudienceJoinFansGroupDialog liveAudience = PatchProxy.applyFourRefs(v14, p0, obj1, p2, null, LiveAudienceJoinFansGroupDialog.class, "1");
          if (liveAudience != PatchProxyResult.class) {
          }else {
             liveAudience = new LiveAudienceJoinFansGroupDialog();
             liveAudience.C = v14;
             liveAudience.D = oobject;
             liveAudience.A = obj1;
             liveAudience.B = oobject2;
          }
          ot.a = liveAudience;
          liveAudience.k0(new b(this));
          ot.a.Cb(ot.b.b(), "live_lite_fans_group_join_dialog");
          return;
       }else if(this.d(oobject1.mJoinType)){
          goto label_0054 ;
       }else {
          i2 = oobject1.mPrice;
          if (i2 <= null) {
             i2 = 1;
          }
       }
       i = i2;
       goto label_0054 ;
    }
    public final boolean i(int p0,String p1){
       Object obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ot, "5");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (PatchProxy.isSupport(ot)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ot, "6");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          label_006d :
             if (b) {
                return false;
             }else {
                this.h.a(p1, null);
                i.f(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101c45), true);
                return true;
             }
          }
       }
       long l = d.a(0x630bc993).d1().q();
       obj = (l - (long)p0 >= 0)? 1: 0;
       if (!obj) {
          LiveLiteLogTag lITE_FANS_GR = LiveLiteLogTag.LITE_FANS_GROUP;
          lITE_FANS_GR.appendTag("LiveFansGroupJoinModel");
          b.T(lITE_FANS_GR, "lack coin", "current coin", Long.valueOf(l), "need=", Integer.valueOf(p0));
       }
       b = obj;
       goto label_006d ;
    }
}
