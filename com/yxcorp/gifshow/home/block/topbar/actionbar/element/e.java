package com.yxcorp.gifshow.home.block.topbar.actionbar.element.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.b;
import java.lang.String;
import android.widget.TextView;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.c;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.d;
import mm8.a;

public final class e implements b	// class@001659
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(PagerSlidingTabStrip$d.class, new a(this, p1));
       p0.i("KCUBE_TAB", new b(this, p1));
       TextView textView = TextView.class;
       c uoc = new c(this, p1);
       try{
          p0.h(textView, uoc);
          p0.h(HomeBlockViewElement$b.class, new d(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
