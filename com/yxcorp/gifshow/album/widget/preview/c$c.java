package com.yxcorp.gifshow.album.widget.preview.c$c;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.album.widget.preview.c;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j79.l0;
import com.yxcorp.gifshow.base.fragment.IPreviewViewBinder;

public class c$c extends GestureDetector$SimpleOnGestureListener	// class@001b2e
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       c$c tb = this.b;
       c j = tb.j;
       if (j != null && j instanceof l0) {
          tb.f.b(j);
       }
       return false;
    }
}
