package com.tachikoma.component.viewpager.widget.RecyclerViewPager$a;
import androidx.recyclerview.widget.o;
import com.tachikoma.component.viewpager.widget.RecyclerViewPager;
import android.content.Context;
import android.util.DisplayMetrics;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class RecyclerViewPager$a extends o	// class@000d31
{
    public final RecyclerViewPager q;

    public void RecyclerViewPager$a(RecyclerViewPager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public float v(DisplayMetrics p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecyclerViewPager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (super.v(p0) * 3.00f);
    }
}
