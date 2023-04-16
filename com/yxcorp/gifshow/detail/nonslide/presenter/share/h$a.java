package com.yxcorp.gifshow.detail.nonslide.presenter.share.h$a;
import tyc.k3;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.h;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;

public class h$a implements k3	// class@0015e2
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void onDispatchTouchEvent(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().s("T401541", "¸¡²ã³öÏÖ", objArray);
       p0.A = true;
       return;
    }
}
