package com.yxcorp.gifshow.camera.record.intelligentidentify.ui.b;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.d$c;
import java.lang.Object;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import vd9.c;

public final class b implements Runnable	// class@000e0a
{
    public final View b;
    public final View c;
    public final int d;
    public final View e;
    public final d$c f;

    public void b(View p0,View p1,int p2,View p3,d$c p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       b te = this.e;
       b tf = this.f;
       boolean i = 8;
       if (tb.getVisibility() != i && tc.getVisibility() != i) {
          int[] ointArray = n.o(tc);
          i = 1;
          ointArray[i] = ointArray[i] + tc.getMeasuredHeight();
          int i1 = (ointArray[i] - n.o(tb)[i]) + td;
          d uod = d.class;
          if (PatchProxy.isSupport(uod)) {
             ViewGroup$MarginLayoutParams obj = PatchProxy.applyTwoRefs(te, Integer.valueOf(i1), null, uod, "3");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else if(te != null && te.getLayoutParams() instanceof ViewGroup$MarginLayoutParams){
                obj = te.getLayoutParams();
                if (obj.bottomMargin != i1) {
                   obj.bottomMargin = i1;
                   te.setLayoutParams(obj);
                }
             }
             i = false;
          }else {
             goto label_004f ;
          }
          if (tf != null) {
             d.b(i, te, new c(tf));
          }
       }
    label_0075 :
       return;
    }
}
