package butterknife.ViewCollections;
import java.lang.Object;
import android.view.View;
import butterknife.Action;
import java.util.List;
import android.util.Property;
import butterknife.Setter;

public final class ViewCollections	// class@000ba0
{

    public void ViewCollections(){
       super();
    }
    public static void run(View p0,Action p1){
       p1.apply(p0, 0);
    }
    public static void run(View p0,Action[] p1){
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          p1[i].apply(p0, 0);
       }
       return;
    }
    public static void run(List p0,Action p1){
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p1.apply(p0.get(i1), i1);
       }
       return;
    }
    public static void run(List p0,Action[] p1){
       int i = p0.size();
       int i1 = 0;
       while (i1 < i) {
          int len = p1.length;
          for (int i2 = 0; i2 < len; i2 = i2 + 1) {
             p1[i2].apply(p0.get(i1), i1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public static void run(View[] p0,Action p1){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          p1.apply(p0[i], i);
       }
       return;
    }
    public static void run(View[] p0,Action[] p1){
       int len = p0.length;
       int i = 0;
       while (i < len) {
          int len1 = p1.length;
          for (int i1 = 0; i1 < len1; i1 = i1 + 1) {
             p1[i1].apply(p0[i], i);
          }
          i = i + 1;
       }
       return;
    }
    public static void set(View p0,Property p1,Object p2){
       p1.set(p0, p2);
    }
    public static void set(View p0,Setter p1,Object p2){
       p1.set(p0, p2, 0);
    }
    public static void set(List p0,Property p1,Object p2){
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p1.set(p0.get(i1), p2);
       }
       return;
    }
    public static void set(List p0,Setter p1,Object p2){
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p1.set(p0.get(i1), p2, i1);
       }
       return;
    }
    public static void set(View[] p0,Property p1,Object p2){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          p1.set(p0[i], p2);
       }
       return;
    }
    public static void set(View[] p0,Setter p1,Object p2){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          p1.set(p0[i], p2, i);
       }
       return;
    }
}
