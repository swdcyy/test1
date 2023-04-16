package com.kuaishou.live.audience.component.comments.send.e$d;
import erd.g;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gy0.m;
import android.view.ViewConfiguration;
import java.lang.Runnable;
import e93.f;
import t02.a0;
import ne1.h;
import java.util.Objects;
import n91.f;
import lp3.c;
import lp3.i;
import eb1.c;
import vf3.b;
import vf3.a;
import p91.m;
import brd.t;
import gy0.j;
import com.kuaishou.live.audience.component.comments.send.b;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ft5.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.api.live.service.show.comments.sendcomment.LiveActivityCommentQueryUserConsumedResponse;
import gy0.l;
import com.kwai.feature.api.live.service.show.comments.sendcomment.LiveActivityCommentGiftConfig;
import z1.a;
import wx0.m$b;

public class e$d implements g	// class@000abd
{
    public final e b;

    public void e$d(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       e$d tb;
       boolean b;
       e$d tb1;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "1")) {
       }else {
          f.k("setCommentsViewClickable", new m(this), this.b, (long)(ViewConfiguration.getDoubleTapTimeout() + 50));
          Object[] objArray = null;
          if (this.b.r.X.Ho()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, uoe, "14")) {
                c.a(((p0.r.X.ki() - p0.B.a(f.class).s()) / 1000));
             }
          }else if(p0.a == null){
             if (p0.n != null) {
                tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(p0, tb, uoe, "23")) {
                   tb.X7(a.a().a(tb.t.getLiveStreamId(), tb.t.d(), p0.c).subscribe(new j(tb), b.b));
                }
             }else {
                BaseEditorFragment$g q = p0.q;
                if (q >= 0 && q - 0x3f800000 <= 0) {
                   b = this.b.S8(q);
                }else {
                   tb1 = this.b;
                   b = tb1.S8(tb1.F);
                }
                tb = this.b;
                if (tb.N != null && (tb.P.M() && (this.b.O != null && !b))) {
                   LiveLogTag lIVE_ACTIVIT = LiveLogTag.LIVE_ACTIVITY_COMMENT;
                   b.Z(lIVE_ACTIVIT, "start to send spring festival comment");
                   if (this.b.O.mHasConsumed == null) {
                      b.Z(lIVE_ACTIVIT, "user has not consumed, try send gift");
                      this.b.R8(p0);
                      tb1 = this.b;
                      e y = tb1.y;
                      uoe = tb1.O;
                      if (uoe != null) {
                         objArray = uoe.mActivityCommentGiftConfig;
                      }
                      y.a(objArray, new l(this, p0));
                   }else {
                      b.Z(lIVE_ACTIVIT, "user has consumed, do send spring festival comment");
                      this.b.P8(p0, 2, objArray, false);
                   }
                }else {
                   this.b.P8(p0, 1, objArray, b);
                }
             }
          }else {
             this.b.R8(p0);
          }
       }
       return;
    }
}
