package com.yxcorp.gifshow.detail.view.SlideRecoTitleView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.widget.ImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class SlideRecoTitleView extends ConstraintLayout	// class@001a6e
{
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public ImageView F;
    public ImageView G;
    public ImageView H;
    public ImageView I;
    public int J;

    public void SlideRecoTitleView(Context p0){
       super(p0, null);
    }
    public void SlideRecoTitleView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void SlideRecoTitleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.J = 1;
       ViewGroup.inflate(p0, R.layout.arg_RES_7f0d084f, this);
    }
    public SlideRecoTitleView L(int p0){
       if (PatchProxy.isSupport(SlideRecoTitleView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SlideRecoTitleView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.J = p0;
       if (p0 == 2) {
          SlideRecoTitleView tB = this.B;
          int i = 8;
          if (tB != null) {
             tB.setVisibility(i);
          }
          tB = this.C;
          if (tB != null) {
             tB.setVisibility(i);
          }
          tB = this.F;
          if (tB != null) {
             tB.setVisibility(i);
          }
          tB = this.G;
          if (tB != null) {
             tB.setVisibility(i);
          }
          tB = this.D;
          if (tB != null) {
             tB.setVisibility(0);
          }
          tB = this.E;
          if (tB != null) {
             tB.setVisibility(0);
          }
          tB = this.H;
          if (tB != null) {
             tB.setVisibility(0);
          }
          tB = this.I;
          if (tB != null) {
             tB.setVisibility(0);
          }
       }
       return this;
    }
    public SlideRecoTitleView M(String p0,String p1){
       SlideRecoTitleView obj = PatchProxy.applyTwoRefs(p0, p1, this, SlideRecoTitleView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B;
       if (obj != null && this.C != null) {
          SlideRecoTitleView tD = this.D;
          if (tD != null && this.E != null) {
             if (this.J == 2) {
                ImageView[] imageViewArr = new ImageView[]{this.H,this.I};
                this.O(tD, p0, imageViewArr);
                this.N(this.E, p1);
             }else {
                ImageView[] imageViewArr1 = new ImageView[]{this.F,this.G};
                this.O(obj, p0, imageViewArr1);
                this.N(this.C, p1);
             }
          }
       }
       return this;
    }
    public final void N(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlideRecoTitleView.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (TextUtils.x(p1)) {
          p0.setVisibility(4);
       }else {
          p0.setVisibility(0);
          p0.setText(p1);
       }
       return;
    }
    public final void O(TextView p0,String p1,ImageView[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SlideRecoTitleView.class, "5")) {
          return;
       }
       this.N(p0, p1);
       if (p0 != null && TextUtils.x(p1)) {
          int len = p2.length;
          int i = 0;
          while (i < len) {
             object oobject = p2[i];
             if (oobject != null) {
                oobject.setVisibility(8);
             }
             i++;
          }
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SlideRecoTitleView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.B = this.findViewById(0x7f0a42cc);
       this.F = this.findViewById(0x7f0a1594);
       this.G = this.findViewById(0x7f0a1595);
       this.C = this.findViewById(0x7f0a42b0);
       this.D = this.findViewById(0x7f0a42d8);
       this.E = this.findViewById(0x7f0a42b1);
       this.H = this.findViewById(0x7f0a158d);
       this.I = this.findViewById(0x7f0a158e);
       return;
    }
}
