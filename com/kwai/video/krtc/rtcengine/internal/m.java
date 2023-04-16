package com.kwai.video.krtc.rtcengine.internal.m;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import java.util.ArrayList;
import com.kwai.video.krtc.rtcengine.RtcEngineFileStreamingConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.HashMap;
import com.kwai.video.krtc.rtcengine.internal.m$1;
import java.util.List;
import com.kwai.video.krtc.observers.FileStreamingObserver;
import com.kwai.video.krtc.utils.Log;
import java.lang.Boolean;

public class m	// class@000882
{
    public Arya a;
    public z b;
    public String c;

    public void m(Arya p0,z p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static z a(m p0){
       return p0.b;
    }
    public static String b(m p0){
       return p0.c;
    }
    public int a(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, m.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       this.a.stopFileStreaming();
       return 0;
    }
    public int a(String p0,long p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          p0 = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, om, "5");
          if (p0 != PatchProxyResult.class) {
             return p0.intValue();
          }
       }
       this.a.seekFileStreamingToMs(p1);
       return 0;
    }
    public int a(String p0,ArrayList p1,RtcEngineFileStreamingConfig p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, m.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       if (p1 != null && (p2 == null || TextUtils.isEmpty(p2.savePath))) {
          Log.w("RtcEngineFileStreaming", "startFileStream params is null");
          return -1;
       }else {
          this.c = null;
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             HashMap hashMap = new HashMap();
             hashMap.put("url", str);
             uArrayList.add(hashMap);
             if (TextUtils.isEmpty(this.c)) {
                this.c = str;
             }
          }
          this.a.startFileStreaming(uArrayList, p2.savePath, 0x5000, new m$1(this));
          return 0;
       }
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, m.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.isStartingFileStreaming();
    }
    public int b(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, m.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       this.a.pauseFileStreaming();
       return 0;
    }
    public int c(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, m.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       this.a.resumeFileStreaming();
       return 0;
    }
}
