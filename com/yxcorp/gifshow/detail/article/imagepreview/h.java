package com.yxcorp.gifshow.detail.article.imagepreview.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.h;
import brd.t;
import t45.d;
import brd.z;
import xw9.b;
import erd.g;
import crd.b;
import xw9.a;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.entity.QPhoto;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import xw9.c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.detail.article.imagepreview.g;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.lang.Integer;
import android.view.View;
import ekd.m1;

public class h extends PresenterV2	// class@001352
{
    public ViewPager p;
    public TextView q;
    public TextView r;
    public ImageView s;
    public List t;
    public int u;
    public PublishSubject v;
    public QPhoto w;
    public ViewPager$i x;
    public a y;

    public void h(){
       super();
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       this.X7(RxBus.f.f(h.class).observeOn(d.a).subscribe(new b(this)));
       if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
          a uoa = new a(this.t, this.u, this.v, this.w);
          this.y = uoa;
          this.p.setAdapter(uoa);
          this.p.setCurrentItem(this.u);
          this.p.setOffscreenPageLimit(this.t.size());
          this.q.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          this.r.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          this.q.setText(String.valueOf((this.u + 1)));
          this.r.setText(" / "+this.t.size());
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "5")) {
          c uoc = new c(this);
          this.x = uoc;
          this.p.addOnPageChangeListener(uoc);
          this.s.setOnClickListener(new g(this));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h.class, "6")) {
          return;
       }
       this.p.removeOnPageChangeListener(this.x);
       return;
    }
    public final void P8(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "8")) {
          return;
       }
       this.s.setVisibility(p0);
       this.q.setVisibility(p0);
       this.r.setVisibility(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a40eb);
       this.q = m1.f(p0, 0x7f0a4143);
       this.p = m1.f(p0, 0x7f0a4540);
       this.s = m1.f(p0, 0x7f0a156e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.t = this.r8("IMAGE_PREVIEW_MODELS_FRAGMENT");
       this.u = this.r8("IMAGE_PREVIEW_CURRENT_POSITION").intValue();
       this.v = this.r8("IMAGE_PREVIEW_PUBLISH_SUBJECT");
       this.w = this.r8("IMAGE_PREVIEW_PHOTO");
       return;
    }
}
