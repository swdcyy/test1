package com.yxcorp.gifshow.rankgather.view.SlideDetailTitleView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.SpannableStringBuilder;
import java.lang.StringBuilder;
import android.text.style.AbsoluteSizeSpan;
import lnc.a1;
import android.text.TextUtils;
import java.lang.Integer;

public class SlideDetailTitleView extends LinearLayout	// class@0016f1
{
    public String b;
    public String c;
    public String d;
    public TextView e;
    public TextView f;

    public void SlideDetailTitleView(Context p0){
       super(p0);
       this.a(p0);
    }
    public void SlideDetailTitleView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public void SlideDetailTitleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideDetailTitleView.class, "1")) {
          return;
       }
       this.setOrientation(0);
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d08b4, this, true);
       this.e = this.findViewById(0x7f0a1738);
       this.f = this.findViewById(0x7f0a3668);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, SlideDetailTitleView.class, "6")) {
          return;
       }
       this.e.setText(this.b);
       if (this.c == null || this.d == null) {
          this.f.setVisibility(8);
          return;
       }else {
          this.f.setVisibility(0);
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(this.d+"/"+this.c);
          int i = (this.d).length() + 1;
          spannableStr.setSpan(new AbsoluteSizeSpan(a1.e(12.00f)), i, ((this.c).length() + i), 17);
          this.f.setText(spannableStr);
          if (!TextUtils.isEmpty(this.c)) {
             if (Integer.parseInt(this.c) > 9) {
                this.f.setMinWidth(a1.e(44.00f));
             }else {
                this.f.setMinWidth(a1.e(34.00f));
             }
          }
          return;
       }
    }
    public void setCurrentCount(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideDetailTitleView.class, "5")) {
          return;
       }
       this.d = p0;
       this.b();
       return;
    }
    public void setTitleText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideDetailTitleView.class, "3")) {
          return;
       }
       this.b = p0;
       this.b();
       return;
    }
    public void setTotalCount(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideDetailTitleView.class, "4")) {
          return;
       }
       this.c = p0;
       this.b();
       return;
    }
}
