package f3b.f;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import f3b.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import com.google.protobuf.nano.MessageNano;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Integer;
import lnc.i3;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HeartBeatEvent;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$SearchEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.log.model.CommonParams;

public class f	// class@0015c0
{

    public void f(){
       super();
    }
    public static void a(ClientEvent$EventPackage p0,ClientContentWrapper$ContentWrapper p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "3")) {
          return;
       }
       Log.g("EventUtils", "fillContentWrapperIfNeeded start");
       o.n();
       ClientEvent$EventPackage showEvent = p0.showEvent;
       if (showEvent != null) {
          if (!TextUtils.x(showEvent.contentWrapper)) {
             ExceptionHandler.handleCaughtException(new IllegalArgumentException("不应该在赋值showEvent.contentWrapper同时还传入非空的ContentWrapper对象参数"));
             return;
          }else {
             p0.showEvent.contentWrapper = o.f(p1);
             Log.g("EventUtils", "fillContentWrapperIfNeeded showEvent.contentWrapper = "+p0.showEvent.contentWrapper);
          }
       }else {
          showEvent = p0.shareEvent;
          if (showEvent != null) {
             if (!TextUtils.x(showEvent.contentWrapper)) {
                ExceptionHandler.handleCaughtException(new IllegalArgumentException("不应该在赋值shareEvent.contentWrapper同时还传入非空的ContentWrapper对象参数"));
                return;
             }else {
                p0.shareEvent.contentWrapper = o.f(p1);
                Log.g("EventUtils", "fillContentWrapperIfNeeded shareEvent.contentWrapper = "+p0.shareEvent.contentWrapper);
             }
          }else {
             showEvent = p0.clickEvent;
             if (showEvent != null) {
                if (!TextUtils.x(showEvent.contentWrapper)) {
                   ExceptionHandler.handleCaughtException(new IllegalArgumentException("不应该在赋值clickEvent.contentWrapper同时还传入非空的ContentWrapper对象参数"));
                   return;
                }else {
                   p0.clickEvent.contentWrapper = o.f(p1);
                   Log.g("EventUtils", "fillContentWrapperIfNeeded clickEvent.contentWrapper = "+p0.clickEvent.contentWrapper);
                }
             }else {
                showEvent = p0.taskEvent;
                if (showEvent != null) {
                   if (!TextUtils.x(showEvent.contentWrapper)) {
                      ExceptionHandler.handleCaughtException(new IllegalArgumentException("不应该在赋值taskEvent.contentWrapper同时还传入非空的ContentWrapper对象参数"));
                      return;
                   }else {
                      p0.taskEvent.contentWrapper = o.f(p1);
                      Log.g("EventUtils", "fillContentWrapperIfNeeded taskEvent.contentWrapper = "+p0.taskEvent.contentWrapper);
                   }
                }
             }
          }
       }
       return;
    }
    public static void b(ClientLog$ReportEvent p0,ClientContentWrapper$ContentWrapper p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "2")) {
          return;
       }
       if (p1 != null && p0 != null) {
          p0 = p0.eventPackage;
          if (p0 != null) {
             try{
                f.a(p0, p1);
             }catch(java.lang.RuntimeException e3){
                Log.e("EventUtils", "build reportEvent fill contentWrapper error, exception is: ", e3);
             }
          }
       }
    }
    public static String c(MessageNano p0){
       String str;
       ClientEvent$ShowEvent obj = PatchProxy.applyOneRefs(p0, null, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof ClientEvent$ShowEvent) {
          obj = p0;
          ClientEvent$ShowEvent elementPacka = obj.elementPackage;
          if (elementPacka != null) {
             str = (TextUtils.x(elementPacka.action2))? o.l(obj.elementPackage.action): obj.elementPackage.action2;
          }else {
          label_0031 :
             str = "";
          }
       }else {
          goto label_0031 ;
       }
       if (p0 instanceof ClientEvent$TaskEvent) {
          ClientEvent$TaskEvent taskEvent = p0;
          str = (TextUtils.x(taskEvent.action2))? o.l(taskEvent.action): taskEvent.action2;
       }
    label_004b :
       if (p0 instanceof ClientEvent$ClickEvent) {
          ClientEvent$ClickEvent elementPacka1 = p0.elementPackage;
          if (elementPacka1 != null) {
             String str1 = (TextUtils.x(elementPacka1.action2))? o.l(p0.elementPackage.action): p0.elementPackage.action2;
             str = str1;
          }
       }
       return str;
    }
    public static String d(int p0,MessageNano p1){
       i3 obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uof, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          return "";
       }else {
          obj = i3.f();
          if (p1 instanceof ClientStat$HeartBeatEvent && p0 == 17) {
             obj.c("seq", Integer.valueOf(p1.seq));
             return obj.e();
          }else if(p1 instanceof ClientEvent$ShareEvent && p0 == 8){
             obj.d("exp_tag", p1.expTag);
             return obj.e();
          }else if(p1 instanceof ClientEvent$SearchEvent && p0 == 9){
             obj.c("search_type", Integer.valueOf(p1.type));
             obj.c("search_source", Integer.valueOf(p1.source));
             return obj.e();
          }else {
             obj.d("page_code", f.e(p1));
             obj.d("action", f.c(p1));
             return obj.e();
          }
       }
    }
    public static String e(MessageNano p0){
       String str;
       ClientEvent$ShowEvent obj = PatchProxy.applyOneRefs(p0, null, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof ClientEvent$ShowEvent) {
          obj = p0;
          ClientEvent$ShowEvent urlPackage = obj.urlPackage;
          if (urlPackage != null) {
             str = (TextUtils.x(urlPackage.page2))? o.i(obj.urlPackage.page): obj.urlPackage.page2;
          }else {
          label_0031 :
             str = "";
          }
       }else {
          goto label_0031 ;
       }
       if (p0 instanceof ClientEvent$TaskEvent) {
          ClientEvent$TaskEvent taskEvent = p0;
          ClientEvent$TaskEvent urlPackage1 = taskEvent.urlPackage;
          if (urlPackage1 != null) {
             str = (TextUtils.x(urlPackage1.page2))? o.i(taskEvent.urlPackage.page): taskEvent.urlPackage.page2;
          }
       }
       if (p0 instanceof ClientEvent$ClickEvent) {
          ClientEvent$ClickEvent urlPackage2 = p0.urlPackage;
          if (urlPackage2 != null) {
             String str1 = (TextUtils.x(urlPackage2.page2))? o.i(p0.urlPackage.page): p0.urlPackage.page2;
             str = str1;
          }
       }
       return str;
    }
    public static CommonParams f(CommonParams p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          p0 = new CommonParams();
       }
       if (TextUtils.x(p0.mActivityTag)) {
          p0.mActivityTag = p1;
       }
       p0.mProcessName = p2;
       return p0;
    }
    public static boolean g(int p0){
       int i = 1;
       if (p0 == i || (p0 != 2 && p0 != 3)) {
          i = false;
       }
    label_000b :
       return i;
    }
}
