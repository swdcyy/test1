package com.kwai.library.widget.viewpager.indicator.CircleIndicator;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import android.content.Context;
import java.util.HashMap;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.indicator.CircleIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;

public class CircleIndicator extends PagerIndicator	// class@000a86
{
    public ViewPager F;
    public Map G;

    public void CircleIndicator(Context p0){
       super(p0);
       this.G = new HashMap();
    }
    public void CircleIndicator(Context p0,AttributeSet p1){
       super(p0, p1);
       this.G = new HashMap();
    }
    public void CircleIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.G = new HashMap();
    }
    public void setViewPager(ViewPager p0){
       this.F = p0;
       super.setPager(new CircleIndicator$a(this));
    }
}
