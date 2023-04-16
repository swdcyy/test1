package com.kuaishou.live.webview.liveloading.LiveLoadingView;
import com.kwai.yoda.kernel.loading.YodaLoadingView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import wy7.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.NullPointerException;
import sy7.b;
import java.lang.Throwable;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.context.LiveWebViewBackgroundImageParam;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import qkd.b;
import android.graphics.drawable.Drawable;

public final class LiveLoadingView extends YodaLoadingView	// class@00100a
{
    public String j;
    public int k;
    public Drawable l;
    public float m;
    public float n;
    public Drawable o;

    public void LiveLoadingView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void LiveLoadingView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void LiveLoadingView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void a(c p0,int p1){
       if (PatchProxy.isSupport(LiveLoadingView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveLoadingView.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, LiveLoadingView.class, "4")) {
          try{
             ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.setMargins((int)this.m, (int)this.n, 0, 0);
                this.setLayoutParams(layoutParams);
             }else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             }
          }catch(java.lang.Exception e0){
             b.b.e("Live loading adjustLoadingSize fail", e0);
          }
       }
    }
    public final void setLiveWebViewParam(LiveWebViewParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLoadingView.class, "3")) {
          return;
       }
       a.p(p0, "param");
       p0 = p0.mBackGroundImageParam;
       if (p0 != null) {
          this.j = p0.mImageFilePath;
          this.k = p0.mLocalResId;
          this.l = p0.mLocalResDrawable;
          this.m = p0.mStartX;
          this.n = p0.mStartY;
       }
       return;
    }
    public void setLoadingBgColor(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLoadingView.class, "1")) {
          return;
       }
       LiveLoadingView obj = PatchProxy.apply(null, this, LiveLoadingView.class, "5");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.j;
          obj = (obj == null || !obj.length())? 1: null;
          if (!obj) {
             String[] stringArray = new String[]{this.j};
             File uFile = b.B(stringArray);
             if (uFile != null && (uFile.exists() && !uFile.isDirectory())) {
                b = true;
             }
          }
       }
    label_004b :
       if (b) {
          this.o = Drawable.createFromPath(this.j);
       }else if(this.k == null){
          this.o = this.l;
       }
       obj = this.o;
       if (obj != null) {
          this.setBackground(obj);
          return;
       }else {
          obj = this.k;
          if (obj != null) {
             this.setBackgroundResource(obj);
             return;
          }else {
             super.setLoadingBgColor(p0);
             return;
          }
       }
    }
}
