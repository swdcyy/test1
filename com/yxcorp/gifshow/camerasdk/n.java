package com.yxcorp.gifshow.camerasdk.n;
import com.kwai.video.westeros.processors.WesterosFrameAttributesDumpProcessor$OnFacesArrayListener;
import qi9.k1;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qi9.q1;
import java.lang.StringBuilder;
import java.lang.Integer;
import q87.c;
import java.util.Iterator;
import com.kwai.camerasdk.models.FaceData;
import com.kwai.camerasdk.models.Rect;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.RectF;
import qi9.j1;
import java.lang.Runnable;
import ekd.k1;

public final class n implements WesterosFrameAttributesDumpProcessor$OnFacesArrayListener	// class@001038
{
    public final k1 b;

    public void n(k1 p0){
       this.b = p0;
    }
    public final void onFacesArray(List p0){
       boolean b;
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, k1.class, "4")) {
       }else {
          q1 oq1 = q1.C();
          StringBuilder str = "facesArray ";
          Integer integer = (p0 != null)? Integer.valueOf(p0.size()): "null";
          int i = 0;
          Object[] objArray = new Object[i];
          oq1.s("FacesDetectTracer", str+integer, objArray);
          if (tb.b != null) {
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                Rect rect = iterator.next().getRect();
                k1 obj = PatchProxy.applyOneRefs(rect, tb, k1.class, "5");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   obj = tb.d;
                   b = (obj == null || obj.contains(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom()))? true: false;
                }
                if (b) {
                   i = 1;
                   break ;
                }
             }
             if (tb.c != i) {
                tb.c = i;
                k1.o(new j1(tb));
             }
          }
       }
       return;
    }
}
