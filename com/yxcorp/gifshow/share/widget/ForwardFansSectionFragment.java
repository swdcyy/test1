package com.yxcorp.gifshow.share.widget.ForwardFansSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardFansSectionFragment$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import uo7.j0;
import java.util.Collections;
import uo7.a;
import ip7.h;
import java.util.Collection;
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.widget.ForwardFansSectionFragment$b;
import com.google.gson.JsonElement;
import ekd.k0;
import android.os.Bundle;
import com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.kwai.sharelib.ui.SharePanelFragment;
import com.kwai.sharelib.model.ShareInitResponse$ShareTheme;
import com.kwai.sharelib.model.ShareInitResponse$ThemePanelElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.app.Activity;
import java.lang.Integer;
import java.lang.Number;
import android.util.DisplayMetrics;
import cw9.c;
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;

public final class ForwardFansSectionFragment extends ForwardGridSectionFragment	// class@001cb7
{
    public final int X0;
    public final String Y0;
    public ForwardFansSectionFragment$b Z0;
    public int a1;
    public static final ForwardFansSectionFragment$a b1;

    static {
       ForwardFansSectionFragment.b1 = new ForwardFansSectionFragment$a(null);
    }
    public void ForwardFansSectionFragment(){
       super();
       this.X0 = 128;
       this.Y0 = "#00FFFFFF";
       this.a1 = 2;
    }
    public void ForwardFansSectionFragment(u p0){
       super();
    }
    public boolean ai(){
       boolean b = true;
       if (this.a1 == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void dd(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardFansSectionFragment.class, "2")) {
          return;
       }
       a.p(p0, "operationList");
       ArrayList uArrayList = new ArrayList();
       List list = Collections.emptyList();
       a.o(list, "Collections.emptyList\(\)");
       j0 oj0 = new j0(list, "FANS_POP_BANNER", null, null, 12, null);
       uArrayList.add(0, v9);
       uArrayList.addAll(p0);
       super.dd(uArrayList);
       return;
    }
    public void n8(JsonObject p0){
       ForwardFansSectionFragment$b uob1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardFansSectionFragment.class, "1")) {
          return;
       }
       a.p(p0, "extParam");
       ForwardFansSectionFragment$b uob = PatchProxy.applyOneRefs(p0, this, ForwardFansSectionFragment.class, "5");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = null;
          if (p0 != null) {
             JsonElement jsonElement = k0.e(p0, "fans2share");
             jsonElement = (jsonElement != null)? jsonElement.r(): uob;
             if (jsonElement != null) {
                String str = k0.h(jsonElement, "dialogTextLeft", "");
                String str1 = k0.h(jsonElement, "dialogTextRight", "");
                int i = 1;
                int i1 = (str == null || !str.length())? 1: 0;
                if (!i1) {
                   if (str1 != null && str1.length()) {
                      i = 0;
                   }
                   if (!i) {
                      uob = new ForwardFansSectionFragment$b(str, str1);
                   }
                }
             }
          }
       }
       this.Z0 = uob;
       return;
    }
    public void onActivityCreated(Bundle p0){
       Dialog dialog;
       Window window;
       Dialog dialog1;
       Window window1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardFansSectionFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.ai()) {
          dialog = this.getDialog();
          if (dialog != null) {
             window = dialog.getWindow();
             if (window != null) {
                window.setWindowAnimations(R.style.arg_RES_7f1103dd);
             }
          }
          dialog1 = this.getDialog();
          if (dialog1 != null) {
             window1 = dialog1.getWindow();
             if (window1 != null) {
                window1.setGravity(49);
             }
          }
       }else {
          dialog = this.getDialog();
          if (dialog != null) {
             window = dialog.getWindow();
             if (window != null) {
                window.setWindowAnimations(R.style.arg_RES_7f1103dc);
             }
          }
          dialog1 = this.getDialog();
          if (dialog1 != null) {
             window1 = dialog1.getWindow();
             if (window1 != null) {
                window1.setGravity(81);
             }
          }
       }
    label_005b :
       return;
    }
    public void show(){
       ShareInitResponse$ShareTheme shareTheme;
       Resources obj;
       if (PatchProxy.applyVoid(null, this, ForwardFansSectionFragment.class, "3")) {
          return;
       }
       if (this.Xh().Vg().mPanel == null) {
          shareTheme = this.Xh().Vg();
          ForwardFansSectionFragment tY0 = this.Y0;
          String str = this.Lh().getResources().getString(R.color.arg_RES_7f060094);
          int i = 0x7f070420;
          if (PatchProxy.isSupport(ForwardFansSectionFragment.class)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, ForwardFansSectionFragment.class, "4");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             label_0079 :
                shareTheme.mPanel = new ShareInitResponse$ThemePanelElement(tY0, str, i);
             }
          }
          obj = this.Lh().getResources();
          a.o(obj, "activity.resources");
          i = (int)((this.Lh().getResources().getDimension(i) - 0x3f000000) / c.c(obj).scaledDensity);
          goto label_0079 ;
       }else {
          this.Xh().Vg().mPanel.mSeparatorColour = this.Y0;
       }
       shareTheme = this.Xh().Vg().mCancelButton;
       if (shareTheme != null) {
          shareTheme.mBackgroundColour = null;
       }
       shareTheme = this.Xh().Vg().mCancelButton;
       if (shareTheme != null) {
          shareTheme.mHighlightedBackgroundColour = null;
       }
       super.show();
       return;
    }
}
