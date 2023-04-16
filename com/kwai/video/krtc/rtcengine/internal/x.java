package com.kwai.video.krtc.rtcengine.internal.x;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.internal.x$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.utils.Log;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kwai.video.krtc.rtcengine.RtcEngine$Layout;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.Arya$KWAryaLayout;
import android.graphics.Bitmap;
import com.kwai.video.krtc.rtcengine.RtcEngine$DirectorConfig;
import com.kwai.video.krtc.Arya$DirectorConfig;
import com.kwai.video.krtc.observers.DirectorObserver;

public class x	// class@00089f
{
    public Arya a;
    public z b;
    public DirectorObserver c;
    public int d;

    public void x(Arya p0,z p1){
       super();
       this.d = 4;
       this.a = p0;
       this.b = p1;
       this.c = new x$1(this);
    }
    public static z a(x p0){
       return p0.b;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, x.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineVideoMix", "[VideoMix][director] enableVideoMix");
       this.a.enableVideoMix();
       return 0;
    }
    public int a(int p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ox, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineVideoMix", "[VideoMix][director] destroyScene "+p0);
       this.a.destroyScene(p0);
       return 0;
    }
    public int a(int p0,int p1){
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ox, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineVideoMix", "[VideoMix][director] setVideoMixOutputMode "+p0+" "+p1);
       this.a.setVideoMixOutputMode(p0, p1);
       return 0;
    }
    public int a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(x.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, x.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineVideoMix", "setSceneSourceMixMode sceneId: "+p0+" sourceId: "+p1+" mixMode: "+p2);
       this.a.setSceneSourceMixMode(p0, p1, p2);
       return 0;
    }
    public int a(int p0,RtcEngine$Layout[] p1,int p2,int p3,ByteBuffer p4,ByteBuffer p5){
       x ox = this;
       object oobject = p1;
       x ox1 = x.class;
       if (PatchProxy.isSupport(ox1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, ox1, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (ox.a.updateLayoutAndResolutionForScene(p0, this.a(p1), p2, p3, p4, p5)) {
          return 0;
       }else {
          return -1;
       }
    }
    public int a(int p0,RtcEngine$Layout[] p1,ByteBuffer p2){
       if (PatchProxy.isSupport(x.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, x.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a(p0, p1, 0, 0, p2, null);
    }
    public int a(Bitmap p0,int p1){
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ox, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineVideoMix", "[VideoMix][director] inputImageToSource sourceId: "+p1);
       this.a.inputImageToDirectorSource(p0, p1);
       return 0;
    }
    public int a(RtcEngine$DirectorConfig p0){
       Arya$DirectorConfig obj = PatchProxy.applyOneRefs(p0, this, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       String str = "[VideoMix][director] createScene ";
       Log.i("RtcEngineVideoMix", str+p0.sceneId+" resolution "+p0.outputWidth+" x "+p0.outputHeight+" mode "+p0.mixMode+" method "+p0.mixMethod);
       if (this.c(p0.outputWidth) || this.c(p0.outputHeight)) {
          Log.w("RtcEngineVideoMix", str+p0.sceneId+" outputWidth "+p0.outputWidth+" and outputHeight "+p0.outputHeight+" should be even number");
       }
       obj = new Arya$DirectorConfig();
       obj.outputWidth = p0.outputWidth;
       obj.outputHeight = p0.outputHeight;
       obj.sceneId = p0.sceneId;
       obj.mixMode = p0.mixMode;
       obj.mixMethod = p0.mixMethod;
       obj.eglContext = p0.eglContext;
       if (this.a.createScene(obj, this.c)) {
          this.b(this.d);
          return 0;
       }else {
          return -1;
       }
    }
    public final Arya$KWAryaLayout[] a(RtcEngine$Layout[] p0){
       Arya$KWAryaLayout[] obj = PatchProxy.applyOneRefs(p0, this, x.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Arya$KWAryaLayout[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          Arya$KWAryaLayout kWAryaLayout = new Arya$KWAryaLayout();
          kWAryaLayout.sourceId = p0[i].sourceId;
          kWAryaLayout.channelId = p0[i].channelId;
          kWAryaLayout.userId = p0[i].userId;
          kWAryaLayout.x = p0[i].x;
          kWAryaLayout.y = p0[i].y;
          kWAryaLayout.w = p0[i].w;
          kWAryaLayout.h = p0[i].h;
          kWAryaLayout.z = p0[i].z;
          obj[i] = kWAryaLayout;
       }
       return obj;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, x.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineVideoMix", "[VideoMix][director] disableVideoMix");
       this.a.disableVideoMix();
       return 0;
    }
    public int b(int p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ox, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineVideoMix", "[VideoMix][director] setVideoMixType "+p0);
       this.d = p0;
       this.a.setMixType(p0);
       return 0;
    }
    public int b(int p0,int p1){
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ox, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineVideoMix", "[VideoMix][director] setAsMainSourceOfScene "+p0+" "+p1);
       this.a.setAsMainSourceOfScene(p0, p1);
       return 0;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, x.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineVideoMix", "[VideoMix][director] enableVideoInnerMix");
       this.a.setEnableInnerMix(true);
       return 0;
    }
    public final boolean c(int p0){
       boolean b = true;
       if ((p0 % 2) == b) {
       }else {
          b = false;
       }
       return b;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, x.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineVideoMix", "[VideoMix][director] disableVideoInnerMix");
       this.a.setEnableInnerMix(false);
       return false;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, x.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineVideoMix", "disableVideoInnerMix");
       this.a.SetEnableReplaceImageInnerMix(true);
       return 0;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, x.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineVideoMix", "disableVideoInnerMix");
       this.a.SetEnableReplaceImageInnerMix(false);
       return false;
    }
}
