package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import ekd.q;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Integer;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$refreshContent$1;
import msd.l;
import trd.y;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$refreshContent$2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$a;
import android.widget.TextView;
import java.lang.CharSequence;
import lnc.a1;
import android.graphics.Typeface;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import ooc.f1;
import java.lang.Math;
import java.lang.StringBuilder;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$d;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$e;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$f;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$b;
import android.view.LayoutInflater;
import ag6.a;

public final class SubtitleTextAdapter extends RecyclerView$Adapter	// class@000af9
{
    public SubtitleTextAdapter$c e;
    public int f;
    public List g;
    public double h;

    public void SubtitleTextAdapter(List p0){
       a.p(p0, "contentList");
       super();
       ArrayList uArrayList = q.b(p0);
       a.o(uArrayList, "CollectionUtils.copyFrom\(contentList\)");
       this.g = uArrayList;
    }
    public static void N0(SubtitleTextAdapter p0,List p1,double p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = -1;
       }
       p0.M0(p1, p2, p3);
       return;
    }
    public final List J0(){
       return this.g;
    }
    public final int K0(){
       return this.f;
    }
    public final SubtitleTextAdapter$c L0(){
       return this.e;
    }
    public final void M0(List p0,double p1,int p2){
       if (PatchProxy.isSupport(SubtitleTextAdapter.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), Integer.valueOf(p2), this, SubtitleTextAdapter.class, "6")) {
          return;
       }
       a.p(p0, "content");
       if (p2 != -1) {
          this.f = p2;
       }
       ArrayList uArrayList = q.b(p0);
       double d = (double)0;
       if (p1 - d > 0) {
          a.o(uArrayList, "copy");
          y.K0(uArrayList, new SubtitleTextAdapter$refreshContent$1(p1));
       }else if(this.h - d > 0){
          a.o(uArrayList, "copy");
          y.K0(uArrayList, new SubtitleTextAdapter$refreshContent$2(this));
       }
       this.h = p1;
       a.o(uArrayList, "copy");
       this.g = uArrayList;
       uArrayList.add(NewTextBaseElementData.Q.a());
       this.k0();
       return;
    }
    public int f0(int p0){
       SubtitleTextAdapter subtitleText = SubtitleTextAdapter.class;
       if (PatchProxy.isSupport(subtitleText)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, subtitleText, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (p0 == (this.g.size() - 1))? 1001: 1002;
       return p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, SubtitleTextAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       String str1;
       int b1;
       int i;
       SubtitleTextAdapter subtitleText = SubtitleTextAdapter.class;
       String str = "4";
       if (PatchProxy.isSupport(subtitleText) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, subtitleText, str)) {
          return;
       }
       a.p(p0, "holder");
       if (!p0 instanceof SubtitleTextAdapter$a) {
          return;
       }
       p0.a().setText(this.g.get(p1).F0());
       if (p1 == this.f) {
          p0.a().setTextColor(a1.a(R.color.arg_RES_7f0620d1));
          p0.a().setTypeface(Typeface.DEFAULT_BOLD);
       }else {
          p0.a().setTextColor(a1.a(R.color.arg_RES_7f0620e9));
          p0.a().setTypeface(Typeface.DEFAULT);
       }
       SubtitleTextAdapter$a b = p0.b;
       double d = this.g.get(p1).m0();
       f1 uof1 = f1.class;
       if (PatchProxy.isSupport(uof1)) {
          str1 = PatchProxy.applyOneRefs(Double.valueOf(d), null, uof1, str);
          if (str1 != PatchProxyResult.class) {
          label_00e7 :
             b.setText(str1);
             View view = p0.c();
             b1 = true;
             i = 0;
             int b2 = (p1 == this.f)? true: false;
             view.setEnabled(b2);
             view = p0.b();
             if (p1 != this.f) {
                b1 = false;
             }
             view.setEnabled(b1);
             view = p0.c();
             b2 = (p1 == this.f)? 0: 4;
             view.setVisibility(b2);
             view = p0.b();
             if (p1 != this.f) {
                i = 4;
             }
             view.setVisibility(i);
             p0.a.setOnClickListener(new SubtitleTextAdapter$d(this, p1));
             p0.b().setOnClickListener(new SubtitleTextAdapter$e(this, p1));
             p0.c().setOnClickListener(new SubtitleTextAdapter$f(this, p1));
             return;
          }
       }
       str1 = 10;
       if ((int)Math.round(((d * 10.00f) % 10.00f)) == str1) {
          d = d + 0x3ff0000000000000;
       }
       double d1 = 60.00f;
       b1 = (int)(d % d1);
       i = (int)(d / d1);
       str = (b1 >= str1)? String.valueOf(b1): "0"+b1;
       str1 = (i >= str1)? String.valueOf(i): "0"+i;
       str1 = str1+":"+str;
       goto label_00e7 ;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       SubtitleTextAdapter subtitleText = SubtitleTextAdapter.class;
       if (PatchProxy.isSupport(subtitleText)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, subtitleText, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "container");
       if (p1 == 1001) {
          View view = new View(p0.getContext());
          view.setLayoutParams(new FrameLayout$LayoutParams(-1, a1.d(R.dimen.arg_RES_7f0703a3)));
          return new SubtitleTextAdapter$b(view);
       }else {
          View view1 = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d157a, p0, false);
          a.o(view1, "LayoutInflater.from\(cont¡­ container, false\n      \)");
          return new SubtitleTextAdapter$a(view1);
       }
    }
}
