package com.kuaishou.merchant.basic.activity.plugin.MakeActivityHalfScreenPlugin;
import com.kuaishou.merchant.basic.activity.plugin.BasePlugin;
import com.kuaishou.merchant.basic.activity.plugin.MakeActivityHalfScreenPlugin$a;
import nsd.u;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.os.Bundle;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.ViewGroup;
import ot3.a0;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import dt3.b;
import android.view.View$OnTouchListener;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import dt3.a;
import android.view.WindowManager$LayoutParams;
import android.content.Context;
import com.kuaishou.merchant.basic.activity.plugin.MakeActivityHalfScreenPlugin$b;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import ot3.g0;
import java.lang.Exception;

public final class MakeActivityHalfScreenPlugin extends BasePlugin	// class@0015ab
{
    public boolean b;
    public int c;
    public boolean d;
    public MakeActivityHalfScreenPlugin$b e;
    public static final MakeActivityHalfScreenPlugin$a f;

    static {
       MakeActivityHalfScreenPlugin.f = new MakeActivityHalfScreenPlugin$a(null);
    }
    public void MakeActivityHalfScreenPlugin(){
       super();
    }
    public static final int Vg(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeActivityHalfScreenPlugin.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return MakeActivityHalfScreenPlugin.f.a(p0);
    }
    public static final boolean Wg(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeActivityHalfScreenPlugin.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MakeActivityHalfScreenPlugin.f.b(p0);
    }
    public final int Ug(){
       MakeActivityHalfScreenPlugin obj = PatchProxy.apply(null, this, MakeActivityHalfScreenPlugin.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getActivity() == null) {
          return 800;
       }
       obj = this.c;
       if (obj <= null) {
          FragmentActivity activity = this.getActivity();
          a.m(activity);
          int i = (n.l(activity) * 73) / 100;
       }
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeActivityHalfScreenPlugin.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.b != null) {
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             View view = null;
             if (activity instanceof SingleFragmentActivity) {
                Fragment uFragment = activity.w3();
                if (uFragment != null) {
                   view = uFragment.getView();
                }
             }else {
                ViewGroup viewGroup = activity.getWindow().getDecorView().findViewById(0x1020002);
                if (viewGroup != null) {
                   view = viewGroup.getChildAt(0);
                }
             }
             if (view != null) {
                a0.a(activity, -1);
                ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof FrameLayout$LayoutParams) {
                   layoutParams.height = this.Ug();
                   layoutParams.gravity = 80;
                }
                if (!PatchProxy.applyVoidTwoRefs(activity, view, this, MakeActivityHalfScreenPlugin.class, "5")) {
                   Window window = activity.getWindow();
                   if (window != null) {
                      View decorView = window.getDecorView();
                      if (decorView != null) {
                         decorView.setOnTouchListener(new b(this, activity, view));
                      }
                   }
                }
             }
          label_007c :
             if (activity instanceof MerchantSingleFragmentActivity) {
                activity.n1();
             }else if(activity instanceof a){
                activity.n1();
             }
          }
          if (activity != null && this.d != null) {
             activity.getWindow().setDimAmount(0x3f000000);
             activity.getWindow().addFlags(2);
             activity.getWindow().setAttributes(activity.getWindow().getAttributes());
          }
       }
    label_00b7 :
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeActivityHalfScreenPlugin.class, "2")) {
          return;
       }
       super.onAttach(p0);
       if (p0 instanceof MakeActivityHalfScreenPlugin$b) {
          this.e = p0;
       }
       return;
    }
    public void onCreate(Bundle p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeActivityHalfScreenPlugin.class, "3")) {
          return;
       }
       super.onCreate(p0);
       FragmentActivity activity = this.getActivity();
       Intent intent = (activity != null)? activity.getIntent(): null;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(intent, this, MakeActivityHalfScreenPlugin.class, "1") && intent != null) {
          MakeActivityHalfScreenPlugin$a f = MakeActivityHalfScreenPlugin.f;
          this.b = f.b(intent);
          this.c = f.a(intent);
          String obj = PatchProxy.applyOneRefs(intent, f, MakeActivityHalfScreenPlugin$a.class, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             Uri uri = f.c(intent);
             obj = "useMask";
             boolean b1 = (uri != null)? TextUtils.equals(x0.a(uri, obj), "true"): false;
             if (!b1) {
                b = intent.getBooleanExtra(obj, i);
             }else {
                b = b1;
             }
          }
          this.d = b;
       }
       if (this.b != null) {
          activity = this.getActivity();
          if (activity != null) {
             i.h(activity, i, i);
             i = 0x7f01010d;
             activity.overridePendingTransition(R.anim.arg_RES_7f010105, i);
             if (activity instanceof GifshowActivity) {
                FragmentActivity uFragmentAct = activity;
                if (!PatchProxy.applyVoidOneRefs(uFragmentAct, this, MakeActivityHalfScreenPlugin.class, "7")) {
                   try{
                      g0.a(uFragmentAct, "mCloseEnterAnimation", Integer.valueOf(i));
                   }catch(java.lang.Exception e0){
                      e0.toString();
                   }
                }
             }
          }
       }
       return;
    }
}
