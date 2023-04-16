package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i$b;
import qm1.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import java.lang.Object;
import android.widget.ImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.Bitmap;
import qm1.b;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftWrapper;
import cm1.a;
import com.yxcorp.gifshow.model.CDNUrl;

public class i$b implements c	// class@000b0b
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public ImageView a(){
       Object obj = PatchProxy.apply(null, this, i$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b.findViewById(0x7f0a1d3a);
    }
    public KwaiImageView b(){
       Object obj = PatchProxy.apply(null, this, i$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b.findViewById(0x7f0a1d50);
    }
    public View c(){
       Object obj = PatchProxy.apply(null, this, i$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b.findViewById(0x7f0a1cfe);
    }
    public Bitmap d(){
       return b.a(this);
    }
    public LiveViewFlipper e(){
       Object obj = PatchProxy.apply(null, this, i$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b.findViewById(0x7f0a1d82);
    }
    public Bitmap f(UpdatedGiftWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(p0.getGiftId());
    }
    public CDNUrl[] g(){
       return b.b(this);
    }
}
