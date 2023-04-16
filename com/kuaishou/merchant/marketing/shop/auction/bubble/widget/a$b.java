package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$b;
import ml8.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import bs3.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.Typeface;
import ot3.p0;

public class a$b extends RecyclerView$ViewHolder implements d	// class@001b8a
{
    public KwaiImageView b;
    public TextView c;
    public TextView d;

    public void a$b(View p0){
       super(p0);
       this.doBindView(p0);
    }
    public void a(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.b.U(p0.e);
          this.c.setText(p0.b);
          Object[] objArray = new Object[]{p0.d};
          this.d.setText(String.format("гд%s", objArray));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a028a);
       this.c = m1.f(p0, 0x7f0a0293);
       TextView textView = m1.f(p0, R.id.auction_bid_price);
       this.d = textView;
       textView.setTypeface(p0.l());
       return;
    }
}
