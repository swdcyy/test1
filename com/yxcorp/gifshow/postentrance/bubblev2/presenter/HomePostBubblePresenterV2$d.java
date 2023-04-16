package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$d;
import an6.f;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import an6.o;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import jn5.g;
import an6.l;

public final class HomePostBubblePresenterV2$d implements f	// class@00101d
{
    public final HomePostBubblePresenterV2 a;

    public void HomePostBubblePresenterV2$d(HomePostBubblePresenterV2 p0){
       this.a = p0;
       super();
    }
    public final boolean onClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, HomePostBubblePresenterV2$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       o oo = this.a.S8().g();
       int i = 0;
       if (oo != null) {
          Object[] objArray = new Object[i];
          g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 clickCameraBtn "+oo.getPriority(), objArray);
          g.i("BottomPost");
          i = oo.d();
       }
       return i;
    }
}
