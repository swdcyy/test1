package com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment$b;
import joc.b0;
import com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import n89.m;
import java.lang.Integer;

public class HorizontalPhotosFragment$b implements b0	// class@001bb1
{
    public final HorizontalPhotosFragment a;

    public void HorizontalPhotosFragment$b(HorizontalPhotosFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0,boolean p1){
       if (PatchProxy.isSupport(HorizontalPhotosFragment$b.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, HorizontalPhotosFragment$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = (this.a.s.S.intValue())? true: false;
       return b;
    }
}
