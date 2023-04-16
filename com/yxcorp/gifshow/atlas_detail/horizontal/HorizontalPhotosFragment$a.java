package com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment$a;
import joc.d;
import com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment;
import java.lang.Object;
import joc.b;
import i99.c;
import lkd.b;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import n89.m;
import vd5.a;

public class HorizontalPhotosFragment$a implements d	// class@001bb0
{
    public b a;
    public final HorizontalPhotosFragment b;

    public void HorizontalPhotosFragment$a(HorizontalPhotosFragment p0){
       this.b = p0;
       super();
       this.a = new b(new c(this));
    }
    public boolean a(MotionEvent p0,boolean p1){
       if (PatchProxy.isSupport(HorizontalPhotosFragment$a.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, HorizontalPhotosFragment$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = this.a.a(p0, p1);
       if (!b && !p1) {
          b = PatchProxy.apply(null, this, HorizontalPhotosFragment$a.class, "2");
          if (b != PatchProxyResult.class) {
             b = b.booleanValue();
          }else {
             m b1 = this.b.s.B;
             b = (b1 != null && b1.a())? true: false;
          }
       }
       return b;
    }
}
