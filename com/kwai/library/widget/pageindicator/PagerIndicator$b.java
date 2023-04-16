package com.kwai.library.widget.pageindicator.PagerIndicator$b;
import android.database.DataSetObserver;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;
import android.widget.LinearLayout;

public class PagerIndicator$b extends DataSetObserver	// class@00096c
{
    public final PagerIndicator a;

    public void PagerIndicator$b(PagerIndicator p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       super.onChanged();
       PagerIndicator c = this.a.C;
       if (c == null) {
          return;
       }
       int i = c.b();
       if (i == this.a.getChildCount()) {
          return;
       }
       PagerIndicator$b ta = this.a;
       ta.v = (ta.v < i)? ta.C.e(): -1;
       this.a.e();
       return;
    }
}
