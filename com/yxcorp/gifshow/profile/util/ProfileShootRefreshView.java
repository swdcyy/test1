package com.yxcorp.gifshow.profile.util.ProfileShootRefreshView;
import o17.j;
import android.widget.RelativeLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import z5c.p2;
import java.lang.Runnable;
import java.lang.Float;
import z5c.q2;
import ekd.k1;

public class ProfileShootRefreshView extends RelativeLayout implements j	// class@0015cf
{
    public boolean b;
    public PathLoadingView c;
    public static final float d;

    static {
       ProfileShootRefreshView.d = (float)a1.e(62.00f);
    }
    public void ProfileShootRefreshView(Context p0){
       super(p0, null);
    }
    public void ProfileShootRefreshView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ProfileShootRefreshView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileShootRefreshView.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Y1);
          p2 = typedArray.getInt(4, LoadingStyle.WHITE.value);
          typedArray.recycle();
          a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d072c, this, true);
          PathLoadingView pathLoadingV = this.findViewById(R.id.pull_to_refresh_loading);
          this.c = pathLoadingV;
          pathLoadingV.setLoadingStyle(LoadingStyle.fromOrdinal(p2));
          this.post(new p2(this));
       }
       return;
    }
    public void pullProgress(float p0,float p1){
       if (PatchProxy.isSupport(ProfileShootRefreshView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ProfileShootRefreshView.class, "5")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       float f = 0;
       int i = (!p0 - f || !p1 - f)? 4: 0;
       this.setVisibility(i);
       ProfileShootRefreshView tc = this.c;
       if (tc != null) {
          tc.m(((p0 / ProfileShootRefreshView.d) + 0x3f000000));
       }
       return;
    }
    public void pullToRefresh(){
    }
    public void refreshComplete(){
       if (PatchProxy.applyVoid(null, this, ProfileShootRefreshView.class, "4")) {
          return;
       }
       this.b = false;
       k1.r(new q2(this), 200);
       return;
    }
    public int refreshedAnimatorDuration(){
       return 200;
    }
    public void refreshing(){
       if (PatchProxy.applyVoid(null, this, ProfileShootRefreshView.class, "3")) {
          return;
       }
       this.b = true;
       this.setVisibility(0);
       ProfileShootRefreshView tc = this.c;
       if (tc != null) {
          tc.k();
       }
       return;
    }
    public void releaseToRefresh(){
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, ProfileShootRefreshView.class, "2")) {
          return;
       }
       this.setVisibility(4);
       this.b = false;
       ProfileShootRefreshView tc = this.c;
       if (tc != null) {
          tc.a();
       }
       return;
    }
    public void setLoadingStyle(LoadingStyle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileShootRefreshView.class, "7")) {
          return;
       }
       ProfileShootRefreshView tc = this.c;
       if (tc != null) {
          tc.setLoadingStyle(p0);
       }
       return;
    }
}
