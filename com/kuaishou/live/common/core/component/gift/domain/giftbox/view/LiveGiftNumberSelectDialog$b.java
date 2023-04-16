package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$b;
import g9c.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem;
import java.lang.CharSequence;
import android.widget.TextView;
import d61.v;
import android.text.TextPaint;
import ekd.k1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.b;
import android.graphics.Color;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public class LiveGiftNumberSelectDialog$b extends a	// class@001222
{
    public final Typeface g;
    public final LiveGiftNumberSelectDialog h;

    public void LiveGiftNumberSelectDialog$b(LiveGiftNumberSelectDialog p0){
       this.h = p0;
       super();
       this.g = d0.a("alte-din.ttf", a.a().a());
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       KwaiRadiusStyles tL8_TR8;
       LiveGiftNumberSelectDialog$b uob = LiveGiftNumberSelectDialog$b.class;
       String str = "2";
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, str)) {
          LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem liveGiftBatc = this.N0(p1);
          if (liveGiftBatc != null && !liveGiftBatc.isGiftBatchNumberItemInvalid()) {
             p0.b.setText(liveGiftBatc.mGiftBatchDisplayText);
             if (v.a(liveGiftBatc.mGiftBatchDisplayText)) {
                p0.b.setTypeface(this.g);
             }else {
                p0.b.getPaint().setFakeBoldText(1);
                p0.b.setTextSize(1, 14.00f);
             }
             if (k1.h()) {
                p0.c.setText(liveGiftBatc.mGiftBatchCountDescription);
             }else {
                p0.c.setVisibility(8);
             }
             Object[] objArray = null;
             if (!p1) {
                tL8_TR8 = KwaiRadiusStyles.TL8_TR8;
             }else if(p1 == (this.getItemCount() - 1)){
                tL8_TR8 = KwaiRadiusStyles.BL8_BR8;
             }else {
                tL8_TR8 = objArray;
             }
             b uob1 = new b();
             String str1 = (liveGiftBatc.mIsEditGiftCountItem != null)? "#F0F0F0": "#f8f8f8";
             uob1.p(Color.parseColor(str1), Color.parseColor("#00000000"));
             if (tL8_TR8 != null) {
                uob1.g(tL8_TR8);
             }
             p0.itemView.setBackground(uob1.a());
             if (p1 == (this.getItemCount() - 1)) {
                p0.d.setVisibility(8);
             }
             int i = this.getItemCount() - 1;
             if (p1 != i || (liveGiftBatc.mIsEditGiftCountItem != null && !PatchProxy.applyVoid(objArray, p0, LiveGiftNumberSelectDialog$c.class, str))) {
                View[] viewArray = new View[]{p0.b,p0.c};
                n.Z(8, viewArray);
                viewArray = new View[]{p0.e};
                n.Z(0, viewArray);
             }
          label_00d7 :
             p0.itemView.setOnClickListener(new a(this, p1, i, liveGiftBatc));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveGiftNumberSelectDialog$c uoc;
       LiveGiftNumberSelectDialog$b uob = LiveGiftNumberSelectDialog$b.class;
       if (PatchProxy.isSupport(uob)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uoc != PatchProxyResult.class) {
          label_002a :
             return uoc;
          }
       }
       uoc = new LiveGiftNumberSelectDialog$c(a.d(p0.getContext(), 0x7f0d0ce9, p0, false));
       goto label_002a ;
    }
}
