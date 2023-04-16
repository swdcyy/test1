package com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelView$a;
import nsd.u;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class InterestLabelView extends LinearLayout	// class@001738
{
    public KwaiImageView b;
    public TextView c;
    public String d;
    public String e;
    public static final int f;
    public static final int g;
    public static final InterestLabelView$a h;

    static {
       InterestLabelView.h = new InterestLabelView$a(null);
       InterestLabelView.f = 0x7f080f3f;
       InterestLabelView.g = 0x7f080f3e;
    }
    public void InterestLabelView(Context p0){
       super(p0);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0635, this, true);
       this.setBackgroundResource(R.drawable.arg_RES_7f080f3d);
       View view = this.findViewById(R.id.interest_label_icon);
       a.o(view, "findViewById\(R.id.interest_label_icon\)");
       this.b = view;
       view = this.findViewById(R.id.interest_label_text);
       a.o(view, "findViewById\(R.id.interest_label_text\)");
       this.c = view;
       this.setOrientation(0);
       this.setGravity(16);
    }
    public void InterestLabelView(Context p0,AttributeSet p1){
       super(p0, p1);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0635, this, true);
       this.setBackgroundResource(R.drawable.arg_RES_7f080f3d);
       View view = this.findViewById(R.id.interest_label_icon);
       a.o(view, "findViewById\(R.id.interest_label_icon\)");
       this.b = view;
       view = this.findViewById(R.id.interest_label_text);
       a.o(view, "findViewById\(R.id.interest_label_text\)");
       this.c = view;
       this.setOrientation(0);
       this.setGravity(16);
    }
    public void InterestLabelView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0635, this, true);
       this.setBackgroundResource(R.drawable.arg_RES_7f080f3d);
       View view = this.findViewById(R.id.interest_label_icon);
       a.o(view, "findViewById\(R.id.interest_label_icon\)");
       this.b = view;
       view = this.findViewById(R.id.interest_label_text);
       a.o(view, "findViewById\(R.id.interest_label_text\)");
       this.c = view;
       this.setOrientation(0);
       this.setGravity(16);
    }
    public final KwaiImageView getMIcon(){
       InterestLabelView obj = PatchProxy.applyWithListener(null, this, InterestLabelView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("mIcon");
       }
       PatchProxy.onMethodExit(InterestLabelView.class, "1");
       return obj;
    }
    public final String getMSelectedIconUrl(){
       return this.d;
    }
    public final TextView getMText(){
       InterestLabelView obj = PatchProxy.applyWithListener(null, this, InterestLabelView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("mText");
       }
       PatchProxy.onMethodExit(InterestLabelView.class, "3");
       return obj;
    }
    public final String getMUnselectedIconUrl(){
       return this.e;
    }
    public final void setMIcon(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestLabelView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       PatchProxy.onMethodExit(InterestLabelView.class, "2");
       return;
    }
    public final void setMSelectedIconUrl(String p0){
       this.d = p0;
    }
    public final void setMText(TextView p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestLabelView.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       PatchProxy.onMethodExit(InterestLabelView.class, "4");
       return;
    }
    public final void setMUnselectedIconUrl(String p0){
       this.e = p0;
    }
    public void setSelected(boolean p0){
       InterestLabelView tb;
       if (PatchProxy.isSupport2(InterestLabelView.class, "6") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, InterestLabelView.class, "6")) {
          return;
       }
       super.setSelected(p0);
       String str = "mIcon";
       if (p0) {
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          tb.setFailureImage(InterestLabelView.g);
          if (!TextUtils.isEmpty(this.d)) {
             tb = this.b;
             if (tb == null) {
                a.S(str);
             }
             tb.L(this.d);
          }
       }else {
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          tb.setFailureImage(InterestLabelView.f);
          if (!TextUtils.isEmpty(this.e)) {
             tb = this.b;
             if (tb == null) {
                a.S(str);
             }
             tb.L(this.e);
          }
       }
       PatchProxy.onMethodExit(InterestLabelView.class, "6");
       return;
    }
}
