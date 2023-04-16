package com.kwai.library.widget.viewpager.VerticalViewPager$c;
import java.lang.Runnable;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import java.lang.Object;

public class VerticalViewPager$c implements Runnable	// class@000a7a
{
    public final VerticalViewPager b;

    public void VerticalViewPager$c(VerticalViewPager p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.setScrollState(0);
       this.b.C();
       this.b.w();
    }
}
