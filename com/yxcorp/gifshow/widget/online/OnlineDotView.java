package com.yxcorp.gifshow.widget.online.OnlineDotView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import izc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import lnc.a1;
import android.view.View$MeasureSpec;
import com.facebook.drawee.view.DraweeView;
import java.util.Objects;
import java.util.Map;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class OnlineDotView extends KwaiImageView	// class@00199c
{
    public int x;
    public int y;

    public void OnlineDotView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void OnlineDotView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void OnlineDotView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.K3);
       a.o(typedArray, "context.obtainStyledAttr¡­eable.OnlineDotView\n    \)");
       this.y = typedArray.getColor(0, a.b.e(p0));
       this.setViewSize(typedArray.getInt(1, 0));
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(OnlineDotView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, OnlineDotView.class, "2")) {
          return;
       }
       super.onMeasure(View$MeasureSpec.makeMeasureSpec(a1.e((float)this.x), 0x40000000), View$MeasureSpec.makeMeasureSpec(a1.e((float)this.x), 0x40000000));
       return;
    }
    public final void setViewSize(int p0){
       if (PatchProxy.isSupport(OnlineDotView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, OnlineDotView.class, "1")) {
          return;
       }
       if (this.x == p0) {
          return;
       }
       this.x = p0;
       Objects.requireNonNull(a.b);
       Integer integer = a.a.get(Integer.valueOf(this.x));
       integer = (integer != null)? integer.intValue(): 2;
       float f = (float)a1.e((float)integer);
       this.setTranslationX(f);
       this.setTranslationY(f);
       this.setImageURI(null);
       Context context = this.getContext();
       a.o(context, "context");
       this.setPlaceHolderImage(a.b(context, integer, this.y));
       return;
    }
}
