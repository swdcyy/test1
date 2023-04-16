package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaPymkDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import e8a.w0;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import psb.c;
import brd.t;
import cjd.e;
import erd.o;
import e8a.o0;
import e8a.n0;
import erd.g;
import crd.b;
import android.os.Bundle;
import android.app.Dialog;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.view.WindowManager$LayoutParams;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import ekd.m1;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import e8a.m0;
import android.view.View$OnClickListener;
import android.text.TextPaint;
import java.lang.CharSequence;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import e8a.g0;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class NasaPymkDialogFragment extends BaseDialogFragment	// class@00191d
{
    public String p;
    public List q;
    public String r;
    public TextView s;
    public RecyclerView t;
    public static final int u;

    public void NasaPymkDialogFragment(String p0,List p1,String p2){
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
    }
    public static void th(GifshowActivity p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, NasaPymkDialogFragment.class, "1")) {
          return;
       }
       ProgressFragment progressFrag = new ProgressFragment();
       progressFrag.setCancelable(false);
       progressFrag.Ih(R.string.arg_RES_7f103667);
       progressFrag.Cb(p0.getSupportFragmentManager(), "reward_loading");
       c uoc = PatchProxy.apply(null, null, w0.class, "1");
       if (uoc == PatchProxyResult.class) {
          uoc = b.a(0x1e7ef171);
       }
       uoc.p(p2, p3).map(new e()).subscribe(new o0(progressFrag, p1, p0), new n0(progressFrag));
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaPymkDialogFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          this.getDialog().getWindow().setWindowAnimations(R.style.arg_RES_7f1103dc);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaPymkDialogFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(1, R.style.arg_RES_7f110362);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, NasaPymkDialogFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d1068, p1, false);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaPymkDialogFragment.class, "6")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, NasaPymkDialogFragment.class, "9")) {
          Dialog dialog = this.getDialog();
          if (dialog != null && dialog.getWindow() != null) {
             dialog.setCancelable(true);
             dialog.setCanceledOnTouchOutside(false);
             WindowManager$LayoutParams attributes = dialog.getWindow().getAttributes();
             attributes.gravity = 17;
             attributes.width = n.y(a.B);
             attributes.height = n.u(a.B);
             dialog.getWindow().setAttributes(attributes);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NasaPymkDialogFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, NasaPymkDialogFragment.class, "7")) {
          this.s = m1.f(p0, 0x7f0a3f7d);
          this.t = m1.f(p0, 0x7f0a0955);
          m1.a(p0, new m0(this), R.id.close_btn);
          this.s.getPaint().setFakeBoldText(true);
          this.s.setText(this.p);
          if (!PatchProxy.applyVoid(null, this, NasaPymkDialogFragment.class, "8") && !q.f(this.q)) {
             this.t.setItemAnimator(null);
             this.t.setLayoutManager(new LinearLayoutManager(this.getContext()));
             g0 og0 = new g0(this.r);
             og0.W0(this.q);
             this.t.setAdapter(og0);
          }
       }
       if (!PatchProxy.applyVoid(null, this, NasaPymkDialogFragment.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "KNOW_PEOPLE_POPUP";
          uElementPack.params = this.r;
          u1.u0(4, uElementPack, null);
       }
       return;
    }
}
