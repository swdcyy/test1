package com.yxcorp.plugin.setting.entries.holder.h$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.plugin.setting.entries.holder.h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.plugin.setting.entries.holder.g$a;
import com.yxcorp.plugin.setting.entries.holder.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import o07.o;

public class h$a implements PopupInterface$h	// class@00085b
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
    }
    public void H(c p0,int p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       h c = this.b.c;
       c.R8(c.r.a, c.p);
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
