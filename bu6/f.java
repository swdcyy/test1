package bu6.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import kotlin.text.Regex;
import java.lang.CharSequence;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import java.lang.Integer;
import zsd.d;
import java.nio.charset.Charset;
import java.lang.StringBuilder;

public final class f	// class@00060c
{

    public static final int a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (p0 != null) {
          a.m(p0);
          String[] stringArray = new String[0];
          Object[] objArray = new Regex("\\.").split(p0, 0).toArray(stringArray);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          a.m(p1);
          String[] stringArray1 = new String[0];
          Object[] objArray1 = new Regex("\\.").split(p1, 0).toArray(stringArray1);
          Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
          int i1 = 0;
          try{
             while (true) {
                if (i1 < objArray.length && i1 < objArray1.length) {
                   int i2 = Integer.parseInt(objArray[i1]);
                   int i3 = Integer.parseInt(objArray1[i1]);
                   if (i2 < i3) {
                      return i;
                   }else if(i2 > i3){
                      return 1;
                   }else {
                      i1 = i1 + 1;
                   }
                }else if(objArray.length > i1){
                   i = 1;
                   break ;
                }else if(objArray1.length > i1){
                   i = 0;
                   break ;
                }
             }
          }catch(java.lang.NumberFormatException e0){
             i = p0.compareTo(p1);
          }
       }
    }
    public static final String b(String p0,int p1){
       byte[] obj;
       Charset a;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          obj = p0.getBytes(d.a);
          a.o(obj, "\(this as java.lang.String\).getBytes\(charset\)");
          obj = (obj.length > p1)? 1: 0;
          a = d.a;
          Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
          byte[] bytes = p0.getBytes(a);
          a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          while (bytes.length > p1) {
             int i = p0.length() * p1;
             byte[] bytes1 = p0.getBytes(a);
             a.o(bytes1, "\(this as java.lang.String\).getBytes\(charset\)");
             i = i / bytes1.length;
             if (i < p0.length()) {
                p0 = p0.substring(0, i);
                a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             }else {
                int i1 = p0.length() - 1;
                p0 = p0.substring(0, i1);
                a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             }
          }
          if (obj) {
             p0 = p0+"...";
          }
       }
       return p0;
    }
}
