package com.kwai.video.clipkit.post.ClipPostException;
import java.lang.Object;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.clipkit.post.ClipUploadException;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuffer;
import java.lang.Exception;

public class ClipPostException	// class@001ada
{
    public ClipExportException exportException;
    public ClipUploadException uploadException;
    public ClipExportException watermarkException;

    public void ClipPostException(){
       super();
    }
    public ClipExportException getExportException(){
       return this.exportException;
    }
    public ClipUploadException getUploadException(){
       return this.uploadException;
    }
    public ClipExportException getWatermarkException(){
       return this.watermarkException;
    }
    public String toString(){
       StringBuffer obj = PatchProxy.apply(null, this, ClipPostException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (this.exportException != null) {
          obj = obj+"encode exception,errorType:"+this.exportException.errorType+",errorCode:"+this.exportException.errorCode+",msg:"+this.exportException.getMessage()+";";
       }
       if (this.uploadException != null) {
          obj = obj+"upload exception,errorCode:"+this.uploadException.getErrorCode()+",msg:"+this.uploadException.getMessage()+";";
       }
       if (this.watermarkException != null) {
          obj = obj+"encode exception,errorType:"+this.watermarkException.errorType+",errorCode:"+this.watermarkException.errorCode+",msg:"+this.watermarkException.getMessage()+";";
       }
       return obj;
    }
}
