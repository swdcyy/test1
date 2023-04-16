package com.kuaishou.live.core.show.wealthgrade.privilegedetail.LiveWealthGradeDetailContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import t02.a0;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import lnc.a1;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import o56.c;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import kq3.a;
import c22.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import qm2.f;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.LiveWealthGradeDetailFragment;
import qm2.a;
import android.os.Bundle;
import androidx.fragment.app.e;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;

public class LiveWealthGradeDetailContainerFragment extends LiveDialogContainerFragment	// class@001267
{
    public BaseFragment A;
    public static final int B;

    public void LiveWealthGradeDetailContainerFragment(){
       super();
    }
    public static LiveWealthGradeDetailContainerFragment Eh(a0 p0,int p1,int p2,String p3){
       LiveWealthGradeDetailContainerFragment obj;
       LiveWealthGradeDetailFragment obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveWealthGradeDetailContainerFragment.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, LiveWealthGradeDetailContainerFragment.class, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new LiveWealthGradeDetailContainerFragment();
       int i = -1;
       obj.Bh(a1.e(280.00f), i);
       BaseFragment uBaseFragmen = null;
       if (!TextUtils.isEmpty(p3)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p3, obj, null, LiveWealthGradeDetailContainerFragment.class, "5");
          if (obj1 != patchProxyRe) {
             uBaseFragmen = obj1;
          }else {
             Context uContext = a.a().f();
             if (uContext instanceof GifshowActivity) {
                a uoa = a.b(uContext, p0.Z2.b().getChildFragmentManager(), p0);
                uoa.b.setPortraitHeightPixel(i).setLayoutType("3").setInOutAnimation(R.style.arg_RES_7f1103e0);
                uoa.f = obj;
                uBaseFragmen = a.c().b(p3, uoa);
             }
          }
       }
       if (uBaseFragmen != null) {
          obj.A = uBaseFragmen;
       }else {
          f uof = new f(obj);
          if (PatchProxy.isSupport(LiveWealthGradeDetailFragment.class)) {
             obj1 = PatchProxy.applyFourRefs(p0, uof, Integer.valueOf(p1), Integer.valueOf(p2), null, LiveWealthGradeDetailFragment.class, "1");
             if (obj1 != patchProxyRe) {
             label_00c6 :
                obj.A = obj1;
             }
          }
          obj1 = new LiveWealthGradeDetailFragment();
          obj1.q = p0.Z2.getLiveStreamId();
          obj1.t = p0;
          obj1.u = uof;
          LiveWealthGradeDetailFragment w = obj1.w;
          w.f = p1;
          w.g = p2;
          goto label_00c6 ;
       }
       return obj;
    }
    public int getTheme(){
       return 0x7f1103e6;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeDetailContainerFragment.class, "6")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!this.isAdded()) {
          return;
       }
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.v(R.id.live_bottom_dialog_container_root, this.A);
       uoe.m();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveWealthGradeDetailContainerFragment.class, "7")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          dialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103e0);
       }
       return;
    }
    public int wh(){
       return 0;
    }
}
