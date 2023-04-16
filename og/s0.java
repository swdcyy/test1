package og.s0;
import java.lang.Object;
import java.lang.String;
import lnc.a1;
import kotlin.jvm.internal.a;

public final class s0	// class@0027c0
{
    public static final s0 a;

    static {
       s0.a = new s0();
    }
    public void s0(){
       super();
    }
    public final String a(long p0){
       String str;
       p0 = p0 / (long)1000;
       long l = (long)60;
       if (p0 - l < 0) {
          str = a1.q(R.string.arg_RES_7f103a56, (int)p0);
          a.o(str, "CommonUtil.string\(R.stri¡­_second, seconds.toInt\(\)\)");
       }else {
          str = a1.q(R.string.arg_RES_7f103a48, (int)(p0 / l));
          a.o(str, "CommonUtil.string\(R.stri¡­m_minute, minute.toInt\(\)\)");
       }
       return str;
    }
}
