package com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawConstraintLayout;
import ft3.a;
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

public class WatchDispatchDrawConstraintLayout extends ConstraintLayout implements a	// class@0015ac
{
    public final c B;

    public void WatchDispatchDrawConstraintLayout(Context p0){
       super(p0);
       this.B = PublishSubject.g();
    }
    public void WatchDispatchDrawConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.B = PublishSubject.g();
    }
    public void WatchDispatchDrawConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.B = PublishSubject.g();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WatchDispatchDrawConstraintLayout.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       this.B.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, WatchDispatchDrawConstraintLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.hide();
    }
}
