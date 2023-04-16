package com.yxcorp.gifshow.share.widget.ForwordPosterFragment;
import djc.x0;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment$a;
import nsd.u;
import android.graphics.Paint;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.sharelib.model.ShareInitResponse$PanelPoster;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import djc.x0$a;
import ekd.k1;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment$b;
import java.lang.Runnable;
import com.google.gson.JsonObject;
import ekd.k0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import i2b.a;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;
import com.google.android.material.bottomsheet.ForwardBottomSheetBehavior;
import com.kwai.sharelib.jsshare.StartShareParam$PosterConfig;

public final class ForwordPosterFragment extends ForwardGridSectionFragment implements x0	// class@001cff
{
    public StartShareParam$JsShareParam X0;
    public ImageView Y0;
    public ImageView Z0;
    public View a1;
    public View b1;
    public View c1;
    public final Paint d1;
    public boolean e1;
    public static final ForwordPosterFragment$a f1;

    static {
       ForwordPosterFragment.f1 = new ForwordPosterFragment$a(null);
    }
    public void ForwordPosterFragment(){
       super();
       this.d1 = new Paint(199);
    }
    public void ForwordPosterFragment(u p0){
       super();
    }
    public static final StartShareParam$JsShareParam hi(ForwordPosterFragment p0){
       p0 = p0.X0;
       if (p0 == null) {
          a.S("jsParam");
       }
       return p0;
    }
    public static final View ii(ForwordPosterFragment p0){
       p0 = p0.b1;
       if (p0 == null) {
          a.S("longPosterLayout");
       }
       return p0;
    }
    public static final View ji(ForwordPosterFragment p0){
       p0 = p0.c1;
       if (p0 == null) {
          a.S("shortPosterLayout");
       }
       return p0;
    }
    public Bitmap Uc(ShareInitResponse$PanelPoster p0,int p1){
       if (PatchProxy.isSupport(ForwordPosterFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ForwordPosterFragment.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "panelPoster");
       return x0$a.b(this, p0, p1);
    }
    public final void ki(){
       if (PatchProxy.applyVoid(null, this, ForwordPosterFragment.class, "4")) {
          return;
       }
       if (!k1.g()) {
          k1.o(new ForwordPosterFragment$b(this));
          return;
       }else {
          ForwordPosterFragment ta1 = this.a1;
          if (ta1 == null) {
             a.S("allPosterLayout");
          }
          ta1.setVisibility(8);
          return;
       }
    }
    public void n8(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwordPosterFragment.class, "1")) {
          return;
       }
       a.p(p0, "extParam");
       super.n8(p0);
       this.e1 = k0.c(p0, "hidePanelPoster", false);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ForwordPosterFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(this.getLayoutInflater(), R.layout.arg_RES_7f0d0493, p1, false);
       if (this.e1 == null) {
          View view1 = m1.f(view, R.id.long_poster_picture);
          a.o(view1, "ViewBindUtils.bindWidget¡­R.id.long_poster_picture\)");
          this.Y0 = view1;
          view1 = m1.f(view, R.id.short_poster_picture);
          a.o(view1, "ViewBindUtils.bindWidget¡­.id.short_poster_picture\)");
          this.Z0 = view1;
          view1 = m1.f(view, R.id.all_poster_layout);
          a.o(view1, "ViewBindUtils.bindWidget¡­, R.id.all_poster_layout\)");
          this.a1 = view1;
          view1 = m1.f(view, R.id.long_poster_layout);
          a.o(view1, "ViewBindUtils.bindWidget¡­ R.id.long_poster_layout\)");
          this.b1 = view1;
          view1 = m1.f(view, R.id.short_poster_layout);
          a.o(view1, "ViewBindUtils.bindWidget¡­R.id.short_poster_layout\)");
          this.c1 = view1;
          this.Jh(false);
          a.o(view, "rootView");
          view.getViewTreeObserver().addOnPreDrawListener(new ForwordPosterFragment$c(view, this));
       }
       return view;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ForwordPosterFragment.class, "3")) {
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
    public Bitmap qf(StartShareParam$PosterConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ForwordPosterFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "posterConfig");
       return x0$a.a(this, p0);
    }
}
