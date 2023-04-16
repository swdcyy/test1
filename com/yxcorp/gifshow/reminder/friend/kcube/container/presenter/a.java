package com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import odc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import lnc.b5;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.g;
import java.lang.Boolean;
import odc.a;
import android.view.View;
import z1.a;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil;
import ekd.i;
import com.yxcorp.utility.n;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;

public class a extends PresenterV2	// class@001ab6
{
    public KwaiActionBar p;
    public final g q;

    public void a(){
       super();
       this.q = new b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.P8(b5.a(this.getActivity()));
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().k3(this.q);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().t3(this.q);
       }
       return;
    }
    public final void P8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (p0) {
          MultiWindowLayoutUtil.a(this.p, new a(this));
       }else {
          MultiWindowLayoutUtil.d(this.p);
          if (i.c()) {
             n.V(this.p);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f6a);
       return;
    }
}
