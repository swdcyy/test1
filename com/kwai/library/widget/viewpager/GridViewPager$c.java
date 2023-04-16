package com.kwai.library.widget.viewpager.GridViewPager$c;
import android.database.DataSetObserver;
import com.kwai.library.widget.viewpager.GridViewPager;

public class GridViewPager$c extends DataSetObserver	// class@000a68
{
    public final GridViewPager a;

    public void GridViewPager$c(GridViewPager p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       super.onChanged();
       this.a.k();
    }
}
