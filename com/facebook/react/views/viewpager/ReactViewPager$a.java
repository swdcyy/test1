package com.facebook.react.views.viewpager.ReactViewPager$a;
import java.lang.Runnable;
import com.facebook.react.views.viewpager.ReactViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;

public class ReactViewPager$a implements Runnable	// class@00143f
{
    public final ReactViewPager b;

    public void ReactViewPager$a(ReactViewPager p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ReactViewPager$a.class, "1")) {
          return;
       }
       ReactViewPager$a tb = this.b;
       tb.measure(View$MeasureSpec.makeMeasureSpec(tb.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.b.getHeight(), 0x40000000));
       tb = this.b;
       tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
       return;
    }
}
