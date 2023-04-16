package androidx.appcompat.widget.ScrollingTabContainerView$c;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.ScrollingTabContainerView;
import java.lang.Object;
import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView$TabView;
import androidx.appcompat.app.ActionBar$c;
import android.view.ViewGroup;

public class ScrollingTabContainerView$c implements View$OnClickListener	// class@000612
{
    public final ScrollingTabContainerView b;

    public void ScrollingTabContainerView$c(ScrollingTabContainerView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       p0.getTab().g();
       int childCount = this.b.d.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          View childAt = this.b.d.getChildAt(i);
          boolean b = (childAt == p0)? true: false;
          childAt.setSelected(b);
       }
       return;
    }
}
