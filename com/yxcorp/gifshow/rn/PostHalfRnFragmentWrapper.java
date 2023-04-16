package com.yxcorp.gifshow.rn.PostHalfRnFragmentWrapper;
import com.yxcorp.gifshow.rn.PostConsumeDismissBottomSheetFragment;
import java.util.WeakHashMap;
import com.yxcorp.gifshow.rn.PostHalfRnFragmentWrapper$b;
import com.yxcorp.gifshow.rn.PostHalfRnFragmentWrapper$a;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Boolean;
import ekd.x0;
import com.kuaishou.krn.model.LaunchModel$b;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import ekd.q;
import java.util.Map$Entry;
import js6.a;
import java.util.HashMap;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import ekd.i;
import android.content.Context;
import android.view.Window;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.content.DialogInterface;
import java.util.List;

public class PostHalfRnFragmentWrapper extends PostConsumeDismissBottomSheetFragment	// class@001b1f
{
    public View B;
    public final PostHalfRnFragmentWrapper$b C;
    public KwaiRnFragment D;
    public static WeakHashMap E;

    static {
       PostHalfRnFragmentWrapper.E = new WeakHashMap();
    }
    public void PostHalfRnFragmentWrapper(){
       super();
       this.C = new PostHalfRnFragmentWrapper$b(null);
    }
    public void onActivityCreated(Bundle p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostHalfRnFragmentWrapper.class, "12")) {
          return;
       }
       super.onActivityCreated(p0);
       if (TextUtils.x(this.C.a)) {
          return;
       }
       Uri uri = Uri.parse(this.C.a);
       LaunchModel launchModel = PatchProxy.applyOneRefs(uri, this, PostHalfRnFragmentWrapper.class, "18");
       String str = 1;
       boolean b = false;
       if (launchModel != patchProxyRe) {
       }else {
          LaunchModel$b obj1 = PatchProxy.applyOneRefs(uri, this, PostHalfRnFragmentWrapper.class, "19");
          String str3 = "componentName";
          String str4 = "bundleId";
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(TextUtils.x(x0.a(uri, str4)) || TextUtils.x(x0.a(uri, str3))){
             b1 = false;
          }else {
             b1 = true;
          }
          if (!b1) {
             launchModel = null;
          }else {
             obj1 = new LaunchModel$b();
             obj1.f("enableBackBtnHandler", b);
             Iterator iterator = x0.c(uri).iterator();
             while (iterator.hasNext()) {
                String str5 = iterator.next();
                String str6 = x0.a(uri, str5);
                if (TextUtils.n(str5, "title")) {
                   obj1.m(str6);
                }else if(TextUtils.n(str5, str4)){
                   obj1.i(str6);
                }else if(TextUtils.n(str5, str3)){
                   obj1.j(str6);
                }else if(TextUtils.n(str5, "autoPageShow")){
                   obj1.g(Boolean.parseBoolean(str6));
                }else {
                   obj1.e(str5, str6);
                }
             }
             if (!q.h(this.C.b)) {
                Iterator iterator1 = this.C.b.entrySet().iterator();
                while (iterator1.hasNext()) {
                   Map$Entry uEntry = iterator1.next();
                   str4 = uEntry.getKey();
                   obj1.e(str4, uEntry.getValue());
                }
             }
             launchModel = obj1.h();
          }
       }
       a.b.Gg(launchModel);
       if (launchModel == null) {
          new HashMap().put("url", this.C.a);
          return;
       }else {
          int i = -1;
          if (!PatchProxy.applyVoidOneRefs(launchModel, this, PostHalfRnFragmentWrapper.class, "14") && this.B != null) {
             String str2 = launchModel.g().getString("backgroundColor", "");
             if (!TextUtils.x(str2)) {
                b uob = new b();
                uob.v(TextUtils.J(str2, i));
                uob.s(DrawableCreator$Shape.Rectangle);
                uob.g(KwaiRadiusStyles.TL16_BL16);
                this.B.setBackground(uob.a());
             }
             str2 = launchModel.g().getString("disableClickOutsideDismiss", "false");
             if (this.getDialog() != null) {
                this.getDialog().setCanceledOnTouchOutside((Boolean.parseBoolean(str2) ^ str));
             }
          }
       label_0167 :
          if (!PatchProxy.applyVoidOneRefs(launchModel, this, PostHalfRnFragmentWrapper.class, "15")) {
             Dialog dialog = this.getDialog();
             if (dialog != null) {
                if (400 >= n.j(this.getActivity())) {
                   i.h(this.getActivity(), i, str);
                   n.A(this.getActivity());
                }
                Object obj = PatchProxy.applyOneRefs(launchModel, this, PostHalfRnFragmentWrapper.class, "16");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                   String str1 = launchModel.g().getString("hideDim", "");
                   if (!TextUtils.x(str1)) {
                      b = Boolean.parseBoolean(str1);
                   }
                }
                if (b && dialog.getWindow() != null) {
                   dialog.getWindow().clearFlags(2);
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(launchModel, this, PostHalfRnFragmentWrapper.class, "17")) {
             launchModel.g().putString("containerSource", "PostHalfRnFragmentWrapper");
             KwaiRnFragment kwaiRnFragme = KwaiRnFragment.Yg(launchModel);
             if (kwaiRnFragme == null) {
                this.dismiss();
             }else if(this.getActivity() == null || (this.getActivity().isFinishing() || kwaiRnFragme.isHidden())){
                this.D = kwaiRnFragme;
                e uoe = this.getChildFragmentManager().beginTransaction();
                uoe.f(R.id.post_rn_container, kwaiRnFragme);
                uoe.o();
             }
          }
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostHalfRnFragmentWrapper.class, "4")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostHalfRnFragmentWrapper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().setSoftInputMode(48);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PostHalfRnFragmentWrapper.class, "11");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d04ca, p1, false);
       this.B = view;
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PostHalfRnFragmentWrapper.class, "13")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostHalfRnFragmentWrapper.class, "9")) {
          return;
       }
       List list = PostHalfRnFragmentWrapper.E.get(this.getFragmentManager());
       if (list != null && list.size()) {
          list.remove(this);
          i.h(this.getActivity(), 0, true);
          super.onDismiss(p0);
       }
       return;
    }
}
