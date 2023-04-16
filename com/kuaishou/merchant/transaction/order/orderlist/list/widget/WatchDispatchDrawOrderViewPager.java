package com.kuaishou.merchant.transaction.order.orderlist.list.widget.WatchDispatchDrawOrderViewPager;
import com.yxcorp.gifshow.widget.viewpager.HomeViewPager;
import android.content.Context;
import io.reactivex.subjects.PublishSubject;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.lang.Boolean;
import brd.y;
import brd.t;
import com.kwai.robust.PatchProxyResult;

public class WatchDispatchDrawOrderViewPager extends HomeViewPager	// class@0008aa
{
    public c G;

    public void WatchDispatchDrawOrderViewPager(Context p0){
       super(p0);
       this.G = PublishSubject.g();
    }
    public void WatchDispatchDrawOrderViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.G = PublishSubject.g();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WatchDispatchDrawOrderViewPager.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       this.G.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, WatchDispatchDrawOrderViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.hide();
    }
}
