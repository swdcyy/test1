package com.kwai.video.clipkit.config.EditorEncodeConfig$LocalVideoEncodeConfig;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.config.EditorEncodeConfig$LocalVideoEncodeConfig$1;
import java.lang.reflect.Type;
import el.a;
import com.kwai.video.clipkit.ClipKitUtils;
import com.google.gson.Gson;
import java.lang.CloneNotSupportedException;

public class EditorEncodeConfig$LocalVideoEncodeConfig implements Cloneable	// class@001a66
{
    public int fps;
    public int height;
    public int type;
    public int videoBitrate;
    public int videoGopSize;
    public int width;
    public String x264params;

    public void EditorEncodeConfig$LocalVideoEncodeConfig(){
       super();
    }
    public static List defaultVideoEncodeConfigs(){
       Object obj = PatchProxy.apply(null, null, EditorEncodeConfig$LocalVideoEncodeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipKitUtils.COMMON_GSON.i("[{\"type\":1,\"width\":540,\"height\":960,\"fps\":30,\"x264params\":\"cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=150:bframes=3:open-gop=0:vbv_maxrate=6000:vbv_bufsize=12000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8\",\"videoBitrate\":8000000,\"videoGopSize\":150},{\"type\":2,\"width\":540,\"height\":960,\"fps\":60,\"x264params\":\"cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=300:bframes=3:open-gop=0:vbv_maxrate=9000:vbv_bufsize=18000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8\",\"videoBitrate\":12000000,\"videoGopSize\":300},{\"type\":3,\"width\":720,\"height\":1280,\"fps\":30,\"x264params\":\"cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0: vbv_maxrate=8000:vbv_bufsize=16000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8\",\"videoBitrate\":11000000,\"videoGopSize\":250},{\"type\":4,\"width\":720,\"height\":1280,\"fps\":60,\"x264params\":\"cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=300:bframes=3:open-gop=0:vbv_maxrate=12000:vbv_bufsize=24000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8\",\"videoBitrate\":20000000,\"videoGopSize\":300},{\"type\":5,\"width\":1080,\"height\":1920,\"fps\":30,\"x264params\":\"cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=11000:vbv_bufsize=22000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8\",\"videoBitrate\":16000000,\"videoGopSize\":250},{\"type\":6,\"width\":1080,\"height\":1920,\"fps\":60,\"x264params\":\"cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=350:bframes=3:open-gop=0:vbv_maxrate=18000:vbv_bufsize=36000:threads=6:mbtree=1:analyse=i4x4
    ,i8x8,p8x8,b8x8\",\"videoBitrate\":30000000,\"videoGopSize\":300},{\"type\":7,\"width\":2160,\"height\":3840,\"fps\":30,\"x264params\":\"cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=45000:vbv_bufsize=90000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8\",\"videoBitrate\":65000000,\"videoGopSize\":250},{\"type\":8,\"width\":2160,\"height\":3840,\"fps\":60,\"x264params\":\"cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=300:bframes=3:open-gop=0:vbv_maxrate=68000:vbv_bufsize=136000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8\",\"videoBitrate\":98000000,\"videoGopSize\":300}]", new EditorEncodeConfig$LocalVideoEncodeConfig$1().getType());
    }
    public EditorEncodeConfig$LocalVideoEncodeConfig clone(){
       CloneNotSupportedException uCloneNotSup;
       Object[] objArray1;
       Object[] objArray = null;
       EditorEncodeConfig$LocalVideoEncodeConfig obj = PatchProxy.apply(objArray, this, EditorEncodeConfig$LocalVideoEncodeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          try{
             obj.x264params = this.x264params;
          label_0024 :
             return objArray1;
          }catch(java.lang.CloneNotSupportedException e1){
          }
          uCloneNotSup.printStackTrace();
          goto label_0024 ;
       }catch(java.lang.CloneNotSupportedException e0){
          uCloneNotSup = e0;
          objArray1 = objArray;
          goto label_0021 ;
       }
    }
    public Object clone(){
       return this.clone();
    }
}
