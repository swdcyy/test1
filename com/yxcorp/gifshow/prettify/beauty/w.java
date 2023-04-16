package com.yxcorp.gifshow.prettify.beauty.w;
import g9c.a;
import com.yxcorp.gifshow.prettify.beauty.w$b;
import nsd.u;
import com.yxcorp.gifshow.prettify.widget.RecycleViewWithIndicator;
import com.yxcorp.gifshow.prettify.beauty.w$c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import h16.l;
import com.yxcorp.gifshow.prettify.beauty.w$d;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.beauty.w$a;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import android.content.Context;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.widget.RadioButton;
import android.graphics.Typeface;
import q0c.u1;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import i2b.a;

public final class w extends a	// class@001128
{
    public int g;
    public final RecycleViewWithIndicator h;
    public final w$c i;
    public final boolean j;
    public static final w$b k;

    static {
       w.k = new w$b(null);
    }
    public void w(RecycleViewWithIndicator p0,w$c p1,boolean p2){
       a.p(p0, "mRecyclerWithIndicator");
       a.p(p1, "mPartTabChangeListener");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       p0.l();
    }
    public final void X0(int p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ow, "3")) {
          return;
       }
       this.Y0(p0, true);
       return;
    }
    public final void Y0(int p0,boolean p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ow, "4")) {
          return;
       }
       w tg = this.g;
       if (p0 != tg) {
          this.g = p0;
          this.l0(tg);
          this.l0(p0);
          if (!PatchProxy.isSupport(ow) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ow, "5")) {
             l ol = this.N0(p0);
             if (ol != null) {
                a.o(ol, "it");
                this.i.a(ol, p1);
             }
          }
       }else {
          f.E(new w$d(this), 10);
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       w$a a;
       int i1;
       float f1;
       w ow = w.class;
       if (!PatchProxy.isSupport(ow) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ow, "2")) {
          a.p(p0, "holder");
          l ol = this.N0(p1);
          if (ol != null) {
             a.o(ol, "getItem\(position\) ?: return");
             int i = 0;
             boolean b = (p1 == this.g)? true: false;
             this.h.n(p0.itemView, p1, b);
             a = p0.a;
             if (a != null) {
                String str = PatchProxy.applyOneRefs(ol, this, ow, "6");
                if (str != PatchProxyResult.class) {
                }else if(ol.a()){
                   str = a1.p(ol.a());
                }else if(!TextUtils.x(ol.b())){
                   Context uContext = a1.c();
                   a.o(uContext, "CommonUtil.context\(\)");
                   i1 = a1.m().getIdentifier(ol.b(), "string", uContext.getPackageName());
                   if (i1) {
                      ol.h = i1;
                      str = a1.p(i1);
                   }
                }
                str = ol.b;
                if (!str.length()) {
                   f1 = 1;
                }
                if (f1) {
                   str = "";
                }
                a.setText(str);
                a.clearAnimation();
                float f = (b)? 0x3f800000: 0x3f051eb8;
                a.setAlpha(f);
                i1 = 2;
                f1 = (b)? 17.00f: 16.00f;
                a.setTextSize(i1, f1);
                Typeface dEFAULT_BOLD = (b)? Typeface.DEFAULT_BOLD: Typeface.DEFAULT;
                a.setTypeface(dEFAULT_BOLD);
                a.setOnClickListener(new u1(this, ol, b, p1));
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       w$a uoa;
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ow, "1");
          if (uoa != PatchProxyResult.class) {
          label_003c :
             return uoa;
          }
       }
       a.p(p0, "parent");
       Context context = p0.getContext();
       int i = (this.j != null)? 0x7f0d12ce: 0x7f0d12cd;
       View view = a.d(context, i, p0, false);
       a.o(view, "item");
       uoa = new w$a(this, view);
       goto label_003c ;
    }
}
