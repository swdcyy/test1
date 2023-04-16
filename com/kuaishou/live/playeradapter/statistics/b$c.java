package com.kuaishou.live.playeradapter.statistics.b$c;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosListener;
import com.kuaishou.live.playeradapter.statistics.b;
import java.lang.Object;
import com.kwai.player.qos.KwaiQosInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.LivePlayerUtils;
import java.util.Objects;
import tj3.k;
import java.lang.Float;
import tj3.r;
import com.kwai.video.waynelive.qosmoniter.QosLowReason;
import lw7.a;

public class b$c implements LivePlayerQosListener	// class@000d5f
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void onTickQosInfo(KwaiQosInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       b$c ta = this.a;
       b c = ta.c;
       float videoOutputF = LivePlayerUtils.getVideoOutputFramesPerSecond(ta.E());
       Objects.requireNonNull(c);
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(videoOutputF), c, ok, "26") && videoOutputF > 0)) {
          c.c(videoOutputF, 1000);
       }
       return;
    }
    public void qosTooLow(QosLowReason p0){
       a.b(this, p0);
    }
}
