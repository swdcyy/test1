package com.kwai.widget.customer.mediapreview.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import zf6.j;
import java.util.List;
import ix7.l;
import erd.g;
import crd.b;
import brd.t;
import ix7.m;
import android.widget.TextView;
import ix7.k;
import java.lang.Integer;
import java.util.Locale;
import java.lang.CharSequence;
import lx7.a;
import android.view.View;
import ekd.m1;
import android.app.Activity;
import ix7.i;
import android.view.View$OnClickListener;
import ix7.j;
import io.reactivex.subjects.PublishSubject;
import ix7.a0;

public class r extends PresenterV2	// class@001141
{
    public a0 A;
    public int B;
    public int C;
    public ImageView p;
    public ImageView q;
    public View r;
    public View s;
    public TextView t;
    public PublishSubject u;
    public PublishSubject v;
    public PublishSubject w;
    public List x;
    public int y;
    public a z;

    public void r(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       this.R8();
       r tp = this.p;
       tp.setImageDrawable(j.l(tp.getContext(), R.drawable.arg_RES_7f080623, 2));
       this.q.setImageDrawable(j.l(this.p.getContext(), R.drawable.common_nav_close_black, 2));
       this.B = this.x.size();
       this.X7(this.u.subscribe(new l(this)));
       this.X7(this.v.subscribe(new m(this)));
       if (this.x.size() > 0) {
          this.t.setVisibility(0);
          this.P8(this.y);
          this.X7(this.w.subscribe(new k(this)));
       }else {
          this.t.setVisibility(8);
       }
       return;
    }
    public void P8(int p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, or, "8")) {
          return;
       }
       this.C = p0;
       Object[] objArray = new Object[]{Integer.valueOf((p0 + 1)),Integer.valueOf(this.B)};
       this.t.setText(String.format(Locale.getDefault(), "%d/%d", objArray));
       this.S8();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, r.class, "9")) {
          return;
       }
       r tp = this.p;
       int i = 0;
       int i1 = (this.z.a != null)? 0: 8;
       tp.setVisibility(i1);
       tp = this.q;
       if (this.z.b == null) {
          i = 8;
       }
       tp.setVisibility(i);
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, r.class, "7")) {
          return;
       }
       this.R8();
       this.r.setVisibility(0);
       this.s.setVisibility(0);
       this.t.setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a31aa);
       this.q = m1.f(p0, 0x7f0a31ab);
       this.r = this.getActivity().findViewById(0x7f0a0ee3);
       this.p.setOnClickListener(new i(this));
       this.q.setOnClickListener(new j(this));
       this.s = m1.f(p0, 0x7f0a400d);
       this.t = m1.f(p0, 0x7f0a421b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.u = this.r8("PREVIEW_MEDIA_PREVIEW_DRAG_STATE");
       this.v = this.r8("PREVIEW_MEDIA_OPTION_VIEW_CLICK");
       this.w = this.r8("PREVIEW_MEDIA_PREVIEW_POSITION");
       this.x = this.r8("PREVIEW_MEDIA_PREVIEW_INFO");
       this.y = this.r8("PREVIEW_MEDIA_PREVIEW_POSITION_INIT").intValue();
       this.z = this.r8("PREVIEW_MEDIA_PREVIEW_STYLE_CONFIG");
       this.A = this.r8("PREVIEW_MEDIA_PAGE_INDEX");
       return;
    }
}
