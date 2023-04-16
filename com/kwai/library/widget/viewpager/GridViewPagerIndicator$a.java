package com.kwai.library.widget.viewpager.GridViewPagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;
import com.kwai.library.widget.viewpager.GridViewPagerIndicator;
import java.lang.Object;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import java.util.Map;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.GridViewPager;
import com.kwai.library.widget.viewpager.GridViewPagerIndicator$a$a;

public class GridViewPagerIndicator$a implements PagerIndicator$d	// class@000a6d
{
    public final GridViewPagerIndicator a;

    public void GridViewPagerIndicator$a(GridViewPagerIndicator p0){
       this.a = p0;
       super();
    }
    public void a(PagerIndicator$c p0){
       GridViewPagerIndicator$a ta = this.a;
       ta.F.removeOnPageChangeListener(ta.G.get(p0));
    }
    public int b(){
       return this.a.F.getPageCount();
    }
    public void c(int p0){
       this.a.F.setCurrentItem(p0);
    }
    public void d(PagerIndicator$c p0){
       GridViewPagerIndicator$a$a uoa$a = new GridViewPagerIndicator$a$a(this, p0);
       this.a.G.put(p0, uoa$a);
       this.a.F.addOnPageChangeListener(uoa$a);
    }
    public int e(){
       return this.a.F.getCurrentItem();
    }
    public boolean isValid(){
       boolean b = (this.a.F != null)? true: false;
       return b;
    }
}
