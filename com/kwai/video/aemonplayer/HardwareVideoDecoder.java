package com.kwai.video.aemonplayer.HardwareVideoDecoder;
import java.lang.Object;
import android.media.MediaCodec$BufferInfo;
import com.kwai.video.aemonplayer.JavaAttrList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.Surface;
import com.kwai.video.aemonplayer.AemonNativeLogger;
import android.media.MediaCodec;
import java.lang.StringBuilder;
import java.nio.ByteBuffer;
import java.lang.Long;
import android.media.MediaFormat;
import android.os.Build$VERSION;
import com.kwai.video.aemonplayer.surface.KwaiGpuContext;
import com.kwai.video.aemonplayer.surface.KwaiGpuContextFactory;
import android.opengl.EGLContext;
import android.opengl.EGL14;
import com.kwai.video.aemonplayer.surface.OesSurfaceImpl;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import android.media.MediaCrypto;
import java.lang.Number;
import java.lang.Math;
import com.kwai.video.aemonplayer.surface.OesSurface;
import java.lang.Boolean;
import java.util.ArrayList;
import android.media.MediaCodecList;
import android.media.MediaCodecInfo;
import com.kwai.video.aemonplayer.AemonCodecInfo;
import java.util.Iterator;

public class HardwareVideoDecoder	// class@0019c9
{
    public final Object dimensionLock;
    public int kInitConfigFail;
    public int kInitConfigSurfaceFail;
    public int kInitCreateFail;
    public int kInitOK;
    public int kInitParamUnsupport;
    public int kInitUnknowError;
    public int kInputBusyErr;
    public int kInputDataErr;
    public int kInputNoConfig;
    public int kInputOK;
    public int kInputQueueErr;
    public int kInputStateErr;
    public int kOutputBuffersChanged;
    public int kOutputFormatChanged;
    public int kOutputOK;
    public int kOutputStateErr;
    public int kOutputSurfaceInvalid;
    public int kOutputTryAgain;
    public int kSurfaceNeedReconfig;
    public int kSurfaceSameOjb;
    public int kSurfaceSetFailed;
    public int kSurfaceSetOK;
    public final MediaCodec$BufferInfo mBufferInfo;
    public MediaCodec mCodec;
    public String mCodecName;
    public String mCodecType;
    public int mColorFormat;
    public ByteBuffer mExtraData;
    public int mHeight;
    public boolean mIsConfiged;
    public int mJniInstallMode;
    public int mNewHeight;
    public int mNewRotation;
    public int mNewWidth;
    public OesSurface mOesSurface;
    public int mRotationForCodec;
    public String mSessionTag;
    public int mSliceHeight;
    public int mStride;
    public Surface mSurface;
    public int mWidth;
    public JavaAttrList m_attr_list;

