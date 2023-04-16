package com.yxcorp.plugin.setting.entries.holder.PendantSettingEntryHolder$PendantSettingPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.PendantSettingEntryHolder$PendantSettingPresenter$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.gifshow.util.rx.RxBus;
import tt5.a;
import brd.t;
import t45.d;
import brd.z;
import kgd.v0;
import erd.g;
import crd.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import tkd.b;
import tkd.d;
import nsb.h;
import android.view.View;
import ekd.m1;

public class PendantSettingEntryHolder$PendantSettingPresenter extends PresenterV2	// class@000842
{
    public TextView p;
    public GifshowActivity q;
    public final LifecycleObserver r;

    public void PendantSettingEntryHolder$PendantSettingPresenter(){
       super();
       this.r = new PendantSettingEntryHolder$PendantSettingPresenter$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, PendantSettingEntryHolder$PendantSettingPresenter.class, "4")) {
          return;
       }
       this.p.setVisibility(0);
       this.P8();
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new v0(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, PendantSettingEntryHolder$PendantSettingPresenter.class, "1")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       this.q = activity;
       if (activity != null) {
          activity.getLifecycle().addObserver(this.r);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, PendantSettingEntryHolder$PendantSettingPresenter.class, "2")) {
          return;
       }
       PendantSettingEntryHolder$PendantSettingPresenter tq = this.q;
       if (tq != null) {
          tq.getLifecycle().removeObserver(this.r);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, PendantSettingEntryHolder$PendantSettingPresenter.class, "5")) {
          return;
       }
       PendantSettingEntryHolder$PendantSettingPresenter tp = this.p;
       int i = (d.a(0x11fcff7c).Ff())? 0x7f103bc0: 0x7f103bbf;
       tp.setText(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantSettingEntryHolder$PendantSettingPresenter.class, "3")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
