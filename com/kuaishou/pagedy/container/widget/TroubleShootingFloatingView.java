package com.kuaishou.pagedy.container.widget.TroubleShootingFloatingView;
import com.kuaishou.pagedy.container.widget.FloatingView;
import android.content.Context;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import android.app.Activity;
import com.kuaishou.merchant.router.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import yz7.n;

public class TroubleShootingFloatingView extends FloatingView	// class@000a7f
{
    public String f;
    public String g;

    public void TroubleShootingFloatingView(Context p0,String p1,String p2){
       super(p0);
       this.f = p1;
       this.g = p2;
    }
    public String getFloatingText(){
       return "≈≈’œ";
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TroubleShootingFloatingView.class, "3")) {
          return;
       }
       b.o(this.f, p0.getContext(), "kwai://krn?bundleId=KwaishopTroubleShooting&componentName=page&liveId="+this.f+"&group="+this.g);
       return;
    }
    public int q(){
       return 0x7f0a0c6e;
    }
    public int r(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TroubleShootingFloatingView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (n.c(p0, 50.00f) / 3);
    }
    public int s(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TroubleShootingFloatingView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (n.c(p0, 50.00f) * 3);
    }
}
