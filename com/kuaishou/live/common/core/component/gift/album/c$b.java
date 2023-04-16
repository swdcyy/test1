package com.kuaishou.live.common.core.component.gift.album.c$b;
import com.kuaishou.live.common.core.component.gift.album.c$a;
import com.kuaishou.live.common.core.component.gift.album.c;
import android.view.View;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.util.Set;
import com.kuaishou.live.common.core.component.gift.album.c$c;
import rm1.f;
import java.util.Collection;
import ekd.q;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;

public class c$b extends c$a	// class@00113e
{
    public final List f;
    public final c g;

    public void c$b(c p0,View p1,List p2){
       this.g = p0;
       super(p0, p1);
       this.f = p2;
    }
    public void a(int p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       GiftPanelItem giftPanelIte = this.g.e.get(p0);
       if (giftPanelIte == null) {
          return;
       }
       c$b tg = this.g;
       c g = tg.g;
       if (g != null) {
          g.b(giftPanelIte, p0, tg.f.contains(giftPanelIte));
       }
       this.g.f.add(giftPanelIte);
       List list = f.i(giftPanelIte);
       if (q.f(list)) {
          list = this.f;
       }
       if (q.f(list)) {
          this.a.setImageDrawable(null);
       }else {
          f.a(this.a, list);
       }
       this.b.setText(R.string.arg_RES_7f10203e);
       this.b.setTextColor(a1.a(R.color.arg_RES_7f0620e9));
       this.c.setText("");
       return;
    }
}
