package h59.a;
import p49.a;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Throwable;
import java.lang.Object;
import q35.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q35.b;
import q35.d;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import h59.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kp.r1;
import kotlin.jvm.internal.a;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Long;
import java.lang.Number;
import tw.f;
import java.lang.Integer;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import zsd.u;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;

public final class a implements a	// class@00254d
{
    public final String a;
    public final BaseFeed b;
    public final Throwable c;
    public final String d;

    public void a(String p0,BaseFeed p1,Throwable p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void a(c$a p0){
       b a;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       p0.i(b.g);
       p0.d(BusinessType.CONVERSION);
       p0.g(SubBusinessType.DOWNLOAD);
       p0.h(this.a);
       a = b.a;
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       Objects.requireNonNull(a);
       JsonObject jsonObject = PatchProxy.applyThreeRefs(tb, tc, td, a, b.class, "2");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          if (tc != null) {
             String message = tc.getMessage();
             if (message == null) {
                message = "null";
             }
             jsonObject.c0("error_code", message);
          }
          Integer integer = null;
          if (td != null) {
             str = (td.length() > 0)? 1: null;
             if (!str) {
                td = integer;
             }
             if (td != null) {
                jsonObject.c0("url", td);
             }
          }
          if (tb != null) {
             str = r1.U1(tb);
             String str1 = "it";
             if (str != null) {
                a.o(str, str1);
                String str2 = (str.length() > 0)? 1: null;
                if (!str2) {
                   str = integer;
                }
                if (str != null) {
                   jsonObject.c0("user_id", str);
                }
             }
             str = r1.V1(tb);
             if (str != null) {
                a.o(str, str1);
                str1 = (str.length() > 0)? 1: null;
                if (!str1) {
                   str = integer;
                }
                if (str != null) {
                   jsonObject.c0("user_name", str);
                }
             }
             jsonObject.c0("photo_id", tb.getId());
             PhotoAdvertisement photoAdverti = tb.get("AD");
             if (photoAdverti != null) {
                jsonObject.a0("creative_id", Long.valueOf(photoAdverti.mCreativeId));
                jsonObject.c0("app_name", f.c(photoAdverti));
                jsonObject.a0("source_type", Integer.valueOf(photoAdverti.mSourceType));
                PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
                adData = (adData != null)? adData.mH5Url: integer;
                if (adData != null) {
                   if (u.q2(adData, "kwai://adtkpage/moli", false, 2, integer)) {
                      integer = Integer.valueOf(2);
                   }else if(u.q2(adData, "kwai://adkrn", false, 2, integer)){
                      integer = Integer.valueOf(3);
                   }else if(StringsKt__StringsKt.O2(adData, "getIntermediatePageHtml", false, 2, integer)){
                      integer = Integer.valueOf(1);
                   }
                   if (integer != null) {
                      jsonObject.a0("jian_zhan_type", integer);
                   }
                }
             }
          }
       }
    label_0116 :
       p0.f(jsonObject);
       return;
    }
}
