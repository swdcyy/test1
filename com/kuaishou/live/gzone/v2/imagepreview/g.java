package com.kuaishou.live.gzone.v2.imagepreview.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import a63.c;
import brd.t;
import t45.d;
import brd.z;
import a63.b;
import erd.g;
import crd.b;
import a63.a;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.kuaishou.live.gzone.v2.imagepreview.f;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.lang.Integer;
import android.view.View;
import ekd.m1;

public class g extends PresenterV2	// class@001ccc
{
    public ViewPager p;
    public TextView q;
    public TextView r;
    public ImageView s;
    public List t;
    public int u;
    public PublishSubject v;
    public a w;
    public static String sLivePresenterClassName = "GzoneImagePreviewFragmentPresenter";

    public void g(){
       super();
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       this.X7(RxBus.f.f(c.class).observeOn(d.a).subscribe(new b(this)));
       if (!PatchProxy.applyVoid(objArray, this, og, "4")) {
          a uoa = new a(this.t, this.u, this.v);
          this.w = uoa;
          this.p.setAdapter(uoa);
          this.p.setCurrentItem(this.u);
          this.p.setOffscreenPageLimit(this.t.size());
          this.q.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          this.r.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          this.q.setText(String.valueOf((this.u + 1)));
          this.r.setText(" / "+this.t.size());
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "5")) {
          this.s.setOnClickListener(new f(this));
       }
       return;
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, g.class, "6");
    }
    public final void P8(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "8")) {
          return;
       }
       this.s.setVisibility(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a40eb);
       this.q = m1.f(p0, 0x7f0a4143);
       this.p = m1.f(p0, 0x7f0a4540);
       this.s = m1.f(p0, 0x7f0a156e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.t = this.r8("LIVE_GZONE_IMAGE_PREVIEW_MODELS_FRAGMENT");
       this.u = this.r8("LIVE_GZONE_IMAGE_PREVIEW_CURRENT_POSITION").intValue();
       this.v = this.r8("LIVE_GZONE_IMAGE_PREVIEW_PUBLISH_SUBJECT");
       return;
    }
}
