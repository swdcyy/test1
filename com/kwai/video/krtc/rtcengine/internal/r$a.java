package com.kwai.video.krtc.rtcengine.internal.r$a;
import com.kwai.video.krtc.observers.MediaFrameObserver;
import com.kwai.video.krtc.rtcengine.internal.r;
import com.kwai.video.krtc.rtcengine.internal.r$1;
import java.lang.String;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.util.concurrent.locks.ReentrantLock;
import com.kwai.video.krtc.rtcengine.IMediaFrameObserver;
import com.kwai.video.krtc.rtcengine.RtcEngineAudioFrame;
import com.kwai.video.krtc.rtcengine.internal.z;
import android.os.Handler;
import com.kwai.video.krtc.rtcengine.internal.r$a$4;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.r$a$3;
import com.kwai.video.krtc.observers.CustomVideoDataObserver;
import com.kwai.video.krtc.Arya;
import java.util.Map;
import java.util.Set;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import java.util.Iterator;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderView;
import com.kwai.video.krtc.rtcengine.render.RtcEngineRenderer;
import com.kwai.video.krtc.rtcengine.internal.r$a$2;
import com.kwai.video.krtc.rtcengine.internal.r$a$1;
import com.kwai.video.krtc.GL.TextureBuffer;

public class r$a extends MediaFrameObserver	// class@000895
{
    public final r a;

