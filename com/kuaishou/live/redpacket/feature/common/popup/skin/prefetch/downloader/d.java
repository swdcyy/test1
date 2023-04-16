package com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.d;
import kb.b;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.f;
import java.lang.String;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.a$a;
import xo3.a;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.ResourceDownloadFailType;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kb.c;
import java.lang.RuntimeException;
import com.facebook.common.references.a;
import vo3.a;
import com.facebook.common.memory.PooledByteBuffer;
import eb.f;
import java.io.InputStream;
import qkd.b;

public class d extends b	// class@000f49
{
    public final String a;
    public final long b;
    public final a$a c;
    public final a d;
    public final f e;

    public void d(f p0,String p1,long p2,a$a p3,a p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public final void a(ResourceDownloadFailType p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       this.e.d(this.b, p0, p1, this.c, this.d);
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       this.e.e(p0, this.b, this.a, this.c, this.d);
       return;
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.e.d(this.b, ResourceDownloadFailType.DOWNLOAD_FRESCO_INNER_ERROR, p0.e(), this.c, this.d);
       return;
    }
    public void onNewResultImpl(c p0){
       a result;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (!p0.a()) {
          this.a(ResourceDownloadFailType.SAVE_FRESCO_DATA_SOURCE_NOT_FINISH, new RuntimeException("save webp anim to disk error, dataSource not finish"));
          return;
       }else if(!p0.hasResult()){
          this.a(ResourceDownloadFailType.SAVE_FRESCO_DATA_SOURCE_NO_RESULT, new RuntimeException("save webp anim to disk error, dataSource no result"));
          return;
       }else {
          result = p0.getResult();
          if (result == null || !result.k()) {
             this.a(ResourceDownloadFailType.SAVE_FRESCO_DATA_SOURCE_REF_INVALID, new RuntimeException("save webp anim to disk error, dataSource reference invalid"));
             if (result != null) {
                a.f(result);
             }
             return;
          }else {
             f h = this.e.h;
             if (h != null && h.e(this.a)) {
                this.b("download success cause local file already exist");
                a.f(result);
                return;
             }else if(b.l(new f(result.j()), this.a)){
                this.b("download success by fetchEncodedImage");
             }else {
                this.a(ResourceDownloadFailType.SAVE_IO_ERROR, new RuntimeException("save webp anim to disk error, io error"));
             }
             a.f(result);
             return;
          }
       }
    }
}
