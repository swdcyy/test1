package j01.f$c;
import sfc.a;
import j01.f;
import lm1.i;
import java.lang.String;
import com.kuaishou.live.core.show.gift.DrawingGift;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import j01.i0;
import mk1.h;
import rk1.b;
import h01.y;
import java.lang.CharSequence;
import e17.i;
import java.lang.StringBuilder;
import oy1.a;
import android.os.SystemClock;
import z12.e;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.util.List;
import f92.a;
import xp5.g;
import lp3.c;
import lp3.e;
import lm1.a;
import lm1.f;
import lm1.c;
import java.util.Map;
import lm1.b;
import com.yxcorp.gifshow.model.response.WalletResponse;
import t02.a0;
import ik1.i0;

public class f$c extends a	// class@0029f4
{
    public final i c;
    public final long d;
    public final String e;
    public final int f;
    public final DrawingGift g;
    public final boolean h;
    public final UserInfo i;
    public final f j;

    public void f$c(f p0,i p1,long p2,String p3,int p4,DrawingGift p5,boolean p6,UserInfo p7){
       this.j = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       f$c obj2;
       KwaiException mErrorCode;
       c obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, f$c.class, "1")) {
          return;
       }
       super.b(p0);
       int i = 0;
       if (obj1 instanceof KwaiException) {
          obj2 = obj1;
          mErrorCode = obj2.mErrorCode;
          if (mErrorCode == 803) {
             d.a(0x630bc993).d1().l();
          }else if(mErrorCode == 907 || mErrorCode == 908){
             i.d(R.style.arg_RES_7f110668, obj2.getMessage());
             obj.j.q.q.c();
          }else if(mErrorCode == 901){
             obj.j.q.q.c();
          }else if(mErrorCode == 143){
             obj.j.r.a();
          }
       }else {
          mErrorCode = null;
       }
       obj2 = obj.j;
       f$c c = obj.c;
       String str = "[GiftBoxSendDrawingGiftPresenter][httpSendDrawingGift]"+a.a(p0);
       if (mErrorCode == null) {
          mErrorCode = 0x18a25;
       }
       obj2.b9(c, "CLIENT_SEND_REQUEST_RESULT", str, mErrorCode);
       long l = SystemClock.elapsedRealtime() - obj.d;
       String[] stringArray = new String[]{"taskSessionId=",obj.e,"giftCount=",String.valueOf(obj.f),"timeCost=",String.valueOf(l)};
       e.a("LiveAudienceGiftBox", "sendDrawingGiftFailed", obj1, stringArray);
       GiftMessage giftMessage = obj.j.W8(obj.g, obj.h, obj.i);
       c uoc = v14;
       obj = v14;
       uoc = new c(obj.e, l, null, null, null);
       a uoa = new a(obj.j.v.a(g.class).getLiveStreamId(), giftMessage, obj.j.X8(obj.g, obj.h, obj.i), obj.g.mPoints.size(), obj.j.V8(obj.g), false, obj.h, new a(obj.c.b(), obj, new b(null, obj1)));
       f$c uoc1 = this;
       i.a("key_send_gift_context", uoc1.c);
       uoc1.j.u.V1.S1(i);
       return;
    }
}
