package com.yxcorp.gifshow.image.KwaiZoomImageView$a;
import android.view.View$OnTouchListener;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;

public class KwaiZoomImageView$a implements View$OnTouchListener	// class@001948
{
    public List b;

    public void KwaiZoomImageView$a(View$OnTouchListener[] p0){
       super();
       if (p0 != null) {
          this.b = Arrays.asList(p0);
       }
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       KwaiZoomImageView$a obj = PatchProxy.applyTwoRefs(p0, p1, this, KwaiZoomImageView$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = false;
       if (obj != null && !obj.isEmpty()) {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             b = b | iterator.next().onTouch(p0, p1);
          }
       }
       return b;
    }
}
