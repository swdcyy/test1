package com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$b;
import g9c.a;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$c;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem;
import java.lang.CharSequence;
import android.widget.TextView;
import d61.v;
import android.text.TextPaint;
import android.view.ViewGroup$LayoutParams;
import ekd.k1;
import com.yxcorp.utility.TextUtils;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.View;
import ug1.i0;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import i2b.a;

public class LiveGiftNumberNewSelectDialog$b extends a	// class@001131
{
    public final Typeface g;
    public final LiveGiftNumberNewSelectDialog h;

    public void LiveGiftNumberNewSelectDialog$b(LiveGiftNumberNewSelectDialog p0){
       this.h = p0;
       super();
       this.g = d0.a("alte-din.ttf", a.a().a());
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveGiftNumberNewSelectDialog$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (super.getItemCount() + 1);
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       LiveGiftNumberNewSelectDialog$b uob = LiveGiftNumberNewSelectDialog$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem liveGiftBatc = this.N0(p1);
          if (liveGiftBatc != null && !liveGiftBatc.isGiftBatchNumberItemInvalid()) {
             p0.b.setText(liveGiftBatc.mGiftBatchDisplayText);
             if (v.a(liveGiftBatc.mGiftBatchDisplayText)) {
                p0.b.setTypeface(this.g);
             }else {
                boolean b = true;
                p0.b.getPaint().setFakeBoldText(b);
                p0.b.setTextSize(b, 14.00f);
             }
             ViewGroup$LayoutParams layoutParams = p0.b.getLayoutParams();
             int i = 8;
             if (k1.h()) {
                p0.c.setText(liveGiftBatc.mGiftBatchCountDescription);
                if (TextUtils.x(liveGiftBatc.mLabel)) {
                   p0.d.setVisibility(i);
                }else {
                   p0.d.setVisibility(0);
                   p0.d.setText(liveGiftBatc.mLabel);
                   b uob1 = new b();
                   uob1.v(a1.a(R.color.arg_RES_7f060535));
                   uob1.g(KwaiRadiusStyles.R2);
                   p0.d.setBackground(uob1.a());
                }
                layoutParams.width = a1.d(0x7f07088f);
             }else {
                p0.c.setVisibility(i);
                p0.d.setVisibility(i);
                layoutParams.width = -1;
             }
             p0.b.setLayoutParams(layoutParams);
             KwaiRadiusStyles kwaiRadiusSt = null;
             if (!p1) {
                kwaiRadiusSt = KwaiRadiusStyles.TL8_TR8;
             }
             this.h.Ah(p0.itemView, R.color.arg_RES_7f062030, kwaiRadiusSt);
             p0.itemView.setOnClickListener(new i0(this, liveGiftBatc));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveGiftNumberNewSelectDialog$c uoc;
       LiveGiftNumberNewSelectDialog$b uob = LiveGiftNumberNewSelectDialog$b.class;
       if (PatchProxy.isSupport(uob)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uoc != PatchProxyResult.class) {
          label_002a :
             return uoc;
          }
       }
       uoc = new LiveGiftNumberNewSelectDialog$c(a.d(p0.getContext(), 0x7f0d0ceb, p0, false));
       goto label_002a ;
    }
}
