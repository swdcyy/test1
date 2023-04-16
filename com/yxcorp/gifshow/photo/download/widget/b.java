package com.yxcorp.gifshow.photo.download.widget.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.photo.download.widget.h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicOptDialog$a;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;

public class b extends Accessor	// class@000f40
{
    public final DownloadPicOptDialog$a c;
    public final h d;

    public void b(h p0,DownloadPicOptDialog$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
