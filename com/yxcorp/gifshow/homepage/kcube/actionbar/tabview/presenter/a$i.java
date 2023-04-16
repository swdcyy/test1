package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$i;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;

public final class a$i implements u	// class@00171c
{
    public final a a;

    public void a$i(a p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       float f = p0.floatValue();
       a$i oi = a$i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), this, oi, "1")) {
          if (!f - 0x3f800000) {
             a.V8(this.a).h(false);
          }else if(!f){
             a.V8(this.a).h(true);
          }
       }
       return;
    }
}
