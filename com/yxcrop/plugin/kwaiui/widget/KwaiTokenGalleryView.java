package com.yxcrop.plugin.kwaiui.widget.KwaiTokenGalleryView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.util.List;
import cpd.a;

public class KwaiTokenGalleryView extends LinearLayout	// class@000c71
{
    public List b;
    public a c;
    public static final int[] d;

    static {
       KwaiTokenGalleryView.d = new int[6]{0x7f0d073b,0x7f0d073c,0x7f0d073d,0x7f0d073e,0x7f0d073f,0x7f0d0740};
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
    public final void a(View p0){
       if (p0 instanceof ViewGroup) {
          int childCount = p0.getChildCount();
          int i = 0;
          while (i < childCount) {
             View childAt = p0.getChildAt(i);
             if (childAt instanceof KwaiImageView) {
                this.b.add(childAt);
             }else if(childAt instanceof ViewGroup){
                this.a(childAt);
             }
             i = i + 1;
          }
       }else if(p0 instanceof KwaiImageView){
          this.b.add(p0);
       }
       return;
    }
    public void setGalleryImageClickListener(a p0){
       this.c = p0;
    }
}
