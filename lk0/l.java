package lk0.l;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import se.c;
import java.util.Map;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import com.kuaishou.krn.exception.KrnException;

public class l	// class@002f8e
{
    public static String a;
    public static Integer b;

    public void l(){
       super();
    }
    public static String a(){
       StringBuilder obj = PatchProxy.apply(null, null, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(l.a)) {
          obj = "";
          Map a = c.a;
          Object obj1 = a.get("major");
          if (obj1 instanceof Integer) {
             obj = obj+obj1;
          }
          obj1 = a.get("minor");
          if (obj1 instanceof Integer) {
             obj = obj+"."+obj1;
          }
          obj1 = a.get("patch");
          if (obj1 instanceof Integer) {
             obj = obj+"."+obj1;
          }
          Object obj2 = a.get("prerelease");
          if (obj2 instanceof Integer) {
             obj = obj+"."+obj2;
          }
          l.a = obj;
       }
       return l.a;
    }
    public static int b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l ol = l.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, ol, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = 0;
       if (l.b == null) {
          Object obj1 = PatchProxy.applyOneRefs("0.87.1.1", objArray, ol, "3");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): Pattern.compile("^\(\\d{1,2}\\.\){2,3}\(\\d{1,2}\)").matcher("0.87.1.1").find();
          if (b) {
             Matcher matcher = Pattern.compile("^\(\\d+\\.\){2}\(\\d+\)").matcher("0.87.1.1");
             if (matcher.find()) {
                String[] stringArray = (matcher.group()).split("\\.");
                l.b = Integer.valueOf((((Integer.valueOf(stringArray[i]).intValue() * 10000) + (Integer.valueOf(stringArray[1]).intValue() * 100)) + Integer.valueOf(stringArray[2]).intValue()));
             }
          }else {
             throw new KrnException("Krn SDK版本号不合法，合法版本号格式为：xx.xx.xx-yyyy\(yyyy为测试扩展版本号，正式的没有，读取版本号也只读取xx.xx.xx\)");
          }
       }
       Integer b1 = l.b;
       if (b1 != null) {
          i = b1.intValue();
       }
       return i;
    }
}
