package com.kwai.slide.play.detail.information.music.MusicLabelLayout;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.LinearLayout;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

public final class MusicLabelLayout extends PriorityLinearLayout	// class@0017f9
{
    public View g;
    public View h;
    public View i;
    public View j;
    public HashMap k;

    public void MusicLabelLayout(Context p0){
       super(p0, null, 2, null);
    }
    public void MusicLabelLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void MusicLabelLayout(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, MusicLabelLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       View view = this.findViewById(R.id.musicLabelContainer);
       a.o(view, "findViewById\(R.id.musicLabelContainer\)");
       this.g = view;
       view = this.findViewById(R.id.musicTextView);
       a.o(view, "findViewById\(R.id.musicTextView\)");
       this.h = view;
       view = this.findViewById(R.id.danmakuTextView);
       a.o(view, "findViewById\(R.id.danmakuTextView\)");
       this.i = view;
       view = this.findViewById(R.id.danmakuTextSpace);
       a.o(view, "findViewById\(R.id.danmakuTextSpace\)");
       this.j = view;
       return;
    }
    public void onMeasure(int p0,int p1){
       ViewGroup$LayoutParams layoutParams;
       MusicLabelLayout th1;
       if (PatchProxy.isSupport(MusicLabelLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MusicLabelLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       MusicLabelLayout tj = this.j;
       String str = "mDanmakuTextSpace";
       if (tj == null) {
          a.S(str);
       }
       if (tj.getVisibility()) {
          return;
       }else {
          tj = this.g;
          String str1 = "mMusicLabelContainer";
          if (tj == null) {
             a.S(str1);
          }
          String str2 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
          String str3 = "mDanmakuTextView";
          if (!tj.getVisibility()) {
             tj = this.h;
             String str4 = "mMusicTextView";
             if (tj == null) {
                a.S(str4);
             }
             if (!tj.getVisibility()) {
                tj = this.i;
                if (tj == null) {
                   a.S(str3);
                }
                ViewGroup$LayoutParams height = tj.getLayoutParams().height;
                MusicLabelLayout th = this.h;
                if (th == null) {
                   a.S(str4);
                }
                if (height != th.getMeasuredHeight()) {
                   tj = this.i;
                   if (tj == null) {
                      a.S(str3);
                   }
                   layoutParams = tj.getLayoutParams();
                   Objects.requireNonNull(layoutParams, str2);
                   th1 = this.h;
                   if (th1 == null) {
                      a.S(str4);
                   }
                   layoutParams.height = th1.getMeasuredHeight();
                   tj.setLayoutParams(layoutParams);
                }
             }else {
             label_0089 :
                tj = this.i;
                if (tj == null) {
                   a.S(str3);
                }
                if (tj.getLayoutParams().height != -2) {
                   tj = this.i;
                   if (tj == null) {
                      a.S(str3);
                   }
                   layoutParams = tj.getLayoutParams();
                   Objects.requireNonNull(layoutParams, str2);
                   layoutParams.height = -2;
                   tj.setLayoutParams(layoutParams);
                }
             }
          }else {
             goto label_0089 ;
          }
          tj = this.g;
          if (tj == null) {
             a.S(str1);
          }
          if (tj.getVisibility()) {
             return;
          }else {
             tj = this.j;
             if (tj == null) {
                a.S(str);
             }
             tj = tj.getMeasuredWidth();
             MusicLabelLayout tj1 = this.j;
             if (tj1 == null) {
                a.S(str);
             }
             if (tj < tj1.getMinimumWidth()) {
                tj = this.j;
                if (tj == null) {
                   a.S(str);
                }
                ViewGroup$LayoutParams layoutParams1 = tj.getLayoutParams();
                Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type com.yxcorp.gifshow.detail.view.PriorityLinearLayout.LayoutParams");
                layoutParams1.a = 50;
                th1 = this.j;
                if (th1 == null) {
                   a.S(str);
                }
                layoutParams1.width = th1.getMinimumWidth();
                tj.setLayoutParams(layoutParams1);
             }
             return;
          }
       }
    }
}
