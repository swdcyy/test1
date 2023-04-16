package be8.r;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.kuaishou.webkit.URLUtil;
import v88.h;
import brd.t;
import be8.n;
import io.reactivex.g;
import be8.o;
import be8.p;

public final class r	// class@00033f
{
    public static final Pattern a;

    static {
       r.a = Pattern.compile("^data:image/[^;]+;base64,\(.+\)");
    }
    public void r(){
       super();
    }
    public static boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r.a.matcher(p0).matches();
    }
    public static boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return URLUtil.isNetworkUrl(p0);
    }
    public static t c(String p0,h p1){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, r.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (r.b(p0)) {
          ot = PatchProxy.applyOneRefs(p0, null, r.class, "2");
          if (ot != patchProxyRe) {
          }else {
             ot = t.create(new n(p0));
          }
          return ot;
       }else if(r.a(p0)){
          ot = PatchProxy.applyOneRefs(p0, null, r.class, "3");
          if (ot != patchProxyRe) {
          }else {
             ot = t.create(new o(p0));
          }
          return ot;
       }else {
          return t.create(new p(p0, p1));
       }
    }
}
