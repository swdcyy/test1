package com.kuaishou.live.widget.page2.ViewPager2$LinearLayoutManagerImpl$a;
import androidx.recyclerview.widget.o;
import com.kuaishou.live.widget.page2.ViewPager2$LinearLayoutManagerImpl;
import android.content.Context;
import android.util.DisplayMetrics;
import com.kuaishou.live.widget.page2.ViewPager2;

public class ViewPager2$LinearLayoutManagerImpl$a extends o	// class@001027
{
    public final ViewPager2$LinearLayoutManagerImpl q;

    public void ViewPager2$LinearLayoutManagerImpl$a(ViewPager2$LinearLayoutManagerImpl p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public float v(DisplayMetrics p0){
       return (this.q.r.v / (float)p0.densityDpi);
    }
}
