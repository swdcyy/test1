package com.kuaishou.live.core.show.luckystar.pendant.LiveLuckyStarNewPendantView;
import com.kuaishou.live.core.show.luckystar.pendant.LiveBaseLuckyStarPendantView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import yz7.n;

public class LiveLuckyStarNewPendantView extends LiveBaseLuckyStarPendantView	// class@000cef
{

    public void LiveLuckyStarNewPendantView(Context p0){
       super(p0, null);
    }
    public void LiveLuckyStarNewPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLuckyStarNewPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int getCountDownTextSizeDp(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarNewPendantView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.g((float)a1.d(0x7f070980));
    }
    public int getLayoutRes(){
       return 0x7f0d0c80;
    }
    public int getOpeningTextSizeDp(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarNewPendantView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.g((float)a1.d(0x7f070981));
    }
}
