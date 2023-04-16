package com.yxcorp.gifshow.detail.trigger.b$b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$b;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$a;

public class b$b implements IMediaPlayer$OnInfoListener	// class@001a1f
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       ActionTrigger b;
       if (PatchProxy.isSupport(b$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          b$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, b.class, "22")) {
             Iterator iterator = tb.I.iterator();
             while (iterator.hasNext()) {
                ActionTrigger$b uob = iterator.next().c();
                Objects.requireNonNull(uob);
                if (PatchProxy.applyVoid(null, uob, ActionTrigger$b.class, "2")) {
                   continue ;
                }
                uob = uob.a;
                b = uob.b;
                boolean b1 = true;
                b.d = b1;
                int i = b.f + b1;
                b.f = i;
                uob.b();
             }
          }
       }
       return false;
    }
}
