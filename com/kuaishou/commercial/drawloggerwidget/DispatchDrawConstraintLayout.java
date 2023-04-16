package com.kuaishou.commercial.drawloggerwidget.DispatchDrawConstraintLayout;
import ex.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import io.reactivex.subjects.PublishSubject;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;
import brd.t;
import com.kwai.robust.PatchProxyResult;

public class DispatchDrawConstraintLayout extends ConstraintLayout implements b	// class@0014b7
{
    public final c B;

    public void DispatchDrawConstraintLayout(Context p0){
       super(p0);
       this.B = PublishSubject.g();
    }
    public void DispatchDrawConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.B = PublishSubject.g();
    }
    public void DispatchDrawConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.B = PublishSubject.g();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DispatchDrawConstraintLayout.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       this.B.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, DispatchDrawConstraintLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.hide();
    }
}
