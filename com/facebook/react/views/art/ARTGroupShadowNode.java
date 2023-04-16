package com.facebook.react.views.art.ARTGroupShadowNode;
import kf.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.graphics.RectF;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.bridge.ReadableArray;
import kf.b;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

public class ARTGroupShadowNode extends a	// class@00138a
{
    public RectF g;

    public void ARTGroupShadowNode(){
       super();
    }
    public void b(Canvas p0,Paint p1,float p2){
       if (PatchProxy.isSupport(ARTGroupShadowNode.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, ARTGroupShadowNode.class, "2")) {
          return;
       }
       p2 = p2 * this.b;
       if (p2 - 0x3c23d70a > 0) {
          this.d(p0);
          ARTGroupShadowNode tg = this.g;
          if (tg != null) {
             a td = this.d;
             p0.clipRect((tg.left * td), (tg.top * td), (tg.right * td), (tg.bottom * td));
          }
          for (int i = 0; i < this.getChildCount(); i = i + 1) {
             a childAt = this.getChildAt(i);
             childAt.b(p0, p1, p2);
             childAt.markUpdateSeen();
          }
          this.c(p0);
       }
       return;
    }
    public void setClipping(ReadableArray p0){
       ARTGroupShadowNode uARTGroupSha = ARTGroupShadowNode.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uARTGroupSha, "1")) {
          return;
       }
       float[] uofloatArray = b.b(p0);
       if (uofloatArray != null) {
          RectF rectF = PatchProxy.applyOneRefs(uofloatArray, null, uARTGroupSha, "3");
          if (rectF != PatchProxyResult.class) {
          }else if(uofloatArray.length == 4){
             rectF = new RectF(uofloatArray[0], uofloatArray[1], (uofloatArray[0] + uofloatArray[2]), (uofloatArray[1] + uofloatArray[3]));
          }else {
             throw new JSApplicationIllegalArgumentException("Clipping should be array of length 4 \(e.g. [x, y, width, height]\)");
          }
          this.g = rectF;
          this.markUpdated();
       }
       return;
    }
}
