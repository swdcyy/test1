package com.yxcorp.gifshow.photo.download.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import kxb.b;
import lxb.s;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import android.widget.CheckBox;
import android.view.View;
import ekd.m1;
import gxb.r;
import android.view.View$OnClickListener;

public class d extends PresenterV2	// class@000ee2
{
    public KwaiImageView p;
    public CheckBox q;
    public View r;
    public KwaiImageView s;
    public QPhoto t;
    public s u;
    public ObservableList v;
    public List w;
    public String x;

    public void d(){
       super();
    }
    public void E8(){
       s b;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       int i = 0;
       if (!q.f(this.w) && ("updateCheckbox").equals(this.w.get(i))) {
          this.R8();
          return;
       }else {
          this.R8();
          if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
             float f = 0x3f400000;
             int i1 = 0x7f080166;
             if (b.a(this.t) && !q.f(this.u.f)) {
                if (this.u.f.size() > 1) {
                   this.p.setImageResource(i1);
                }else {
                   b = this.u.f.get(i).b;
                   if (this.P8() - f > 0 && this.s != null) {
                      this.p.setImageResource(i1);
                      this.s.setAspectRatio(this.P8());
                      this.s.P(b);
                   }else {
                      this.p.P(b);
                   }
                }
             }else if(this.u.d != null){
                this.p.setImageResource(i1);
             }else if(this.P8() - f > 0 && this.s != null){
                this.p.setImageResource(i1);
                this.s.setAspectRatio(this.P8());
                this.s.P(this.u.b);
             }else {
                this.p.P(this.u.b);
             }
          }
          return;
       }
    }
    public final float P8(){
       s c = this.u.c;
       if (c != null) {
          return (c.mWidth / c.mHeight);
       }
       return 0;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       this.q.setChecked(this.v.contains(this.u));
       d tr = this.r;
       int i = (this.v.contains(this.u))? 0: 8;
       tr.setVisibility(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0dd3);
       this.p = m1.f(p0, 0x7f0a14c0);
       this.r = m1.f(p0, 0x7f0a038e);
       this.q = m1.f(p0, 0x7f0a147b);
       p0.setOnClickListener(new r(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.u = this.q8(s.class);
       this.t = this.r8("DOWNLOAD_PHOTO");
       this.v = this.r8("SELECTED_PIC_TARGETS");
       this.w = this.r8("PAYLOADS");
       this.x = this.r8("DOWNLOAD_SOURCE");
       return;
    }
}
