package com.kuaishou.merchant.base.rmc.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.merchant.base.rmc.a;
import at3.b;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ys3.g;
import android.view.ViewTreeObserver;

public class a$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001580
{
    public final b b;
    public final LiveShopComponentModel c;
    public final a d;

    public void a$b(a p0,b p1,LiveShopComponentModel p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       if (!this.b.getVisibility()) {
          this.d.d.a(this.c);
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
