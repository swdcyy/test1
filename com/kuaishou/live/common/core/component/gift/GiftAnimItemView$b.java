package com.kuaishou.live.common.core.component.gift.GiftAnimItemView$b;
import ub.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class GiftAnimItemView$b extends a	// class@00112a
{
    public final Runnable b;
    public final KwaiImageView c;
    public final long d;

    public void GiftAnimItemView$b(Runnable p0,KwaiImageView p1,long p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GiftAnimItemView$b.class, "1")) {
       }else {
          GiftAnimItemView$b tb = this.b;
          if (tb != null) {
             this.c.postDelayed(tb, this.d);
          }
       }
       return;
    }
}
