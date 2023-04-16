package com.kwai.tokenshare.KwaiTokenGalleryView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Collections;
import java.lang.Math;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;

public class KwaiTokenGalleryView extends LinearLayout	// class@001914
{
    public List b;
    public static final int[] c;

    static {
       KwaiTokenGalleryView.c = new int[6]{0x7f0d0765,0x7f0d0766,0x7f0d0767,0x7f0d0768,0x7f0d0769,0x7f0d076a};
    }
    public void KwaiTokenGalleryView(Context p0){
       super(p0);
    }
    public void KwaiTokenGalleryView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void KwaiTokenGalleryView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(List p0,int p1){
       if (PatchProxy.isSupport(KwaiTokenGalleryView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KwaiTokenGalleryView.class, "2")) {
          return;
       }
       if (p0 == null) {
          p0 = Collections.emptyList();
       }
       int i = 1;
       int i1 = Math.min(6, Math.max(i, p0.size()));
       a.k(this, KwaiTokenGalleryView.c[(i1 - 1)], i);
       this.b = new ArrayList();
       this.b(this);
       if (i1 < this.b.size()) {
          return;
       }else {
          i1 = 0;
          while (i1 < this.b.size()) {
             KwaiImageView kwaiImageVie = this.b.get(i1);
             kwaiImageVie.setPlaceHolderImage(new ColorDrawable(p1));
             if (i1 < p0.size()) {
                kwaiImageVie.U(p0.get(i1));
             }
             i1 = i1 + 1;
          }
          return;
       }
    }
    public final void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenGalleryView.class, "1")) {
          return;
       }
       if (p0 instanceof ViewGroup) {
          int childCount = p0.getChildCount();
          int i = 0;
          while (i < childCount) {
             View childAt = p0.getChildAt(i);
             if (childAt instanceof KwaiImageView) {
                this.b.add(childAt);
             }else if(childAt instanceof ViewGroup){
                this.b(childAt);
             }
             i = i + 1;
          }
       }else if(p0 instanceof KwaiImageView){
          this.b.add(p0);
       }
       return;
    }
}
