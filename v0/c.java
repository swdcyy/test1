package v0.c;
import v0.e;
import androidx.appcompat.view.menu.j;
import android.widget.AdapterView$OnItemClickListener;
import java.lang.Object;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.d;
import android.widget.HeaderViewListAdapter;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View$MeasureSpec;
import android.widget.FrameLayout;
import android.view.View;
import androidx.appcompat.view.menu.e;
import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import androidx.appcompat.view.menu.b;
import android.widget.AdapterView;
import android.widget.Adapter;
import android.graphics.Rect;
import android.widget.PopupWindow$OnDismissListener;

public abstract class c implements e, j, AdapterView$OnItemClickListener	// class@002daf
{
    public Rect b;

    public void c(){
       super();
    }
    public static d A(ListAdapter p0){
       if (p0 instanceof HeaderViewListAdapter) {
          return p0.getWrappedAdapter();
       }
       return p0;
    }
    public static int q(ListAdapter p0,ViewGroup p1,Context p2,int p3){
       int i = 0;
       int i1 = View$MeasureSpec.makeMeasureSpec(i, i);
       d uod = View$MeasureSpec.makeMeasureSpec(i, i);
       int count = p0.getCount();
       ViewGroup viewGroup = null;
       View view = viewGroup;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (i >= count) {
             return i2;
          }
          int itemViewType = p0.getItemViewType(i);
          if (itemViewType != i3) {
             view = null;
             i3 = itemViewType;
          }
          if (viewGroup == null) {
             viewGroup = new FrameLayout(p2);
          }
          view = p0.getView(i, view, viewGroup);
          view.measure(i1, uod);
          itemViewType = view.getMeasuredWidth();
          if (itemViewType >= p3) {
             break ;
          }else if(itemViewType > i2){
             i2 = itemViewType;
          }
          i++;
       }
       return p3;
    }
    public static boolean z(e p0){
       int i = p0.size();
       boolean b = false;
       int i1 = 0;
       while (i1 < i) {
          MenuItem item = p0.getItem(i1);
          if (item.isVisible() && item.getIcon() != null) {
             b = true;
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return b;
    }
    public boolean g(e p0,h p1){
       return false;
    }
    public int getId(){
       return 0;
    }
    public boolean j(e p0,h p1){
       return false;
    }
    public void k(Context p0,e p1){
    }
    public k m(ViewGroup p0){
       throw new UnsupportedOperationException("MenuPopups manage their own views");
    }
    public abstract void n(e p0);
    public boolean o(){
       return (this instanceof b ^ 0x01);
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       ListAdapter adapter = p0.getAdapter();
       d b = c.A(adapter).b;
       MenuItem item = adapter.getItem(p2);
       p2 = (this.o())? 0: 4;
       b.O(item, this, p2);
       return;
    }
    public Rect p(){
       return this.b;
    }
    public abstract void r(View p0);
    public void s(Rect p0){
       this.b = p0;
    }
    public abstract void t(boolean p0);
    public abstract void u(int p0);
    public abstract void v(int p0);
    public abstract void w(PopupWindow$OnDismissListener p0);
    public abstract void x(boolean p0);
    public abstract void y(int p0);
}
