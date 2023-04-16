package com.yxcorp.gifshow.ad.detail.presenter.player.j$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.player.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.player.b;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import com.yxcorp.gifshow.image.KwaiImageView;

public class j$a extends a	// class@001683
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "1")) {
          return;
       }
       j$a tb = this.b;
       if (tb.z != null && (tb.E == null && tb.q.isVideoType())) {
          this.b.z.setVisibility(0);
       }
    label_0026 :
       this.b.y.G();
       tb = this.b;
       tb.V8(tb.P8(), this.b.q.getColor(), true);
       return;
    }
}
