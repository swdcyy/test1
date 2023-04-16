package com.kwai.locallife.live.widget.bubble.LocalLifeRNBubble$a;
import java.lang.Object;
import nsd.u;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class LocalLifeRNBubble$a	// class@000eb8
{

    public void LocalLifeRNBubble$a(){
       super();
    }
    public void LocalLifeRNBubble$a(u p0){
       super();
    }
    public final int a(View p0,int p1,String p2){
       if (PatchProxy.isSupport(LocalLifeRNBubble$a.class)) {
          p2 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, LocalLifeRNBubble$a.class, "2");
          if (p2 != PatchProxyResult.class) {
             return p2.intValue();
          }
       }
       int i = 0;
       try{
          p0 = p0.getTag(p1);
          if (p0 instanceof Number) {
             return p0.intValue();
          }else {
             return i;
          }
       }catch(java.lang.Exception e0){
       }
    }
}
