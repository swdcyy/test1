package com.yxcorp.gifshow.bubble.b$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.bubble.a;
import java.lang.Integer;
import o07.o;

public class b$a implements PopupInterface$h	// class@001c74
{
    public final PostBubbleManager$c b;
    public final b c;

    public void b$a(b p0,PostBubbleManager$c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a tc = this.c;
       tc.k = p0;
       this.b.b(tc, p0);
       return;
    }
    public void H(c p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       uoa = this.c;
       uoa.k = null;
       this.b.a(uoa, p0, p1);
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
