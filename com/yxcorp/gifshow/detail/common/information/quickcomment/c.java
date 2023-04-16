package com.yxcorp.gifshow.detail.common.information.quickcomment.c;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import m9a.t$c;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Throwable;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.c2;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import or7.a;
import lnc.ba;
import qp7.x0;
import or7.w;
import java.util.Objects;
import pp7.b;
import bk5.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Application;
import o56.a;
import uy9.q;
import android.content.Context;
import com.yxcorp.gifshow.detail.util.e$b;
import crd.b;
import com.yxcorp.gifshow.detail.util.e;
import ek9.d1;

public class c implements e$c	// class@00144c
{
    public final BaseEditorFragment$g a;
    public final int b;
    public final t$c c;
    public final b d;

    public void c(b p0,BaseEditorFragment$g p1,int p2,t$c p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(QComment p0,Throwable p1){
       p0.K = false;
    }
    public void b(QComment p0,e$g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       c td = this.d;
       td.K = false;
       EmotionInfo uEmotionInfo = null;
       td.N = uEmotionInfo;
       td.O = uEmotionInfo;
       td.P = uEmotionInfo;
       td.M = uEmotionInfo;
       td.I = p1.b() ^ 0x01;
       c td1 = this.d;
       b u = td1.u;
       b w = td1.w;
       String str = (this.a == null)? "QUICK_COMMENT_EMOJI": "QUICK_COMMENT_INPUT_CARD";
       c2.g(u, w, str, this.b, p0, td1.U);
       if (this.d.H().m().c == null) {
          ba.c(this.d.u.getPhotoId());
       }
       c tc = this.c;
       if (tc == null) {
          w ow = this.d.E();
          Objects.requireNonNull(ow);
          if (!PatchProxy.applyVoidOneRefs(uEmotionInfo, ow, w.class, "11")) {
             ow.f.f(uEmotionInfo);
          }
       }else {
          t$c a = tc.a;
          if (a != null && !TextUtils.x(a.b)) {
             this.d.j(e.a(a.b(), this.c.a.b, new q(this)));
          }
       }
       return;
    }
    public void c(){
       d1.b(this);
    }
    public void d(QComment p0,Throwable p1){
       d1.d(this, p0, p1);
    }
}
