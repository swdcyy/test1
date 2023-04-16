package com.kuaishou.commercial.drawloggerwidget.DispatchDrawSelectShapeFrameLayout;
import ex.b;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
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

public class DispatchDrawSelectShapeFrameLayout extends SelectShapeFrameLayout implements b	// class@0014bb
{
    public c c;

    public void DispatchDrawSelectShapeFrameLayout(Context p0){
       super(p0);
       this.c = PublishSubject.g();
    }
    public void DispatchDrawSelectShapeFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = PublishSubject.g();
    }
    public void DispatchDrawSelectShapeFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = PublishSubject.g();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DispatchDrawSelectShapeFrameLayout.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       this.c.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, DispatchDrawSelectShapeFrameLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.hide();
    }
}
