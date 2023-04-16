package com.yxcorp.gifshow.bubble.e;
import java.lang.Object;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.widget.popup.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.bubble.e$a;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.Enum;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class e	// class@001c7b
{

    public void e(){
       super();
    }
    public static void a(b p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "2")) {
          return;
       }
       if (p1.s() != null) {
          p0.k = p1.X();
          return;
       }else {
          int i = e$a.a[p1.j0().ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   p0.k = (p0.j != null)? p.o(p1): p.m(p1);
                }else if(p0.j != null){
                   p0.k = p.e(p1);
                }else {
                   p0.k = p.c(p1);
                }
             }else if(p0.j != null){
                p0.k = p.l(p1);
             }else {
                p0.k = p.j(p1);
             }
          }else if(p0.j != null){
             p0.k = p.i(p1);
          }else {
             p0.k = p.g(p1);
          }
          return;
       }
    }
}