    public void r$a(r p0){
       this.a = p0;
       super();
    }
    public void r$a(r p0,r$1 p1){
       super(p0);
    }
    public void onAudioDecoded(String p0,String p1,int p2,ByteBuffer p3,int p4,int p5){
       r$a uoa = r$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "10")) {
             return;
          }
       }
       if (p1 == null) {
          return;
       }else if(p2 == -1){
          return;
       }else {
          r.a(this.a).lock();
          IMediaFrameObserver iMediaFrameO = r.b(this.a);
          r.a(this.a).unlock();
          if (iMediaFrameO != null && r.a(this.a, 2048)) {
             iMediaFrameO.onRemoteAudioDecoded(p1, p0, RtcEngineAudioFrame.createAudioRawFrame(p3, p3.remaining(), p4, p5, 0));
          }
          return;
       }
    }
    public void onAudioEncoded(String p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r$a.class, "8")) {
          return;
       }
       r.c(this.a).j().post(new r$a$4(this));
       r.a(this.a).lock();
       IMediaFrameObserver iMediaFrameO = r.b(this.a);
       r.a(this.a).unlock();
       if (iMediaFrameO != null && r.a(this.a, 512)) {
          RtcEngineAudioFrame.createAudioEncodedFrame(p1, p1.remaining());
          iMediaFrameO.onLocalAudioEncoded(p1);
       }
       return;
    }
    public void onAudioPreDecode(String p0,String p1,int p2,ByteBuffer p3){
       if (PatchProxy.isSupport(r$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, r$a.class, "9")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (p2 == -1) {
          return;
       }
       r.a(this.a).lock();
       IMediaFrameObserver iMediaFrameO = r.b(this.a);
       r.a(this.a).unlock();
       if (iMediaFrameO != null && r.a(this.a, 1024)) {
          iMediaFrameO.onRemoteAudioPreDecoded(p1, p0, RtcEngineAudioFrame.createAudioEncodedFrame(p3, p3.remaining()));
       }
       return;
    }
    public void onAudioPreEncode(String p0,ByteBuffer p1,int p2,int p3){
       if (PatchProxy.isSupport(r$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, r$a.class, "7")) {
          return;
       }
       r.c(this.a).j().post(new r$a$3(this));
       r.a(this.a).lock();
       IMediaFrameObserver iMediaFrameO = r.b(this.a);
       r.a(this.a).unlock();
       if (iMediaFrameO != null && r.a(this.a, 256)) {
          iMediaFrameO.onLocalAudioPreEncoded(RtcEngineAudioFrame.createAudioRawFrame(p1, p1.remaining(), p2, p3, 0));
       }
       return;
    }
    public void onCustomVideoData(String p0,String p1,byte[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, r$a.class, "5")) {
          return;
       }
       if (r.d(this.a) != null) {
          r.d(this.a).onCustomVideoData(p1, p0, p2);
       }
       return;
    }
    public void onVideoDecoded(String p0,String p1,int p2,ByteBuffer p3,int p4,int p5,int p6,int p7,int p8){
       Object[] objArray;
       RtcEngineVideoFrame rtcEngineVid1;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       r$a uoa = r$a.class;
       int i = 3;
       int i1 = 2;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[9];
          objArray[i3] = oobject;
          objArray[i2] = oobject1;
          objArray[i1] = Integer.valueOf(p2);
          objArray[i] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, obj, uoa, "6")) {
             return;
          }
       }
       if (oobject1 == null) {
          return;
       }else {
          RtcEngineVideoFrame rtcEngineVid = null;
          int elapsedTime = r.e(obj.a).getElapsedTime(oobject1, i3);
          if (elapsedTime == -1) {
             return;
          }else if(r.f(obj.a) != null){
             objArray = new Object[i];
             objArray[i3] = oobject;
             objArray[i2] = oobject1;
             objArray[i1] = Integer.valueOf(p2);
             Set set = r.f(obj.a).get(String.format("%s-%s-%d", objArray));
             if (set != null) {
                rtcEngineVid1 = new RtcEngineVideoFrame(p6, p3, p4, p5, 0, 0, p7, false, true, false);
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   iterator.next().getRenderer().renderFrame(rtcEngineVid);
                }
             }
          }
          rtcEngineVid1 = rtcEngineVid;
          if (!p2) {
             r$a$2 uoa$2 = new r$a$2(this, p1, p0, p2, p4, p5, elapsedTime);
             r.c(obj.a).j().post(v14);
          }
          r.a(obj.a).lock();
          IMediaFrameObserver iMediaFrameO = r.b(obj.a);
          r.a(obj.a).unlock();
          if (iMediaFrameO != null && r.a(obj.a, 8)) {
             if (rtcEngineVid1 == null) {
                rtcEngineVid1 = new RtcEngineVideoFrame(p6, p3, p4, p5, 0, 0, p7, false, false, false);
             }
             if (!p2) {
                iMediaFrameO.onRemoteVideoDecoded(oobject1, oobject, rtcEngineVid1);
             }else {
                iMediaFrameO.onRemoteScreenCaptureDecoded(oobject1, oobject, rtcEngineVid1);
             }
          }
          return;
       }
    }
    public void onVideoEncoded(String p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r$a.class, "3")) {
          return;
       }
       r.c(this.a).j().post(new r$a$1(this));
       r.a(this.a).lock();
       IMediaFrameObserver iMediaFrameO = r.b(this.a);
       r.a(this.a).unlock();
       if (iMediaFrameO != null && r.a(this.a, 2)) {
          RtcEngineVideoFrame.createVideoEncodedFrame(p1);
          iMediaFrameO.onLocalVideoEncoded(p1);
       }
       return;
    }
    public void onVideoPreDecode(String p0,String p1,int p2,ByteBuffer p3){
       if (PatchProxy.isSupport(r$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, r$a.class, "4")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (p2 == -1) {
          return;
       }
       r.a(this.a).lock();
       IMediaFrameObserver iMediaFrameO = r.b(this.a);
       r.a(this.a).unlock();
       if (iMediaFrameO != null && r.a(this.a, 4)) {
          iMediaFrameO.onRemoteVideoPreDecoded(p1, p0, p3);
       }
       return;
    }
    public void onVideoPreEncodeByteBuffer(String p0,ByteBuffer p1,int p2,int p3,int p4){
       r$a uoa = r$a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       r.a(this.a).lock();
       IMediaFrameObserver iMediaFrameO = r.b(this.a);
       r.a(this.a).unlock();
       if (iMediaFrameO != null && r.a(this.a, i)) {
          RtcEngineVideoFrame rtcEngineVid = new RtcEngineVideoFrame(p4, p1, p2, p3, 0, 0, 0);
          iMediaFrameO.onLocalVideoPreEncoded(uoa);
       }
       return;
    }
    public void onVideoPreEncodeTexture(String p0,TextureBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r$a.class, "2")) {
          return;
       }
       r.a(this.a).lock();
       IMediaFrameObserver iMediaFrameO = r.b(this.a);
       r.a(this.a).unlock();
       if (iMediaFrameO != null) {
          int i = 1;
          if (r.a(this.a, i)) {
             int width = p1.getWidth();
             int height = p1.getHeight();
             int rotation = p1.getRotation();
             if (rotation != 90 && rotation != 270) {
                i = 0;
             }
             int i1 = (i)? height: width;
             int i2 = (i)? width: height;
             RtcEngineVideoFrame rtcEngineVid = new RtcEngineVideoFrame(i1, i2, p1.getTimestamp(), rotation, p1, false);
             iMediaFrameO.onLocalVideoPreEncoded(v11);
             v11.release();
          }
       }
       return;
    }
}
