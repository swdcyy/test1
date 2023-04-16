package com.kwai.library.widget.pageindicator.PagerSnapHelperIndicator$a;
import androidx.recyclerview.widget.t;
import java.util.LinkedList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;

public class PagerSnapHelperIndicator$a extends t	// class@000971
{
    public RecyclerView f;
    public List g;

    public void PagerSnapHelperIndicator$a(){
       super();
       this.g = new LinkedList();
    }
    public void b(RecyclerView p0){
       super.b(p0);
       this.f = p0;
    }
    public int i(RecyclerView$LayoutManager p0,int p1,int p2){
       int i = super.i(p0, p1, p2);
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageSelected(i);
       }
       return i;
    }
}
