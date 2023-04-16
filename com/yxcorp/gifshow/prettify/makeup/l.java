package com.yxcorp.gifshow.prettify.makeup.l;
import com.yxcorp.gifshow.prettify.makeup.a;
import p0c.f;
import hka.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import g9c.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import java.util.List;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.makeup.a$b;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import bld.b;
import lnc.a1;
import bld.c;
import n1c.i;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import com.yxcorp.gifshow.prettify.makeup.i;
import com.yxcorp.gifshow.model.CDNUrl;
import android.graphics.Typeface;
import android.view.View;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import f1c.g0;
import android.view.View$OnClickListener;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;

public class l extends a	// class@00118b
{
    public int j;

    public void l(f p0,h p1){
       super(p0, p1);
    }
    public int Z0(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.k();
    }
    public MakeupMaterial g1(){
       Object obj = PatchProxy.apply(null, this, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N0(this.j);
    }
    public int h1(){
       return this.j;
    }
    public void i1(MakeupPart p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       this.W0(p0.getMaterials());
       this.j = p0.getSelectMaterial().getPosition();
       this.k0();
       return;
    }
    public void j1(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol, "3")) {
          return;
       }
       ol = this.j;
       if (p0 != ol) {
          this.j = p0;
          Boolean fALSE = Boolean.FALSE;
          this.m0(ol, fALSE);
          this.m0(this.j, fALSE);
          a tg = this.g;
          if (tg != null) {
             tg.b(this.N0(p0));
          }
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a$b c;
       l ol = l.class;
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ol, "2")) {
          MakeupMaterial makeupMateri = this.N0(p1);
          if (makeupMateri != null) {
             int i = 8;
             boolean b = false;
             if (MakeupMaterial.isEmpty(makeupMateri.mId)) {
                p0.d.setText(R.string.arg_RES_7f1039a6);
                p0.e.setVisibility(i);
                p0.b.setImageResource(R.drawable.prettify_common_icon_none);
                if (this.i.b()) {
                   b uob = new b();
                   uob.v(a1.a(R.color.arg_RES_7f06203b));
                   uob.g(i.e());
                   p0.b.setBackground(uob.a());
                }else {
                   p0.b.setBackgroundResource(R.drawable.arg_RES_7f081d2a);
                }
             }else {
                p0.d.setText(makeupMateri.mName);
                c = p0.e;
                if (!i.n(makeupMateri) || !i.p(makeupMateri)) {
                   i = 0;
                }
                c.setVisibility(i);
                this.d1(p0.b, makeupMateri.mImages);
             }
             if (p1 == this.j) {
                b = true;
             }
             p0.b.setSelected(b);
             p0.d.setSelected(b);
             a ti = this.i;
             if (ti == null || !ti.b()) {
                p0.d.setTypeface(null, b);
             }
             c = p0.c;
             if (c != null) {
                c.setSelected(b);
             }
             c = p0.g;
             if (c != null) {
                c.setSelected(b);
             }
             this.e1(p0.g, makeupMateri.getBottomMaskText(), makeupMateri.getBottomMaskColor(), makeupMateri.getBottomMastSecondColor(), false);
             p0.itemView.setOnClickListener(new g0(this, makeupMateri, p1, p0));
             MakeupMaterial mItemNameSty = makeupMateri.mItemNameStyle;
             a$b d = p0.d;
             if (!PatchProxy.applyVoidTwoRefs(mItemNameSty, d, this, ol, "7") && this.i.b()) {
                d.setTextColor(i.d(mItemNameSty));
                b uob1 = new b();
                uob1.v(i.c(mItemNameSty));
                uob1.g(i.a());
                d.setBackground(uob1.a());
             }
          }
       }
       return;
    }
}
