package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Integer;
import bs3.a$a;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$f;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$b;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$d$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$c;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import xm4.a;

public class a$d extends RecyclerView$Adapter	// class@001b8d
{
    public List e;
    public AbstractAuctionBubble$a f;
    public final a g;

    public void a$d(a p0){
       this.g = p0;
       super();
       this.e = new ArrayList();
    }
    public int f0(int p0){
       p0 = (!p0)? 0: 1;
       return p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a$d uod = a$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "3")) {
          return;
       }
       a$a uoa = this.e.get(p1);
       if (uoa != null) {
          if (p0 instanceof a$f) {
             p0.a(uoa);
             p0.b.setOnClickListener(new a$d$a(this, uoa));
          }else if(p0 instanceof a$c){
             p0.a(uoa);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$d uod = a$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1) {
          return new a$c(a.c(p0.getContext(), 0x7f0d012d, p0, false));
       }else {
          return new a$f(a.c(p0.getContext(), 0x7f0d012f, p0, false));
       }
    }
}
