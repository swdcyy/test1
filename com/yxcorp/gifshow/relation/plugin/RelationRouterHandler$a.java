package com.yxcorp.gifshow.relation.plugin.RelationRouterHandler$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.plugin.RelationRouterHandler;
import qh7.c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import yh7.a;

public class RelationRouterHandler$a implements PopupInterface$h	// class@001935
{
    public final c b;
    public final RelationRouterHandler c;

    public void RelationRouterHandler$a(RelationRouterHandler p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       RelationRouterHandler$a uoa = RelationRouterHandler$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1) {
          this.b.a(new a(200));
       }
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
