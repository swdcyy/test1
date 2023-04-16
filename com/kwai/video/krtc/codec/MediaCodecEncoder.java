package com.kwai.video.krtc.codec.MediaCodecEncoder;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Queue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedList;
import android.media.MediaCodecList;
import android.media.MediaCodecInfo;
import java.lang.Throwable;
import com.kwai.video.krtc.utils.Log;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import android.media.MediaCodecInfo$CodecCapabilities;
import java.lang.Integer;
import com.kwai.video.krtc.codec.MediaCodecEncoder$a;
import android.media.MediaCodecInfo$VideoCapabilities;
import java.util.Iterator;
import com.kwai.video.krtc.codec.MediaCodecEncoder$b;
import android.media.MediaCodecInfo$CodecProfileLevel;
import java.nio.ByteBuffer;
import java.lang.Number;
import java.lang.Math;
import android.util.Range;
import java.lang.Comparable;
import java.lang.Exception;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Build$VERSION;
import com.oplus.ocs.roiencode.RoiEncodeUnitClient;
import com.oplus.ocs.roiencode.RoiEncodeUnit;
import com.kwai.video.krtc.codec.MediaCodecEncoder$2;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import com.oplus.ocs.base.common.api.OplusApi;
import com.kwai.video.krtc.codec.MediaCodecEncoder$1;
import com.oplus.ocs.base.common.api.OnConnectionFailedListener;
import java.lang.Boolean;
import android.os.Build;
import android.media.MediaCodec;
import android.os.Bundle;
import java.lang.Thread;
import com.kwai.video.krtc.codec.MediaCodecEncoder$OutputBufferInfo;
import android.media.MediaCodec$BufferInfo;
import java.nio.Buffer;
import java.lang.Long;
import android.media.Image;
import com.kwai.video.krtc.render.GLDrawer;
import com.kwai.video.krtc.GL.EglBase$Context;
import com.kwai.video.krtc.codec.a;
import com.kwai.video.krtc.codec.a$a;
import com.kwai.video.krtc.codec.MediaCodecEncoder$c;
import android.media.MediaCodecInfo$EncoderCapabilities;
import android.view.Surface;
import android.media.MediaCrypto;
import com.kwai.video.krtc.GL.EglBase;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.krtc.codec.MediaCodecEncoder$3;
import java.lang.Runnable;
import com.kwai.video.krtc.utils.e;
import com.kwai.video.krtc.GL.EglBase14;

public class MediaCodecEncoder	// class@00077e
{
    public Thread b;
    public MediaCodec c;
    public int colorFormat;
    public EglBase d;
    public int e;
    public int f;
    public int g;
    public Surface h;
    public ByteBuffer[] i;
    public boolean isRoiEnabled;
    public GLDrawer j;
    public int k;
    public int l;
    public ByteBuffer m;
    public RoiEncodeUnitClient n;
    public int stride;
    public static final String a = "com.kwai.video.krtc.codec.MediaCodecEncoder";

