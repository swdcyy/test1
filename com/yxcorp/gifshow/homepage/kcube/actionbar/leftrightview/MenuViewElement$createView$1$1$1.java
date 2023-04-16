package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement$createView$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.widget.IconifyImageButton;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.homepage.experiment.HomeTabBarIconExperimentUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;

public final class MenuViewElement$createView$1$1$1 extends Lambda implements l	// class@0016fb
{
    public static final MenuViewElement$createView$1$1$1 INSTANCE;

    static {
       MenuViewElement$createView$1$1$1.INSTANCE = new MenuViewElement$createView$1$1$1();
    }
    public void MenuViewElement$createView$1$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(IconifyImageButton p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MenuViewElement$createView$1$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setId(R.id.left_btn);
       p0.setBackground(null);
       p0.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       p0.setDotDrawable(R.drawable.arg_RES_7f080daa);
       p0.setPlaceHolderImage(HomeTabBarIconExperimentUtils.b());
       a hierarchy = p0.getHierarchy();
       a.o(hierarchy, "hierarchy");
       hierarchy.u(t$b.h);
       return;
    }
}
