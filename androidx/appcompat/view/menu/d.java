package androidx.appcompat.view.menu.d;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.e;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import ag6.a;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.k$a;

public class d extends BaseAdapter	// class@0005a9
{
    public e b;
    public int c;
    public boolean d;
    public final boolean e;
    public final LayoutInflater f;
    public final int g;

    public void d(e p0,LayoutInflater p1,boolean p2,int p3){
       super();
       this.c = -1;
       this.e = p2;
       this.f = p1;
       this.b = p0;
       this.g = p3;
       this.a();
    }
    public void a(){
       h oh = this.b.x();
       if (oh != null) {
          ArrayList uArrayList = this.b.B();
          int i = uArrayList.size();
          int i1 = 0;
          while (i1 < i) {
             if (uArrayList.get(i1) == oh) {
                this.c = i1;
                return;
             }
             i1 = i1 + 1;
          }
       }
       this.c = -1;
       return;
    }
    public e b(){
       return this.b;
    }
    public h c(int p0){
       ArrayList uArrayList = (this.e != null)? this.b.B(): this.b.G();
       d tc = this.c;
       if (tc >= null && p0 >= tc) {
          p0++;
       }
       return uArrayList.get(p0);
    }
    public void d(boolean p0){
       this.d = p0;
    }
    public int getCount(){
       ArrayList uArrayList = (this.e != null)? this.b.B(): this.b.G();
       if (this.c < null) {
          return uArrayList.size();
       }else {
          return (uArrayList.size() - 1);
       }
    }
    public Object getItem(int p0){
       return this.c(p0);
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       if (p1 == null) {
          p1 = a.c(this.f, this.g, p2, false);
       }
       boolean groupId = this.c(p0).getGroupId();
       int i = p0 - 1;
       i = (i >= 0)? this.c(i).getGroupId(): groupId;
       View view = p1;
       groupId = (this.b.H() && groupId != i)? true: false;
       view.setGroupDividerEnabled(groupId);
       View view1 = p1;
       if (this.d != null) {
          view.setForceShowIcon(true);
       }
       view1.k(this.c(p0), false);
       return p1;
    }
    public void notifyDataSetChanged(){
       this.a();
       super.notifyDataSetChanged();
    }
}
