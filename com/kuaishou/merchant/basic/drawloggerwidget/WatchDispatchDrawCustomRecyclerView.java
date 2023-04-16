package com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawCustomRecyclerView;
import ft3.a;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
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

public class WatchDispatchDrawCustomRecyclerView extends CustomRecyclerView implements a	// class@0015ad
{
    public c q;

    public void WatchDispatchDrawCustomRecyclerView(Context p0){
       super(p0);
       this.q = PublishSubject.g();
    }
    public void WatchDispatchDrawCustomRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.q = PublishSubject.g();
    }
    public void WatchDispatchDrawCustomRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.q = PublishSubject.g();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WatchDispatchDrawCustomRecyclerView.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       this.q.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, WatchDispatchDrawCustomRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.hide();
    }
}
