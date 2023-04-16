package com.kwai.video.krtc.utils.GzipManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import com.kwai.video.krtc.utils.Log;

public class GzipManager	// class@0008b8
{

    public void GzipManager(){
       super();
    }
    public static byte[] gzipCompress(byte[] p0){
       ByteArrayOutputStream obj = PatchProxy.applyOneRefs(p0, null, GzipManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.length <= 0) {
          return p0;
       }
       try{
          obj = new ByteArrayOutputStream();
          GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(obj);
          gZIPOutputSt.write(p0);
          gZIPOutputSt.close();
          return obj.toByteArray();
       }catch(java.io.UnsupportedEncodingException e3){
          e3.printStackTrace();
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return v1;
    }
    public static byte[] gzipUncompress(byte[] p0){
       ByteArrayOutputStream obj = PatchProxy.applyOneRefs(p0, null, GzipManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.length <= 0) {
          return p0;
       }
       try{
          obj = new ByteArrayOutputStream();
          GZIPInputStream gZIPInputStr = new GZIPInputStream(new ByteArrayInputStream(p0));
          byte[] uobyteArray = new byte[256];
          int i = gZIPInputStr.read(uobyteArray);
          while (i >= 0) {
             obj.write(uobyteArray, 0, i);
          }
          Log.d("GzipManager", "gzipUncompress success");
          return obj.toByteArray();
       }catch(java.io.UnsupportedEncodingException e5){
          e5.printStackTrace();
       }catch(java.io.IOException e5){
          e5.printStackTrace();
       }
       return null;
    }
}
