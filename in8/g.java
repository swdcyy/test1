package in8.g;
import in8.m;
import java.util.Locale;
import java.text.NumberFormat;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import hn8.f;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Double;

public class g extends m	// class@0026bd
{
    public final int[] a;
    public static final NumberFormat b;

    static {
       NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
       g.b = instance;
       instance.setMinimumFractionDigits(0);
       instance.setGroupingUsed(0);
    }
    public void g(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.a = f.a(p1.getArray("input"));
    }
    public Object evaluate(){
       StringBuilder str = "";
       int i = 0;
       g ta = this.a;
       while (i < ta.length) {
          String str1 = this.mNodesManager.a(ta[i], m.class).value();
          if (str1 instanceof Double) {
             str1 = g.b.format(str1);
          }
          str = str+str1;
          i = i + 1;
       }
       return str;
    }
}
