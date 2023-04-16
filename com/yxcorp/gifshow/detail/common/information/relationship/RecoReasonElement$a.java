package com.yxcorp.gifshow.detail.common.information.relationship.RecoReasonElement$a;
import qp7.b1;
import com.yxcorp.gifshow.detail.common.information.relationship.RecoReasonElement;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.utility.SystemUtil;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import com.kuaishou.android.model.mix.HyperTag;
import yz7.e;
import qp7.b;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserExtraInfo;
import qp7.x0;
import com.kwai.slide.play.detail.information.reco.b;
import com.kwai.framework.model.user.UserExtraInfo$TextColor;
import com.kwai.slide.play.detail.information.reco.b$d;
import pp7.b;
import wy9.j;
import java.lang.Runnable;
import android.os.Handler;

public class RecoReasonElement$a implements b1	// class@001450
{
    public final RecoReasonElement a;

    public void RecoReasonElement$a(RecoReasonElement p0){
       this.a = p0;
       super();
    }
    public void a(){
       a1.a(this);
    }
    public void b(){
       a1.g(this);
    }
    public void c(boolean p0){
       RecoReasonElement$a uoa = RecoReasonElement$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (SystemUtil.K()) {
          int i = 0;
          Object[] objArray = new Object[i];
          o.C().w("RecoReasonElement", "onAttached: photo:"+this.a.t.getPhotoId()+","+this.a.t.getCaption(), objArray);
          HyperTag hyperTag = RecoReasonElement.t0(this.a.t);
          if (hyperTag != null) {
             Object[] objArray1 = new Object[i];
             o.C().w("RecoReasonElement", "onAttached: hyperTag:"+e.f(hyperTag), objArray1);
          }else {
             Object[] objArray2 = new Object[i];
             o.C().w("RecoReasonElement", "onAttached: hyperTag is null!", objArray2);
          }
       }
       return;
    }
    public void d(boolean p0){
    }
    public void e(boolean p0){
       RecoReasonElement$a uoa = RecoReasonElement$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       RecoReasonElement$a ta = this.a;
       ta.x = false;
       if (ta.m != null) {
          ta.b0();
       }
       ta = this.a;
       ta.y = false;
       ta.z = false;
       return;
    }
    public void f(boolean p0){
       RecoReasonElement$a uoa = RecoReasonElement$a.class;
       RecoReasonElement recoReasonEl = RecoReasonElement.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       RecoReasonElement$a ta = this.a;
       boolean b = true;
       ta.x = b;
       boolean b1 = false;
       ta.y = b1;
       ta.z = b1;
       if (ta.z0()) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, recoReasonEl, "8")) {
             HyperTag hyperTag1 = RecoReasonElement.s0(ta.t);
             if (hyperTag1 != null && !TextUtils.x(hyperTag1.mUntruncableText)) {
                HyperTag mExtraData = hyperTag1.mExtraData;
                UserExtraInfo mTextColor = (mExtraData != null)? mExtraData.mTextColor: null;
                b uob = ta.E();
                hyperTag1 = hyperTag1.mUntruncableText;
                UserExtraInfo$TextColor mUntruncable = (mTextColor != null)? mTextColor.mUntruncableText: null;
                Objects.requireNonNull(uob);
                if (!PatchProxy.applyVoidTwoRefs(hyperTag1, mUntruncable, uob, b.class, "5")) {
                   b$d uod = new b$d();
                   uod.a = hyperTag1;
                   uod.b = mUntruncable;
                   uob.e.f(uod);
                }
                ta.c0();
                ta.E().m(b);
             }
          }
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, recoReasonEl, "43") && ta.z == null) {
             ta.z = b;
             ta.C.post(new j(ta));
          }
       }else {
          this.a.E().m(b1);
          this.a.u0();
       }
       Objects.requireNonNull(this.a);
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, recoReasonEl, "33")) {
          HyperTag hyperTag = RecoReasonElement.t0(ta.t);
          if (!PatchProxy.applyVoidOneRefs(hyperTag, ta, recoReasonEl, "49")) {
             ta.D0(hyperTag, -1);
          }
       }
       if (!this.a.A0()) {
          this.a.v0();
          return;
       }else {
          this.a.G0();
          this.a.F0();
          return;
       }
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       a1.c(this);
    }
}
