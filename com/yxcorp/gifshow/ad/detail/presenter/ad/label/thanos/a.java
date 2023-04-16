package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.a$a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import im8.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import g59.g;
import vy6.a;
import java.util.Objects;
import n49.o;
import java.util.Set;
import android.widget.TextView;
import java.lang.StringBuilder;
import lnc.a1;
import java.lang.Runnable;
import ekd.k1;
import mxb.b0;
import android.widget.ImageView;
import vz8.e;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2	// class@0015cc
{
    public o$b A;
    public final a B;
    public View p;
    public TextView q;
    public TextView r;
    public ImageView s;
    public QPhoto t;
    public o u;
    public f v;
    public BaseFragment w;
    public SlidePlayViewModel x;
    public int y;
    public Runnable z;

    public void a(){
       super();
       this.A = new a$a(this);
       this.B = new a$b(this);
    }
    public void E8(){
       boolean b;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       PhotoAdvertisement obj = PatchProxy.apply(objArray, this, uoa, "4");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.v.get().booleanValue()){
          obj = k.B(this.t);
          uoa = (obj != null && obj.mDisplayType == 12)? 1: null;
          if (uoa && !TextUtils.isEmpty(k.B(this.t).mAdLabelDescription)) {
             b = true;
          }
       }
    label_0051 :
       b = false;
       if (!b) {
          this.p.setVisibility(8);
          return;
       }else {
          this.x = SlidePlayViewModel.S0(this.w.getParentFragment());
          this.p.setVisibility(i);
          if (g.b(k.B(this.t))) {
             this.y = 100;
             this.S8();
          }else {
             this.y = i;
             this.x.P(this.w, this.B);
             uoa = this.u;
             a tA = this.A;
             Objects.requireNonNull(uoa);
             if (!PatchProxy.applyVoidOneRefs(tA, uoa, o.class, "1")) {
                uoa.a.add(tA);
             }
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.q.setVisibility(8);
       a tx = this.x;
       if (tx != null) {
          tx.D(this.w, this.B);
       }
       tx = this.u;
       a tA = this.A;
       Objects.requireNonNull(tx);
       if (!PatchProxy.applyVoidOneRefs(tA, tx, o.class, "2")) {
          tx.a.remove(tA);
       }
       return;
    }
    public String P8(){
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       int i = 100;
       if (obj > null && obj < i) {
          return a1.p(0x7f10007b)+this.y+"%";
       }
       if (obj == null && g.b(k.B(this.t))) {
          this.y = i;
       }
       if (this.y == i) {
          this.R8();
          return a1.p(0x7f1016d0);
       }else {
          return a1.p(0x7f100aad);
       }
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       a tz = this.z;
       if (tz != null) {
          k1.m(tz);
          this.z = null;
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.q.setVisibility(8);
       this.r.setVisibility(0);
       PhotoAdvertisement photoAdverti = k.B(this.t);
       PhotoAdvertisement mAdLabelDesc = photoAdverti.mAdLabelDescription;
       if (b0.b(photoAdverti)) {
          this.s.setImageResource(R.drawable.arg_RES_7f0800c4);
          if (g.b(photoAdverti)) {
             mAdLabelDesc = this.P8();
          }
       }else {
          this.s.setImageResource(R.drawable.arg_RES_7f0800c5);
       }
       this.q.setText(mAdLabelDesc);
       this.r.setText(mAdLabelDesc);
       this.p.setOnClickListener(new e(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3a1f);
       this.p = m1.f(p0, 0x7f0a3a1e);
       this.q = m1.f(p0, 0x7f0a3a1d);
       this.r = m1.f(p0, 0x7f0a3a20);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.t = this.q8(QPhoto.class);
       this.u = this.q8(o.class);
       this.v = this.x8("DETAIL_IS_THANOS");
       this.w = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
