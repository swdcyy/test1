package com.yxcorp.gifshow.camera.record.sameframe.a;
import bd9.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import ug9.c;
import ug9.b;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eg9.a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import oc9.e0;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.SameFrameInfo;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import qr4.i;
import qr4.m$k0;
import qr4.m$c0;
import lq.i;
import tkd.b;
import tkd.d;
import hb0.b;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import q16.a$a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.text.TextUtils;
import com.kwai.framework.model.user.User;
import kp.r1;
import vg9.l;
import vg9.b;
import vg9.u;
import vg9.x;
import vg9.w;
import oc9.t;
import oa0.a;
import com.kwai.video.player.IMediaPlayer;

public class a extends d	// class@000f03
{
    public u A;
    public x B;
    public w C;
    public b y;
    public l z;

    public void a(CameraPageType p0,b p1){
       super(p0, p1);
       this.d.n(c.class, new b(this));
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.d.m(new a(false));
       super.I7();
       return;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       super.L3(p0);
       if (p0 == null) {
          return;
       }
       PhotoMeta mSameFrameIn = this.q.a(PhotoMeta.class).mSameFrameInfo;
       int i = 1;
       if (mSameFrameIn != null) {
          i = i + mSameFrameIn.mCurrentDepth;
       }
       a e = p0.e;
       Objects.requireNonNull(e);
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Integer.valueOf(i), e, videoContext, "95") != PatchProxyResult.class) {
       }else {
          VideoContext.b();
          e.d0();
          e.a.b.t.c = i;
       }
       if (i.h()) {
          Map obj = i.m().z("toolbox_template_params");
          if (obj instanceof String) {
             obj = d.a(0x338f144a).KV(obj);
             String str = obj.get("photo_id");
             String str1 = obj.get("tab_id");
             String str2 = obj.get("template_name");
             String str3 = obj.get("template_type");
             if (!TextUtils.x(str)) {
                VideoContext.e2(p0.e, str, str1, str2, str3);
             }
          }
       }
       return;
    }
    public boolean R0(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (super.R0()) {
          return true;
       }
       this.qb();
       return true;
    }
    public void de(a$a p0,a p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "2")) {
          return;
       }
       super.de(p0, p1);
       PhotoMeta mSameFrameIn = this.q.a(PhotoMeta.class).mSameFrameInfo;
       String id = this.q.getId();
       Objects.requireNonNull(p0);
       Object obj = PatchProxy.applyOneRefs(id, p0, a$a.class, "14");
       String str = (obj != PatchProxyResult.class)? obj: id;
       int i = (mSameFrameIn != null)? mSameFrameIn.mAvailableDepth - 1: -1;
       Objects.requireNonNull(str);
       if (PatchProxy.isSupport(a$a.class)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), str, a$a.class, "15");
          if (obj1 != PatchProxyResult.class) {
             str = obj1;
          label_0058 :
             SameFrameInfo sameFrameInf = PatchProxy.applyOneRefs(mSameFrameIn, this, uoa, "4");
             if (sameFrameInf != PatchProxyResult.class) {
             }else if(!PostExperimentUtils.z1() && (mSameFrameIn != null && !TextUtils.isEmpty(mSameFrameIn.mUserName))){
                sameFrameInf = mSameFrameIn.mUserName;
             }else {
                User user = r1.T1(this.q);
                sameFrameInf = (user != null && !TextUtils.isEmpty(user.mName))? user.mName: "";
             }
             Objects.requireNonNull(str);
             mSameFrameIn = PatchProxy.applyOneRefs(sameFrameInf, str, a$a.class, "13");
             str = (mSameFrameIn != PatchProxyResult.class)? mSameFrameIn: sameFrameInf;
             Objects.requireNonNull(str);
             if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyOneRefs(Boolean.TRUE, str, a$a.class, "16") != PatchProxyResult.class) {
             }else {
                str.y1 = true;
             }
             return;
          }
       }
       str.x1 = i;
       goto label_0058 ;
    }
    public void g2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.z = new l(this.c, this.d, this);
       this.y = new b(this.c, this.d, this);
       this.A = new u(this.c, this.d, this);
       this.B = new x(this.c, this.d, this);
       this.C = new w(this.c, this.d, this);
       this.L0(this.y);
       this.L0(this.z);
       this.L0(this.A);
       this.L0(this.B);
       this.L0(this.C);
       a.r1(true);
       return;
    }
    public void l2(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       super.l2(p0);
       return;
    }
}
