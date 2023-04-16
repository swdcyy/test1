package com.kwai.video.westeros.stentorplugin.StentorPlugin$2;
import com.kwai.stentor.AsrProduct.Asr$PB;
import com.kwai.video.westeros.stentorplugin.StentorPlugin;
import java.lang.Object;
import java.lang.String;
import com.kwai.stentor.Audio.AudioCallback$DebugLevel;
import com.kwai.stentor.AsrProduct.Asr$PB$StentorASRState;
import com.kwai.stentor.AsrProduct.Asr$PB$StentorASRStatus;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.video.westeros.WesterosPlugin;
import java.lang.Enum;
import com.google.protobuf.MessageLite;
import com.kwai.chat.kwailink.data.PacketData;
import com.kwai.chat.sdk.signal.f;
import o75.j0;
import com.google.protobuf.nano.MessageNano;

public class StentorPlugin$2 implements Asr$PB	// class@0010bb
{
    public final StentorPlugin this$0;

    public void StentorPlugin$2(StentorPlugin p0){
       this.this$0 = p0;
       super();
    }
    public void StentorLog(String p0,AudioCallback$DebugLevel p1){
    }
    public void onResult(String p0,String p1,Asr$PB$StentorASRState p2,Asr$PB$StentorASRStatus p3,long p4,String p5){
       StentorPlugin$2 u2 = this;
       StentorPlugin$2 u21 = StentorPlugin$2.class;
       if (PatchProxy.isSupport(u21)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Long.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, u21, "3")) {
             return;
          }
       }
       if (u2.this$0.isReleased()) {
          return;
       }else {
          StentorPlugin$2 this$0 = u2.this$0;
          this$0.nativeUpdateAsrResult(this$0.nativePlugin, p0, p1, p2.ordinal(), p3.ordinal(), p4, p5);
          return;
       }
    }
    public void sendMessage(MessageLite p0,Class p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StentorPlugin$2.class, "2")) {
          return;
       }
       PacketData packetData = new PacketData();
       packetData.t(StentorPlugin.MESSAGE_SDK_COMMAND);
       packetData.w(p0.toByteArray());
       f.e().p(packetData, StentorPlugin.MESSAGE_SDK_MESSAGE_SEND_TIMEOUT_MILLIONS, 0, this.this$0.asrSendPacketListener, true);
       return;
    }
    public void sendMessage(MessageNano p0,Class p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, StentorPlugin$2.class, "1")) {
          return;
       }
       this.this$0.isReleased();
       return;
    }
}
