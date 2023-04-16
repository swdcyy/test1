package com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment;
import uo7.d;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$Companion;
import nsd.u;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$c;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.c;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.System;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import i2b.a;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$e;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$f;
import erd.g;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;
import com.google.android.material.bottomsheet.ForwardBottomSheetBehavior;

public final class ForwardPicSectionFragment extends ForwardGridSectionFragment implements d	// class@001cf4
{
    public View X0;
    public View Y0;
    public KwaiImageView Z0;
    public View a1;
    public ForwardPicSectionFragment$c b1;
    public static long c1;
    public static final ForwardPicSectionFragment$Companion d1;

    static {
       ForwardPicSectionFragment.d1 = new ForwardPicSectionFragment$Companion(null);
    }
    public void ForwardPicSectionFragment(){
       super();
    }
    public void ForwardPicSectionFragment(u p0){
       super();
    }
    public static final View hi(ForwardPicSectionFragment p0){
       p0 = p0.Y0;
       if (p0 == null) {
          a.S("imageViewContainer");
       }
       return p0;
    }
    public static final KwaiImageView ii(ForwardPicSectionFragment p0){
       p0 = p0.Z0;
       if (p0 == null) {
          a.S("mImageView");
       }
       return p0;
    }
    public static final ForwardPicSectionFragment$c ji(ForwardPicSectionFragment p0){
       p0 = p0.b1;
       if (p0 == null) {
          a.S("picFetcher");
       }
       return p0;
    }
    public boolean Eg(){
       return true;
    }
    public boolean M3(String p0,String p1,String p2,ShareAnyResponse$ShareObject p3){
       return c.a(this, p0, p1, p2, p3);
    }
    public Bitmap h3(Bitmap p0,String p1,String p2,String p3,ShareAnyResponse$ShareObject p4){
       if (PatchProxy.isSupport(ForwardPicSectionFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, ForwardPicSectionFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "shareChannel");
       a.p(p2, "shareMethod");
       a.p(p3, "shareMode");
       a.p(p4, "shareObject");
       if (p0 == null) {
          ForwardPicSectionFragment tb1 = this.b1;
          if (tb1 == null) {
             a.S("picFetcher");
          }
          tb1 = tb1.getBitmap();
       }
       return p0;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardPicSectionFragment.class, "3")) {
          return;
       }
       a.p(p0, "context");
       super.onAttach(p0);
       ForwardPicSectionFragment.c1 = System.currentTimeMillis();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ForwardPicSectionFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(this.getLayoutInflater(), R.layout.arg_RES_7f0d048c, p1, false);
       View view1 = view.findViewById(R.id.share_panel);
       a.o(view1, "rootView.findViewById\(R.id.share_panel\)");
       this.X0 = view1;
       view1 = view.findViewById(R.id.image_pic_container);
       a.o(view1, "rootView.findViewById\(R.id.image_pic_container\)");
       this.Y0 = view1;
       view1 = view.findViewById(R.id.image_pic);
       a.o(view1, "rootView.findViewById\(R.id.image_pic\)");
       this.Z0 = view1;
       this.uh(R.style.arg_RES_7f110362);
       t.just("").subscribeOn(d.b).doOnNext(new ForwardPicSectionFragment$f(this)).observeOn(d.a).subscribe(new ForwardPicSectionFragment$g(new ForwardPicSectionFragment$e(this), this), Functions.d());
       return view;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, ForwardPicSectionFragment.class, "4")) {
          return;
       }
       super.onDetach();
       ForwardPicSectionFragment.c1 = 0;
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ForwardPicSectionFragment.class, "5")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             View view = window.findViewById(R.id.design_bottom_sheet);
             if (view != null) {
                BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(view);
                Objects.requireNonNull(uBottomSheet, "null cannot be cast to non-null type com.google.android.material.bottomsheet.ForwardBottomSheetBehavior<android.view.View!>");
                uBottomSheet.setState(3);
             }
          }
       }
       return;
    }
}
