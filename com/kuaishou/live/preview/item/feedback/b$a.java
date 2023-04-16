package com.kuaishou.live.preview.item.feedback.b$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kuaishou.live.preview.item.feedback.b;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sk3.f;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import sk3.h;
import android.view.View;
import android.view.View$OnClickListener;
import tyc.q0;

public class b$a extends GestureDetector$SimpleOnGestureListener	// class@000de2
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.b.p.onNext(new f(1, p0));
       return;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.r.a(null, new h(this, p0));
       return super.onSingleTapConfirmed(p0);
    }
}
