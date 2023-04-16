package com.yxcorp.gifshow.widget.banner.SlowScrollRecyclerViewPager$a;
import androidx.recyclerview.widget.o;
import com.yxcorp.gifshow.widget.banner.SlowScrollRecyclerViewPager;
import android.content.Context;
import android.util.DisplayMetrics;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class SlowScrollRecyclerViewPager$a extends o	// class@001953
{
    public final SlowScrollRecyclerViewPager q;

    public void SlowScrollRecyclerViewPager$a(SlowScrollRecyclerViewPager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public float v(DisplayMetrics p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlowScrollRecyclerViewPager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       a.p(p0, "displayMetrics");
       return (super.v(p0) * 3.00f);
    }
}
