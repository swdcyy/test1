package btd.k;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.lang.String;
import java.lang.ThreadLocal;
import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class k	// class@0002eb
{
    public static final DecimalFormatSymbols a;
    public static final DecimalFormatSymbols b;
    public static final ThreadLocal[] c;
    public static final ThreadLocal d;

    static {
       Locale rOOT = Locale.ROOT;
       DecimalFormatSymbols uDecimalForm = new DecimalFormatSymbols(rOOT);
       uDecimalForm.setExponentSeparator("e");
       k.a = uDecimalForm;
       uDecimalForm = new DecimalFormatSymbols(rOOT);
       uDecimalForm.setExponentSeparator("e+");
       k.b = uDecimalForm;
       int i = 4;
       ThreadLocal[] threadLocalA = new ThreadLocal[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          threadLocalA[i1] = new ThreadLocal();
       }
       k.c = threadLocalA;
       k.d = new ThreadLocal();
    }
    public static final DecimalFormat a(int p0){
       DecimalFormat uDecimalForm = new DecimalFormat("0", k.a);
       if (p0 > 0) {
          uDecimalForm.setMinimumFractionDigits(p0);
       }
       uDecimalForm.setRoundingMode(RoundingMode.HALF_UP);
       return uDecimalForm;
    }
    public static final String b(double p0){
       ThreadLocal d = k.d;
       DecimalFormat uDecimalForm = d.get();
       if (uDecimalForm != null) {
       }else {
          uDecimalForm = new DecimalFormat("0E0", k.a);
          uDecimalForm.setMinimumFractionDigits(2);
          d.set(uDecimalForm);
       }
       DecimalFormatSymbols b = (p0 - (double)1 >= 0 || p0 - (double)-1 <= 0)? k.b: k.a;
       uDecimalForm.setDecimalFormatSymbols(b);
       String str = uDecimalForm.format(p0);
       a.o(str, "scientificFormat.getOrSe¡­ }\n        .format\(value\)");
       return str;
    }
    public static final String c(double p0,int p1){
       DecimalFormat uDecimalForm;
       ThreadLocal[] c = k.c;
       if (p1 < c.length) {
          object oobject = c[p1];
          uDecimalForm = oobject.get();
          if (uDecimalForm == null) {
             uDecimalForm = k.a(p1);
             oobject.set(uDecimalForm);
          }
       }else {
          uDecimalForm = k.a(p1);
       }
       String str = uDecimalForm.format(p0);
       a.o(str, "format.format\(value\)");
       return str;
    }
    public static final String d(double p0,int p1){
       DecimalFormat uDecimalForm = k.a(0);
       uDecimalForm.setMaximumFractionDigits(p1);
       String str = uDecimalForm.format(p0);
       a.o(str, "createFormatForDecimals\(¡­ }\n        .format\(value\)");
       return str;
    }
}
