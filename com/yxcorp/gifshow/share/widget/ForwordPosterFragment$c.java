package com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c$a;
import java.lang.Runnable;

public final class ForwordPosterFragment$c implements ViewTreeObserver$OnPreDrawListener	// class@001cfe
{
    public final View b;
    public final ForwordPosterFragment c;

    public void ForwordPosterFragment$c(View p0,ForwordPosterFragment p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean onPreDraw(){
       ForwordPosterFragment$c obj = PatchProxy.applyWithListener(null, this, ForwordPosterFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       String str = "rootView";
       a.o(obj, str);
       ViewTreeObserver viewTreeObse = obj.getViewTreeObserver();
       a.o(viewTreeObse, "rootView.viewTreeObserver");
       if (viewTreeObse.isAlive()) {
          obj = this.b;
          a.o(obj, str);
          obj.getViewTreeObserver().removeOnPreDrawListener(this);
          ForwordPosterFragment.ii(this.c).post(new ForwordPosterFragment$c$a(this));
       }
       PatchProxy.onMethodExit(ForwordPosterFragment$c.class, "1");
       return true;
    }
}
