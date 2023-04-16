package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftRecyclerView$b;
import java.lang.Integer;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage$GiftInfo;
import java.util.Objects;
import com.yxcorp.gifshow.models.Gift;
import com.yxcorp.gifshow.image.KwaiImageView;
import rm1.f;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.b;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;
import z12.a0;

public class LiveFellowRedPacketGiftRecyclerView$a extends RecyclerView$Adapter	// class@000ec7
{
    public int e;
    public List f;
    public a0 g;

    public void LiveFellowRedPacketGiftRecyclerView$a(){
       super();
       this.e = 0x7f0d0b0b;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketGiftRecyclerView$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (q.f(this.f))? 0: this.f.size();
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       LiveFellowRedPacketGiftRecyclerView$a uoa = LiveFellowRedPacketGiftRecyclerView$a.class;
       if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2") && p1 < this.f.size())) {
          LiveGiftPackage$GiftInfo giftInfo = this.f.get(p1);
          Objects.requireNonNull(p0);
          LiveFellowRedPacketGiftRecyclerView$b uob = LiveFellowRedPacketGiftRecyclerView$b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(giftInfo, Integer.valueOf(p1), p0, uob, "1")) {
             LiveGiftPackage$GiftInfo mGift = giftInfo.mGift;
             if (mGift != null) {
                f.a(p0.b, mGift.mImageUrl);
             }
             p0.c.setText(String.valueOf(giftInfo.mGiftCount));
             p0.itemView.setOnClickListener(new b(p0, giftInfo, p1));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveFellowRedPacketGiftRecyclerView$b uob;
       LiveFellowRedPacketGiftRecyclerView$a uoa = LiveFellowRedPacketGiftRecyclerView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uob != PatchProxyResult.class) {
          label_002b :
             return uob;
          }
       }
       uob = new LiveFellowRedPacketGiftRecyclerView$b(a.d(p0.getContext(), this.e, p0, false), this.g);
       goto label_002b ;
    }
}
