package gn8.e;
import fn8.e;
import java.lang.Object;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import fn8.b;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public class e implements e	// class@00249b
{
    public final SparseArray a;
    public final SparseArray b;
    public final SparseArray c;

    public void e(){
       super();
       this.a = new SparseArray();
       this.b = new SparseArray();
       this.c = new SparseArray();
    }
    public synchronized ArrayList a(View p0){
       return this.c.get(p0.getId());
    }
    public synchronized boolean b(int p0,int p1){
       b uob = this.a.get(p0);
       if (uob == null) {
          return false;
       }
       this.c(uob);
       this.f(p1, uob);
       return true;
    }
    public synchronized final void c(b p0){
       Integer integer = this.b.get(p0.l());
       if (integer != null) {
          this.b.remove(p0.l());
          ArrayList uArrayList = this.c.get(integer.intValue());
          if (uArrayList != null) {
             uArrayList.remove(p0);
             if (!uArrayList.size()) {
                this.c.remove(integer.intValue());
             }
          }
       }
       if (p0.m() != null) {
          p0.c();
       }
       return;
    }
    public synchronized void d(int p0){
       b uob = this.a.get(p0);
       if (uob != null) {
          this.c(uob);
          this.a.remove(p0);
       }
       return;
    }
    public synchronized void e(b p0){
       this.a.put(p0.l(), p0);
    }
    public synchronized final void f(int p0,b p1){
       if (this.b.get(p1.l()) != null) {
          throw new IllegalStateException("Handler "+p1+" already attached");
       }
       this.b.put(p1.l(), Integer.valueOf(p0));
       ArrayList uArrayList = this.c.get(p0);
       if (uArrayList == null) {
          uArrayList = new ArrayList(1);
          uArrayList.add(p1);
          this.c.put(p0, uArrayList);
       }else {
          uArrayList.add(p1);
       }
       return;
    }
}
