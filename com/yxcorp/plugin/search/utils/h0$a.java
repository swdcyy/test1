package com.yxcorp.plugin.search.utils.h0$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.plugin.search.utils.h0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import nfd.t0;

public class h0$a implements ViewTreeObserver$OnPreDrawListener	// class@00079d
{
    public final View b;
    public final int[] c;
    public final int d;
    public final h0 e;

    public void h0$a(h0 p0,View p1,int[] p2,int p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public boolean onPreDraw(){
       h0$a obj = PatchProxy.apply(null, this, h0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       this.e.t.getLocationOnScreen(this.c);
       obj = this.d;
       h0$a tc = this.c;
       int i = obj - tc[1];
       if (i > 0 && (float)tc[1] - ((float)obj * 0x3f2aaaab) < 0) {
          obj = this.b;
          obj.setTranslationY((((float)(i - obj.getHeight()) / 2.00f) - (float)t0.u));
       }else {
          this.b.setTranslationY(h0.C);
       }
       return 1;
    }
}
