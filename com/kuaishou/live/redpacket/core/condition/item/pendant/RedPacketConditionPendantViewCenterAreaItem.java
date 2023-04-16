package com.kuaishou.live.redpacket.core.condition.item.pendant.RedPacketConditionPendantViewCenterAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.condition.view.pendant.RedPacketConditionPendantCenterView;
import kn3.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.redpacket.core.ui.view.pendant.RedPacketPendantCenterView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import go3.e;
import xh3.l;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.pendant.RedPacketConditionPendantViewCenterAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionPendantViewCenterAreaItem extends a	// class@000ec9
{

    public void RedPacketConditionPendantViewCenterAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPendantCenterView p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionPendantViewCenterAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       KwaiImageView avatarView = p0.getAvatarView();
       e.a(avatarView, subLifecycle, p1.n, HeadImageSize.SMALL);
       l.c(avatarView, subLifecycle, p1.o);
       l.c(p0.getOpenIndicatorView(), subLifecycle, p1.p);
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public f createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPendantViewCenterAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionPendantViewCenterAreaItem$a(this, f.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPendantCenterView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPendantViewCenterAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPendantCenterView(this.mRedPacketContext.b());
    }
}
