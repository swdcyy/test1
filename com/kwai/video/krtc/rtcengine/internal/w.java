package com.kwai.video.krtc.rtcengine.internal.w;
import com.kwai.video.krtc.Arya;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import com.kwai.video.krtc.Arya$VideoFrameAttribute;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.GL.TextureBuffer;
import java.lang.Integer;
import com.kwai.video.krtc.GL.TextureBuffer$Type;
import android.os.Handler;
import com.kwai.video.krtc.GL.e;
import com.kwai.video.krtc.utils.d$a;

public class w	// class@00089d
{
    public boolean a;
    public Arya b;

    public void w(Arya p0){
       super();
       this.a = false;
       this.b = p0;
    }
    public final int a(RtcEngineVideoFrame p0,Arya$VideoFrameAttribute p1){
       int i;
       byte[] uobyteArray1;
       int i1;
       RtcEngineVideoFrame obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.alpha;
       byte[] uobyteArray = null;
       if (obj != null) {
          if (obj.isDirect()) {
             i = p0.alpha.remaining();
             uobyteArray1 = new byte[i];
             p0.alpha.get(uobyteArray1, 0, i);
             p0.alpha.position(0);
          }else {
             uobyteArray1 = p0.data.array();
          }
       }else {
          uobyteArray1 = uobyteArray;
       }
       if (p0.data.isDirect()) {
          if (p0.alpha != null) {
             i = p0.data.remaining();
             uobyteArray = new byte[i];
             p0.data.get(uobyteArray, 0, i);
             p0.data.position(0);
          }
       }else {
          uobyteArray = p0.data.array();
       }
       if (uobyteArray1 != null) {
          i1 = this.b.inputRawVideo(uobyteArray, uobyteArray1, p1);
       }else if(uobyteArray != null){
          i1 = this.b.inputRawVideo(uobyteArray, p1, 0);
       }else {
          i1 = this.b.inputRawVideo(p0.data.duplicate(), p1);
       }
       return i1;
    }
    public void a(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "1")) {
          return;
       }
       Log.i("RtcEngineVideoInput", "setExternalRawVideoSource "+p0);
       this.a = p0;
       return;
    }
    public boolean a(RtcEngineVideoFrame p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.a == null || p0 == null) {
          this.c(p0);
          return b;
       }else if(p0.isTexture != null){
          i = this.b.inputRawVideo(this.b(p0), p0.rois, b);
       }else {
          Arya$VideoFrameAttribute videoFrameAt = new Arya$VideoFrameAttribute(p0.format, p0.width, p0.height, p0.timestamp, p0.rotation, p0.colorSpace, p0.rois);
          i = this.a(p0, obj);
       }
       if (!i) {
          b = true;
       }
       return b;
    }
    public boolean a(RtcEngineVideoFrame p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ow, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.a == null || p0 == null) {
          this.c(p0);
          return false;
       }else {
          return this.b(p0, p1);
       }
    }
    public final TextureBuffer b(RtcEngineVideoFrame p0){
       RtcEngineVideoFrame obj = PatchProxy.applyOneRefs(p0, this, w.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.textureBuffer;
       if (obj == null) {
          TextureBuffer textureBuffe = new TextureBuffer(p0.width, p0.height, p0.rotation, p0.timestamp, TextureBuffer$Type.values()[p0.textureType], p0.textureId, p0.transformMatrix, null, null, null);
       }
       return obj;
    }
    public boolean b(RtcEngineVideoFrame p0,int p1){
       int i;
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ow, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }else if(p0.isTexture != null){
          i = this.b.inputRawVideo(this.b(p0), p0.rois, p1, b);
       }else {
          Arya$VideoFrameAttribute videoFrameAt = new Arya$VideoFrameAttribute(p0.format, p0.width, p0.height, p0.timestamp, p0.rotation, p0.colorSpace, p0.rois, p1);
          i = this.a(p0, v11);
       }
       if (!i) {
          b = true;
       }
       return b;
    }
    public final void c(RtcEngineVideoFrame p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "7")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.textureBuffer;
          if (p0 != null) {
             p0.release();
          }
       }
       return;
    }
}
