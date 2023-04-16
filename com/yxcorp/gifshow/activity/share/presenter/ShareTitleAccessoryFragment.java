package com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$a;
import nsd.u;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$screenWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.activity.share.bubble.PublishBubbleItem;
import lnc.a1;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import android.content.Context;
import androidx.fragment.app.Fragment;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.lang.Boolean;
import java.io.Serializable;
import android.widget.CheckBox;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$b;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$c;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$d;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.Number;
import com.yxcorp.gifshow.bubble.b;
import ra9.c;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$e;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$f;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.a;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class ShareTitleAccessoryFragment extends KwaiDialogFragment	// class@0013ba
{
    public int p;
    public final p q;
    public int r;
    public TextView s;
    public AppCompatCheckBox t;
    public TextView u;
    public final boolean v;
    public int w;
    public y2 x;
    public z2 y;
    public static final ShareTitleAccessoryFragment$a z;

    static {
       ShareTitleAccessoryFragment.z = new ShareTitleAccessoryFragment$a(null);
    }
    public void ShareTitleAccessoryFragment(){
       super();
       this.q = s.c(new ShareTitleAccessoryFragment$screenWidth$2(this));
       int b = PublishBubbleItem.ADD_TITLE.couldShow();
       this.v = b;
       b = (b)? a1.e(96.00f): a1.e(52.00f);
       this.w = b;
       return;
    }
    public static final TextView sh(ShareTitleAccessoryFragment p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mAddTitleText");
       }
       return p0;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareTitleAccessoryFragment.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       if (!PatchProxy.applyVoid(null, this, ShareTitleAccessoryFragment.class, "9")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             dialog.requestWindowFeature(1);
          }
          dialog = this.getDialog();
          boolean b = false;
          if (dialog != null) {
             dialog.setCanceledOnTouchOutside(b);
          }
          dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(b));
                window.getDecorView().setBackgroundColor(b);
                window.setDimAmount(0);
                WindowManager$LayoutParams attributes = window.getAttributes();
                attributes.type = 1000;
                attributes.gravity = 51;
                attributes.flags = ((attributes.flags | Float.MIN_NORMAL) | 0x20000) | 0x08;
                attributes.softInputMode = 49;
                a.o(attributes, "attr");
                this.uh(attributes);
                window.setAttributes(attributes);
             }
          }
       }
    label_007e :
       return LayoutInflater.from(this.getContext()).inflate(0x7f0d1121, null);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ShareTitleAccessoryFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ShareTitleAccessoryFragment.class, "5")) {
          return;
       }
       super.onResume();
       if (this.v != null) {
          this.vh();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ShareTitleAccessoryFragment.class, "10")) {
          return;
       }
       try{
          super.onStart();
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                WindowManager$LayoutParams attributes = window.getAttributes();
                attributes.flags = attributes.flags | 0x08;
                Object[] objArray = new Object[0];
                a.b().w("ShareTitleAccessoryFragment", "onStart isAdded "+this.isAdded(), objArray);
                if (this.isAdded()) {
                   window.setAttributes(attributes);
                }
             }
          }
          return;
       }catch(android.view.WindowManager$BadTokenException e2){
          a.b().e("ShareTitleAccessoryFragment", "onStart: ", e2);
          this.dismiss();
          return;
       }catch(java.lang.IllegalStateException e2){
          a.b().e("ShareTitleAccessoryFragment", "onStart: ", e2);
          this.dismiss();
          return;
       }catch(java.lang.IllegalArgumentException e2){
          a.b().e("ShareTitleAccessoryFragment", "onStart: ", e2);
          this.dismiss();
          return;
       }
    }
    public void onViewCreated(View p0,Bundle p1){
       ShareTitleAccessoryFragment tt1;
       Context context;
       Resources resources;
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareTitleAccessoryFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, ShareTitleAccessoryFragment.class, "4")) {
          view = p0.findViewById(R.id.title_done);
          a.o(view, "rootView.findViewById\(R.id.title_done\)");
          this.s = view;
          view = p0.findViewById(R.id.title_checkbox);
          a.o(view, "rootView.findViewById\(R.id.title_checkbox\)");
          this.t = view;
          view = p0.findViewById(R.id.if_add_title);
          a.o(view, "rootView.findViewById\(R.id.if_add_title\)");
          this.u = view;
       }
       Boolean uBoolean = this.ah("check_box_init_state", Boolean.FALSE);
       Object[] objArray = new Object[0];
       a.b().w("ShareTitleAccessoryFragment", "onViewCreated: checkBoxInitState="+uBoolean, objArray);
       ShareTitleAccessoryFragment tt = this.t;
       if (tt == null) {
          a.S("mIfAddTitleCheckbtn");
       }
       a.o(uBoolean, "checkBoxInitState");
       tt.setChecked(uBoolean.booleanValue());
       boolean b = uBoolean.booleanValue();
       if (!PatchProxy.isSupport(ShareTitleAccessoryFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, ShareTitleAccessoryFragment.class, "17")) {
          ColorStateList uColorStateL = null;
          if (b) {
             tt1 = this.u;
             if (tt1 == null) {
                a.S("mAddTitleText");
             }
             context = this.getContext();
             if (context != null) {
                resources = context.getResources();
                if (resources != null) {
                   uColorStateL = resources.getColorStateList(R.color.arg_RES_7f061641);
                }
             }
             tt1.setTextColor(uColorStateL);
             tt1 = this.u;
             if (tt1 == null) {
                a.S("mAddTitleText");
             }
             tt1.setTypeface(Typeface.DEFAULT_BOLD);
          }else {
             tt1 = this.u;
             if (tt1 == null) {
                a.S("mAddTitleText");
             }
             context = this.getContext();
             if (context != null) {
                resources = context.getResources();
                if (resources != null) {
                   uColorStateL = resources.getColorStateList(R.color.arg_RES_7f06168c);
                }
             }
             tt1.setTextColor(uColorStateL);
             tt1 = this.u;
             if (tt1 == null) {
                a.S("mAddTitleText");
             }
             tt1.setTypeface(Typeface.DEFAULT);
          }
       }
       tt1 = this.t;
       if (tt1 == null) {
          a.S("mIfAddTitleCheckbtn");
       }
       tt1.setOnCheckedChangeListener(new ShareTitleAccessoryFragment$b(this));
       m1.a(p0, new ShareTitleAccessoryFragment$c(this), R.id.if_add_title);
       m1.a(p0, new ShareTitleAccessoryFragment$d(this), R.id.title_done);
       if (PostExperimentUtils.A1()) {
          ShareTitleAccessoryFragment ts = this.s;
          if (ts == null) {
             a.S("mTitleDonebtn");
          }
          ts.setVisibility(8);
       }
       return;
    }
    public final int th(){
       return this.r;
    }
    public final void uh(WindowManager$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTitleAccessoryFragment.class, "8")) {
          return;
       }
       p0.x = 0;
       ShareTitleAccessoryFragment tw = this.w;
       p0.y = this.r - tw;
       p0.height = tw;
       Number number = PatchProxy.apply(null, this, ShareTitleAccessoryFragment.class, "1");
       if (number == PatchProxyResult.class) {
          number = this.q.getValue();
       }
       p0.width = number.intValue();
       return;
    }
    public final void vh(){
       if (PatchProxy.applyVoid(null, this, ShareTitleAccessoryFragment.class, "13")) {
          return;
       }
       ShareTitleAccessoryFragment tu = this.u;
       String str = "mAddTitleText";
       if (tu == null) {
          a.S(str);
       }
       if (tu.getWidth()) {
          tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          if (tu.getHeight()) {
             View view = this.getView();
             if (view != null) {
                b uob = new b(PublishBubbleItem.ADD_TITLE);
                ShareTitleAccessoryFragment tu1 = this.u;
                if (tu1 == null) {
                   a.S(str);
                }
                uob.b(tu1);
                uob.k(new ShareTitleAccessoryFragment$e(view, this));
                uob.j(new ShareTitleAccessoryFragment$f(view, this));
                if (this.getActivity() instanceof GifshowActivity) {
                   FragmentActivity activity = this.getActivity();
                   Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                   PostBubbleManager.e(activity).n(uob);
                }
             }
             return;
          }
       }
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       tu.getViewTreeObserver().addOnGlobalLayoutListener(new ShareTitleAccessoryFragment$g(this));
       return;
    }
}
