package com.kwai.library.widget.viewpager.GridViewPager$a;
import androidx.viewpager.widget.ViewPager$j;
import com.kwai.library.widget.viewpager.GridViewPager;
import java.lang.Object;
import android.view.View;

public class GridViewPager$a implements ViewPager$j	// class@000a66
{
    public final GridViewPager a;

    public void GridViewPager$a(GridViewPager p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
       p0.setTranslationX(((float)p0.getWidth() * (- p1)));
       p0.setTranslationY(((float)p0.getHeight() * p1));
    }
}
