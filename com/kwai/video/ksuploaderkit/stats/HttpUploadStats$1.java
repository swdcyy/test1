package com.kwai.video.ksuploaderkit.stats.HttpUploadStats$1;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.stats.HttpUploadStats;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HttpUploadStats$1 implements Runnable	// class@0009bf
{
    public final HttpUploadStats this$0;
    public final String val$host;

    public void HttpUploadStats$1(HttpUploadStats p0,String p1){
       this.this$0 = p0;
       this.val$host = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HttpUploadStats$1.class, "1")) {
          return;
       }
       HttpUploadStats$1 tval$host = this.val$host;
       if (tval$host != null) {
          try{
             String hostAddress = InetAddress.getByName(tval$host).getHostAddress();
             if (hostAddress != null) {
                HttpUploadStats mLock = this.this$0.mLock;
                _monitor_enter(mLock);
                this.this$0.mIpAddress = hostAddress;
                _monitor_exit(mLock);
             }
          }catch(java.net.UnknownHostException e0){
             e0.printStackTrace();
          }
       }
    }
}
