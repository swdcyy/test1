package com.kuaishou.live.lite.like.b$a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$b;
import com.kuaishou.live.lite.like.b;
import java.lang.Object;
import android.view.MotionEvent;
import jb3.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.like.c;

public class b$a implements LiveLiteGestureService$b	// class@0009ec
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(MotionEvent p0){
       c.c(this, p0);
    }
    public void onDoubleTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, b.class, "4")) {
          ta.A(p0);
          ta.k.d();
       }
       return;
    }
    public void onLongPress(MotionEvent p0){
       c.b(this, p0);
    }
}
