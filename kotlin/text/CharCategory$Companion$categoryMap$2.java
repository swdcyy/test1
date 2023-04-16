package kotlin.text.CharCategory$Companion$categoryMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import kotlin.text.CharCategory;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.lang.Integer;

public final class CharCategory$Companion$categoryMap$2 extends Lambda implements a	// class@0018e8
{
    public static final CharCategory$Companion$categoryMap$2 INSTANCE;

    static {
       CharCategory$Companion$categoryMap$2.INSTANCE = new CharCategory$Companion$categoryMap$2();
    }
    public void CharCategory$Companion$categoryMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       CharCategory[] uCharCategor = CharCategory.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(uCharCategor.length), 16));
       int len = uCharCategor.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uCharCategor[i];
          linkedHashMa.put(Integer.valueOf(oobject.getValue()), oobject);
       }
       return linkedHashMa;
    }
}
