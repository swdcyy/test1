package com.yxcorp.gifshow.atlas_detail.vertical.VerticalPhotosFragment$a;
import joc.b0;
import com.yxcorp.gifshow.atlas_detail.vertical.VerticalPhotosFragment;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import n89.m;
import android.view.ViewGroup;
import java.lang.Integer;

public class VerticalPhotosFragment$a implements b0	// class@001bcb
{
    public final VerticalPhotosFragment a;

    public void VerticalPhotosFragment$a(VerticalPhotosFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0,boolean p1){
       if (PatchProxy.isSupport(VerticalPhotosFragment$a.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, VerticalPhotosFragment$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       m d = this.a.r.d;
       p1 = false;
       if (d != null && (d.getChildCount() > 0 && this.a.r.S.intValue())) {
          p1 = true;
       }
    label_0039 :
       return p1;
    }
}
