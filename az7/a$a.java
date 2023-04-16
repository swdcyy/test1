package az7.a$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.util.regex.Pattern;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import kotlin.TypeCastException;
import sy7.b;

public final class a$a	// class@0002e5
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       int i = (p0 == null || !p0.length())? 1: 0;
       if (i) {
          return b;
       }else {
          return Pattern.matches("^#\([0-9a-fA-F]{6}|[0-9a-fA-F]{8}\)$", p0);
       }
    }
    public final String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       StringBuilder str = (p0 == null || !p0.length())? 1: null;
       if (str) {
          return null;
       }else if(Pattern.matches("^#\([0-9a-fA-F]{8}\)", p0)){
          str = '#';
          if (p0 != null) {
             String str1 = p0.substring(7);
             a.h(str1, "\(this as java.lang.String\).substring\(startIndex\)");
             p0 = p0.substring(i, 7);
             a.h(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             return str+str1+p0;
          }else {
             throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
          }
       }else {
          b.b.g(p0+" is not of rgba format,returned old value");
          return p0;
       }
    }
}
