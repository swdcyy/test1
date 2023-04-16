package androidx.appcompat.widget.ListPopupWindow$e;
import android.widget.AbsListView$OnScrollListener;
import androidx.appcompat.widget.ListPopupWindow;
import java.lang.Object;
import android.widget.AbsListView;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.Runnable;
import android.os.Handler;
import androidx.appcompat.widget.ListPopupWindow$g;

public class ListPopupWindow$e implements AbsListView$OnScrollListener	// class@000609
{
    public final ListPopupWindow a;

    public void ListPopupWindow$e(ListPopupWindow p0){
       this.a = p0;
       super();
    }
    public void onScroll(AbsListView p0,int p1,int p2,int p3){
    }
    public void onScrollStateChanged(AbsListView p0,int p1){
       if (p1 == 1 && (!this.a.w() && this.a.G.getContentView() != null)) {
          ListPopupWindow$e ta = this.a;
          ta.C.removeCallbacks(ta.x);
          this.a.x.run();
       }
    label_0025 :
       return;
    }
}
