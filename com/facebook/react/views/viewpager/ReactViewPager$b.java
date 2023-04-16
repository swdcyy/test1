package com.facebook.react.views.viewpager.ReactViewPager$b;
import h3.a;
import com.facebook.react.views.viewpager.ReactViewPager;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import androidx.viewpager.widget.ViewPager;

public class ReactViewPager$b extends a	// class@001440
{
    public final List d;
    public boolean e;
    public final ReactViewPager f;

    public void ReactViewPager$b(ReactViewPager p0){
       this.f = p0;
       super();
       this.d = new ArrayList();
       this.e = false;
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(ReactViewPager$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactViewPager$b.class, "9")) {
          return;
       }
       p0.removeView(p2);
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, ReactViewPager$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public int k(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactViewPager$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.e != null || !this.d.contains(p0))? -2: this.d.indexOf(p0);
       return i;
    }
    public Object o(ViewGroup p0,int p1){
       ReactViewPager$b uob = ReactViewPager$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = this.d.get(p1);
       p0.addView(view, 0, this.f.generateDefaultLayoutParams());
       return view;
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
}
