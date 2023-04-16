package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$c;
import jm1.b;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import java.lang.Object;
import lj1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.e;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lj1.e;
import pj1.c;
import mj1.a;
import java.util.Objects;
import pj1.c$a;
import pj1.a;
import java.util.ArrayList;
import qj1.c0;
import nj1.a;
import qj1.u;
import z1.k;
import xp5.i;
import qj1.i0;
import qj1.n;
import xh1.b;
import qj1.v;
import qj1.s;
import jj1.a;
import java.util.List;
import pj1.b$a;
import jj1.c;
import pj1.b$b;

public final class LiveLiteGiftPresenter$c implements b	// class@001dae
{
    public final LiveLiteGiftPresenter a;

    public void LiveLiteGiftPresenter$c(LiveLiteGiftPresenter p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       c$a a;
       a uoa2;
       String str2;
       String obj = this;
       LiveSendGiftBaseTraceInfo liveSendGift = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(liveSendGift, obj, LiveLiteGiftPresenter$c.class, "1")) {
          return;
       }
       String str = "params";
       a.p(liveSendGift, str);
       if (p0.l() == null) {
          liveSendGift.k = obj.a.U0.o6();
       }
       LiveLiteGiftPresenter z = obj.a.Z;
       if (z != null) {
          LiveLiteGiftManager liveLiteGift = PatchProxy.apply(null, z, LiveLiteGiftManager.class, "16");
          if (liveLiteGift != patchProxyRe) {
          }else {
             liveLiteGift = z.j;
             if (liveLiteGift == null) {
                a.S("giftSendModel");
             }
          }
          if (liveLiteGift != null && !PatchProxy.applyVoidTwoRefs(liveSendGift, null, liveLiteGift, LiveGiftSendModel.class, "3")) {
             a.p(liveSendGift, str);
             b.c0(LiveGiftTag.GIFT_SEND, "[LiveGiftSendModel][sendNoPanelGiftToAnchor]", str, liveSendGift);
             a = c.a;
             LiveGiftSendModel l = liveLiteGift.l;
             LiveGiftSendModel m = liveLiteGift.m;
             LiveGiftSendModel o = liveLiteGift.o;
             a uoa = liveLiteGift.e();
             LiveGiftSendModel n = liveLiteGift.n;
             LiveGiftSendModel s = liveLiteGift.s;
             LiveGiftSendModel t = liveLiteGift.t;
             LiveGiftSendModel u = liveLiteGift.u;
             LiveGiftSendModel v = liveLiteGift.v;
             obj = "ALL";
             Objects.requireNonNull(a);
             Object obj1 = liveLiteGift;
             c$a uoa1 = c$a.class;
             e uoe = v13;
             int i = 0;
             if (PatchProxy.isSupport(uoa1)) {
                String str1 = str;
                Object[] objArray = new Object[12];
                objArray[i] = liveSendGift;
                objArray[1] = l;
                objArray[2] = m;
                objArray[3] = o;
                objArray[4] = uoa;
                objArray[5] = n;
                objArray[6] = t;
                objArray[7] = s;
                objArray[8] = u;
                objArray[9] = v;
                objArray[10] = obj;
                objArray[11] = null;
                uoa2 = PatchProxy.apply(objArray, a, uoa1, "6");
                if (uoa2 != patchProxyRe) {
                label_0142 :
                   e uoe1 = new e(uoa2);
                   Object obj2 = obj1;
                   obj2.i.add(uoe1);
                   uoe1.a(new c(obj2, null, liveSendGift, uoe1));
                }else {
                   str2 = str1;
                }
             }else {
                str2 = str;
             }
             a.p(liveSendGift, str2);
             a.p(l, "noPanelComboStateManager");
             a.p(m, "liveStreamIdSupplier");
             a.p(o, "liveLogPackageProvider");
             a.p(uoa, "bindPhoneManager");
             a.p(n, "feedWrapperSupplier");
             a.p(t, "fragmentManagerSupplier");
             a.p(s, "loginDependency");
             a.p(u, "failTipsIntervalMillisSupplier");
             a.p(v, "paymentManager");
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(new c0(s));
             if (p0.b()) {
                uArrayList.add(new u(t, o));
             }
             uArrayList.add(new i0(v));
             uArrayList.add(new n(l, obj));
             uArrayList.add(new v(uoa, u));
             s os = new s(l, m, n, obj, 0, o);
             uArrayList.add(uoa2);
             uoa2 = new a(uArrayList, liveSendGift, 0);
             goto label_0142 ;
          }
       }
    label_0157 :
       return;
    }
}
