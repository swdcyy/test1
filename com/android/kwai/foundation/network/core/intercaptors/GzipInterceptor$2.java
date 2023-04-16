package com.android.kwai.foundation.network.core.intercaptors.GzipInterceptor$2;
import okhttp3.RequestBody;
import com.android.kwai.foundation.network.core.intercaptors.GzipInterceptor;
import okhttp3.MediaType;
import okio.c;
import okio.i;
import okio.m;
import okio.l;
import cud.j;

public class GzipInterceptor$2 extends RequestBody	// class@000eee
{
    public final GzipInterceptor this$0;
    public final RequestBody val$body;

    public void GzipInterceptor$2(GzipInterceptor p0,RequestBody p1){
       this.this$0 = p0;
       this.val$body = p1;
       super();
    }
    public long contentLength(){
       return -1;
    }
    public MediaType contentType(){
       return this.val$body.contentType();
    }
    public void writeTo(c p0){
       p0 = l.c(new i(p0));
       this.val$body.writeTo(p0);
       p0.close();
    }
}
