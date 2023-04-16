package com.kwai.component.photo.detail.slide.negative.operation.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.message.imshare.model.IMShareTarget;
import com.kwai.feature.api.social.message.imshare.model.ShareIMInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import le5.f;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import android.widget.CheckBox;
import android.view.View;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import kf5.h;
import android.view.View$OnClickListener;
import ekd.m1;
import java.util.HashMap;
import android.util.Pair;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import dw5.a;
import brd.t;
import bw5.u;
import kf5.i;
import com.kwai.component.photo.detail.slide.negative.operation.a;
import erd.g;
import crd.b;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import lu7.f;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import y8c.d;

public class b extends PresenterV2	// class@000a7e
{
    public QPhoto A;
    public PublishSubject B;
    public String C;
    public Pair D;
    public ObservableList E;
    public boolean F;
    public HashMap G;
    public TextView p;
    public KwaiImageView q;
    public TextView r;
    public ImageView s;
    public ImageView t;
    public View u;
    public CheckBox v;
    public d w;
    public View x;
    public View y;
    public IMShareTarget z;

    public void b(){
       super();
       this.F = false;
    }
    public static boolean S8(IMShareTarget p0){
       return p0.shareIMInfo.mIsRtcRunning;
    }
    public void E8(){
       int b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "11")) {
          IMShareTarget groupType = this.z.groupType;
          int i = 0;
          b = (groupType == 3 || groupType == 4)? true: false;
          this.F = b;
          b = (b)? 0x7f080145: 0x7f081ffe;
          Drawable uDrawable = a1.f(b);
          this.q.setPlaceHolderImage(uDrawable);
          this.q.setFailureImage(uDrawable);
          this.q.L(this.z.headUri);
          if (!f.e()) {
             if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
                if (this.E.size() > 0) {
                   this.v.setVisibility(i);
                   this.x.setVisibility(8);
                }else {
                   this.v.setVisibility(8);
                }
                this.v.setChecked(this.E.contains(this.z));
             }
             this.R8();
             this.t.setVisibility(8);
          }else if(this.z.mHasSent != null){
             this.p.setText(a1.p(R.string.arg_RES_7f1047d1));
             this.p.setTextColor(a1.a(R.color.arg_RES_7f06175d));
             this.p.setCompoundDrawablesWithIntrinsicBounds(i, i, R.drawable.arg_RES_7f080b11, i);
             this.t.setVisibility(8);
          }else {
             this.R8();
             if (!b.S8(this.z)) {
                this.t.setVisibility(i);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          m1.a(this.u, new h(this), R.id.share_to_layout);
       }
       if (this.G.get(this.z.id) != null) {
          this.P8(this.G.get(this.z.id));
       }else {
          this.P8(new Pair(Boolean.valueOf(this.z.isOnline), this.z.onlineStatusText));
       }
       this.X7(d.a(0x7904f115).hM(this.z.id).subscribe(new i(this), a.b));
       return;
    }
    public final void P8(Pair p0){
       boolean b;
       int b1;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "4")) {
          return;
       }
       this.G.put(this.z.id, p0);
       b = p0.first.booleanValue();
       p0 = p0.second;
       if (this.F != null || TextUtils.x(p0)) {
          this.r.setVisibility(8);
          this.s.setVisibility(8);
          this.x.setVisibility(8);
          this.y.setVisibility(8);
          this.p.setMaxLines(2);
       }else if(b.S8(this.z)){
          if (!this.E.size()) {
             this.x.setVisibility(0);
          }
          this.y.setVisibility(0);
          this.s.setVisibility(8);
       }else {
          b ts = this.s;
          if (PatchProxy.isSupport(uob)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(b), this, uob, "5");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else if(!f.e() && (b && (this.E.size() <= 0 && f.c()))){
                b1 = true;
             }else {
                b1 = false;
             }
          }else {
             goto label_006d ;
          }
          b1 = (b1)? 0: 8;
          ts.setVisibility(b1);
          this.x.setVisibility(8);
          this.y.setVisibility(8);
       }
       this.r.setVisibility(0);
       this.r.setText(p0);
       this.p.setMaxLines(1);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b tz = this.z;
       String str = f.b(tz.id, tz.name);
       if (str == null) {
          str = "";
       }
       this.p.setText(str);
       this.p.setTextColor(a1.a(R.color.arg_RES_7f06161f));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3915);
       this.p = m1.f(p0, 0x7f0a391a);
       this.q = m1.f(p0, 0x7f0a3919);
       this.r = m1.f(p0, 0x7f0a2eb4);
       this.s = m1.f(p0, 0x7f0a2eac);
       this.v = m1.f(p0, 0x7f0a06ca);
       this.t = m1.f(p0, 0x7f0a38c6);
       this.x = m1.f(p0, 0x7f0a36b6);
       this.y = m1.f(p0, 0x7f0a036b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.z = this.q8(IMShareTarget.class);
       this.A = this.q8(QPhoto.class);
       this.B = this.q8(PublishSubject.class);
       this.w = this.r8("ADAPTER_POSITION_GETTER");
       this.C = this.r8("DOWNLOAD_DIALOG_SOURCE");
       this.E = this.r8("SELECTED_TARGETS");
       this.G = this.r8("SHARE_ITEM_ONLINE_STATUS");
       return;
    }
}
