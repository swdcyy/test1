package com.yxcorp.gifshow.share.view.TagShareGalleryLayout;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;

public final class TagShareGalleryLayout extends FrameLayout	// class@001c94
{

    public void TagShareGalleryLayout(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void TagShareGalleryLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void TagShareGalleryLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public final void a(View p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TagShareGalleryLayout.class, "2")) {
          return;
       }
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          if (childAt instanceof ImageView) {
             childAt.setScaleType(ImageView$ScaleType.CENTER_CROP);
             p1.add(childAt);
          }else if(!childAt instanceof ViewGroup){
             childAt = null;
          }
          if (childAt != null) {
             this.a(childAt, p1);
          }
          i = i + 1;
       }
       return;
    }
}
