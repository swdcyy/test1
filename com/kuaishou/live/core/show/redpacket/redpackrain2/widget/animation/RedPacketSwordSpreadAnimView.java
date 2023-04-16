package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordSpreadAnimView;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;

public final class RedPacketSwordSpreadAnimView extends RedPacketSwordAnimView	// class@000f37
{
    public Animator l;
    public HashMap m;

    public void RedPacketSwordSpreadAnimView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void RedPacketSwordSpreadAnimView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void RedPacketSwordSpreadAnimView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public View a(int p0){
       View obj;
       if (PatchProxy.isSupport(RedPacketSwordSpreadAnimView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RedPacketSwordSpreadAnimView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.m == null) {
          this.m = new HashMap();
       }
       obj = this.m.get(Integer.valueOf(p0));
       if (obj == null) {
          obj = this.findViewById(p0);
          this.m.put(Integer.valueOf(p0), obj);
       }
       return obj;
    }
}
