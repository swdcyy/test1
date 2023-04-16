package fya.f;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.lang.StringBuilder;
import fya.b;
import java.util.regex.Matcher;
import java.lang.CharSequence;
import java.util.regex.Pattern;
import com.kuaishou.android.model.mix.CashTag;

public class f	// class@002a5b
{

    public void f(){
       super();
    }
    public static String a(String p0,QComment p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Matcher obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uof, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p1 != null) {
          p1 = p1.mCashTags;
          if (p1 != null) {
             obj1 = "1";
             StringBuilder str = PatchProxy.applyTwoRefs(p0, p1, obj, uof, obj1);
             if (str != patchProxyRe) {
             }else if(p1 == null || p1.isEmpty()){
                str = "";
                int i = 0;
                obj = PatchProxy.applyOneRefs(p0, obj, b.class, obj1);
                if (obj != patchProxyRe) {
                }else {
                   obj = b.k.matcher(p0);
                }
                while (obj.find()) {
                   CashTag uCashTag = p1.get(b.c(obj));
                   str = (uCashTag != null)? str+p0.substring(i, obj.start())+uCashTag.mShowText: str+p0.substring(i, obj.end());
                   i = obj.end();
                }
                if (i < p0.length()) {
                   str = str+p0.substring(i);
                }
                p0 = str;
             }
             str = p0;
             return str;
          }
       }
       return p0;
    }
}
