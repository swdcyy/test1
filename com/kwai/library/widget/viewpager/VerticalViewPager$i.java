package com.kwai.library.widget.viewpager.VerticalViewPager$i;
import java.util.Comparator;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.viewpager.VerticalViewPager$LayoutParams;

public class VerticalViewPager$i implements Comparator	// class@000a80
{

    public void VerticalViewPager$i(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       p0 = p0.getLayoutParams();
       p1 = p1.getLayoutParams();
       VerticalViewPager$LayoutParams a = p0.a;
       if (a != p1.a) {
          i = (a != null)? 1: -1;
       }else {
          i = p0.e - p1.e;
       }
       return i;
    }
}
