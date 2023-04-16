package o2.b$c;
import androidx.lifecycle.ViewModel;
import o2.b$c$a;
import androidx.collection.SparseArrayCompat;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Class;
import java.lang.String;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.StringBuilder;
import java.lang.Object;
import o2.b$a;
import p2.a;

public class b$c extends ViewModel	// class@00274c
{
    public SparseArrayCompat a;
    public boolean b;
    public static final ViewModelProvider$Factory c;

    static {
       b$c.c = new b$c$a();
    }
    public void b$c(){
       super();
       this.a = new SparseArrayCompat();
       this.b = false;
    }
    public static b$c q0(ViewModelStore p0){
       return new ViewModelProvider(p0, b$c.c).get(b$c.class);
    }
    public void o0(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
       if (this.a.size() > 0) {
          p2.print(p0);
          p2.println("Loaders:");
          String str = p0+"    ";
          for (int i = 0; i < this.a.size(); i = i + 1) {
             b$a uoa = this.a.valueAt(i);
             p2.print(p0);
             p2.print("  #");
             p2.print(this.a.keyAt(i));
             p2.print(": ");
             p2.println(uoa.toString());
             uoa.r(str, p1, p2, p3);
          }
       }
       return;
    }
    public void onCleared(){
       super.onCleared();
       int i = this.a.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.a.valueAt(i1).q(true);
       }
       this.a.clear();
       return;
    }
    public void p0(){
       this.b = false;
    }
    public b$a r0(int p0){
       return this.a.get(p0);
    }
    public boolean s0(){
       return this.b;
    }
    public void t0(){
       int i = this.a.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.a.valueAt(i1).t();
       }
       return;
    }
    public void u0(int p0,b$a p1){
       this.a.put(p0, p1);
    }
    public void v0(int p0){
       this.a.remove(p0);
    }
    public void w0(){
       this.b = true;
    }
}
