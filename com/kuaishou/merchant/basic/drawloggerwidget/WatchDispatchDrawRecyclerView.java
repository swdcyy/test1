package com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawRecyclerView;
import ft3.a;
import androidx.recyclerview.widget.RecyclerView;
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

public class WatchDispatchDrawRecyclerView extends RecyclerView implements a	// class@0015af
{
    public c b;

    public void WatchDispatchDrawRecyclerView(Context p0){
       super(p0);
       this.b = PublishSubject.g();
    }
    public void WatchDispatchDrawRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = PublishSubject.g();
    }
    public void WatchDispatchDrawRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = PublishSubject.g();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WatchDispatchDrawRecyclerView.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       this.b.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, WatchDispatchDrawRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.hide();
    }
}
