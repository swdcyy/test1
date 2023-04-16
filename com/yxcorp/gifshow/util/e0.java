package com.yxcorp.gifshow.util.e0;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper;
import java.lang.Object;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import java.lang.String;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;

public class e0 implements PostBaseResourceDownloadHelper$a	// class@001f78
{
    public final PostBaseResourceDownloadHelper$a a;
    public final PostBaseResourceDownloadHelper b;

    public void e0(PostBaseResourceDownloadHelper p0,PostBaseResourceDownloadHelper$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(PostBaseResourceDownloadHelper$InfoWithResource p0,String p1){
       Object[] objArray = new Object[0];
       a.D().s("PostBaseResourceDownloadHelper", "onCompleted\(\) called with: infoWithResource = ["+p0+"], path = ["+p1+"]", objArray);
       this.b.a(p0);
       e0 ta = this.a;
       if (ta != null) {
          ta.a(p0, p1);
       }
       return;
    }
    public void b(PostBaseResourceDownloadHelper$InfoWithResource p0,int p1,int p2){
       e0 ta = this.a;
       if (ta != null) {
          ta.b(p0, p1, p2);
       }
       return;
    }
    public void c(PostBaseResourceDownloadHelper$InfoWithResource p0,Throwable p1){
       e0 ta = this.a;
       if (ta != null) {
          ta.c(p0, p1);
       }
       this.b.a(p0);
       return;
    }
}
