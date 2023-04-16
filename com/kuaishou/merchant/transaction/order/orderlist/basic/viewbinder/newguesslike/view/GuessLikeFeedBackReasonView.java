package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.newguesslike.view.GuessLikeFeedBackReasonView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.TextView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;

public final class GuessLikeFeedBackReasonView extends LinearLayout	// class@00086d
{
    public final MerchantKwaiImageView b;
    public final TextView c;
    public final View d;
    public HashMap e;

    public void GuessLikeFeedBackReasonView(Context p0){
       super(p0, null, 0);
    }
    public void GuessLikeFeedBackReasonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0591, this, true);
       this.b = this.findViewById(0x7f0a0e41);
       this.c = this.findViewById(0x7f0a0e44);
       this.d = this.findViewById(0x7f0a0e42);
    }
    public final void setImage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessLikeFeedBackReasonView.class, "1")) {
          return;
       }
       this.b.L(p0);
       return;
    }
    public final void setLinesetVisibility(int p0){
       if (PatchProxy.isSupport(GuessLikeFeedBackReasonView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuessLikeFeedBackReasonView.class, "3")) {
          return;
       }
       this.d.setVisibility(p0);
       return;
    }
    public final void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessLikeFeedBackReasonView.class, "2")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
}
