package com.yxcorp.gifshow.ad.union.AdUnionShopCardView;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.yxcorp.gifshow.ad.union.AdUnionShopCardView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.ad.union.AdUnionShopCardView$initView$1;
import msd.l;
import lnc.y0;
import com.yxcorp.gifshow.ad.union.AdUnionShopCardView$initView$2;
import com.yxcorp.gifshow.ad.union.AdUnionShopCardView$initView$3;

public final class AdUnionShopCardView extends SelectShapeFrameLayout	// class@00186a
{
    public View c;
    public TextView d;
    public TextView e;
    public KwaiImageView f;
    public View g;
    public AdUnionShopCardView$a h;
    public HashMap i;

    public void AdUnionShopCardView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AdUnionShopCardView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AdUnionShopCardView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0055, this, true);
    }
    public void AdUnionShopCardView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final AdUnionShopCardView$a getMCardClickListener(){
       return this.h;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdUnionShopCardView.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, AdUnionShopCardView.class, "2")) {
          View view = this.findViewById(R.id.go_shop);
          a.o(view, "findViewById\(R.id.go_shop\)");
          this.g = view;
          view = this.findViewById(R.id.shop_title);
          a.o(view, "findViewById\(R.id.shop_title\)");
          this.d = view;
          view = this.findViewById(R.id.shop_card_icon);
          a.o(view, "findViewById\(R.id.shop_card_icon\)");
          this.f = view;
          view = this.findViewById(R.id.shop_subtitle);
          a.o(view, "findViewById\(R.id.shop_subtitle\)");
          this.e = view;
          view = this.findViewById(R.id.shop_close_panel);
          a.o(view, "findViewById\(R.id.shop_close_panel\)");
          this.c = view;
          String str = "mShopCardClose";
          if (view == null) {
             a.S(str);
          }
          view.setBackground(j.j(R.drawable.arg_RES_7f080e80, 1));
          y0.a(this, AdUnionShopCardView$initView$1.INSTANCE);
          AdUnionShopCardView tc = this.c;
          if (tc == null) {
             a.S(str);
          }
          y0.a(tc, new AdUnionShopCardView$initView$2(this));
          tc = this.g;
          if (tc == null) {
             a.S("mGoShop");
          }
          y0.a(tc, new AdUnionShopCardView$initView$3(this));
       }
       return;
    }
    public final void setMCardClickListener(AdUnionShopCardView$a p0){
       this.h = p0;
    }
}
