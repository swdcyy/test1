package com.kuaishou.live.core.show.subscribe.edit.LiveAnchorSubscribeContainerFragment$a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;
import com.kuaishou.live.core.show.subscribe.edit.LiveAnchorSubscribeContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment;

public class LiveAnchorSubscribeContainerFragment$a implements LiveDialogContainerFragment$b	// class@0010ec
{
    public final LiveAnchorSubscribeContainerFragment a;

    public void LiveAnchorSubscribeContainerFragment$a(LiveAnchorSubscribeContainerFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       LiveAnchorSubscribeContainerFragment obj = PatchProxy.apply(null, this, LiveAnchorSubscribeContainerFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.C;
       if (!obj instanceof LiveSubscribeEditFragment || !obj.ch()) {
          return false;
       }
       this.a.Eh(true);
       return true;
    }
    public boolean b(){
       return false;
    }
}
