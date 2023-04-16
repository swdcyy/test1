package com.kuaishou.live.common.core.component.gift.album.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.gift.album.c$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.album.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;

public class b extends m	// class@00113c
{
    public final c$a c;

    public void b(c$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       int adapterPosit = this.c.getAdapterPosition();
       if (adapterPosit < 0) {
          b.Z(LiveLogTag.LIVE_GIFT_BOX_ALBUM, "illegal navigation bar click position");
          return;
       }else {
          c$a e = this.c.e;
          c i = e.i;
          if (i != -1 && i != adapterPosit) {
             e.l0(i);
          }
          e = this.c.e;
          e.i = adapterPosit;
          if (!q.f(e.e) && adapterPosit < this.c.e.e.size()) {
             b tc = this.c;
             tc.b(tc.e.e.get(adapterPosit), adapterPosit, true);
          }
          return;
       }
    }
}
