package com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$c;
import pn9.g$a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import jn9.b;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import jn9.e;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import mn9.a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$c$a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;

public final class PostListComponentView$c implements g$a	// class@0011cc
{
    public final PostListComponentView a;
    public final b b;

    public void PostListComponentView$c(PostListComponentView p0,b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,b p1,View p2){
       String str;
       e f;
       if (PatchProxy.isSupport(PostListComponentView$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, PostListComponentView$c.class, "1")) {
          return;
       }
       a.p(p1, "item");
       a.p(p2, "itemView");
       PostListComponentView g = this.a.g;
       if (g != null) {
          e c = g.c;
          if (c != null) {
             if (g != null) {
                str = g.b();
                if (str != null) {
                label_0039 :
                   if (c.a(p1, p2, str) == true) {
                      return;
                   }
                }
             }
             str = "";
             goto label_0039 ;
          }
       }
       g = this.a.g;
       if (g != null) {
          g.a().a(p1, p2, g.b());
       }
       if (p1.d() && p1.g().i()) {
          this.b.I(p0);
          k1.r(new PostListComponentView$c$a(this, p1, p2), 0);
       }else {
          PostListComponentView$c tb = this.b;
          PostListComponentView g1 = this.a.g;
          if (g1 != null) {
             f = g1.f;
             if (f != null) {
             label_0082 :
                b.E(tb, p0, false, f, 2, null);
             }
          }
          f = SelectScrollOption.NONE;
          goto label_0082 ;
       }
       return;
    }
}
