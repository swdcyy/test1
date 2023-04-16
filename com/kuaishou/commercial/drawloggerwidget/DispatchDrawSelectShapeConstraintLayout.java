package com.kuaishou.commercial.drawloggerwidget.DispatchDrawSelectShapeConstraintLayout;
import ex.b;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import android.content.Context;
import io.reactivex.subjects.PublishSubject;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Boolean;
import brd.y;
import brd.t;
import com.kwai.robust.PatchProxyResult;

public class DispatchDrawSelectShapeConstraintLayout extends SelectShapeConstraintLayout implements b	// class@0014ba
{
    public final c C;

    public void DispatchDrawSelectShapeConstraintLayout(Context p0){
       super(p0);
       this.C = PublishSubject.g();
    }
    public void DispatchDrawSelectShapeConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.C = PublishSubject.g();
    }
    public void DispatchDrawSelectShapeConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.C = PublishSubject.g();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DispatchDrawSelectShapeConstraintLayout.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       this.C.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, DispatchDrawSelectShapeConstraintLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.hide();
    }
}
