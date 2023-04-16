package com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$ScaleType$2;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$ScaleType;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$a;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Point;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil;
import z12.e;

public final class VoicePartySurfaceUtil$ScaleType$2 extends VoicePartySurfaceUtil$ScaleType	// class@001ade
{

    public void VoicePartySurfaceUtil$ScaleType$2(String p0,int p1){
       super(p0, p1, null);
    }
    public void adjust(ViewGroup$MarginLayoutParams p0,Point p1,Point p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VoicePartySurfaceUtil$ScaleType$2.class, "1")) {
          return;
       }
       if (!VoicePartySurfaceUtil.h(p1) || !VoicePartySurfaceUtil.h(p2)) {
          String[] stringArray = new String[0];
          e.c("VoicePartySurfaceUtil", "FitCenter adjust: invalid size", stringArray);
          return;
       }else {
          float f = ((float)p2.x * 0x3f800000) / (float)p2.y;
          p2 = p1.x;
          p1 = p1.y;
          if (f - (((float)p2 * 0x3f800000) / (float)p1) >= 0) {
             p0.width = p2;
             int i = (int)((float)p2 / f);
             p0.height = i;
             p0.setMargins(0, ((p1 - i) / 2), 0, 0);
          }else {
             p0.height = p1;
             int i1 = (int)((float)p1 * f);
             p0.width = i1;
             p0.setMargins(((p2 - i1) / 2), 0, 0, 0);
          }
          return;
       }
    }
}
