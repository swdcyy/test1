package com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusMainStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultStatusMainStateAreaView;
import un3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusMainStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionResultStatusMainStateAreaItem extends a	// class@000e9e
{

    public void RedPacketConditionResultStatusMainStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupResultStatusMainStateAreaView p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionResultStatusMainStateAreaItem.class, "3")) {
          return;
       }
       l.d(p0, this.mRedPacketContext.k(), p1.v0(), true);
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public a createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionResultStatusMainStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionResultStatusMainStateAreaItem$a(this, a.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupResultStatusMainStateAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionResultStatusMainStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupResultStatusMainStateAreaView(this.mRedPacketContext.b());
    }
}
