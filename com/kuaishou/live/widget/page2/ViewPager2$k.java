package com.kuaishou.live.widget.page2.ViewPager2$k;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ViewPager2$k implements Runnable	// class@001039
{
    public final int b;
    public final RecyclerView c;

    public void ViewPager2$k(int p0,RecyclerView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ViewPager2$k.class, "1")) {
          return;
       }
       this.c.smoothScrollToPosition(this.b);
       return;
    }
}
