package com.kuaishou.live.audience.component.comments.editor.f$a;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.audience.component.comments.editor.f;
import brd.v;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zx0.u;
import t02.a0;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import hb2.g$b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g$a;
import ft5.b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import brd.g;
import java.util.Iterator;
import java.util.HashSet;
import ft5.d;

public final class f$a implements DialogInterface$OnDismissListener	// class@000aac
{
    public final f b;
    public final v c;

    public void f$a(f p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       boolean b = true;
       this.b.b.c9(b);
       a0 z2 = u.S8(this.b.b).Z2;
       a.o(z2, "mLivePlayCallContext.mLiveBasicContext");
       if (z2.b() == null) {
          return;
       }
       u.S8(this.b.b).N().yj(AudienceBizRelation.COMMENT_EDITOR);
       f b1 = this.b.b;
       if (b1.D != null && !y.d(b1.getActivity())) {
          this.b.b.a9();
          z2 = u.S8(this.b.b).l1;
          if (z2 != null) {
             z2.b(false);
          }
       }
       if (!this.c.isDisposed()) {
          BaseEditorFragment$g$a og$a = new BaseEditorFragment$g$a();
          og$a.d(b);
          u g = this.b.b.G;
          if (g == null) {
             g = "";
          }
          og$a.l(g);
          a0 y1 = u.S8(this.b.b).Y1;
          a.o(y1, "mLivePlayCallContext.mSendCommentsService");
          og$a.l = y1.Xd();
          this.c.onNext(og$a.a());
          this.c.onComplete();
       }
       b1 = this.b.b;
       b1.D = false;
       b1.E = null;
       Iterator iterator = b1.K.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDismiss();
       }
       return;
    }
}
