package com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView$d;
import java.lang.Integer;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackPrize;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import d61.f0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.view.View;
import i2b.a;

public class LiveSurpriseRedPackGiftListView$c extends RecyclerView$Adapter	// class@000fbb
{
    public List e;
    public final LiveSurpriseRedPackGiftListView f;

    public void LiveSurpriseRedPackGiftListView$c(LiveSurpriseRedPackGiftListView p0){
       this.f = p0;
       super();
       this.e = new ArrayList();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveSurpriseRedPackGiftListView$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       String str;
       LiveSurpriseRedPackGiftListView$c uoc = LiveSurpriseRedPackGiftListView$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          LiveRedPackPrize liveRedPackP = this.e.get(p1);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(liveRedPackP, p0, LiveSurpriseRedPackGiftListView$d.class, "2")) {
             if (!q.f(liveRedPackP.mPicUrl)) {
                p0.b.P(liveRedPackP.mPicUrl);
             }
             LiveSurpriseRedPackGiftListView$d c = p0.c;
             if (c != null) {
                f0.i(c, p0.d.getContext());
                if (liveRedPackP.mCount <= null && TextUtils.x(p0.d.g)) {
                   p0.c.setVisibility(8);
                }else if(TextUtils.x(p0.d.g)){
                   str = String.valueOf(liveRedPackP.mCount);
                }else {
                   str = p0.d.g+liveRedPackP.mCount;
                }
                p0.c.setText(str);
                p0.c.setVisibility(0);
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveSurpriseRedPackGiftListView$d uod;
       LiveSurpriseRedPackGiftListView$c uoc = LiveSurpriseRedPackGiftListView$c.class;
       if (PatchProxy.isSupport(uoc)) {
          uod = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (uod != PatchProxyResult.class) {
          label_0026 :
             return uod;
          }
       }
       uoc = this.f;
       uod = new LiveSurpriseRedPackGiftListView$d(uoc, a.i(p0, uoc.f));
       goto label_0026 ;
    }
}
