package kotlin.text.CharDirectionality$Companion$directionalityMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import kotlin.text.CharDirectionality;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.lang.Integer;

public final class CharDirectionality$Companion$directionalityMap$2 extends Lambda implements a	// class@0018eb
{
    public static final CharDirectionality$Companion$directionalityMap$2 INSTANCE;

    static {
       CharDirectionality$Companion$directionalityMap$2.INSTANCE = new CharDirectionality$Companion$directionalityMap$2();
    }
    public void CharDirectionality$Companion$directionalityMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       CharDirectionality[] uCharDirecti = CharDirectionality.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(uCharDirecti.length), 16));
       int len = uCharDirecti.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uCharDirecti[i];
          linkedHashMa.put(Integer.valueOf(oobject.getValue()), oobject);
       }
       return linkedHashMa;
    }
}
