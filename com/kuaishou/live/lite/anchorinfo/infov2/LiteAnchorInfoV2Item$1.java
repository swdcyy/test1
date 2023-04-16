package com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoV2Item$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoV2Item;
import android.graphics.Rect;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s83.z;
import android.view.View;

public final class LiteAnchorInfoV2Item$1 extends Lambda implements a	// class@001e61
{
    public final LiteAnchorInfoV2Item this$0;

    public void LiteAnchorInfoV2Item$1(LiteAnchorInfoV2Item p0){
       this.this$0 = p0;
       super(0);
    }
    public final Rect invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiteAnchorInfoV2Item obj = PatchProxy.apply(objArray, this, LiteAnchorInfoV2Item$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.b;
       if (obj != null) {
          objArray = PatchProxy.apply(objArray, obj, z.class, "2");
          if (objArray != patchProxyRe) {
          }else {
             int[] ointArray = new int[2];
             obj.l.getLocationOnScreen(ointArray);
             objArray = new Rect(ointArray[0], ointArray[1], ((ointArray[0] + obj.m.getWidth()) - obj.l.getLeft()), (ointArray[1] + obj.m.getHeight()));
          }
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
