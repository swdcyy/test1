package com.kwai.video.westeros.v2.ycnn.YcnnPluginUtils;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.video.westeros.models.YCNNResourceConfig;
import android.content.Context;
import com.kwai.video.westeros.models.YCNNFaces;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.google.protobuf.AbstractMessageLite;
import java.io.IOException;

public class YcnnPluginUtils	// class@0010f5
{

    public void YcnnPluginUtils(){
       super();
    }
    public static YCNNFaces getFaceData(Bitmap p0,YCNNResourceConfig p1,Context p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, YcnnPluginUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p0 != null && (p1.getYcnnModelPath() == null || !(p1.getYcnnModelPath()).length())) {
          }else {
             ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(p0.getByteCount());
             p0.copyPixelsToBuffer(uByteBuffer);
             byte[] uobyteArray = YcnnPluginUtils.nativeGetFaceData(p0.getWidth(), p0.getHeight(), uByteBuffer, p1.toByteArray(), p2);
             return YCNNFaces.parseFrom(uobyteArray);
          }
       }catch(com.google.protobuf.InvalidProtocolBufferException e6){
          e6.printStackTrace();
       }
    label_004b :
       return null;
    }
    public static native byte[] nativeGetFaceData(int p0,int p1,ByteBuffer p2,byte[] p3,Object p4);
}
