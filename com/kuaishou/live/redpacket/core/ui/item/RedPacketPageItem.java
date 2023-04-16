package com.kuaishou.live.redpacket.core.ui.item.RedPacketPageItem;
import io3.a;
import eo3.w;
import java.util.Map;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.RedPacketBasePageView;
import com.kuaishou.live.redpacket.core.ui.vm.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;
import com.kuaishou.live.redpacket.core.ui.view.a;
import com.kuaishou.live.redpacket.core.ui.view.RedPacketBasePageView$a;

public abstract class RedPacketPageItem extends a	// class@000eee
{
    public Map mAreaMap;
    public RedPacketBasePageView mTargetView;

    public void RedPacketPageItem(w p0,Map p1){
       super(p0);
       this.mAreaMap = p1;
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketBasePageView p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketPageItem.class, "1")) {
          return;
       }
       this.mTargetView = p0;
       a tmRedPacketC = this.mRedPacketContext;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidTwoRefs(tmRedPacketC, p1, p0, RedPacketBasePageView.class, "3")) {
          p0.c = p1;
          l.d(p0, tmRedPacketC.k(), p0.c.v0(), true);
          p0.setVisibilityListener(new a(p0, p1));
       }
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public abstract a createVM();
    public Object createVM(){
       return this.createVM();
    }
    public View createView(){
       return this.createView();
    }
    public abstract RedPacketBasePageView createView();
    public Map getAreaMap(){
       return this.mAreaMap;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, RedPacketPageItem.class, "2")) {
          return;
       }
       RedPacketPageItem tmTargetView = this.mTargetView;
       if (tmTargetView != null) {
          tmTargetView.release();
       }
       return;
    }
}