    public void HardwareVideoDecoder(int p0){
       super();
       this.kInitOK = 0;
       this.kInitCreateFail = -1;
       this.kInitConfigFail = -2;
       this.kInitParamUnsupport = -3;
       this.kInitConfigSurfaceFail = -4;
       this.kInitUnknowError = -1000;
       this.kInputOK = 0;
       this.kInputDataErr = -1;
       this.kInputBusyErr = -2;
       this.kInputNoConfig = -3;
       this.kInputQueueErr = -4;
       this.kInputStateErr = -5;
       this.kOutputOK = 0;
       this.kOutputFormatChanged = -1;
       this.kOutputBuffersChanged = -2;
       this.kOutputTryAgain = -3;
       this.kOutputSurfaceInvalid = -4;
       this.kOutputStateErr = -5;
       this.kSurfaceSetOK = 0;
       this.kSurfaceNeedReconfig = -1;
       this.kSurfaceSameOjb = -2;
       this.kSurfaceSetFailed = -3;
       this.mBufferInfo = new MediaCodec$BufferInfo();
       this.dimensionLock = new Object();
       this.mCodec = null;
       this.mJniInstallMode = p0;
    }
    public JavaAttrList DequeueInputBuffer(int p0){
       String str = "QueueInputBuffer dequeueInputBuffer failed:";
       HardwareVideoDecoder hardwareVide = HardwareVideoDecoder.class;
       if (PatchProxy.isSupport(hardwareVide)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, hardwareVide, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.mSurface.isValid()) {
          this.m_attr_list.SetIntValue("result", this.kInputBusyErr);
          AemonNativeLogger.e(this.GetTag(), "QueueInputBuffer queueInputBuffer surface null:");
          return this.m_attr_list;
       }else {
          try{
             p0 = this.mCodec.dequeueInputBuffer((long)p0);
             if (p0 < 0) {
                AemonNativeLogger.e(this.GetTag(), "QueueInputBuffer dequeueInputBuffer2 index:"+p0);
                this.m_attr_list.SetIntValue("result", this.kInputBusyErr);
                return this.m_attr_list;
             }else {
                try{
                   this.m_attr_list.SetObjectValue("buffer", this.mCodec.getInputBuffers()[p0]);
                   if (this.mIsConfiged == null) {
                      AemonNativeLogger.e(this.GetTag(), "QueueInputBuffer noconfig failed.");
                      this.m_attr_list.SetIntValue("result", this.kInputNoConfig);
                      return this.m_attr_list;
                   }else {
                      this.m_attr_list.SetIntValue("result", this.kOutputOK);
                      this.m_attr_list.SetIntValue("index", p0);
                      return this.m_attr_list;
                   }
                }catch(java.lang.Exception e6){
                   AemonNativeLogger.e(this.GetTag(), "QueueInputBuffer getInputBuffers failed Exception:"+e6);
                   this.m_attr_list.SetIntValue("result", this.kInputStateErr);
                   return this.m_attr_list;
                }catch(java.lang.Error e6){
                   AemonNativeLogger.e(this.GetTag(), "QueueInputBuffer getInputBuffers failed Error:"+e6);
                   this.m_attr_list.SetIntValue("result", this.kInputStateErr);
                   return this.m_attr_list;
                }
             }
          }catch(java.lang.Exception e6){
             AemonNativeLogger.e(this.GetTag(), str+e6);
             this.m_attr_list.SetIntValue("result", this.kInputStateErr);
             return this.m_attr_list;
          }catch(java.lang.Error e6){
             AemonNativeLogger.e(this.GetTag(), str+e6);
             this.m_attr_list.SetIntValue("result", this.kInputStateErr);
             return this.m_attr_list;
          }
       }
    }
    public JavaAttrList DequeueOutput(long p0){
       HardwareVideoDecoder hardwareVide = HardwareVideoDecoder.class;
       if (PatchProxy.isSupport(hardwareVide)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, hardwareVide, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.mSurface.isValid()) {
          this.m_attr_list.SetIntValue("result", this.kOutputSurfaceInvalid);
          AemonNativeLogger.e(this.GetTag(), "QueueInputBuffer DequeueOutput surface null:");
          return this.m_attr_list;
       }else {
          try{
             int i = this.mCodec.dequeueOutputBuffer(this.mBufferInfo, p0);
             if (i == -2) {
                this.ReFormat(this.mCodec.getOutputFormat());
                this.m_attr_list.SetIntValue("result", this.kOutputFormatChanged);
                AemonNativeLogger.i(this.GetTag(), "INFO_OUTPUT_FORMAT_CHANGED, newWidth:"+this.mNewWidth+", newHeight:"+this.mNewHeight);
                this.m_attr_list.SetIntValue("newWidth", this.mNewWidth);
                this.m_attr_list.SetIntValue("newHeight", this.mNewHeight);
                this.m_attr_list.SetIntValue("newRotation", this.mNewRotation);
             }else if(i == -3){
                AemonNativeLogger.i(this.GetTag(), "INFO_OUTPUT_BUFFERS_CHANGED");
                this.m_attr_list.SetIntValue("result", this.kOutputBuffersChanged);
             }else if(i == -1){
                AemonNativeLogger.i(this.GetTag(), "INFO_TRY_AGAIN_LATER");
                this.m_attr_list.SetIntValue("result", this.kOutputTryAgain);
             }else if(i >= 0){
                this.m_attr_list.SetIntValue("index", i);
                this.m_attr_list.SetIntValue("result", this.kOutputOK);
                this.m_attr_list.SetLongValue("pts", this.mBufferInfo.presentationTimeUs);
                this.m_attr_list.SetIntValue("flags", this.mBufferInfo.flags);
             }
             return this.m_attr_list;
          }catch(java.lang.Exception e4){
             AemonNativeLogger.e(this.GetTag(), "dequeueOutputBuffer illegal exception:"+e4);
             this.m_attr_list.SetIntValue("result", this.kOutputStateErr);
             return this.m_attr_list;
          }catch(java.lang.Error e4){
             AemonNativeLogger.e(this.GetTag(), "dequeueOutputBuffer illegal error:"+e4);
             this.m_attr_list.SetIntValue("result", this.kOutputStateErr);
             return this.m_attr_list;
          }
       }
    }
    public void Flush(){
       if (PatchProxy.applyVoid(null, this, HardwareVideoDecoder.class, "13")) {
          return;
       }
       try{
          this.mCodec.flush();
       }catch(java.lang.Exception e0){
          AemonNativeLogger.e(this.GetTag(), "flush failed Exception:"+e0);
       }catch(java.lang.Error e0){
          AemonNativeLogger.e(this.GetTag(), "flush failed Error:"+e0);
       }
       return;
    }
    public int GetAndroidApiLevel(){
       return Build$VERSION.SDK_INT;
    }
    public Surface GetDummySurface(){
       Object obj = PatchProxy.apply(null, this, HardwareVideoDecoder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.GetOesSurface();
    }
    public final Surface GetOesSurface(){
       HardwareVideoDecoder hardwareVide = HardwareVideoDecoder.class;
       Object[] objArray = null;
       KwaiGpuContext obj = PatchProxy.apply(objArray, this, hardwareVide, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mOesSurface == null) {
          _monitor_enter(hardwareVide);
          if (this.mOesSurface == null) {
             AemonNativeLogger.i(this.GetTag(), "[render] create oes surface..");
             obj = KwaiGpuContextFactory.createEGL14(true);
             if (obj != null) {
                EGLContext context = (obj.getContext() != null)? obj.getContext(): EGL14.EGL_NO_CONTEXT;
                objArray = context;
             }
             AemonNativeLogger.d(this.GetTag(), "[render] OesSurfaceImpl newInstanceV17");
             this.mOesSurface = OesSurfaceImpl.newInstanceV17(false, objArray);
             AemonNativeLogger.i(this.GetTag(), "[render] OesSurfaceImpl success.");
          }
          _monitor_exit(hardwareVide);
       }
       return this.mOesSurface;
    }
    public final String GetTag(){
       String str;
       HardwareVideoDecoder obj = PatchProxy.apply(null, this, HardwareVideoDecoder.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!TextUtils.isEmpty(this.mSessionTag))? this.mSessionTag: "HardwareVideoDecoder";
       return obj;
    }
    public JavaAttrList InitDecoder(String p0,String p1,int p2,int p3,Surface p4,int p5,ByteBuffer p6){
       StringBuilder obj;
       JavaAttrList javaAttrList = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       int i = p5;
       HardwareVideoDecoder hardwareVide = HardwareVideoDecoder.class;
       String str = "color-format";
       if (PatchProxy.isSupport(hardwareVide)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),oobject2,Integer.valueOf(p5),p6};
          obj = PatchProxy.apply(objArray, javaAttrList, hardwareVide, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (javaAttrList.m_attr_list != null) {
          AemonNativeLogger.e(this.GetTag(), "InitDecoder, m_attr_list should be null!!!!!");
       }
       javaAttrList.m_attr_list = new JavaAttrList(javaAttrList.mJniInstallMode);
       obj = "";
       javaAttrList.mWidth = p2;
       javaAttrList.mHeight = p3;
       javaAttrList.mCodecName = oobject;
       javaAttrList.mCodecType = oobject1;
       javaAttrList.mSurface = oobject2;
       javaAttrList.mExtraData = p6.duplicate();
       javaAttrList.mNewRotation = i;
       javaAttrList.mRotationForCodec = 0;
       javaAttrList.mIsConfiged = false;
       System.currentTimeMillis();
       String codecName = javaAttrList.getCodecName(javaAttrList.mCodecType, 0, 0);
       javaAttrList.mCodecName = codecName;
       String str1 = "result";
       if (codecName.isEmpty()) {
          AemonNativeLogger.e(this.GetTag(), "getCodecName failed, Cannot find codecName.");
          javaAttrList.m_attr_list.SetIntValue(str1, javaAttrList.kInitCreateFail);
          return javaAttrList.m_attr_list;
       }else {
          AemonNativeLogger.e(this.GetTag(), "getCodecName success:"+javaAttrList.mCodecName);
          long l = System.currentTimeMillis();
          try{
             javaAttrList.mCodec = MediaCodec.createByCodecName(javaAttrList.mCodecName);
             codecName = "ms]";
             obj = obj+"[CodecCreate "+(System.currentTimeMillis() - l)+codecName;
             l = System.currentTimeMillis();
             try{
                MediaFormat mediaFormat = MediaFormat.createVideoFormat(oobject1, javaAttrList.mWidth, javaAttrList.mHeight);
                if (mediaFormat.containsKey(str)) {
                   int integer = mediaFormat.getInteger(str);
                   javaAttrList.mColorFormat = integer;
                   mediaFormat.setInteger(str, integer);
                   AemonNativeLogger.e(this.GetTag(), "colorformat:"+javaAttrList.mColorFormat);
                }
                if (!javaAttrList.mSurface.isValid()) {
                   AemonNativeLogger.e(this.GetTag(), "surface is Valid !!!");
                }
                if (i) {
                   javaAttrList.mNewRotation = 0;
                   javaAttrList.mRotationForCodec = i;
                   mediaFormat.setInteger("rotation-degrees", i);
                }
                mediaFormat.setByteBuffer("csd-0", javaAttrList.mExtraData);
                AemonNativeLogger.e(this.GetTag(), "set csd-0 success !!! \("+javaAttrList.mExtraData+"\)");
                javaAttrList.mCodec.configure(mediaFormat, javaAttrList.mSurface, null, 0);
                javaAttrList.mCodec.start();
                javaAttrList.mIsConfiged = true;
                javaAttrList.m_attr_list.SetStringValue("codecName", javaAttrList.mCodecName);
                javaAttrList.m_attr_list.SetIntValue(str1, javaAttrList.kInitOK);
                AemonNativeLogger.e(this.GetTag(), "configure & start codec success!!:"+obj+"[CodecStart "+(System.currentTimeMillis() - l)+codecName);
                return javaAttrList.m_attr_list;
             }catch(java.lang.IllegalStateException e0){
                AemonNativeLogger.e(this.GetTag(), "initDecode failed "+e0+","+obj);
                javaAttrList.m_attr_list.SetIntValue(str1, javaAttrList.kInitConfigFail);
                return javaAttrList.m_attr_list;
             }catch(java.lang.Exception e0){
                AemonNativeLogger.e(this.GetTag(), "createByCodecName Exception:"+e0+","+obj);
                javaAttrList.m_attr_list.SetIntValue(str1, javaAttrList.kInitUnknowError);
                return javaAttrList.m_attr_list;
             }catch(java.lang.Error e0){
                AemonNativeLogger.e(this.GetTag(), "createByCodecName Exception:"+e0+","+obj);
                javaAttrList.m_attr_list.SetIntValue(str1, javaAttrList.kInitUnknowError);
                return javaAttrList.m_attr_list;
             }
          }catch(java.io.IOException e0){
          }catch(java.lang.IllegalArgumentException e0){
          }catch(java.lang.Exception e0){
             javaAttrList.m_attr_list.SetIntValue(str1, javaAttrList.kInitUnknowError);
             AemonNativeLogger.e(this.GetTag(), "createByCodecName Exception:"+e0+","+obj);
             return javaAttrList.m_attr_list;
          }catch(java.lang.Error e0){
             javaAttrList.m_attr_list.SetIntValue(str1, javaAttrList.kInitUnknowError);
             AemonNativeLogger.e(this.GetTag(), "createByCodecName Error:"+e0+","+obj);
             return javaAttrList.m_attr_list;
          }
          AemonNativeLogger.e(this.GetTag(), "Cannot create media decoder:"+e0+","+obj);
          javaAttrList.m_attr_list.SetIntValue(str1, javaAttrList.kInitCreateFail);
          return javaAttrList.m_attr_list;
       }
    }
    public JavaAttrList InitDecoder(String p0,String p1,int p2,int p3,Surface p4,ByteBuffer p5){
       HardwareVideoDecoder hardwareVide = HardwareVideoDecoder.class;
       if (PatchProxy.isSupport(hardwareVide)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, hardwareVide, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.InitDecoder(p0, p1, p2, p3, p4, 0, p5);
    }
    public int QueueInputBuffer(int p0,int p1,long p2,int p3){
       if (PatchProxy.isSupport(HardwareVideoDecoder.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), Integer.valueOf(p3), this, HardwareVideoDecoder.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          this.mCodec.queueInputBuffer(p0, 0, p1, p2, p3);
          return this.kInputOK;
       }catch(java.lang.Exception e9){
          AemonNativeLogger.e(this.GetTag(), "QueueInputBuffer queueInputBuffer failed Exception:"+e9);
          return this.kInputStateErr;
       }catch(java.lang.Error e9){
          AemonNativeLogger.e(this.GetTag(), "QueueInputBuffer queueInputBuffer failed Error:"+e9);
          return this.kInputStateErr;
       }
    }
    public final void ReFormat(MediaFormat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HardwareVideoDecoder.class, "20")) {
          return;
       }
       if (p0.containsKey("crop-left") && (p0.containsKey("crop-right") && (p0.containsKey("crop-bottom") && p0.containsKey("crop-top")))) {
          this.mNewWidth = (p0.getInteger("crop-right") + 1) - p0.getInteger("crop-left");
          this.mNewHeight = (p0.getInteger("crop-bottom") + 1) - p0.getInteger("crop-top");
       }else {
          this.mNewWidth = p0.getInteger("width");
          this.mNewHeight = p0.getInteger("height");
       }
       HardwareVideoDecoder tdimensionLo = this.dimensionLock;
       _monitor_enter(tdimensionLo);
       if (p0.containsKey("stride")) {
          this.mStride = p0.getInteger("stride");
       }
       if (p0.containsKey("slice-height")) {
          this.mSliceHeight = p0.getInteger("slice-height");
       }
       this.mStride = Math.max(this.mWidth, this.mStride);
       this.mSliceHeight = Math.max(this.mHeight, this.mSliceHeight);
       _monitor_exit(tdimensionLo);
       HardwareVideoDecoder tmRotationFo = this.mRotationForCodec;
       if (tmRotationFo == 90 || tmRotationFo == 270) {
          tmRotationFo = this.mNewWidth;
          this.mNewWidth = this.mNewHeight;
          this.mNewHeight = tmRotationFo;
          AemonNativeLogger.i(this.GetTag(), "after rotation w:"+this.mNewWidth+", h:"+this.mNewHeight+", rotation:"+this.mNewRotation);
       }else {
          AemonNativeLogger.i(this.GetTag(), "w:"+this.mNewWidth+", h:"+this.mNewHeight+", rotation:"+this.mNewRotation);
       }
       return;
    }
    public final void ReInitDecoder(int p0,int p1,Surface p2){
       this.mCodec = null;
    }
    public void Release(){
       HardwareVideoDecoder tmCodec;
       if (PatchProxy.applyVoid(null, this, HardwareVideoDecoder.class, "12")) {
          return;
       }
       try{
          tmCodec = this.mCodec;
          if (tmCodec != null) {
             tmCodec.release();
          }
       }catch(java.lang.Exception e1){
          AemonNativeLogger.e(this.GetTag(), "Release failed Exception:"+e1);
       }catch(java.lang.Error e1){
          AemonNativeLogger.e(this.GetTag(), "Release failed Error:"+e1);
       }
       tmCodec = this.m_attr_list;
       if (tmCodec != null) {
          tmCodec.Destroy();
          this.m_attr_list = null;
       }
       if (this.mOesSurface != null) {
          _monitor_enter(HardwareVideoDecoder.class);
          tmCodec = this.mOesSurface;
          if (tmCodec != null) {
             tmCodec.Destroy();
             this.mOesSurface = null;
          }
          _monitor_exit(HardwareVideoDecoder.class);
       }
       return;
    }
    public int ReleaseOutputBuffer(int p0,boolean p1){
       Object obj;
       HardwareVideoDecoder hardwareVide = HardwareVideoDecoder.class;
       if (PatchProxy.isSupport(hardwareVide)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, hardwareVide, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = -1;
       try{
          this.mCodec.releaseOutputBuffer(p0, p1);
          return 0;
       }catch(java.lang.Exception e5){
          AemonNativeLogger.e(this.GetTag(), "ReleaseOutputBuffer Exception:"+e5);
          return obj;
       }catch(java.lang.Error e5){
          AemonNativeLogger.e(this.GetTag(), "ReleaseOutputBuffer Error:"+e5);
          return obj;
       }
    }
    public void Reset(){
       if (PatchProxy.applyVoid(null, this, HardwareVideoDecoder.class, "16")) {
          return;
       }
       try{
          this.mCodec.reset();
       }catch(java.lang.Exception e0){
          AemonNativeLogger.e(this.GetTag(), "reset failed Exception:"+e0);
       }catch(java.lang.Error e0){
          AemonNativeLogger.e(this.GetTag(), "reset failed Error:"+e0);
       }
       return;
    }
    public void ReturnDecodedOutputBuffer(int p0){
       HardwareVideoDecoder hardwareVide = HardwareVideoDecoder.class;
       if (PatchProxy.isSupport(hardwareVide) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, hardwareVide, "9")) {
          return;
       }
       try{
          this.mCodec.releaseOutputBuffer(p0, false);
       }catch(java.lang.Exception e4){
          AemonNativeLogger.e(this.GetTag(), "ReturnDecodedOutputBuffer illegal exception:"+e4);
       }catch(java.lang.Error e4){
          AemonNativeLogger.e(this.GetTag(), "ReturnDecodedOutputBuffer illegal error:"+e4);
       }
       return;
    }
    public int SetOutputSurface(Surface p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HardwareVideoDecoder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!p0.isValid()) {
          AemonNativeLogger.e(this.GetTag(), "SetOutputSurface surface null");
          return this.kSurfaceSetFailed;
       }else if(Build$VERSION.SDK_INT >= 23){
          try{
             this.mCodec.setOutputSurface(p0);
             this.mSurface = p0;
             return this.kSurfaceSetOK;
          }catch(java.lang.Exception e4){
             AemonNativeLogger.e(this.GetTag(), "setOutputSurface Exception failed:"+e4);
             return this.kSurfaceNeedReconfig;
          }catch(java.lang.Error e4){
             AemonNativeLogger.e(this.GetTag(), "setOutputSurface Error failed:"+e4);
             return this.kSurfaceNeedReconfig;
          }
       }else {
          return this.kSurfaceNeedReconfig;
       }
    }
    public void SetSessionId(int p0){
       HardwareVideoDecoder hardwareVide = HardwareVideoDecoder.class;
       if (PatchProxy.isSupport(hardwareVide) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, hardwareVide, "17")) {
          return;
       }
       this.mSessionTag = "["+p0+"] "+"HardwareVideoDecoder";
       return;
    }
    public void SetVideoScalingMode(int p0){
       HardwareVideoDecoder hardwareVide = HardwareVideoDecoder.class;
       if (PatchProxy.isSupport(hardwareVide) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, hardwareVide, "18")) {
          return;
       }
       try{
          this.mCodec.setVideoScalingMode(p0);
       }catch(java.lang.Exception e4){
          AemonNativeLogger.e(this.GetTag(), "SetVideoScalingMode failed Exception:"+e4);
       }catch(java.lang.Error e4){
          AemonNativeLogger.e(this.GetTag(), "SetVideoScalingMode failed Error:"+e4);
       }
       return;
    }
    public void Start(){
       if (PatchProxy.applyVoid(null, this, HardwareVideoDecoder.class, "15")) {
          return;
       }
       try{
          this.mCodec.start();
       }catch(java.lang.Exception e0){
          AemonNativeLogger.e(this.GetTag(), "stop failed Exception:"+e0);
       }catch(java.lang.Error e0){
          AemonNativeLogger.e(this.GetTag(), "stop failed Error:"+e0);
       }
       return;
    }
    public void Stop(){
       if (PatchProxy.applyVoid(null, this, HardwareVideoDecoder.class, "14")) {
          return;
       }
       try{
          this.mCodec.stop();
       }catch(java.lang.Exception e0){
          AemonNativeLogger.e(this.GetTag(), "stop failed Exception:"+e0);
       }catch(java.lang.Error e0){
          AemonNativeLogger.e(this.GetTag(), "stop failed Error:"+e0);
       }
       return;
    }
    public String getCodecName(String p0,int p1,int p2){
       StringBuilder obj;
       long this;
       String str = p0;
       if (PatchProxy.isSupport(HardwareVideoDecoder.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, HardwareVideoDecoder.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }else {
          ArrayList uArrayList = new ArrayList();
          this = System.currentTimeMillis();
          int codecCount = MediaCodecList.getCodecCount();
          obj = "[CodecCount "+(System.currentTimeMillis() - this)+"ms]";
          int i = 0;
          while (i < codecCount) {
             MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
             if (!codecInfoAt.isEncoder()) {
                String[] supportedTyp = codecInfoAt.getSupportedTypes();
                if (supportedTyp != null) {
                   int len = supportedTyp.length;
                   int i1 = 0;
                   while (i1 < len) {
                      object oobject = supportedTyp[i1];
                      if (!TextUtils.isEmpty(oobject) && oobject.equalsIgnoreCase(str)) {
                         AemonCodecInfo uAemonCodecI = AemonCodecInfo.setupCandidate(codecInfoAt, str);
                         if (uAemonCodecI != null) {
                            uArrayList.add(uAemonCodecI);
                            uAemonCodecI.dumpProfileLevels(str);
                         }
                      }
                      i1 = i1 + 1;
                   }
                }
             }
             i = i + 1;
          }
          AemonNativeLogger.e(this.GetTag(), "getCodecName find codecInfo end:"+obj+"[CodecInfo "+(System.currentTimeMillis() - this)+"ms]");
          if (uArrayList.isEmpty()) {
             return null;
          }else {
             AemonCodecInfo uAemonCodecI1 = uArrayList.get(0);
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                AemonCodecInfo uAemonCodecI2 = iterator.next();
                if (uAemonCodecI2.mRank > uAemonCodecI1.mRank) {
                   uAemonCodecI1 = uAemonCodecI2;
                }
             }
             if (uAemonCodecI1.mRank < 600) {
                return null;
             }else {
                return uAemonCodecI1.mCodecInfo.getName();
             }
          }
       }
    }
}
