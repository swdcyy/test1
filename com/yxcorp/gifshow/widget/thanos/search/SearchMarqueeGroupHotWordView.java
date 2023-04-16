package com.yxcorp.gifshow.widget.thanos.search.SearchMarqueeGroupHotWordView;
import szc.k;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.widget.thanos.search.SearchHotWordMarqueeTextView;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Float;
import java.lang.Math;
import ekd.y0;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;

public class SearchMarqueeGroupHotWordView extends FrameLayout implements k	// class@0019d6
{
    public float b;
    public float c;
    public View d;
    public View e;
    public SearchHotWordMarqueeTextView f;
    public SearchHotWordMarqueeTextView g;
    public y0 h;
    public float i;
    public float j;

    public void SearchMarqueeGroupHotWordView(Context p0){
       super(p0, null);
    }
    public void SearchMarqueeGroupHotWordView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SearchMarqueeGroupHotWordView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f800000;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchMarqueeGroupHotWordView.class, "1")) {
       }else {
          a.d(p0, R.layout.arg_RES_7f0d05ec, this, true);
          this.d = this.findViewById(0x7f0a3a31);
          this.f = this.findViewById(0x7f0a3a33);
          this.e = this.findViewById(0x7f0a3a32);
          this.g = this.findViewById(0x7f0a3a34);
          this.i = ((c.c(p0.getResources()).density * 0x41f00000) * 16.00f) / 1000.00f;
       }
       return;
    }
    public void a(float p0,float p1){
       if (PatchProxy.isSupport(SearchMarqueeGroupHotWordView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, SearchMarqueeGroupHotWordView.class, "7")) {
          return;
       }
       float f = 0x3f800000;
       this.b = (p0 - p1 >= 0)? Math.min(f, ((p0 - p1) / (f - p1))): 0;
       this.c = (p0 - p1 < 0)? f - Math.min(f, (p0 / p1)): 0;
       this.b();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SearchMarqueeGroupHotWordView.class, "9")) {
          return;
       }
       this.f.setAlpha(this.b);
       this.d.setAlpha(this.b);
       this.g.setAlpha(this.c);
       this.e.setAlpha(this.c);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, SearchMarqueeGroupHotWordView.class, "5")) {
          return;
       }
       SearchMarqueeGroupHotWordView th = this.h;
       if (th != null) {
          th.e();
       }
       this.f.r();
       this.g.r();
       this.j = 0;
       return;
    }
    public SearchHotWordMarqueeTextView getCurrentMarqueeView(){
       if (!this.b) {
          return this.g;
       }
       return this.f;
    }
    public Pair getMarqueeView(){
       Object obj = PatchProxy.apply(null, this, SearchMarqueeGroupHotWordView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(this.g, this.f);
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(SearchMarqueeGroupHotWordView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SearchMarqueeGroupHotWordView.class, "8")) {
          return;
       }
       this.b = p0;
       this.c = 0x3f800000 - p0;
       this.b();
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchMarqueeGroupHotWordView.class, "4")) {
          return;
       }
       this.f.setMarqueeText(p0);
       this.g.setMarqueeText(p0);
       return;
    }
    public void setTopBackground(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchMarqueeGroupHotWordView.class, "10")) {
          return;
       }
       SearchMarqueeGroupHotWordView td = this.d;
       if (td != null) {
          td.setBackground(p0);
       }
       return;
    }
}
