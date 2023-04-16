package com.kuaishou.commercial.drawloggerwidget.DispatchDrawRelativeLayout;
import ex.b;
import android.widget.RelativeLayout;
import android.content.Context;
import io.reactivex.subjects.PublishSubject;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ex.a;
import android.view.View;
import msd.q;
import com.yxcorp.gifshow.util.l;
import android.graphics.Canvas;
import android.view.ViewGroup;
import java.lang.Boolean;
import brd.y;
import brd.t;
import com.kwai.robust.PatchProxyResult;

public class DispatchDrawRelativeLayout extends RelativeLayout implements b	// class@0014b9
{
    public c b;
    public static final int c;

    public void DispatchDrawRelativeLayout(Context p0){
       super(p0);
       this.b = PublishSubject.g();
       this.a();
    }
    public void DispatchDrawRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = PublishSubject.g();
       this.a();
    }
    public void DispatchDrawRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = PublishSubject.g();
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, DispatchDrawRelativeLayout.class, "1")) {
          return;
       }
       l.b(this, new a(this));
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DispatchDrawRelativeLayout.class, "2")) {
          return;
       }
       super.dispatchDraw(p0);
       this.b.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, DispatchDrawRelativeLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.hide();
    }
}
