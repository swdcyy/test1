package com.yxcorp.gifshow.widget.FlattenLyricView;
import com.kwai.library.widget.scrollview.SimpleScrollLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import ekd.d0;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.view.View;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.Lyrics$Line;
import android.widget.TextView;
import java.util.Collections;
import com.yxcorp.gifshow.widget.FlattenLyricView$EmptyLyricsStyle;
import java.lang.StringBuilder;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;
import java.lang.Float;
import java.lang.Boolean;

public class FlattenLyricView extends SimpleScrollLayout	// class@00184c
{
    public boolean A;
    public Lyrics B;
    public int C;
    public int D;
    public LinearLayout E;
    public Typeface F;
    public int G;
    public ColorStateList H;
    public int I;
    public int J;
    public int K;
    public List v;
    public List w;
    public List x;
    public List y;
    public List z;

    public void FlattenLyricView(Context p0,AttributeSet p1){
       int[] ointArray1;
       super(p0, p1);
       this.v = new ArrayList();
       this.w = new ArrayList();
       this.x = new ArrayList();
       this.y = new ArrayList();
       this.z = new ArrayList();
       this.I = -1;
       this.J = -1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FlattenLyricView.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c3);
          this.J = typedArray.getColor(4, -1);
          int color = typedArray.getColor(0, -1);
          this.I = color;
          int[][] ointArray = new int[][2]{ointArray1,ointArray1};
          ointArray1 = new int[]{0x10100a1};
          ointArray1 = new int[0];
          int[] ointArray2 = new int[]{this.J,color};
          this.H = new ColorStateList(ointArray, ointArray2);
          this.G = typedArray.getDimensionPixelSize(8, 30);
          this.K = typedArray.getDimensionPixelSize(7, 30);
          typedArray.recycle();
       }
       this.F = d0.c();
       LinearLayout linearLayout = new LinearLayout(this.getContext());
       this.E = linearLayout;
       linearLayout.setOrientation(1);
       this.E.setPadding(0, 0, 0, this.getContentPaddingBottom());
       this.addView(this.E, -1, -1);
       return;
    }
    private void x(){
       if (PatchProxy.applyVoid(null, this, FlattenLyricView.class, "6")) {
          return;
       }
       this.A = false;
       this.v.clear();
       this.w.clear();
       this.x.clear();
       this.y.clear();
       this.z.clear();
       this.scrollTo(false, false);
       return;
    }
    public int getContentHeight(){
       Object obj = PatchProxy.apply(null, this, FlattenLyricView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom());
    }
    public int getContentPaddingBottom(){
       return 0;
    }
    public int getTextViewPadding(){
       return 0;
    }
    public int getTotalHeight(){
       return this.D;
    }
    public void h(Lyrics p0,int p1){
       if (PatchProxy.isSupport(FlattenLyricView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FlattenLyricView.class, "2")) {
          return;
       }
       if (p0 != null && !q.f(p0.mLines)) {
          this.C = p1;
          this.x();
          this.v.addAll(p0.mLines);
          this.E.removeAllViews();
          for (int i = 0; i < this.v.size(); i++) {
             Lyrics$Line line = this.v.get(i);
             this.y.add(Integer.valueOf(line.mStart));
             int i1 = line.mStart + line.mDuration;
             this.z.add(Integer.valueOf(i1));
             this.E.addView(this.m(line));
          }
          this.requestLayout();
          this.v();
       }
       return;
    }
    public void i(int p0,List p1){
       if (PatchProxy.isSupport(FlattenLyricView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, FlattenLyricView.class, "5")) {
          return;
       }
       this.C = p0;
       this.x();
       this.v.addAll(p1);
       this.E.removeAllViews();
       for (p0 = 0; p0 < this.v.size(); p0++) {
          Lyrics$Line line = this.v.get(p0);
          this.y.add(Integer.valueOf(line.mStart));
          if (p0 > 0) {
             int i = line.mStart - 1;
             this.z.add(Integer.valueOf(i));
          }
          this.E.addView(this.m(line));
       }
       this.z.add(Integer.valueOf(this.C));
       this.requestLayout();
       this.v();
       return;
    }
    public void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FlattenLyricView.class, "4")) {
          return;
       }
       Lyrics$Line line = new Lyrics$Line();
       line.mDuration = 500;
       line.mStart = 0;
       line.mText = p0;
       this.i(0x186a0, Collections.singletonList(line));
       return;
    }
    public void k(String p0,FlattenLyricView$EmptyLyricsStyle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FlattenLyricView.class, "3")) {
          return;
       }
       StringBuilder str = "";
       if (p1 == FlattenLyricView$EmptyLyricsStyle.NormalStyle) {
          str = str+"\n";
       }
       this.j(str+p0+"\n"+this.getContext().getString(R.string.arg_RES_7f102829));
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, FlattenLyricView.class, "10")) {
          return;
       }
       this.x();
       this.E.removeAllViews();
       this.requestLayout();
       return;
    }
    public final TextView m(Lyrics$Line p0){
       TextView obj = PatchProxy.applyOneRefs(p0, this, FlattenLyricView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n(p0);
       obj.setTextColor(this.H);
       obj.setTextSize(0, (float)this.G);
       obj.setPadding(this.getTextViewPadding(), this.K, this.getTextViewPadding(), this.K);
       obj.setGravity(17);
       obj.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
       obj.setText(p0.mText);
       obj.setTypeface(this.F);
       this.w(obj, p0);
       return obj;
    }
    public TextView n(Lyrics$Line p0){
       p0 = PatchProxy.applyOneRefs(p0, this, FlattenLyricView.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new TextView(this.getContext());
    }
    public int o(float p0){
       if (PatchProxy.isSupport(FlattenLyricView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, FlattenLyricView.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = this.w.size();
       int i1 = 0;
       if (i <= 1) {
          return i1;
       }else {
          int i2 = 0;
          while (true) {
             if (i2 < i) {
                int i3 = this.t(i2) - this.K;
                if ((float)i3 - p0 <= 0) {
                   i3 = this.p(i2) + this.K;
                   if ((float)i3 - p0 >= 0) {
                      return i2;
                   }
                }
                i2 = i2 + 1;
             }else if(p0 - (float)this.p((i - 2)) >= 0){
                i1 = i - 1;
                break ;
             }
             break ;
          }
          return i1;
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(FlattenLyricView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, FlattenLyricView.class, "9")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.A == null || p0) {
          int childCount = this.E.getChildCount();
          p1 = this.getPaddingTop();
          ArrayList uArrayList = new ArrayList(childCount);
          ArrayList uArrayList1 = new ArrayList(childCount);
          this.D = i;
          for (; i < childCount; i = i + 1) {
             View childAt = this.E.getChildAt(i);
             int i1 = childAt.getTop() + p1;
             i1 = i1 + this.K;
             uArrayList.add(Integer.valueOf(i1));
             i1 = childAt.getBottom() + p1;
             i1 = i1 - this.K;
             uArrayList1.add(Integer.valueOf(i1));
             i1 = this.D + childAt.getHeight();
             this.D = i1;
          }
          this.w = uArrayList;
          this.x = uArrayList1;
          this.A = true;
       }
       return;
    }
    public int p(int p0){
       if (PatchProxy.isSupport(FlattenLyricView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FlattenLyricView.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (p0 >= 0 && p0 < this.x.size())? this.x.get(p0).intValue(): 0;
       return p0;
    }
    public int q(int p0){
       if (PatchProxy.isSupport(FlattenLyricView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FlattenLyricView.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = (p0 >= 0 && p0 < this.y.size())? this.z.get(p0).intValue() - this.y.get(p0).intValue(): 0;
       return i;
    }
    public int r(int p0){
       if (PatchProxy.isSupport(FlattenLyricView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FlattenLyricView.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = (p0 >= 0 && p0 < this.x.size())? this.x.get(p0).intValue() - this.w.get(p0).intValue(): 0;
       return i;
    }
    public int s(int p0){
       if (PatchProxy.isSupport(FlattenLyricView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FlattenLyricView.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (p0 >= 0 && p0 < this.y.size())? this.y.get(p0).intValue(): 0;
       return p0;
    }
    public void setLrcPadding(int p0){
       this.K = p0;
    }
    public int t(int p0){
       if (PatchProxy.isSupport(FlattenLyricView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FlattenLyricView.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (p0 >= 0 && p0 < this.w.size())? this.w.get(p0).intValue(): 0;
       return p0;
    }
    public View u(int p0){
       if (PatchProxy.isSupport(FlattenLyricView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FlattenLyricView.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View childAt = (p0 >= 0 && p0 < this.E.getChildCount())? this.E.getChildAt(p0): null;
       return childAt;
    }
    public void v(){
    }
    public void w(TextView p0,Lyrics$Line p1){
    }
}
