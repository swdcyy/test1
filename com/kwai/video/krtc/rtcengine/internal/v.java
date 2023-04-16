package com.kwai.video.krtc.rtcengine.internal.v;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import com.kwai.video.krtc.Arya;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.DataStreamConfig;

public class v	// class@00089c
{
    public Arya a;

    public void v(z p0){
       super();
       this.a = p0.a();
    }
    public int a(int p0,byte[] p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ov, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 < 0 || p1 == null) {
          Log.w("RtcEngineStreamController", "sendStreamMessage failed streamId invalid or data is empty");
          return -1;
       }else {
          this.a.sendStreamMessage(p0, p1);
          return 0;
       }
    }
    public int a(String p0,int p1,DataStreamConfig p2){
       if (PatchProxy.isSupport(v.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, v.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p1 < 0) {
          Log.w("RtcEngineStreamController", "createDataStream failed streamId invalid");
          return -1;
       }else {
          this.a.createDataStream(p0, p1, p2);
          return 0;
       }
    }
}
