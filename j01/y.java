package j01.y;
import sfc.a;
import j01.x;
import com.yxcorp.gifshow.models.Gift;
import lm1.i;
import ik1.h0;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.app.Application;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import android.text.TextUtils;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import pk1.a;
import sk1.a;
import j01.i0;
import h01.y;
import java.util.Objects;
import mk1.h;
import bl1.a;
import java.lang.StringBuilder;
import oy1.a;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$GiftConfig;
import java.lang.reflect.Type;
import s81.a;
import java.lang.System;
import e17.i;
import android.os.SystemClock;
import mk1.b;
import java.lang.Integer;
import java.lang.Boolean;
import z12.e;
import f92.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.util.Map;
import lm1.f;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.google.gson.JsonElement;
import lm1.d;
import t02.a0;
import ik1.i0;

public class y extends a	// class@002a11
{
    public final Gift c;
    public final i d;
    public final h0 e;
    public final long f;
    public final boolean g;
    public final String h;
    public final String i;
    public final LiveGiftToAudienceMessage j;
    public final int k;
    public final UserInfo l;
    public final x m;

    public void y(x p0,Gift p1,i p2,h0 p3,long p4,boolean p5,String p6,String p7,LiveGiftToAudienceMessage p8,int p9,UserInfo p10){
       this.m = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
       this.l = p10;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       KwaiException mErrorCode;
       y tm;
       y td;
       x ox = x.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       super.b(p0);
       String str = a.B.getString(R.string.arg_RES_7f101fa4);
       int i = 0;
       if (p0 instanceof KwaiException) {
          KwaiException kwaiExceptio = p0;
          mErrorCode = kwaiExceptio.mErrorCode;
          if (!TextUtils.isEmpty(kwaiExceptio.getMessage())) {
             str = kwaiExceptio.getMessage();
          }
          kwaiExceptio = kwaiExceptio.mErrorCode;
          if (kwaiExceptio == 803) {
             d.a(0x630bc993).d1().l();
          }else if(kwaiExceptio == 907 || kwaiExceptio == 908){
             tm = this.m;
             td = this.c;
             Objects.requireNonNull(tm);
             if (!PatchProxy.applyVoidOneRefs(td, tm, ox, "10")) {
                tm.q.o.H2(td);
             }
             this.m.x.d(a.a());
          }else if(kwaiExceptio == 901){
             this.m.x.d(a.a());
          }else if(kwaiExceptio == 143){
             this.m.r.a();
          }
       }else {
          mErrorCode = null;
       }
       tm = this.m;
       td = this.d;
       String str1 = "[GiftBoxSendGiftToAudiencePresenter][httpSendGiftToAudience]"+a.a(p0);
       if (mErrorCode == null) {
          mErrorCode = 0x18a25;
       }
       tm.S8(td, "CLIENT_SEND_REQUEST_RESULT", str1, mErrorCode);
       tm = this.m;
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoidOneRefs(str, tm, ox, "5")) {
          LiveCommonConfigResponse$GiftConfig giftConfig = a.d(LiveCommonConfigResponse$GiftConfig.class);
          if (giftConfig != null && (System.currentTimeMillis() - a.h()) - (long)giftConfig.mShowSendFailTipsIntervalMillis >= 0) {
             a.F(System.currentTimeMillis());
             i.d(R.style.arg_RES_7f110668, str);
          }
       }
       this.e.g = SystemClock.elapsedRealtime() - this.f;
       y tm1 = this.m;
       int i1 = tm1.p.i();
       y te = this.e;
       td = this.g;
       object oobject = null;
       y th = this.h;
       y ti = this.i;
       Objects.requireNonNull(tm1);
       int i2 = 1;
       if (PatchProxy.isSupport(ox)) {
          Object[] objArray = new Object[]{Integer.valueOf(i1),te,p0,Boolean.valueOf(td),oobject,th,ti};
          if (PatchProxy.applyVoid(objArray, tm1, ox, "8")) {
          label_0143 :
             b uob = new b(this.m.getLiveStreamId(), this.j, this.c, this.k, false, true, 0);
             ox.b("key_send_gift_context", this.d);
             ox.g = this.l;
             ox.h = this.m.p.c();
             ox.c(this.m.R8(this.d.b(), null, this.e, null, p0));
             this.m.u.V1.o4(ox);
             return;
          }
       }
       String[] stringArray = new String[i2];
       stringArray[i] = te.toString();
       e.c("LiveAudienceGiftBox", "sendGiftToAudienceFail", stringArray);
       goto label_0143 ;
    }
}
