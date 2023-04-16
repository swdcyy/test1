package com.kuaishou.live.lite.player.basic.layout.LiveLitePlayerLayoutHandler$2;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.player.basic.layout.LiveLitePlayerLayoutHandler;
import java.lang.Object;
import at5.a;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import java.util.Objects;
import le5.f;
import com.kwai.video.waynelive.LivePlayerController;
import android.view.View;
import com.kuaishou.live.lite.framework.layoutmanager.widget.PlayerViewCropLayout;
import android.widget.FrameLayout;

public final class LiveLitePlayerLayoutHandler$2 extends Lambda implements q	// class@000a65
{
    public final LiveLitePlayerLayoutHandler this$0;

    public void LiveLitePlayerLayoutHandler$2(LiveLitePlayerLayoutHandler p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return Boolean.valueOf(this.invoke(p0, p1.intValue(), p2.intValue()));
    }
    public final boolean invoke(a p0,int p1,int p2){
       LiveLitePlayerLayoutHandler$2 obj;
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveLitePlayerLayoutHandler$2.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveLitePlayerLayoutHandler$2.class, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "interceptor");
       int width = this.this$0.m.getWidth();
       obj = this.this$0;
       if (obj.o != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(null, obj, LiveLitePlayerLayoutHandler.class, "1");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): f.b() ^ 0x01;
          if (b) {
             b = this.this$0.m.getHeight();
          }else {
             b = this.this$0.m.getHeight() + this.this$0.g;
          }
       }else {
          b = obj.m.getHeight();
       }
       LiveLitePlayerLayoutHandler$2 tthis$0 = this.this$0;
       boolean b1 = p0.l(tthis$0.n, p1, p2, width, b, tthis$0.c, tthis$0.b);
       if (b1) {
          this.this$0.c.setExtraWidth(0);
          this.this$0.c.setExtraHeight(0);
          this.this$0.c.setTranslationX(0);
          this.this$0.c.setTranslationY(0);
       }
       return b1;
    }
}
