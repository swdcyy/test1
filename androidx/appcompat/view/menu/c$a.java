package androidx.appcompat.view.menu.c$a;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.e;
import java.util.ArrayList;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import ag6.a;
import androidx.appcompat.view.menu.k$a;

public class c$a extends BaseAdapter	// class@0005a7
{
    public int b;
    public final c c;

    public void c$a(c p0){
       this.c = p0;
       super();
       this.b = -1;
       this.a();
    }
    public void a(){
       h oh = this.c.d.x();
       if (oh != null) {
          ArrayList uArrayList = this.c.d.B();
          int i = uArrayList.size();
          int i1 = 0;
          while (i1 < i) {
             if (uArrayList.get(i1) == oh) {
                this.b = i1;
                return;
             }
             i1 = i1 + 1;
          }
       }
       this.b = -1;
       return;
    }
    public h b(int p0){
       ArrayList uArrayList = this.c.d.B();
       p0 = p0 + this.c.f;
       c$a tb = this.b;
       if (tb >= null && p0 >= tb) {
          p0++;
       }
       return uArrayList.get(p0);
    }
    public int getCount(){
       int i = this.c.d.B().size() - this.c.f;
       if (this.b < null) {
          return i;
       }
       return (i - 1);
    }
    public Object getItem(int p0){
       return this.b(p0);
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       c$a tc;
       if (p1 == null) {
          tc = this.c;
          tc = a.c(tc.c, tc.h, p2, false);
       }
       tc.k(this.b(p0), false);
       return tc;
    }
    public void notifyDataSetChanged(){
       this.a();
       super.notifyDataSetChanged();
    }
}
