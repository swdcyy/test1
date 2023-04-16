package com.yxcorp.gifshow.activity.share.topic.l$b$a;
import ub.a;
import com.yxcorp.gifshow.activity.share.topic.l$b;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class l$b$a extends a	// class@001485
{
    public final KwaiImageView b;
    public final l$b c;

    public void l$b$a(l$b p0,KwaiImageView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l$b$a.class, "1")) {
       }else if(p1 != null){
          p1 = this.b.getLayoutParams();
          p1.width = (int)((float)p1.height * (((float)p1.getWidth() * 0x3f800000) / (float)p1.getHeight()));
          this.b.setLayoutParams(p1);
       }
       return;
    }
}
