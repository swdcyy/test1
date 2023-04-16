package e3.b0;
import e3.n;
import java.lang.String;
import e3.o;
import java.lang.Object;
import java.util.Map;
import java.lang.Integer;
import android.view.View;
import java.lang.Math;

public abstract class b0 extends n	// class@001edc
{
    public static final String[] a;

    static {
       String[] stringArray = new String[]{"android:visibilityPropagation:visibility","android:visibilityPropagation:center"};
       b0.a = stringArray;
    }
    public void b0(){
       super();
    }
    public static int d(o p0,int p1){
       if (p0 == null) {
          return -1;
       }
       int[] ointArray = p0.a.get("android:visibilityPropagation:center");
       if (ointArray == null) {
          return -1;
       }
       return ointArray[p1];
    }
    public void a(o p0){
       o b = p0.b;
       Integer integer = p0.a.get("android:visibility:visibility");
       if (integer == null) {
          integer = Integer.valueOf(b.getVisibility());
       }
       p0.a.put("android:visibilityPropagation:visibility", integer);
       int[] ointArray = new int[]{ointArray[0] + (b.getWidth() / 2),ointArray[1] + Math.round(b.getTranslationY())};
       b.getLocationOnScreen(ointArray);
       ointArray[0] = ointArray[0] + Math.round(b.getTranslationX());
       ointArray[1] = ointArray[1] + (b.getHeight() / 2);
       p0.a.put("android:visibilityPropagation:center", ointArray);
       return;
    }
    public String[] b(){
       return b0.a;
    }
    public int e(o p0){
       if (p0 == null) {
          return 8;
       }
       Integer integer = p0.a.get("android:visibilityPropagation:visibility");
       if (integer == null) {
          return 8;
       }
       return integer.intValue();
    }
    public int f(o p0){
       return b0.d(p0, 0);
    }
    public int g(o p0){
       return b0.d(p0, 1);
    }
}
