package com.yxcorp.plugin.setting.entries.holder.g$a$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.plugin.setting.entries.holder.g$a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import o07.o;

public class g$a$b implements PopupInterface$h	// class@000854
{
    public final g$a b;

    public void g$a$b(g$a p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
    }
    public void H(c p0,int p1){
       g$a$b uoa$b = g$a$b.class;
       if (PatchProxy.isSupport(uoa$b) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa$b, "1")) {
          return;
       }
       if (p1 != 3) {
          p0.p = (QCurrentUser.ME.isNotRecommendToContacts() ^ 0x01) ^ QCurrentUser.ME.isRecommendToOthers();
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
