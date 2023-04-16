package com.kwai.library.widget.viewpager.RecyclerViewPager$d;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;

public class RecyclerViewPager$d implements Runnable	// class@000a72
{
    public final int b;
    public final RecyclerView c;

    public void RecyclerViewPager$d(int p0,RecyclerView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       this.c.smoothScrollToPosition(this.b);
    }
}
