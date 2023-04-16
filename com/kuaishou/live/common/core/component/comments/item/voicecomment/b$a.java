package com.kuaishou.live.common.core.component.comments.item.voicecomment.b$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b$b;

public class b$a extends GestureDetector$SimpleOnGestureListener	// class@0010a8
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
       super.onLongPress(p0);
       b$a tb = this.b;
       tb.e = true;
       b c = tb.c;
       if (c != null) {
          c.s();
       }
       return;
    }
}
