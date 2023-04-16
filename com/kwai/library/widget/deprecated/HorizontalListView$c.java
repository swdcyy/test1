package com.kwai.library.widget.deprecated.HorizontalListView$c;
import java.lang.Runnable;
import com.kwai.library.widget.deprecated.HorizontalListView;
import java.lang.Object;
import android.widget.AdapterView;

public class HorizontalListView$c implements Runnable	// class@000916
{
    public final HorizontalListView b;

    public void HorizontalListView$c(HorizontalListView p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.requestLayout();
    }
}
