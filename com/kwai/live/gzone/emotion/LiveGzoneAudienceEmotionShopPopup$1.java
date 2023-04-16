package com.kwai.live.gzone.emotion.LiveGzoneAudienceEmotionShopPopup$1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.live.gzone.emotion.f;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class LiveGzoneAudienceEmotionShopPopup$1 extends LinearLayoutManager	// class@000cd6
{
    public final f r;

    public void LiveGzoneAudienceEmotionShopPopup$1(f p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAudienceEmotionShopPopup$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-1, a1.e(66.00f));
    }
}
