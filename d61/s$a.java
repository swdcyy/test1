package d61.s$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import zsd.u;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.net.URLEncoder;

public final class s$a	// class@001f3f
{

    public void s$a(){
       super();
    }
    public void s$a(u p0){
       super();
    }
    public final boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "url");
       boolean b = false;
       if (u.q2(p0, "http:", b, 2, null) || u.q2(p0, "https:", b, 2, null)) {
          b = true;
       }
       return b;
    }
    public final String b(String p0,String p1,String p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, s$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "url");
       p1 = "__launch_options__=%7B%22topBarBgColor%22%3A%22%2300000000%22%7D&layoutType=3&activityBiz=activityBiz&noBackNavi=true&entry_src=LIVE_PENDANT"+"&authorId="+p1+"&liveStreamId="+p2;
       int i = StringsKt__StringsKt.i3(p0, "?", 0, false, 6, null);
       int i1 = StringsKt__StringsKt.i3(p0, "#", 0, false, 6, null);
       int i2 = 0;
       if (i > 0) {
          i++;
          obj = p0.substring(i2, i);
          a.o(obj, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          p0 = p0.substring(i, p0.length());
          a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          p0 = obj+p1+'&'+p0;
       }else {
          char c = '?';
          if (i1 > 0) {
             String str = p0.substring(i2, i1);
             a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             p0 = p0.substring(i1, p0.length());
             a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             p0 = str+c+p1+p0;
          }else {
             p0 = p0+c+p1;
          }
       }
       return "kwailive://webview?heightRatio=0.8&enablepandown=0&url="+URLEncoder.encode(p0, "UTF-8");
    }
}
