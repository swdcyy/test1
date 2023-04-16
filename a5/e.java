package a5.e;
import java.lang.Object;
import a5.o;
import java.util.HashSet;
import java.lang.String;
import android.graphics.Rect;
import androidx.collection.SparseArrayCompat;
import java.util.Map;
import java.util.List;
import g5.g;
import com.airbnb.lottie.ex.model.layer.Layer;
import androidx.collection.LongSparseArray;
import java.lang.StringBuilder;
import java.util.Iterator;

public class e	// class@0000d5
{
    public final o a;
    public final HashSet b;
    public Map c;
    public Map d;
    public Map e;
    public List f;
    public SparseArrayCompat g;
    public LongSparseArray h;
    public List i;
    public Rect j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public int o;

    public void e(){
       super();
       this.a = new o();
       this.b = new HashSet();
       this.o = 0;
    }
    public void a(String p0){
       this.b.add(p0);
    }
    public Rect b(){
       return this.j;
    }
    public SparseArrayCompat c(){
       return this.g;
    }
    public float d(){
       return (float)(long)((this.e() / this.m) * 1000.00f);
    }
    public float e(){
       return (this.l - this.k);
    }
    public float f(){
       return this.l;
    }
    public Map g(){
       return this.d;
    }
    public List h(){
       return this.i;
    }
    public g i(String p0){
       g og;
       this.f.size();
       int i = 0;
       while (true) {
          if (i >= this.f.size()) {
             return null;
          }
          og = this.f.get(i);
          int i1 = 1;
          if (!(og.a).equalsIgnoreCase(p0)) {
             if ((og.a).endsWith(g.d)) {
                g a = og.a;
                int i2 = a.length() - i1;
                if (!(a.substring(0, i2)).equalsIgnoreCase(p0)) {
                }
             }else {
             }
          }
       label_003e :
          if (i1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return og;
    }
    public int j(){
       return this.o;
    }
    public o k(){
       return this.a;
    }
    public float l(){
       return this.k;
    }
    public boolean m(){
       return this.n;
    }
    public void n(int p0){
       this.o = this.o + p0;
    }
    public Layer o(long p0){
       return this.h.get(p0);
    }
    public void p(boolean p0){
       this.n = p0;
    }
    public void q(boolean p0){
       this.a.a = p0;
    }
    public String toString(){
       String str = "LottieComposition:\n";
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          str = str+iterator.next().n("\t");
       }
       return str;
    }
}
