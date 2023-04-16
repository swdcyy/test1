package com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import co2.f2;
import qu2.a;
import com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment$c;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import ur2.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kuaishou.live.common.core.basic.widget.LiveGridViewPager;
import android.widget.TextView;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import com.kwai.library.widget.specific.misc.LoadingView;
import android.view.ViewGroup;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import android.view.LayoutInflater;
import i2b.a;
import androidx.fragment.app.DialogFragment;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.view.ViewTreeObserver;
import ur2.h;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.core.voiceparty.emoji.VoicePartySelectEmojiFragment$a;
import ur2.f;
import android.database.DataSetObserver;
import android.widget.BaseAdapter;
import com.kwai.library.widget.viewpager.GridViewPager;
import ur2.g;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import brd.t;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import brd.x;
import ur2.e;
import ur2.d;
import erd.g;
import crd.b;

public class VoicePartySelectEmojiFragment extends LiveSafeDialogFragment implements d	// class@0014d8
{
    public final VoicePartySelectEmojiFragment$c A;
    public ViewGroup s;
    public TextView t;
    public HorizontalPageIndicator u;
    public LiveGridViewPager v;
    public LoadingView w;
    public View x;
    public VoicePartySelectEmojiFragment$a y;
    public final a z;
    public static final int B;

    public void VoicePartySelectEmojiFragment(f2 p0,a p1,VoicePartySelectEmojiFragment$c p2,DialogInterface$OnDismissListener p3){
       super();
       this.k0(p3);
       this.z = new a(p0, p1);
       this.A = p2;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartySelectEmojiFragment.class, "1")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a276e);
       this.t = m1.f(p0, 0x7f0a276d);
       this.x = m1.f(p0, 0x7f0a276a);
       this.u = m1.f(p0, 0x7f0a276b);
       this.w = m1.f(p0, 0x7f0a276c);
       this.s = m1.f(p0, 0x7f0a2767);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartySelectEmojiFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().setBackgroundDrawableResource(0x106000d);
       uDialog.getWindow().requestFeature(1);
       uDialog.getWindow().setDimAmount(0);
       if (y.d(this.getActivity())) {
          uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103e0);
          uDialog.getWindow().setGravity(5);
       }else {
          uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103d9);
          uDialog.getWindow().setGravity(80);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartySelectEmojiFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0e73, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VoicePartySelectEmojiFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       this.z.a();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, VoicePartySelectEmojiFragment.class, "7")) {
          return;
       }
       super.onResume();
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          Window window = this.getDialog().getWindow();
          int i = -1;
          if (y.d(this.getActivity())) {
             window.setLayout(c.b(this.getResources(), R.dimen.arg_RES_7f0702e5), i);
             if (this.getView() != null) {
                View view = this.getView();
                if (!PatchProxy.applyVoidOneRefs(view, this, VoicePartySelectEmojiFragment.class, "8")) {
                   ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                   layoutParams.height = a1.h();
                   view.setLayoutParams(layoutParams);
                   ViewGroup$LayoutParams layoutParams1 = this.v.getLayoutParams();
                   layoutParams1.height = 0;
                   this.v.setLayoutParams(layoutParams1);
                   this.v.getViewTreeObserver().addOnGlobalLayoutListener(new h(this));
                }
             }
          }else {
             window.setLayout(i, -2);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartySelectEmojiFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, VoicePartySelectEmojiFragment.class, "6")) {
          VoicePartySelectEmojiFragment$a uoa = new VoicePartySelectEmojiFragment$a(this);
          this.y = uoa;
          uoa.registerDataSetObserver(new f(this));
          this.v.setAdapter(this.y);
          this.v.addOnPageChangeListener(new g(this));
          this.w.setVisibility(0);
          this.x.setVisibility(8);
          if (!PatchProxy.applyVoid(objArray, this, VoicePartySelectEmojiFragment.class, "11")) {
             this.z.b(1).compose(this.Ug(FragmentEvent.DESTROY_VIEW)).subscribe(new e(this), new d(this));
          }
       }
       return;
    }
}
