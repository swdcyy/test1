package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import sja.b;
import java.util.Objects;
import java.lang.Boolean;
import kha.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import jn5.b;
import jn5.a$a;
import lnc.a1;
import jn5.a;
import android.view.View;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$e$a;
import android.view.View$OnClickListener;
import java.lang.Integer;
import o07.o;

public final class FollowFilterGuidePresenter$e implements PopupInterface$h	// class@001237
{
    public final FollowFilterGuidePresenter b;

    public void FollowFilterGuidePresenter$e(FollowFilterGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       b a;
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowFilterGuidePresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       FollowFilterGuidePresenter$e tb = this.b;
       boolean b = true;
       tb.s = b;
       tb.r = p0;
       a = b.a;
       Objects.requireNonNull(a);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, a, uob, "4")) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean(b.d("user")+"has_shown_follow_selector_guide", b);
          g.a(uEditor);
       }
       a$a uoa = new a$a();
       uoa.c(0x27dc);
       uoa.g(2);
       uoa.h(a1.p(R.string.arg_RES_7f101022));
       uoa.d("TopFollow");
       b.a.d(uoa.a());
       View view = p0.z();
       if (view != null) {
          view.setOnClickListener(FollowFilterGuidePresenter$e$a.b);
       }
       return;
    }
    public void H(c p0,int p1){
       FollowFilterGuidePresenter$e uoe = FollowFilterGuidePresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       FollowFilterGuidePresenter$e tb = this.b;
       tb.s = false;
       tb.r = null;
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
