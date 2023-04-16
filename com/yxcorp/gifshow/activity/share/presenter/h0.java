package com.yxcorp.gifshow.activity.share.presenter.h0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.share.presenter.h0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq.i;
import lq.l;
import xw8.p0;
import com.yxcorp.gifshow.activity.share.presenter.d0;
import com.yxcorp.gifshow.activity.share.presenter.e0;
import erd.g;
import crd.b;
import brd.t;
import zw8.o0;
import com.yxcorp.gifshow.activity.share.presenter.f0;
import f66.i;
import jq.a;
import q87.c;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import android.app.Activity;
import com.yxcorp.gifshow.activity.BasePostActivity;
import android.content.Intent;
import android.os.SystemClock;
import lq.l$a;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qr4.i;
import qr4.m$k0;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.Set;
import xw8.p0$d;
import wba.p0;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import gx8.e;
import java.util.Objects;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.activity.share.util.PublishFunnel$funnelSaveToDraft$1;
import msd.l;
import zw8.l0;
import erd.a;
import brd.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.w;
import zw8.m0;
import zw8.q0;
import com.yxcorp.gifshow.activity.share.presenter.g0;
import java.lang.Integer;

public class h0 extends PresenterV2	// class@0013e9
{
    public int p;
    public c q;
    public BasePostActivity r;
    public p0 s;
    public String t;
    public AttrAnimProgressFragment u;
    public boolean v;
    public final l w;

    public void h0(){
       super();
       this.w = new h0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "2")) {
          return;
       }
       i.m().f(this.w);
       this.X7(this.s.i.subscribe(new d0(this), e0.b));
       this.X7(this.s.f.subscribe(new o0(this), f0.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareCancelPresenter", "onUnbind", objArray);
       if (i.h()) {
          i.m().U(this.w);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "6")) {
          return;
       }
       if (this.p >= null) {
          Object[] objArray = new Object[0];
          a.b().w("ShareCancelPresenter", "cancel encoding.", objArray);
          d.a(-273232199).a20().Y3(this.p, true, 18);
       }
       return;
    }
    public final void R8(boolean p0){
       Intent obj;
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh0, "8")) {
          return;
       }
       oh0 = this.u;
       if (oh0 != null) {
          oh0.dismiss();
          this.u = null;
       }
       int i = 0;
       if (p0) {
          Object[] objArray = new Object[i];
          a.b().w("ShareCancelPresenter", "Save draft, finish PostSession and quit ShareActivity.", objArray);
          i.m().d0(2);
          obj = i.m().A("fromRecordDraftTab", Boolean.FALSE);
          if (obj instanceof Boolean && obj.booleanValue()) {
             this.r.setResult(-1);
             this.r.finish();
          }else {
             this.r.finishAffinity();
             this.r.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
          }
       }else {
          obj = new Intent();
          obj.putExtra("back_to_activity_time", SystemClock.uptimeMillis());
          this.r.setResult(i, obj);
          this.r.finish();
       }
       return;
    }
    public void S8(l$a p0){
       e a;
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "ShareCancelPresenter";
       a.b().s(str, "save workspace", objArray);
       h0 tq = this.q;
       if (tq == null) {
          PostUtils.D(str, "saveWorkspace\(\)", new IllegalStateException("mWorkspaceDraft is null"));
          return;
       }else {
          i b = tq.d1().F().b;
          boolean b1 = (!this.q.d1().F().g.length)? true: false;
          b.s0 = b1;
          Object[] objArray1 = new Object[i];
          a.b().w(str, "isActiveSaveLocalAlbum = "+this.q.d1().F().b.s0, objArray1);
          Iterator iterator = this.s.r.iterator();
          while (iterator.hasNext()) {
             iterator.next().j7(this.q.d1());
          }
          p0.d(this.q);
          b.q(this.q.d1().F(), 2);
          a = e.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(null, a, e.class, "3")) {
             PostFunnelManager.j.a().d().l(PublishFunnel$funnelSaveToDraft$1.INSTANCE);
          }
          z a1 = d.a;
          t ot = a.q(new l0(this)).w(d.c).s(a1).d(DraftFileManager.E().b(this.q)).observeOn(a1);
          this.X7(ot.doOnTerminate(new m0(this)).subscribe(new q0(this, p0), g0.b));
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.p = this.r8("SHARE_PRE_ENCODE_ID").intValue();
       this.q = this.t8("WORKSPACE");
       this.r = this.r8("SHARE_ACTIVITY");
       this.s = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.t = this.t8("SHARE_FROM_PAGE");
       return;
    }
}
