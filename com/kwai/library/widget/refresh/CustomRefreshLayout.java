package com.kwai.library.widget.refresh.CustomRefreshLayout;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import com.kwai.library.widget.refresh.KwaiRefreshView;
import o17.j;
import p17.c;
import com.kwai.library.widget.refresh.config.KwaiRefreshManager;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Math;
import java.io.File;
import android.net.Uri;
import o17.b;
import o17.a;
import com.kwai.library.widget.refresh.RefreshLayout$LayoutParams;

public class CustomRefreshLayout extends RefreshLayout	// class@0009bc
{
    public int g1;

    public void CustomRefreshLayout(Context p0){
       super(p0);
    }
    public void CustomRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public View A(){
       KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
       kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
       kwaiImageVie.setLayoutParams(new ViewGroup$LayoutParams(0, 0));
       return kwaiImageVie;
    }
    public View B(AttributeSet p0){
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.n0);
       this.g1 = typedArray.getResourceId(0, 0);
       typedArray.recycle();
       int i = n.c(this.getContext(), 22.50f);
       KwaiRefreshView kwaiRefreshV = (this.g1 == null)? new KwaiRefreshView(this.getContext()): n.G(this.getContext(), this.g1);
       if (!kwaiRefreshV instanceof KwaiRefreshView) {
          kwaiRefreshV.setPadding(i, i, i, i);
       }
       return kwaiRefreshV;
    }
    public View getRefreshView(){
       return this.N;
    }
    public void setRefreshStatus(j p0){
       this.S = p0;
    }
    public void setRefreshView(View p0){
       this.N = p0;
    }
    public void x(View p0){
       if (!p0 instanceof KwaiImageView) {
          return;
       }
       c uoc = KwaiRefreshManager.a();
       if (uoc == null) {
          return;
       }
       int i = uoc.c();
       int i1 = uoc.b();
       String str = uoc.a();
       if (TextUtils.x(str) || (i > 0 && i1 > 0)) {
          ImageView imageView = p0;
          imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
          p0.setLayoutParams(new ViewGroup$LayoutParams(Math.min(n.c(this.getContext(), (float)i), n.z(this.getContext())), n.c(this.getContext(), (float)i1)));
          imageView.setImageURI(Uri.fromFile(new File(str)));
       }
    label_005d :
       return;
    }
    public b y(){
       return new a(this.getContext());
    }
    public RefreshLayout$LayoutParams z(AttributeSet p0){
       RefreshLayout tv;
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.n0);
       int layoutDimens = typedArray.getLayoutDimension(2, this.v);
       int i = 1;
       if (typedArray.hasValue(i)) {
          i = typedArray.getLayoutDimension(i, this.v);
       }else if(layoutDimens < 0){
          tv = this.v;
       }else {
          tv = layoutDimens;
       }
       typedArray.recycle();
       return new RefreshLayout$LayoutParams(layoutDimens, i);
    }
}
