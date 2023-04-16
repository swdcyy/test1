package com.yxcorp.gifshow.ad.challenge.ranklist.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import py8.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.view.Window;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import t2b.b;
import py8.g;
import t2b.a$a;
import py8.i;
import py8.h;
import t2b.b$e;
import t2b.b$c;
import py8.e;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$b;
import com.yxcorp.gifshow.model.TagChallengeBannerInfo;

public class a extends PresenterV2	// class@001537
{
    public RecyclerFragment p;
    public RecyclerView q;
    public b r;
    public String s;
    public int t;
    public String u;
    public TagChallengeBannerInfo v;
    public AppBarLayout w;
    public final AppBarLayout$b x;

    public void a(){
       super();
       this.x = new f(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       a tp = this.p;
       if (tp == null) {
          return;
       }
       this.q = tp.h0();
       Bundle arguments = this.p.getArguments();
       if (arguments == null) {
          return;
       }
       this.s = arguments.getString("tag_id");
       this.t = arguments.getInt("tag_type", 0);
       this.u = arguments.getString("tag_name");
       if (this.getActivity() != null && this.getActivity().getWindow() != null) {
          this.getActivity().getWindow().getDecorView();
          this.w = this.getActivity().getWindow().getDecorView().findViewById(0x7f0a0225);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          b uob = new b(new g(this));
          this.r = uob;
          a tq = this.q;
          if (tq != null) {
             uob.d(tq, new i(this), new h(this));
             this.q.addOnLayoutChangeListener(new e(this));
             uoa = this.w;
             if (uoa != null) {
                uoa.b(this.x);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tr = this.r;
       if (tr != null) {
          tr.g(false);
       }
       tr = this.w;
       if (tr != null) {
          tr.n(this.x);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.t8("FRAGMENT");
       this.v = this.t8("TAG_CHALLENGE_BANNER");
       return;
    }
}
