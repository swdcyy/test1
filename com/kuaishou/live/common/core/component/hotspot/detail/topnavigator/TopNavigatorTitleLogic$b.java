package com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailTopNavigatorModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;

public final class TopNavigatorTitleLogic$b implements Observer	// class@001415
{
    public final TopNavigatorTitleLogic b;

    public void TopNavigatorTitleLogic$b(TopNavigatorTitleLogic p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopNavigatorTitleLogic$b.class, "1")) {
       }else {
          this.b.d.setText(p0.title);
       }
       return;
    }
}
