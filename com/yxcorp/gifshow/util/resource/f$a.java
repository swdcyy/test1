package com.yxcorp.gifshow.util.resource.f$a;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.f;
import java.lang.Object;
import boc.b;
import com.kwai.feature.post.api.model.DownloadStatus;
import java.lang.Throwable;

public class f$a implements n$c	// class@000ce3
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (!this.e()) {
          return;
       }
       this.a.f(p0, DownloadStatus.DOWNLOAD_SUCCESS, 0x3f800000);
       return;
    }
    public void b(b p0,float p1){
       if (!this.e()) {
          return;
       }
       this.a.f(p0, DownloadStatus.DOWNLOADING, p1);
       return;
    }
    public void c(b p0){
       if (!this.e()) {
          return;
       }
       this.a.f(p0, DownloadStatus.DOWNLOAD_FAILED, 0);
       return;
    }
    public void d(b p0,Throwable p1){
       if (!this.e()) {
          return;
       }
       this.a.f(p0, DownloadStatus.DOWNLOAD_FAILED, 0);
       return;
    }
    public final boolean e(){
       f$a ta = this.a;
       if (ta.g == null && ta.i == DownloadStatus.DOWNLOAD_USE_MOBILE_NET_PROMPT) {
          return false;
       }
       return true;
    }
}
