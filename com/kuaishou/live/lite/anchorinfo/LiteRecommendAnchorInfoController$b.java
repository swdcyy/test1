package com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController$b;
import z1.k;
import com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import o83.f;
import android.view.View;
import msd.a;

public final class LiteRecommendAnchorInfoController$b implements k	// class@001e29
{
    public final LiteRecommendAnchorInfoController b;

    public void LiteRecommendAnchorInfoController$b(LiteRecommendAnchorInfoController p0){
       this.b = p0;
       super();
    }
    public Object get(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiteRecommendAnchorInfoController$b obj = PatchProxy.apply(objArray, this, LiteRecommendAnchorInfoController$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.b;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, LiteRecommendAnchorInfoController.class, "5");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             LiteRecommendAnchorInfoController n = obj.n;
             if (n != null) {
                View value = n.d().getValue();
                int[] ointArray = new int[2];
                if (value != null) {
                   value.getLocationOnScreen(ointArray);
                }
                if (value != null) {
                   objArray = new Rect(ointArray[0], ointArray[1], (ointArray[0] + value.getWidth()), (ointArray[1] + value.getHeight()));
                }
             }else {
                n = obj.o;
                if (n != null) {
                   objArray = n.invoke();
                }
             }
             obj = objArray;
          }
       }
       return obj;
    }
}
