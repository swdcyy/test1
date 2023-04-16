package com.kuaishou.live.preview.item.presenter.n$c;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kuaishou.live.preview.item.presenter.n;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import pp.a;
import java.lang.StringBuilder;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCameraFaceDataMessage;
import q87.c;
import com.kuaishou.live.preview.item.presenter.n$c$a;
import java.lang.Runnable;
import ekd.k1;
import java.io.IOException;

public class n$c implements IKwaiMediaPlayer$OnLiveInterActiveListener	// class@000e33
{
    public final n b;

    public void n$c(n p0){
       this.b = p0;
       super();
    }
    public void onParseAdSei(long p0,int p1,String p2){
    }
    public void onTsptInfo(byte[] p0,int p1){
       n$c uoc = n$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       try{
          LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(p0);
          if (liveFlvStrea != null && liveFlvStrea.messageType == 18) {
             liveFlvStrea = liveFlvStrea.cameraFaceInfo;
             if (liveFlvStrea == null) {
             label_0050 :
                return;
             }else {
                Object[] objArray = new Object[0];
                a.C().s("LiveSimplePlayGzoneCameraPresenter", "onTsptInfo:"+liveFlvStrea.showFace, objArray);
                k1.p(new n$c$a(this, liveFlvStrea), this.b);
             }
          }else {
             goto label_0050 ;
          }
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e4){
          e4.printStackTrace();
       }
       return;
    }
    public void onVideoFrameRender(long p0){
    }
}
