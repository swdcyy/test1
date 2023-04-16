package com.kwai.library.widget.viewpager.GridViewPager$BGGridView$a;
import android.database.DataSetObserver;
import com.kwai.library.widget.viewpager.GridViewPager$BGGridView;

public class GridViewPager$BGGridView$a extends DataSetObserver	// class@000a64
{
    public final GridViewPager$BGGridView a;

    public void GridViewPager$BGGridView$a(GridViewPager$BGGridView p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       super.onChanged();
       this.a.a();
    }
}
