package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i$a;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i$b;
import o6a.h;
import erd.g;
import crd.b;
import brd.t;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.MutableLiveData;
import o6a.l;
import o6a.g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import android.text.TextPaint;
import io.reactivex.subjects.PublishSubject;

public class i extends PresenterV2	// class@0017a6
{
    public l p;
    public PublishSubject q;
    public Button r;
    public Button s;
    public RecyclerView t;
    public Handler u;

    public void i(){
       super();
       this.u = new Handler();
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, i.class, "3")) {
          return;
       }
       i tr = this.r;
       if (tr != null) {
          tr.setOnClickListener(new i$a(this));
       }
       tr = this.s;
       if (tr != null) {
          tr.setOnClickListener(new i$b(this));
       }
       this.X7(this.q.subscribe(new h(this)));
       Activity activity = this.getActivity();
       i tp = this.p;
       if (tp != null && activity instanceof GifshowActivity) {
          tp.b().observe(activity, new g(this));
       }
       PatchProxy.onMethodExit(i.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, i.class, "7")) {
          return;
       }
       i tu = this.u;
       if (tu != null) {
          tu.removeCallbacksAndMessages(null);
       }
       PatchProxy.onMethodExit(i.class, "7");
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoidWithListener(null, this, i.class, "4")) {
          return;
       }
       boolean b = this.p.d();
       i tr = this.r;
       if (tr != null) {
          tr.setSelected(b);
       }
       PatchProxy.onMethodExit(i.class, "4");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3490);
       this.s = m1.f(p0, 0x7f0a348f);
       this.t = m1.f(p0, 0x7f0a34da);
       i tr = this.r;
       if (tr != null) {
          tr.getPaint().setFakeBoldText(true);
       }
       tr = this.s;
       if (tr != null) {
          tr.getPaint().setFakeBoldText(true);
       }
       PatchProxy.onMethodExit(i.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, i.class, "1")) {
          return;
       }
       this.p = this.q8(l.class);
       this.q = this.r8("FOLLOW_STATUS_CHANGE");
       PatchProxy.onMethodExit(i.class, "1");
       return;
    }
}
