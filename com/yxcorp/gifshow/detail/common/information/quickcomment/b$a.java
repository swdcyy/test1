package com.yxcorp.gifshow.detail.common.information.quickcomment.b$a;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import qp7.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.c2;
import com.yxcorp.gifshow.comment.e;
import qp7.x0;
import or7.w;
import java.util.Objects;
import pp7.b;

public class b$a extends y0	// class@001444
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void c(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       b$a ta = this.a;
       ta.L = true;
       if (ta.m != null) {
          c2.h(ta.u, ta.w, ta.U);
          ta = this.a;
          c2.d(ta.u, ta.w, ta.U);
       }
       ta.I = false;
       return;
    }
    public void d(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       b$a ta = this.a;
       ta.L = false;
       EmotionInfo uEmotionInfo = null;
       ta.N = uEmotionInfo;
       ta.O = uEmotionInfo;
       ta.P = uEmotionInfo;
       ta.M = uEmotionInfo;
       b z = ta.z;
       if (z != null) {
          z.e = uEmotionInfo;
       }
       w ow = ta.E();
       Objects.requireNonNull(ow);
       w ow1 = w.class;
       if (!PatchProxy.isSupport(ow1) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, ow, ow1, "9")) {
          ow.k.f(Boolean.TRUE);
       }
       return;
    }
}
