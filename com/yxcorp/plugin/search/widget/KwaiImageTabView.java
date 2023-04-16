package com.yxcorp.plugin.search.widget.KwaiImageTabView;
import android.widget.FrameLayout;
import android.content.Context;
import lnc.a1;
import com.yxcorp.plugin.search.widget.KwaiImageTabView$a;
import android.util.AttributeSet;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import jd.c;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Boolean;
import android.widget.ImageView;

public class KwaiImageTabView extends FrameLayout	// class@0007c9
{
    public KwaiImageView b;
    public KwaiImageView c;
    public String d;
    public String e;
    public int f;
    public int g;
    public a h;

    public void KwaiImageTabView(Context p0){
       super(p0);
       this.f = a1.e(17.00f);
       this.g = a1.e(72.00f);
       this.h = new KwaiImageTabView$a(this);
    }
    public void KwaiImageTabView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = a1.e(17.00f);
       this.g = a1.e(72.00f);
       this.h = new KwaiImageTabView$a(this);
    }
    public void KwaiImageTabView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = a1.e(17.00f);
       this.g = a1.e(72.00f);
       this.h = new KwaiImageTabView$a(this);
    }
    public void a(String p0,String p1){
       Uri uri;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiImageTabView.class, "2")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.d = p0;
          uri = Uri.parse(p0);
          Fresco.getImagePipeline().prefetchToBitmapCache(ImageRequest.b(uri), null);
          this.b.H(uri, null, this.h);
       }
       if (!TextUtils.isEmpty(p1)) {
          this.e = p1;
          uri = Uri.parse(p1);
          Fresco.getImagePipeline().prefetchToBitmapCache(ImageRequest.b(uri), null);
          this.c.H(uri, null, this.h);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, KwaiImageTabView.class, "4")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a3ca4);
       this.c = this.findViewById(0x7f0a3cb2);
       return;
    }
    public void setImageHeight(int p0){
       this.f = p0;
    }
    public void setImageWidth(int p0){
       this.g = p0;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(KwaiImageTabView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiImageTabView.class, "3")) {
          return;
       }
       if (p0) {
          this.c.setVisibility(4);
          this.b.setVisibility(0);
       }else {
          this.b.setVisibility(4);
          this.c.setVisibility(0);
       }
       return;
    }
}
