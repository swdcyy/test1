package androidx.appcompat.widget.ScrollingTabContainerView$b;
import android.widget.BaseAdapter;
import androidx.appcompat.widget.ScrollingTabContainerView;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView$TabView;
import androidx.appcompat.app.ActionBar$c;

public class ScrollingTabContainerView$b extends BaseAdapter	// class@000611
{
    public final ScrollingTabContainerView b;

    public void ScrollingTabContainerView$b(ScrollingTabContainerView p0){
       this.b = p0;
       super();
    }
    public int getCount(){
       return this.b.d.getChildCount();
    }
    public Object getItem(int p0){
       return this.b.d.getChildAt(p0).getTab();
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       ScrollingTabContainerView$TabView tabView;
       if (p1 == null) {
          tabView = this.b.f(this.getItem(p0), true);
       }else {
          p1.a(this.getItem(p0));
       }
       return tabView;
    }
}
