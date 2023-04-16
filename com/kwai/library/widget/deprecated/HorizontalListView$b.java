package com.kwai.library.widget.deprecated.HorizontalListView$b;
import android.database.DataSetObserver;
import com.kwai.library.widget.deprecated.HorizontalListView;
import android.widget.AdapterView;
import android.view.View;

public class HorizontalListView$b extends DataSetObserver	// class@000915
{
    public final HorizontalListView a;

    public void HorizontalListView$b(HorizontalListView p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       HorizontalListView$b ta = this.a;
       ta.h = true;
       ta.v = false;
       ta.n();
       this.a.invalidate();
       this.a.requestLayout();
       View emptyView = this.a.getEmptyView();
       if (emptyView != null) {
          this.a.setEmptyView(emptyView);
       }
       return;
    }
    public void onInvalidated(){
       HorizontalListView$b ta = this.a;
       ta.v = false;
       ta.n();
       this.a.l();
       this.a.invalidate();
       View emptyView = this.a.getEmptyView();
       if (emptyView != null) {
          this.a.setEmptyView(emptyView);
       }
       this.a.requestLayout();
       return;
    }
}