    public void MediaCodecEncoder(){
       super();
       this.m = null;
       this.isRoiEnabled = false;
       this.n = null;
    }
    public static String a(){
       return MediaCodecEncoder.a;
    }
    public static Queue a(String p0,List p1){
       String name;
       MediaCodecInfo$CodecCapabilities capabilities;
       int i7;
       int i8;
       MediaCodecInfo$CodecCapabilities uCodecCapabi;
       int i9;
       Object obj = p0;
       StringBuilder str = null;
       MediaCodecInfo obj1 = PatchProxy.applyTwoRefs(obj, p1, str, MediaCodecEncoder.class, "16");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       LinkedList linkedList = new LinkedList();
       int i = 0;
       int i1 = 0;
       try{
          while (i1 < MediaCodecList.getCodecCount()) {
             try{
                obj1 = MediaCodecList.getCodecInfoAt(i1);
             }catch(java.lang.IllegalArgumentException e0){
                Log.e(MediaCodecEncoder.a, "Cannot retrieve encoder codec info", e0);
                obj1 = str;
             }
             try{
                if (obj1 != null && obj1.isEncoder()) {
                   String[] supportedTyp = obj1.getSupportedTypes();
                   int len = supportedTyp.length;
                   int i2 = 0;
                   while (true) {
                      if (i2 < len) {
                         if ((supportedTyp[i2]).equals(obj)) {
                            name = obj1.getName();
                         label_0053 :
                            if (name != null && !(name.toLowerCase()).contains("google")) {
                               String a = MediaCodecEncoder.a;
                               String str1 = "Found candidate encoder: "+name;
                               Log.i(a, str1);
                               capabilities = obj1.getCapabilitiesForType(obj);
                               MediaCodecInfo$CodecCapabilities colorFormats = capabilities.colorFormats;
                               i2 = colorFormats.length;
                               for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                                  Log.i(MediaCodecEncoder.a, " Color: 0x"+Integer.toHexString(colorFormats[i3]));
                               }
                               int[] ointArray = new int[2];
                               if (obj.equalsIgnoreCase(MediaCodecEncoder$a.a.b())) {
                                  MediaCodecEncoder.a(capabilities, ointArray);
                               }else {
                                  MediaCodecEncoder.b(capabilities, ointArray);
                               }
                               Log.i(MediaCodecEncoder.a, "Found candidate encoder profile: "+ointArray[i]+", level: "+ointArray[1]);
                               MediaCodecInfo$VideoCapabilities videoCapabil = capabilities.getVideoCapabilities();
                               Iterator iterator = p1.iterator();
                               while (iterator.hasNext()) {
                                  int i4 = iterator.next().intValue();
                                  MediaCodecInfo$CodecCapabilities colorFormats1 = capabilities.colorFormats;
                                  int len1 = colorFormats1.length;
                                  int i5 = 0;
                                  while (i5 < len1) {
                                     int i6 = colorFormats1[i5];
                                     if (i6 == i4) {
                                        Log.i(MediaCodecEncoder.a, "Found target encoder for mime "+obj+" : "+name+". Color: 0x"+Integer.toHexString(i6));
                                        i = 0;
                                        i7 = i5;
                                        i8 = len1;
                                        uCodecCapabi = colorFormats1;
                                        i9 = i4;
                                        MediaCodecEncoder$b uob = new MediaCodecEncoder$b(name, i6, ointArray[i], ointArray[1], videoCapabil);
                                        linkedList.add(str);
                                     }else {
                                        i7 = i5;
                                        i8 = len1;
                                        uCodecCapabi = colorFormats1;
                                        i9 = i4;
                                     }
                                     i5 = i7 + 1;
                                     colorFormats1 = uCodecCapabi;
                                     i4 = i9;
                                     len1 = i8;
                                     str = null;
                                  }
                               }
                            }
                         }else {
                            i2 = i2 + 1;
                         }
                      }else {
                         name = str;
                         goto label_0053 ;
                      }
                   }
                }
             }catch(java.lang.IllegalArgumentException e0){
                Log.e(MediaCodecEncoder.a, "Cannot retrieve encoder capabilities", e0);
             }catch(java.lang.RuntimeException e0){
                Log.e(MediaCodecEncoder.a, "find hw encoder run exception", e0);
             }
             i1 = i1 + 1;
             str = null;
          }
          return linkedList;
       }catch(java.lang.RuntimeException e0){
       }
    }
    public static void a(MediaCodecInfo$CodecCapabilities p0,int[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, MediaCodecEncoder.class, "15")) {
          return;
       }
       p0 = p0.profileLevels;
       int len = p0.length;
       int i = 0;
       int i1 = 1;
       int i2 = 1;
       int i3 = 1;
       int i4 = 1;
       MediaCodecInfo$CodecProfileLevel uCodecProfil = 2;
       StringBuilder str = 8;
       while (i < len) {
          object oobject = p0[i];
          MediaCodecInfo$CodecProfileLevel profile = oobject.profile;
          if (profile == str) {
             if (profile > i2) {
                i2 = profile;
             }
             uCodecProfil = oobject.level;
             if (uCodecProfil > i3) {
                i3 = uCodecProfil;
             }
          }else if(profile == uCodecProfil){
             if (profile > i2) {
                i2 = profile;
             }
             uCodecProfil = oobject.level;
             if (uCodecProfil > i4) {
                i4 = uCodecProfil;
             }
          }else if(profile == 1){
             uCodecProfil = oobject.level;
             if (uCodecProfil > i1) {
                i1 = uCodecProfil;
             }
          }else {
             Log.i(MediaCodecEncoder.a, "Other profile: "+oobject.profile+", level: "+oobject.level);
          }
          i = i + 1;
       }
       if (i2 == str) {
          i1 = i3;
       }else if(i2 == uCodecProfil){
          i1 = i4;
       }
       p1[0] = i2;
       p1[1] = i1;
       return;
    }
    public static void b(MediaCodecInfo$CodecCapabilities p0,int[] p1){
       p0 = p0.profileLevels;
       int len = p0.length;
       int i = 0;
       int i1 = 1;
       while (i < len) {
          object oobject = p0[i];
          if (oobject.profile == 1) {
             MediaCodecInfo$CodecProfileLevel level = oobject.level;
             if (level > i1) {
                i1 = level;
             }
          }
          i = i + 1;
       }
       p1[0] = 1;
       p1[1] = i1;
       return;
    }
    public final int a(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaCodecEncoder.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return -1;
       }
       p0 = p0.asReadOnlyBuffer();
       byte b = 0;
       int i = p0.position();
       while (p0.hasRemaining()) {
          b = p0.get();
          if (!b) {
             continue ;
          }else {
             break ;
          }
       }
       int i1 = p0.position();
       if (b != 1 || (i1 - i) < 3) {
          return -1;
       }
       return Math.max(i, (i1 - 4));
    }
    public final MediaCodecEncoder$b a(Queue p0,int p1,int p2,int p3){
       MediaCodecEncoder$b obj;
       Integer this;
       boolean b;
       if (PatchProxy.isSupport(MediaCodecEncoder.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, MediaCodecEncoder.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = null;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          obj = obj1.e;
          this = 1;
          if (obj != null) {
             try{
                Range supportedWid = obj.getSupportedWidths();
                if (supportedWid != null) {
                   Log.i(MediaCodecEncoder.a, "checkSupport support width range: "+supportedWid.toString());
                }
                Range supportedHei = obj.getSupportedHeights();
                if (supportedHei != null) {
                   Log.i(MediaCodecEncoder.a, "checkSupport support height range: "+supportedHei.toString());
                }
                if (supportedWid != null && supportedHei != null) {
                   int i = supportedWid.getLower().intValue() * supportedHei.getLower().intValue();
                   int i1 = supportedWid.getUpper().intValue() * supportedHei.getUpper().intValue();
                   long l = (long)i1;
                   int i2 = p1 * p2;
                   long l1 = (long)i2;
                   if (l1 - (long)i < 0 || l1 - l > 0) {
                      this = null;
                   }
                }
                if (this) {
                   Range supportedFra = obj.getSupportedFrameRates();
                   if (supportedFra != null) {
                      Log.i(MediaCodecEncoder.a, "checkSupport frame rate range: "+supportedFra.toString());
                   }
                   if (supportedFra != null) {
                      b = supportedFra.contains(Integer.valueOf(p3));
                   }
                }
                b = this;
             }catch(java.lang.Exception e0){
                Log.i(MediaCodecEncoder.a, "checkSupport failed: "+e0.toString());
             }
          }else {
             b = 1;
          }
       }
       return str;
    }
    public final void a(Context p0,MediaFormat p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MediaCodecEncoder.class, "2")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          RoiEncodeUnitClient roiEncodeUni = RoiEncodeUnit.getRoiEncodeClient(p0).addOnConnectionSucceedListener(new MediaCodecEncoder$2(this)).addOnConnectionFailedListener(new MediaCodecEncoder$1(this));
          this.n = roiEncodeUni;
          if (roiEncodeUni != null) {
             Log.i(MediaCodecEncoder.a, "request enable qcom hw codec roi");
             this.n.enableRoiEncode(p1, 1);
          }
       }
       return;
    }
    public final boolean a(String p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, MediaCodecEncoder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = Build.BRAND;
       Log.i(MediaCodecEncoder.a, "brandName: "+obj);
       boolean b = (!obj.isEmpty() && ((obj.toLowerCase()).contains("oppo") && (!p0.isEmpty() && p0.startsWith(p1))))? true: false;
       return b;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, MediaCodecEncoder.class, "4")) {
          return;
       }
       MediaFormat inputFormat = this.c.getInputFormat();
       String a = MediaCodecEncoder.a;
       StringBuilder str = "HW codec application config format: ";
       String str1 = (inputFormat != null)? inputFormat.toString(): "";
       Log.i(a, str+str1);
       return;
    }
    public final boolean b(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaCodecEncoder.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          p0 = p0.asReadOnlyBuffer();
          do {
          } while (p0.hasRemaining() && !p0.get());
          byte b1 = p0.get();
          if (this.l == MediaCodecEncoder$a.a.a()) {
             if ((b1 & 0x1f) != 7) {
             label_0044 :
                return b;
             }
          }else if(((b1 >> 1) & 0x3f) == 32){
          }
          b = true;
          goto label_0044 ;
       }else {
          goto label_0044 ;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, MediaCodecEncoder.class, "13")) {
          return;
       }
       Bundle uBundle = new Bundle();
       uBundle.putInt("request-sync", 0);
       this.c.setParameters(uBundle);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, MediaCodecEncoder.class, "17")) {
          return;
       }
       if (this.b.getId() - Thread.currentThread().getId()) {
          Log.w(MediaCodecEncoder.a, "MediaCodecEncoder is not on valid thread.");
       }
       return;
    }
    public final int dequeueInputBuffer(int p0){
       MediaCodecEncoder mediaCodecEn = MediaCodecEncoder.class;
       if (PatchProxy.isSupport(mediaCodecEn)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, mediaCodecEn, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          this.d();
          return this.c.dequeueInputBuffer((long)p0);
       }catch(java.lang.IllegalStateException e4){
          Log.e(MediaCodecEncoder.a, "dequeueIntputBuffer failed", e4);
          return -2;
       }
    }
    public MediaCodecEncoder$OutputBufferInfo dequeueOutputBuffer(){
       MediaCodec$BufferInfo uBufferInfo;
       MediaCodecEncoder$OutputBufferInfo outputBuffer1;
       MediaCodecEncoder$OutputBufferInfo outputBuffer2;
       Object[] objArray = null;
       MediaCodec$BufferInfo obj = PatchProxy.apply(objArray, this, MediaCodecEncoder.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          this.d();
          obj = new MediaCodec$BufferInfo();
          long l = 0;
          int i = this.c.dequeueOutputBuffer(obj, l);
          int i1 = 1;
          boolean b = false;
          if (i >= 0) {
             uBufferInfo = (obj.flags & 0x02)? 1: null;
             if (uBufferInfo) {
                this.m = ByteBuffer.allocateDirect(obj.size);
                this.i[i].position(obj.offset);
                this.i[i].limit((obj.offset + obj.size));
                this.m.put(this.i[i]);
                this.c.releaseOutputBuffer(i, b);
                i = this.c.dequeueOutputBuffer(obj, l);
             }
          }
          MediaCodec$BufferInfo uBufferInfo1 = -1;
          if (i >= 0) {
             ByteBuffer uByteBuffer = this.i[i].duplicate();
             uByteBuffer.position(obj.offset);
             uByteBuffer.limit((obj.offset + obj.size));
             boolean i2 = this.a(uByteBuffer);
             if (i2 == uBufferInfo1) {
                Log.e(MediaCodecEncoder.a, "Cannot find start code");
                outputBuffer1 = new MediaCodecEncoder$OutputBufferInfo(-1, null, false, -1);
                return obj;
             }else {
                uByteBuffer.position(i2);
                i2 = (obj.flags & i1)? true: false;
                if (i2 && (this.m != null && !this.b(uByteBuffer))) {
                   ByteBuffer uByteBuffer1 = ByteBuffer.allocateDirect((this.m.capacity() + uByteBuffer.remaining()));
                   this.m.rewind();
                   uByteBuffer1.put(this.m);
                   uByteBuffer1.put(uByteBuffer);
                   uByteBuffer1.position(b);
                   outputBuffer2 = new MediaCodecEncoder$OutputBufferInfo(i, uByteBuffer1, i2, obj.presentationTimeUs);
                   return uBufferInfo;
                }else {
                   outputBuffer2 = new MediaCodecEncoder$OutputBufferInfo(i, uByteBuffer.slice(), i2, obj.presentationTimeUs);
                   return uBufferInfo;
                }
             }
          }else if(i == -3){
             this.i = this.c.getOutputBuffers();
             return this.dequeueOutputBuffer();
          }else if(i == -2){
             this.e();
             return this.dequeueOutputBuffer();
          }else if(i == uBufferInfo1){
             return objArray;
          }else {
             Log.e(MediaCodecEncoder.a, "dequeue output buffer failed result "+i);
             outputBuffer1 = new MediaCodecEncoder$OutputBufferInfo(-1, null, false, -1);
             return obj;
          }
       }catch(java.lang.IllegalStateException e0){
          Log.e(MediaCodecEncoder.a, "dequeue output buffer failed", e0);
          MediaCodecEncoder$OutputBufferInfo outputBuffer = new MediaCodecEncoder$OutputBufferInfo(-1, null, false, -1);
          return e0;
       }
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, MediaCodecEncoder.class, "21")) {
          return;
       }
       MediaCodecEncoder tn = this.n;
       if (tn != null && Build$VERSION.SDK_INT >= 23) {
          this.isRoiEnabled = tn.getRoiFlag(this.c);
       }
       String a = MediaCodecEncoder.a;
       StringBuilder str = "encoder roi ";
       String str1 = (this.isRoiEnabled != null)? "enabled": "disabled";
       Log.i(a, str+str1);
       return;
    }
    public final boolean encodeBuffer(boolean p0,int p1,int p2,long p3){
       if (PatchProxy.isSupport(MediaCodecEncoder.class)) {
          Object obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Long.valueOf(p3), this, MediaCodecEncoder.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       try{
          this.d();
          if (p0) {
             this.c();
          }
          this.c.queueInputBuffer(p1, 0, p2, p3, 0);
          return true;
       }catch(java.lang.IllegalStateException e9){
          Log.e(MediaCodecEncoder.a, "encode buffer failed", e9);
          return false;
       }
    }
    public ByteBuffer[] getInputBuffers(){
       ByteBuffer[] obj = PatchProxy.apply(null, this, MediaCodecEncoder.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.getInputBuffers();
       Log.d(MediaCodecEncoder.a, "Input buffers: "+obj.length);
       return obj;
    }
    public final Image getInputImage(int p0){
       MediaCodecEncoder mediaCodecEn = MediaCodecEncoder.class;
       if (PatchProxy.isSupport(mediaCodecEn)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, mediaCodecEn, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          this.d();
          return this.c.getInputImage(p0);
       }catch(java.lang.IllegalStateException e4){
          Log.e(MediaCodecEncoder.a, "getInputImage failed", e4);
          return null;
       }
    }
    public long getNativeDrawer(){
       MediaCodecEncoder obj = PatchProxy.apply(null, this, MediaCodecEncoder.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       Log.d(MediaCodecEncoder.a, "Getting native drawer.");
       obj = this.j;
       if (obj != null) {
          return obj.getNativeDrawer();
       }
       return 0;
    }
    public final boolean initEncode(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,boolean p9,boolean p10,boolean p11,Context p12,EglBase$Context p13){
       String obj;
       String str4;
       MediaCodecEncoder$b obj1;
       MediaCodecEncoder$b uob1;
       MediaCodecEncoder$b uob2;
       String str5;
       String str6;
       MediaCodec mediaCodec;
       MediaCodecInfo$EncoderCapabilities encoderCapab;
       Range complexityRa;
       Surface surface;
       MediaCodecEncoder d;
       MediaFormat inputFormat;
       Object obj3;
       MediaCodec mediaCodec1;
       int i = this;
       int i1 = p0;
       int i2 = p1;
       int i3 = p4;
       int i4 = p5;
       int i5 = p6;
       int i6 = p7;
       int i7 = p8;
       object oobject = p12;
       object oobject1 = p13;
       String str = "stride";
       MediaCodecEncoder mediaCodecEn = MediaCodecEncoder.class;
       String str1 = "Create media codec error ";
       int i8 = 1;
       if (PatchProxy.isSupport(mediaCodecEn)) {
          Object[] objArray = new Object[14];
          objArray[0] = Integer.valueOf(p0);
          objArray[i8] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          objArray[12] = oobject;
          objArray[13] = oobject1;
          obj = PatchProxy.apply(objArray, i, mediaCodecEn, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }else {
          int i10 = 8;
       }
       obj = MediaCodecEncoder.a;
       String str2 = "x";
       Log.d(obj, "Jave Init Encode Profile: "+i2+" : "+i3+str2+i4+" bitrate "+i5+" fps "+i6);
       str1 = (oobject1 != null)? 1: 0;
       if (i.b != null) {
          Log.i(obj, "mediaCodecThread is not null");
          this.release();
       }
       i.e = i2;
       i.f = i3;
       i.g = i4;
       i.k = i6;
       i.b = Thread.currentThread();
       a$a[] c = a.c;
       String str3 = str;
       int i9 = (i1 >= c.length)? 0: i1;
       str = c[i9].a();
       List b = (str1)? a.b: a.a;
       Queue queue = MediaCodecEncoder.a(str, b);
       if (queue == null || queue.isEmpty()) {
          Log.e(obj, "Failed in find color format");
          return 0;
       }else {
          MediaCodecEncoder$b uob = i.a(queue, i3, i4, i6);
          if (uob == null) {
             Log.e(obj, "HW codec is not support "+i3+str2+i4+"@"+i6+" video encoding");
             return 0;
          }else {
             i.colorFormat = uob.b;
             try{
                MediaFormat mediaFormat = MediaFormat.createVideoFormat(str, i3, i4);
                try{
                   i5 = i5 * 1000;
                   mediaFormat.setInteger("bitrate", i5);
                   mediaFormat.setInteger("color-format", i.colorFormat);
                   mediaFormat.setInteger("frame-rate", i.k);
                   mediaFormat.setInteger("i-frame-interval", p3);
                   if (p11) {
                      try{
                         Log.i(obj, "HW codec set realtime mode");
                         mediaFormat.setInteger("latency", 1);
                      }catch(java.lang.Exception e0){
                         String obj2 = e0;
                         Log.w(MediaCodecEncoder.a, "set realtime mode error: "+obj2);
                      }
                   }
                }catch(java.lang.IllegalStateException e0){
                   obj1 = e0;
                   str4 = str1;
                }catch(java.io.IOException e0){
                label_03d5 :
                   obj1 = e0;
                   str4 = str1;
                }catch( e0){
                }
                Log.e(MediaCodecEncoder.a, str4+obj1);
                this.release();
                return 0;
             }catch(java.lang.IllegalStateException e0){
                str4 = str1;
                obj1 = e0;
             }catch(java.io.IOException e0){
                str4 = str1;
                obj1 = e0;
                goto label_03ff ;
             }catch(java.lang.IllegalArgumentException e0){
                Log.e(MediaCodecEncoder.a, str1+e0);
                this.release();
                return 0;
             }
          }
       }
    }
    public final boolean release(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, MediaCodecEncoder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = MediaCodecEncoder.a;
       Log.i(obj, "Media codec release");
       this.d();
       String str = null;
       if (this.c != null) {
          CountDownLatch uCountDownLa = new CountDownLatch(1);
          new Thread(new MediaCodecEncoder$3(this, this.c, uCountDownLa)).start();
          if (!e.a(uCountDownLa, 2000)) {
             Log.e(obj, "Media codec release timeout");
             str = true;
          }
          this.c = objArray;
       }
       this.b = objArray;
       if (this.n != null) {
          RoiEncodeUnitClient.release();
          this.n = objArray;
       }
       MediaCodecEncoder tj = this.j;
       if (tj != null) {
          tj.destroy();
          this.j = objArray;
       }
       tj = this.d;
       if (tj != null) {
          tj.release();
          this.d = objArray;
       }
       tj = this.h;
       if (tj != null) {
          tj.release();
          this.h = objArray;
       }
       Log.i(obj, "Media codec release done: "+str);
       return (str ^ 0x01);
    }
    public boolean releaseOutputBuffer(int p0){
       Object obj;
       MediaCodecEncoder mediaCodecEn = MediaCodecEncoder.class;
       if (PatchProxy.isSupport(mediaCodecEn)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, mediaCodecEn, "23");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.d();
       try{
          obj = 0;
          this.c.releaseOutputBuffer(p0, obj);
          return true;
       }catch(java.lang.IllegalStateException e0){
          return e0;
       }
    }
    public final boolean requestEncode(boolean p0){
       MediaCodecEncoder mediaCodecEn = MediaCodecEncoder.class;
       if (PatchProxy.isSupport(mediaCodecEn)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, mediaCodecEn, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       try{
          this.d();
          if (p0) {
             this.c();
          }
          this.d.makeCurrent();
          return true;
       }catch(java.lang.RuntimeException e4){
          Log.e(MediaCodecEncoder.a, "requestEncodeFromNative failed", e4);
          return false;
       }
    }
    public final boolean setBitrate(int p0){
       MediaCodecEncoder mediaCodecEn = MediaCodecEncoder.class;
       if (PatchProxy.isSupport(mediaCodecEn)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, mediaCodecEn, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       this.d();
       if (this.c != null) {
          try{
             Bundle uBundle = new Bundle();
             uBundle.putInt("video-bitrate", (p0 * 1000));
             this.c.setParameters(uBundle);
             b = true;
          }catch(java.lang.IllegalStateException e4){
             Log.e(MediaCodecEncoder.a, "MediaCodec set bitrate failed", e4);
          }
       }
    }
    public final void setRoiInfo(long p0,String p1){
       MediaCodecEncoder mediaCodecEn = MediaCodecEncoder.class;
       if (PatchProxy.isSupport(mediaCodecEn) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, mediaCodecEn, "8")) {
          return;
       }
       this.d();
       if (Build$VERSION.SDK_INT >= 23 && (this.isRoiEnabled != null && (this.n != null && !p1.isEmpty()))) {
          this.n.setRoiParameters(this.c, p1, p0);
       }
    label_0033 :
       return;
    }
    public final void swapBuffers(long p0){
       MediaCodecEncoder mediaCodecEn = MediaCodecEncoder.class;
       if (PatchProxy.isSupport(mediaCodecEn) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, mediaCodecEn, "11")) {
          return;
       }
       this.d();
       mediaCodecEn = this.d;
       if (mediaCodecEn != null) {
          if (mediaCodecEn instanceof EglBase14) {
             mediaCodecEn.a(p0);
          }else {
             mediaCodecEn.swapBuffers();
          }
       }else {
          Log.e(MediaCodecEncoder.a, "eglbase should not null here.");
       }
       return;
    }
}
