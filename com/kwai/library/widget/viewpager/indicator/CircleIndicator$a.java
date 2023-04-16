package com.kwai.library.widget.viewpager.indicator.CircleIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;
import com.kwai.library.widget.viewpager.indicator.CircleIndicator;
import java.lang.Object;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import java.util.Map;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import com.kwai.library.widget.viewpager.indicator.CircleIndicator$a$a;

public class CircleIndicator$a implements PagerIndicator$d	// class@000a85
{
    public final CircleIndicator a;

    public void CircleIndicator$a(CircleIndicator p0){
       this.a = p0;
       super();
    }
    public void a(PagerIndicator$c p0){
       CircleIndicator$a ta = this.a;
       ta.F.removeOnPageChangeListener(ta.G.get(p0));
    }
    public int b(){
       return this.a.F.getAdapter().j();
    }
    public void c(int p0){
       this.a.F.setCurrentItem(p0);
    }
    public void d(PagerIndicator$c p0){
       CircleIndicator$a$a uoa$a = new CircleIndicator$a$a(this, p0);
       this.a.G.put(p0, uoa$a);
       this.a.F.addOnPageChangeListener(uoa$a);
    }
    public int e(){
       return this.a.F.getCurrentItem();
    }
    public boolean isValid(){
       CircleIndicator f = this.a.F;
       boolean b = (f != null && f.getAdapter() != null)? true: false;
       return b;
    }
}
