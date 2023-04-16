package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$b;
import android.view.View$OnKeyListener;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.RuntimeException;

public class LiveGiftBoxPopupView$b implements View$OnKeyListener	// class@001211
{
    public final LiveGiftBoxPopupView b;

    public void LiveGiftBoxPopupView$b(LiveGiftBoxPopupView p0){
       this.b = p0;
       super();
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveGiftBoxPopupView$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 4 && !p2.getAction()) {
          try{
             this.b.i();
          }catch(java.lang.RuntimeException e8){
             e8.printStackTrace();
          }
          return true;
       }else {
          return false;
       }
    }
}
