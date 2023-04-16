package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftListView$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftListView;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftListView$b;
import java.lang.Integer;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketGiftInfo;
import java.util.Objects;
import android.graphics.Bitmap;
import cm1.a;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.models.Gift;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.Context;
import android.widget.TextView;
import d61.f0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.view.View;
import i2b.a;

public class LiveFellowRedPacketGiftListView$a extends RecyclerView$Adapter	// class@000ec4
{
    public List e;
    public final LiveFellowRedPacketGiftListView f;

    public void LiveFellowRedPacketGiftListView$a(LiveFellowRedPacketGiftListView p0){
       this.f = p0;
       super();
       this.e = new ArrayList();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketGiftListView$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       String str1;
       LiveFellowRedPacketGiftListView$a uoa = LiveFellowRedPacketGiftListView$a.class;
       String str = "2";
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, str)) {
          LiveFellowRedPacketGiftInfo liveFellowRe = this.e.get(p1);
          Objects.requireNonNull(p0);
          LiveFellowRedPacketGiftListView$b uob = LiveFellowRedPacketGiftListView$b.class;
          if (!PatchProxy.applyVoidOneRefs(liveFellowRe, p0, uob, str)) {
             LiveFellowRedPacketGiftInfo mGiftId = liveFellowRe.mGiftId;
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mGiftId), p0, uob, "3")) {
                Bitmap uBitmap = a.b(mGiftId);
                if (uBitmap != null) {
                   p0.b.setImageDrawable(new BitmapDrawable(p0.d.getResources(), uBitmap));
                }else {
                   Gift gift = a.a(mGiftId);
                   if (gift != null) {
                      Gift mImageUrl = gift.mImageUrl;
                      if (mImageUrl != null && !mImageUrl.isEmpty()) {
                         p0.b.P(gift.mImageUrl);
                      }
                   }
                }
             }
             uob = p0.c;
             if (uob != null) {
                f0.i(uob, p0.d.getContext());
                if (liveFellowRe.mGiftCount <= null && TextUtils.x(p0.d.g)) {
                   p0.c.setVisibility(8);
                }else if(TextUtils.x(p0.d.g)){
                   str1 = String.valueOf(liveFellowRe.mGiftCount);
                }else {
                   str1 = p0.d.g+liveFellowRe.mGiftCount;
                }
                p0.c.setText(str1);
                p0.c.setVisibility(0);
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveFellowRedPacketGiftListView$b uob;
       LiveFellowRedPacketGiftListView$a uoa = LiveFellowRedPacketGiftListView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uob != PatchProxyResult.class) {
          label_0026 :
             return uob;
          }
       }
       uoa = this.f;
       uob = new LiveFellowRedPacketGiftListView$b(uoa, a.i(p0, uoa.f));
       goto label_0026 ;
    }
}
