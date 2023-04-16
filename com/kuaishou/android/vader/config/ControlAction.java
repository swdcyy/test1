package com.kuaishou.android.vader.config.ControlAction;
import java.lang.Object;
import com.kuaishou.android.vader.Channel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import tq.b;
import java.lang.Number;
import java.lang.Float;

public class ControlAction	// class@000710
{
    public Integer channel;
    public Float sampleRatio;

    public void ControlAction(){
       super();
    }
    public Channel getChannel(){
       ControlAction obj = PatchProxy.apply(null, this, ControlAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.channel;
       if (obj != null && (obj.intValue() < Channel.REAL_TIME.getValue() || this.channel.intValue() > Channel.USER_TRACK.getValue())) {
          return null;
       }
       return b.a(this.channel.intValue());
    }
    public float getSampleRatio(){
       ControlAction obj = PatchProxy.apply(null, this, ControlAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.sampleRatio;
       if (obj != null && (obj.floatValue() < 0 || this.sampleRatio.floatValue() - 0x3f800000 > 0)) {
          return 0x3f800000;
       }
       return this.sampleRatio.floatValue();
    }
}
