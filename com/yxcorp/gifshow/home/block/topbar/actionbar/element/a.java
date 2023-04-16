package com.yxcorp.gifshow.home.block.topbar.actionbar.element.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.e;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$b;
import java.lang.Object;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;

public class a extends Accessor	// class@001655
{
    public final HomeBlockViewElement$b c;
    public final e d;

    public void a(e p0,HomeBlockViewElement$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
