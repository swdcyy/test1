package com.kuaishou.live.common.core.component.gift.album.c$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.common.core.component.gift.album.c;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.album.b;
import android.view.View$OnClickListener;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveGiftGroupItemViewData;
import com.yxcorp.gifshow.models.Gift;
import rm1.f;
import java.lang.CharSequence;
import java.util.Set;
import com.kuaishou.live.common.core.component.gift.album.c$c;
import java.lang.Boolean;

public class c$a extends RecyclerView$ViewHolder	// class@00113d
{
    public final KwaiImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final c e;

    public void c$a(c p0,View p1){
       this.e = p0;
       super(p1);
       this.a = p1.findViewById(0x7f0a1d03);
       this.b = p1.findViewById(0x7f0a1d05);
       this.c = p1.findViewById(0x7f0a1d02);
       this.d = p1.findViewById(0x7f0a1d04);
       if (PatchProxy.applyVoidOneRefs(p1, this, c$a.class, "1")) {
       }else {
          p1.setOnClickListener(new b(this));
       }
       return;
    }
    public void a(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       GiftPanelItem giftPanelIte = this.e.e.get(p0);
       if (giftPanelIte == null) {
          return;
       }
       LiveGiftGroupItemViewData giftGroupIte = giftPanelIte.getGiftGroupItemViewData();
       if (giftGroupIte == null) {
          Gift gift = giftPanelIte.getGift();
          if (gift != null) {
             f.a(this.a, gift.mImageUrl);
             this.b.setText(gift.mName);
             this.c.setText(gift.mGiftTypeName);
          }
       }else {
          f.a(this.a, giftGroupIte.iconUrls);
          this.b.setText(giftGroupIte.a());
          this.c.setText(giftGroupIte.desc);
       }
       c$a te = this.e;
       c g = te.g;
       if (g != null) {
          g.b(giftPanelIte, p0, (te.f.contains(giftPanelIte) ^ 0x01));
       }
       this.e.f.add(giftPanelIte);
       return;
    }
    public void b(GiftPanelItem p0,int p1,boolean p2){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, c$a.class, "3")) {
          return;
       }
       this.d.setVisibility(0);
       this.itemView.setSelected(true);
       c g = this.e.g;
       if (g != null) {
          g.a(p0, p1, p2);
       }
       return;
    }
}
