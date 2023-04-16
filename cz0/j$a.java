package cz0.j$a;
import sfc.a;
import cz0.j;
import ht5.b;
import bz0.e;
import lm1.g;
import com.yxcorp.gifshow.models.Gift;
import t02.a0;
import lm1.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ht5.d;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import lnc.a1;
import e17.i;
import java.lang.StringBuilder;
import oy1.a;
import cz0.b;
import zb6.a;
import f92.b;
import bz0.f;
import lm1.i;
import lm1.d;
import lm1.f;
import lm1.e;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import ik1.i0;

public class j$a extends a	// class@001ecb
{
    public final b c;
    public final e d;
    public final g e;
    public final Gift f;
    public final a0 g;
    public final c h;
    public final j i;

    public void j$a(j p0,b p1,e p2,g p3,Gift p4,a0 p5,c p6){
       this.i = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       KwaiException kwaiExceptio;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       super.b(p0);
       b m = this.c.m;
       if (m != null) {
          m.onError(p0);
       }
       int i = 0;
       if (p0 instanceof KwaiException) {
          kwaiExceptio = p0;
          str = 0x10299;
          KwaiException mErrorCode = kwaiExceptio.mErrorCode;
          if (TextUtils.x(kwaiExceptio.getMessage())) {
             String str1 = (kwaiExceptio.mErrorCode == str)? a1.m().getString(R.string.arg_RES_7f101c44): a1.m().getString(R.string.arg_RES_7f104645);
             i.d(R.style.arg_RES_7f110668, str1);
          }
          kwaiExceptio = mErrorCode;
       }
       j$a ti = this.i;
       j$a td = this.d;
       str = "[LiveInSendPacketGiftInterceptor][intercept]"+a.a(p0);
       if (kwaiExceptio == null) {
          i = 0x18a25;
       }
       ti.c(td, "CLIENT_SEND_REQUEST_RESULT", str, i);
       this.e.c(a.b(p0));
       this.e.d(a.i(p0));
       j$a tc = this.c;
       b uob = f.a(this.f, tc.b, tc.c, tc.d, this.g, false, true, tc.e);
       i oi = this.d.b();
       f uof = (oi != null)? oi.b(): f.a(this.c);
       uob.c(new d(uof, this.h, null, this.e));
       if (oi != null) {
          oi.e().k(this.c);
          uob.b("key_send_gift_context", oi);
       }else {
          b.P(b.a, "[LiveInSendPacketGiftInterceptor][RequestErrorConsumer]context is null");
       }
       this.g.V1.t2(uob);
       return;
    }
}
