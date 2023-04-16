package com.yxcorp.gifshow.prettify.makeup.q;
import g9c.a;
import p0c.f;
import hka.h;
import com.yxcorp.gifshow.prettify.widget.RecycleViewWithIndicator;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.makeup.q$a;
import java.lang.Integer;
import xyb.a;
import w46.b;
import java.lang.CharSequence;
import android.widget.RadioButton;
import android.view.View;
import lnc.a1;
import android.graphics.Typeface;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import f1c.o0;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;

public class q extends a	// class@001194
{
    public f g;
    public h h;
    public MakeupSuite i;
    public int j;
    public RecycleViewWithIndicator k;
    public Runnable l;
    public int m;

    public void q(f p0,h p1,RecycleViewWithIndicator p2){
       super();
       this.m = -1;
       this.g = p0;
       this.h = p1;
       this.k = p2;
    }
    public MakeupSuite X0(){
       return this.i;
    }
    public void Y0(MakeupPart p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "3")) {
          return;
       }
       q th = this.h;
       if (th != null) {
          th.b(p0);
       }
       return;
    }
    public void Z0(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "5")) {
          return;
       }
       this.i = p0;
       this.j = p0.getSelectedPart().getPosition();
       this.k.l();
       this.k0();
       q tl = this.l;
       if (tl != null) {
          tl.run();
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       q$a a;
       q oq = q.class;
       if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oq, "2")) {
          MakeupPart makeupPart = this.N0(p1);
          int i = 0;
          if (makeupPart == null) {
             Object[] objArray = new Object[i];
             a.D().t("MakeupPartsTabAdapter", "onBindViewHolderError", objArray);
          }else {
             p0.a.setText(makeupPart.mName);
             boolean b = true;
             boolean b1 = (p1 == this.j)? true: false;
             this.k.n(p0.itemView, p1, b1);
             p0.a.clearAnimation();
             p0.b.clearAnimation();
             a = p0.a;
             float f = (b1)? 0x3f800000: 0x3f051eb8;
             a.setAlpha(f);
             a = p0.a;
             f = (b1)? 17.00f: 16.00f;
             a.setTextSize(i, (float)a1.e(f));
             a = p0.a;
             Typeface dEFAULT_BOLD = (b1)? Typeface.DEFAULT_BOLD: Typeface.DEFAULT;
             a.setTypeface(dEFAULT_BOLD);
             a = p0.b;
             if (!b1) {
                MakeupSuite obj = PatchProxy.applyOneRefs(makeupPart, this, oq, "7");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   obj = this.X0();
                   if (obj != null) {
                      b = obj.partInPresetState(makeupPart, this.g.a());
                   }
                }
                if (!b) {
                label_00a3 :
                   a.setVisibility(i);
                   p0.a.setOnClickListener(new o0(this, p1, makeupPart));
                }
             }
             i = 4;
             goto label_00a3 ;
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       q$a uoa;
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oq, "1");
          if (uoa != PatchProxyResult.class) {
          label_002b :
             return uoa;
          }
       }
       uoa = new q$a(a.d(p0.getContext(), this.g.n, p0, false));
       goto label_002b ;
    }
}
