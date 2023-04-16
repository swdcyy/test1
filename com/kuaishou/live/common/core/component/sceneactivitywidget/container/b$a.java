package com.kuaishou.live.common.core.component.sceneactivitywidget.container.b$a;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView$b;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.LinearLayout;
import android.view.View;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;

public class b$a implements SceneActivityWidgetBannerView$b	// class@00176e
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       b uob;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       int i = 0;
       while (i < this.a.d.getChildCount()) {
          if (i == p0) {
             uob = new b();
             uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060788));
             uob.g(KwaiRadiusStyles.R2);
             this.a.d.getChildAt(i).setBackground(uob.a());
          }else {
             uob = new b();
             uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060620));
             uob.g(KwaiRadiusStyles.R2);
             this.a.d.getChildAt(i).setBackground(uob.a());
          }
          i = i + 1;
       }
       return;
    }
}
