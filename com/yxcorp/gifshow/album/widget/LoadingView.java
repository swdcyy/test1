package com.yxcorp.gifshow.album.widget.LoadingView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import o79.i;
import com.yxcorp.gifshow.album.widget.LoadingCircle;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;

public class LoadingView extends RelativeLayout	// class@001b08
{
    public LoadingCircle b;
    public TextView c;
    public TextView d;

    public void LoadingView(Context p0){
       super(p0);
    }
    public void LoadingView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LoadingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LoadingView.class, "1")) {
          return;
       }
       i.n(this.getContext(), R.layout.arg_RES_7f0d06f8, this, true);
       this.b = this.findViewById(0x7f0a32f1);
       this.c = this.findViewById(0x7f0a2920);
       return;
    }
    public TextView getTitleDetailView(){
       Object[] objArray = null;
       TextView obj = PatchProxy.apply(objArray, this, LoadingView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          obj = new TextView(this.getContext(), objArray, 0x7f110579);
          this.d = obj;
          obj.setGravity(17);
          this.d.setTextColor(-3750202);
          this.d.setTextSize(0, this.getContext().getResources().getDimension(R.dimen.arg_RES_7f07050d));
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
          layoutParams.topMargin = n.c(this.getContext(), 5.00f);
          layoutParams.gravity = 1;
          this.b.getParent().addView(this.d, layoutParams);
       }
       return this.d;
    }
    public TextView getTitleView(){
       return this.c;
    }
    public void setTitleDetailText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoadingView.class, "7")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          LoadingView td = this.d;
          if (td != null) {
             td.setVisibility(8);
          }
          return;
       }else {
          this.getTitleDetailView().setVisibility(0);
          this.getTitleDetailView().setText(p0);
          return;
       }
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(LoadingView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LoadingView.class, "8")) {
          return;
       }
       super.setVisibility(p0);
       LoadingView tb = this.b;
       if (tb != null) {
          tb.setVisibility(p0);
       }
       return;
    }
}
