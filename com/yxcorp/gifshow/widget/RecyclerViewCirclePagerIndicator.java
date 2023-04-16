package com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import android.content.Context;
import java.util.HashMap;
import android.util.AttributeSet;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;

public class RecyclerViewCirclePagerIndicator extends PagerIndicator	// class@0018b7
{
    public ViewPagerRecyclerView F;
    public Map G;

    public void RecyclerViewCirclePagerIndicator(Context p0){
       super(p0);
       this.G = new HashMap();
    }
    public void RecyclerViewCirclePagerIndicator(Context p0,AttributeSet p1){
       super(p0, p1);
       this.G = new HashMap();
    }
    public void RecyclerViewCirclePagerIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.G = new HashMap();
    }
    public void setRecyclerView(ViewPagerRecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerViewCirclePagerIndicator.class, "1")) {
          return;
       }
       this.F = p0;
       super.setPager(new RecyclerViewCirclePagerIndicator$a(this));
       return;
    }
}
