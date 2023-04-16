package com.yxcorp.gifshow.detail.slidev2.presenter.feature.i;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.j;
import com.yxcorp.gifshow.comment.e$c;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e8a.t0;
import x2a.b;
import java.util.Objects;
import x2a.b$a;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import android.app.Activity;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import x2a.a;
import java.lang.Runnable;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class i implements BaseEditorFragment$c	// class@0019a5
{
    public final e$c a;
    public final j b;

    public void i(j p0,e$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(BaseEditorFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       i tb = this.b;
       tb.h = p0.e;
       tb.i = p0.f;
       tb.j = p0.c;
       if (p0.a != null) {
          return;
       }
       j b = tb.b;
       j c = tb.c;
       t0 ot0 = new t0(this, p0);
       if (!PatchProxy.applyVoidThreeRefs(b, c, ot0, null, b.class, "4")) {
          b$a a = b.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidThreeRefs(b, c, ot0, a, b$a.class, "4") && (b != null && c != null)) {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (!mE.isLogined()) {
                String str = b.getString(R.string.arg_RES_7f103076);
                a.o(str, "act.getString\(R.string.login_prompt_comment\)");
                d.a(-1712118428).ne(b, c.getFullSource(), "photo_comment", 8, str, c.mEntity, null, null, new a(ot0)).h();
             }else {
                ot0.run();
             }
          }
       }
       return;
    }
    public void c(BaseEditorFragment$h p0){
    }
    public void d(BaseEditorFragment$m p0){
    }
    public void e(BaseEditorFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       if (p0.a == null && (!TextUtils.x(p0.c) || (p0.e != null || p0.f != null))) {
          i tb = this.b;
          tb.b(tb.c, p0.c, p0.b, this.a);
       }
       return;
    }
}
