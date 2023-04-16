package bpa.d;
import ay7.a;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.AbsoluteLayout;
import rn.a;
import kotlin.jvm.internal.a;
import apa.e;
import lnc.i3;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import java.lang.Boolean;
import k2b.u1;
import java.lang.Long;
import java.lang.Number;
import java.lang.System;

public final class d extends a	// class@00041d
{

    public void d(){
       super();
    }
    public String c(){
       return "pageLoadFinished";
    }
    public String d(){
       return "KwaiBubble";
    }
    public boolean j(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       String str6;
       String str7;
       String this;
       Object obj2;
       Long obj = p0;
       FunctionResultParams obj1 = PatchProxy.applyTwoRefs(obj, p1, this, d.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new FunctionResultParams();
       obj1.mResult = 0x1e84c;
       if (obj != null) {
          a tag = obj.getTag(R.id.ug_kwai_bubble_popup_builder);
          if (tag != null) {
             tag.show();
          }
          String tag1 = obj.getTag(R.id.ug_kwai_bubble_id);
          if (tag1 != null) {
             tag1 = tag1.toString();
             if (tag1 != null) {
             label_0041 :
                String tag2 = obj.getTag(R.id.ug_kwai_bubble_url);
                if (tag2 != null) {
                   tag2 = tag2.toString();
                   if (tag2 != null) {
                   label_0055 :
                      String str = tag2;
                      String str1 = "web_load_success";
                      a.o(str, "url");
                      int i = 9;
                      String str2 = "Singleton.get\(PhoneLevelUtils::class.java\)";
                      String str3 = "id";
                      String str4 = "type";
                      if (!PatchProxy.applyVoidThreeRefs(str1, tag1, str, null, e.class, "2")) {
                         a.p(str1, str4);
                         a.p(tag1, str3);
                         a.p(str, "url");
                         i3 oi3 = i3.f();
                         oi3.d(str4, str1);
                         oi3.d(str3, tag1);
                         oi3.d("url", str);
                         Object obj3 = b.a(-404437045);
                         a.o(obj3, str2);
                         oi3.a("isLowPhone", Boolean.valueOf(obj3.g()));
                         u1.R("Kwai_Bubble", oi3.e(), i);
                      }
                      obj = obj.getTag(R.id.ug_kwai_bubble_web_create_time);
                      long l = (obj != null)? System.currentTimeMillis() - obj.longValue(): -1;
                      String str5 = "web_load_time";
                      if (PatchProxy.isSupport(e.class)) {
                         str6 = str4;
                         str7 = str2;
                         this = str3;
                         if (!PatchProxy.applyVoidFourRefs(str5, tag1, str, Long.valueOf(l), 0, e.class, "1")) {
                         }
                      }else {
                         str6 = str4;
                         this = str3;
                         str7 = str2;
                      }
                   }
                }
                tag2 = p0.getCurrentUrl();
                goto label_0055 ;
             }
          }
          tag1 = "unknown";
          goto label_0041 ;
       }
    label_0138 :
       return obj1;
    }
}
