package com.yxcorp.plugin.setting.activity.AboutUsActivity$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.plugin.setting.activity.AboutUsActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class AboutUsActivity$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0007f8
{
    public final View b;
    public final AboutUsActivity c;

    public void AboutUsActivity$a(AboutUsActivity p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, AboutUsActivity$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       View view = this.c.findViewById(R.id.scroll_view);
       View view1 = this.c.findViewById(R.id.content);
       View view2 = this.c.findViewById(R.id.copyright);
       if (view1.getHeight() < view.getHeight()) {
          ViewGroup$MarginLayoutParams layoutParams = view2.getLayoutParams();
          layoutParams.topMargin = (layoutParams.topMargin + view.getHeight()) - view1.getHeight();
          view2.setLayoutParams(layoutParams);
       }
       return;
    }
}
