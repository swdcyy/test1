package gn8.c;
import fn8.c;
import java.lang.Object;
import android.util.SparseArray;
import fn8.b;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;

public class c implements c	// class@002499
{
    public SparseArray a;
    public SparseArray b;

    public void c(){
       super();
       this.a = new SparseArray();
       this.b = new SparseArray();
    }
    public boolean a(b p0,b p1){
       int[] ointArray = this.a.get(p0.l());
       if (ointArray != null) {
          int i = 0;
          while (i < ointArray.length) {
             if (ointArray[i] == p1.l()) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public boolean b(b p0,b p1){
       return false;
    }
    public boolean c(b p0,b p1){
       return false;
    }
    public boolean d(b p0,b p1){
       int[] ointArray = this.b.get(p0.l());
       if (ointArray != null) {
          int i = 0;
          while (i < ointArray.length) {
             if (ointArray[i] == p1.l()) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public void e(b p0,ReadableMap p1){
       p0.t = this;
       String str = "waitFor";
       if (p1.hasKey(str)) {
          this.a.put(p0.l(), this.f(p1, str));
       }
       str = "simultaneousHandlers";
       if (p1.hasKey(str)) {
          this.b.put(p0.l(), this.f(p1, str));
       }
       return;
    }
    public final int[] f(ReadableMap p0,String p1){
       ReadableArray array = p0.getArray(p1);
       int i = array.size();
       int[] ointArray = new int[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ointArray[i1] = array.getInt(i1);
       }
       return ointArray;
    }
    public void g(int p0){
       this.a.remove(p0);
       this.b.remove(p0);
    }
}
