package com.yxcorp.gifshow.share.widget.CardsAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.share.widget.CardsAdapter$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.widget.CardsAdapter$itemWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import lnc.a1;
import com.yxcorp.gifshow.share.widget.CardsAdapter$scale$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import djc.q1;
import java.lang.Integer;
import djc.l;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import djc.b0;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import android.view.ViewTreeObserver;
import djc.m;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import android.view.ViewGroup;
import ekd.p1;

public final class CardsAdapter extends RecyclerView$Adapter	// class@001cb3
{
    public final p e;
    public final float f;
    public final float g;
    public final int h;
    public final p i;
    public final List j;
    public final int k;
    public static final CardsAdapter$a l;

    static {
       CardsAdapter.l = new CardsAdapter$a(null);
    }
    public void CardsAdapter(List p0,int p1){
       a.p(p0, "list");
       super();
       this.j = p0;
       this.k = p1;
       this.e = s.c(CardsAdapter$itemWidth$2.INSTANCE);
       this.f = 0.27f;
       this.g = 0.18f;
       this.h = a1.e(72.00f);
       this.i = s.c(new CardsAdapter$scale$2(this));
    }
    public final int J0(){
       Object obj = PatchProxy.apply(null, this, CardsAdapter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.e.getValue();
       }
       return obj.intValue();
    }
    public final float K0(){
       Object obj = PatchProxy.apply(null, this, CardsAdapter.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = this.i.getValue();
       }
       return obj.floatValue();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, CardsAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.min(5, this.j.size());
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       CardsAdapter uCardsAdapte = CardsAdapter.class;
       if (!PatchProxy.isSupport(uCardsAdapte) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uCardsAdapte, "3")) {
          a.p(p0, "holder");
          l ol = this.j.get(p1);
          p0.a.P(ol.a());
          int i = 8;
          if (TextUtils.x(ol.c())) {
             p0.b().setVisibility(i);
          }else {
             p0.b().setVisibility(0);
             p0.b().setText(ol.c());
             p0.b().setTextSize(1, (this.K0() * 12.00f));
             Integer integer = b0.a(ol.textColor);
             if (integer != null) {
                p0.b().setTextColor(integer.intValue());
             }
          }
          if (ol.b() <= 1) {
             p0.a().setVisibility(i);
          }else {
             p0.a().setVisibility(0);
             p0.a().setTypeface(d0.a("alte-din.ttf", p0.a().getContext()));
             String str = (ol.b() < 100)? String.valueOf(ol.b()): "99+";
             p0.a().setText(str);
             if (!PatchProxy.applyVoidTwoRefs(p0, ol, this, uCardsAdapte, "5")) {
                uCardsAdapte = this.k;
                if (uCardsAdapte != null) {
                   if (uCardsAdapte == 1) {
                      p0.a().getViewTreeObserver().addOnGlobalLayoutListener(new m(this, p0));
                      ViewGroup$LayoutParams layoutParams = p0.a().getLayoutParams();
                      Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                      layoutParams.h = 0;
                      layoutParams.s = 0;
                      layoutParams.k = -1;
                      layoutParams.q = -1;
                      p0.a().setLayoutParams(layoutParams);
                   }
                }else {
                   p0.a().setScaleX(this.K0());
                   p0.a().setScaleY(this.K0());
                   Guideline guideline = p0.itemView.findViewById(R.id.guide_line_horizontal);
                   if (ol.cardCategory == 1) {
                      guideline.setGuidelinePercent(this.f);
                   }else {
                      guideline.setGuidelinePercent(this.g);
                   }
                }
             }
          }
       }
    label_012d :
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       q1 oq1;
       CardsAdapter uCardsAdapte = CardsAdapter.class;
       if (PatchProxy.isSupport(uCardsAdapte)) {
          oq1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uCardsAdapte, "2");
          if (oq1 != PatchProxyResult.class) {
          label_003d :
             return oq1;
          }
       }
       a.p(p0, "parent");
       View view = p1.i(p0, R.layout.arg_RES_7f0d067a, false);
       a.o(view, "itemView");
       ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
       layoutParams.width = this.J0();
       view.setLayoutParams(layoutParams);
       oq1 = new q1(view);
       goto label_003d ;
    }
}
