package com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollStatusAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionPopupScrollStatusAreaView;
import yn3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollStatusAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionScrollStatusAreaItem extends a	// class@000eab
{

    public void RedPacketConditionScrollStatusAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupScrollStatusAreaView p0,a p1){
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public a createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionScrollStatusAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionScrollStatusAreaItem$a(this, a.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupScrollStatusAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionScrollStatusAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupScrollStatusAreaView(this.mRedPacketContext.b());
    }
}
