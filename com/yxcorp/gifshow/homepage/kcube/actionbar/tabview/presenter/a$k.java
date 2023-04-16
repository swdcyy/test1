package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$k;
import erd.g;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import wq6.g;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import on5.b;
import ro5.u;
import pr6.d;
import z1.a;
import ro5.c0;
import zq6.b;
import wq6.f;
import bo5.a;
import zq6.p;
import wn5.b;
import java.lang.CharSequence;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import android.view.View;

public final class a$k implements g	// class@00171e
{
    public final a b;

    public void a$k(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$k.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a.class, "4")) {
             a s = p0.s;
             String str = "containerController";
             if (s == null) {
                a.S(str);
             }
             p0.v = s.x("ato_operate");
             s = p0.r;
             String str1 = "kcubeTab";
             if (s == null) {
                a.S(str1);
             }
             TabIdentifier d = b.d;
             if (a.g(s.M2(), d)) {
                s = p0.u;
                if (s == null) {
                   a.S("fragmentWrapper");
                }
                c0.c(s, d, new u(R.string.arg_RES_7f102f5f));
             }
             s = p0.s;
             if (s == null) {
                a.S(str);
             }
             b uob = s.y();
             a r = p0.r;
             if (r == null) {
                a.S(str1);
             }
             p s1 = a.s;
             a.o(s1, "HomeTopStateId.TAB_TEXT");
             uob = uob.e(r, s1);
             if (uob != null) {
                a s2 = p0.s;
                if (s2 == null) {
                   a.S(str);
                }
                String str2 = uob.d(s2.x("ato_operate"));
                p0.B.setText(str2);
                p0.B.setContentDescription(str2);
             }
          }
       }
       return;
    }
}
