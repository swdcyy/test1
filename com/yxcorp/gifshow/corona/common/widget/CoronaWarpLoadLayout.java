package com.yxcorp.gifshow.corona.common.widget.CoronaWarpLoadLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View$OnClickListener;

public class CoronaWarpLoadLayout extends FrameLayout	// class@001281
{
    public View b;
    public KwaiPlayerFailedStateView c;

    public void CoronaWarpLoadLayout(Context p0){
       super(p0, null);
    }
    public void CoronaWarpLoadLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CoronaWarpLoadLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       FrameLayout.inflate(this.getContext(), R.layout.arg_RES_7f0d103e, this);
       this.b = this.findViewById(0x7f0a2902);
       this.c = this.findViewById(0x7f0a098d);
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaWarpLoadLayout.class, "5")) {
          return;
       }
       this.e();
       if (this.getVisibility()) {
          this.setVisibility(0);
       }
       if (this.b.getVisibility() != 8) {
          this.b.setVisibility(8);
       }
       if (this.c.getVisibility()) {
          this.c.setVisibility(0);
          if (!TextUtils.isEmpty(p0)) {
             this.c.a(p0);
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, CoronaWarpLoadLayout.class, "6")) {
          return;
       }
       int i = 0;
       if (this.getVisibility()) {
          this.setVisibility(i);
       }
       if (this.b.getVisibility()) {
          this.b.setVisibility(i);
       }
       if (this.c.getVisibility() != 8) {
          this.c.setVisibility(8);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, CoronaWarpLoadLayout.class, "3")) {
          return;
       }
       this.d("");
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaWarpLoadLayout.class, "4")) {
          return;
       }
       this.e();
       if (this.getVisibility()) {
          this.setVisibility(0);
       }
       if (this.b.getVisibility() != 8) {
          this.b.setVisibility(8);
       }
       if (this.c.getVisibility()) {
          this.c.setVisibility(0);
          if (!TextUtils.isEmpty(p0)) {
             this.c.a(p0);
          }
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, CoronaWarpLoadLayout.class, "7")) {
          return;
       }
       CoronaWarpLoadLayout tb = this.b;
       if (tb != null) {
          tb.setVisibility(8);
       }
       return;
    }
    public void setRetryClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaWarpLoadLayout.class, "1")) {
          return;
       }
       this.c.f(p0);
       return;
    }
}
