package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import msd.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion$newInstance$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$1;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.app.Activity;
import java.lang.Integer;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$2;
import com.kwai.sharelib.ui.SharePanelFragment;
import mp7.e;
import com.kwai.sharelib.model.ShareInitResponse$ShareTheme;
import com.kwai.sharelib.model.ShareInitResponse$ThemeAreaElement;
import com.kwai.sharelib.model.ShareInitResponse$ThemeItemElement;
import com.kwai.sharelib.model.ShareInitResponse$ThemePanelElement;
import qrd.l1;

public final class ForwardGridSectionFragment$Companion	// class@001cc1
{

    public void ForwardGridSectionFragment$Companion(){
       super();
    }
    public void ForwardGridSectionFragment$Companion(u p0){
       super();
    }
    public static ForwardGridSectionFragment d(ForwardGridSectionFragment$Companion p0,GifshowActivity p1,a p2,int p3,Object p4){
       ForwardGridSectionFragment$Companion$newInstance$1 iNSTANCE = (p3 & 0x02)? ForwardGridSectionFragment$Companion$newInstance$1.INSTANCE: null;
       return p0.c(p1, iNSTANCE);
    }
    public final boolean a(){
       return ForwardGridSectionFragment.V0;
    }
    public final ForwardGridSectionFragment b(GifshowActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ForwardGridSectionFragment$Companion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ForwardGridSectionFragment$Companion.d(this, p0, null, 2, null);
    }
    public final ForwardGridSectionFragment c(GifshowActivity p0,a p1){
       ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$1 obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, ForwardGridSectionFragment$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "creator");
       ForwardGridSectionFragment uForwardGrid = p1.invoke();
       uForwardGrid.fi(p0);
       obj = new ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$1(p0);
       TypedValue typedValue = new TypedValue();
       p0.getTheme().resolveAttribute(R.attr.arg_RES_7f0403d7, typedValue, true);
       Object[] objArray = new Object[true];
       objArray[0] = Integer.valueOf((typedValue.data & 0xffffff));
       ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$2 uCompanion$n = new ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$2(p0);
       uForwardGrid.Xh().Xg(uForwardGrid.Vh(), uForwardGrid.Nh());
       ShareInitResponse$ShareTheme shareTheme = new ShareInitResponse$ShareTheme();
       shareTheme.mArea = new ShareInitResponse$ThemeAreaElement(uCompanion$n.invoke(0x7f061674), obj.invoke(0x7f070f66));
       shareTheme.mElement = new ShareInitResponse$ThemeItemElement(String.format("#%06X", objArray), obj.invoke(0x7f070f6d), obj.invoke(0x7f070f6d));
       String str = uCompanion$n.invoke(R.color.arg_RES_7f061ea8);
       shareTheme.mPanel = new ShareInitResponse$ThemePanelElement(str, uCompanion$n.invoke(0x7f060094), obj.invoke(0x7f070420));
       uForwardGrid.Xh().Zg(shareTheme);
       PatchProxy.onMethodExit(ForwardGridSectionFragment$Companion.class, "1");
       return uForwardGrid;
    }
}
