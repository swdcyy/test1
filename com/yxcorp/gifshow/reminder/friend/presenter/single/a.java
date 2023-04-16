package com.yxcorp.gifshow.reminder.friend.presenter.single.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.i;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import ydc.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@001ad4
{
    public PublishSubject p;
    public KwaiActionBar q;

    public void a(){
       super();
    }
    public void E8(){
       int i;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (PatchProxy.applyVoid(objArray, this, uoa, "4") || (i.c() && this.getContext() != null)) {
          ViewGroup$LayoutParams layoutParams = this.q.getLayoutParams();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             ViewGroup$LayoutParams layoutParams1 = layoutParams;
             i = n.A(this.getContext());
             if (layoutParams1.topMargin != i) {
                layoutParams1.topMargin = i;
             }
             this.q.setLayoutParams(layoutParams);
          }
       }
       this.q.setVisibility(0);
       this.X7(this.p.subscribe(new a(this), Functions.d()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3f6a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LONG_ATLAS_OPEN_STATE_CHANGE_OBSERVABLE");
       return;
    }
}
