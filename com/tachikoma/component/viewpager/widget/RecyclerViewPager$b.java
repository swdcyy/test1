package com.tachikoma.component.viewpager.widget.RecyclerViewPager$b;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RecyclerViewPager$b implements Runnable	// class@000d32
{
    public final int b;
    public final RecyclerView c;

    public void RecyclerViewPager$b(int p0,RecyclerView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, RecyclerViewPager$b.class, "1")) {
          return;
       }
       this.c.smoothScrollToPosition(this.b);
       return;
    }
}
