package com.kuaishou.commercial.drawloggerwidget.DispatchDrawFrameLayout;
import ex.b;
import android.widget.FrameLayout;
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

public class DispatchDrawFrameLayout extends FrameLayout implements b	// class@0014b8
{
    public c b;

    public void DispatchDrawFrameLayout(Context p0){
       super(p0);
       this.b = PublishSubject.g();
    }
    public void DispatchDrawFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = PublishSubject.g();
    }
    public void DispatchDrawFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = PublishSubject.g();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DispatchDrawFrameLayout.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       this.b.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, DispatchDrawFrameLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.hide();
    }
}
