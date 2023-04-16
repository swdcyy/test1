package androidx.recyclerview.widget.RecyclerView$h;
import android.database.Observable;
import java.util.ArrayList;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$i;

public class RecyclerView$h extends Observable	// class@00088f
{

    public void RecyclerView$h(){
       super();
    }
    public boolean a(){
       return (this.mObservers.isEmpty() ^ 0x01);
    }
    public void b(){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).g();
       }
       return;
    }
    public void c(int p0,int p1){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).k(p0, p1, 1);
       }
       return;
    }
    public void d(int p0,int p1){
       this.e(p0, p1, null);
    }
    public void e(int p0,int p1,Object p2){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).i(p0, p1, p2);
       }
       return;
    }
    public void f(int p0,int p1){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).j(p0, p1);
       }
       return;
    }
    public void g(int p0,int p1){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).l(p0, p1);
       }
       return;
    }
    public void h(){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          this.mObservers.get(i).m();
       }
       return;
    }
}
