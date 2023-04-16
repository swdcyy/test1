package aj1.c;
import vq5.b;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import dj1.a;
import ekd.x0;
import lnc.o5;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import mi1.b;
import mi1.b$a;
import msd.a;
import cj1.b;
import aj1.d;
import aj1.d$a;
import d61.l0;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.ArrayList;
import cj1.c;
import nsd.u;
import java.lang.Integer;
import msd.p;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements b	// class@0000b0
{
    public final LiveDiyGiftManager a;

    public void c(LiveDiyGiftManager p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       LiveCommonEffectInfo liveCommonEf;
       a c;
       ArrayList uArrayList;
       Object obj = this;
       List obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c.class, str)) {
          return;
       }
       LiveDiyGiftManager e = obj.a.e;
       a.o(obj1, "it");
       Objects.requireNonNull(e);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoidOneRefs(obj1, e, a.class, str)) {
          a.p(obj1, "uri");
          String str1 = x0.a(obj1, "giftId");
          String str2 = x0.a(obj1, "pattern");
          String str3 = x0.a(obj1, "commonEffectInfo");
          String str4 = x0.a(obj1, "selectText");
          String str5 = x0.a(obj1, "recoText");
          int i = o5.b(x0.a(obj1, "maxInputNumber"), e.b);
          String str6 = x0.a(obj1, "giftToken");
          if (str6 == null) {
             str6 = "";
          }
          if (str1 != null && (str3 == null || TextUtils.x(str4))) {
             b.e0(e.a, "[handleRouterParams] error !!!", "commonEffectInfoBase64", str3, "giftId", str1, "selectText", str4);
          }else {
             Gift gift = a.a(o5.b(str1, -1));
             Object obj2 = PatchProxy.applyOneRefs(str3, e, a.class, "3");
             if (obj2 != patchProxyRe) {
                liveCommonEf = obj2;
             }else {
                byte[] uobyteArray = b.a.b(str3);
                liveCommonEf = (uobyteArray != null)? LiveCommonEffectInfo.parseFrom(uobyteArray): null;
             }
             if (liveCommonEf == null || gift == null) {
                b.d0(e.a, "[handleRouterParams] error !!!", "commonEffectInfo", liveCommonEf, "gift", gift);
             }else {
                e.d.invoke();
                c = e.c;
                if (o5.b(x0.a(obj1, "diySelectTextType"), 0) != 1) {
                   d$a j = d.j;
                   Objects.requireNonNull(j);
                   String str7 = PatchProxy.apply(null, j, d$a.class, str);
                   if (str7 == patchProxyRe) {
                      str7 = d.i.b(null);
                   }
                   if (str7 != null) {
                      str4 = str7;
                   }
                }
                a.o(str4, "if \(diySelectTextType ==\x20\x02\) ?: selectText\n        }\x00");
                obj1 = PatchProxy.applyOneRefs(str5, e, a.class, "2");
                if (obj1 != patchProxyRe) {
                }else if(str5 != null){
                   String[] stringArray = new String[]{","};
                   obj1 = StringsKt__StringsKt.H4(str5, stringArray, false, 0, 6, null);
                   if (obj1 == null) {
                   }
                }else {
                }
                b uob = new b(str4, obj1, str2, gift, liveCommonEf, new c(str6, 0, 2, null), null, i, false, 320, null);
                c.invoke(v13, Integer.valueOf(1));
             }
          }
       }
       return;
    }
}
