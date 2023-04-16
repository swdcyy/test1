package com.kuaishou.live.core.show.luckystar.util.b$a;
import ub.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.luckystar.util.b;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class b$a extends a	// class@000cf9
{
    public final KwaiImageView b;
    public final int c;

    public void b$a(KwaiImageView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$a.class, "1")) {
       }else if(p1 != null){
          b$a tb = this.b;
          b$a tc = this.c;
          int width = p1.getWidth();
          int height = p1.getHeight();
          if (PatchProxy.isSupport(b.class) && (!PatchProxy.applyVoidFourRefs(tb, Integer.valueOf(tc), Integer.valueOf(width), Integer.valueOf(height), null, b.class, "9") && (tc > null && (height > 0 && width > 0)))) {
             ViewGroup$LayoutParams layoutParams = tb.getLayoutParams();
             layoutParams.width = (int)((float)(tc * width) / (float)height);
             tb.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
