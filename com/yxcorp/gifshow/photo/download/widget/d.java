package com.yxcorp.gifshow.photo.download.widget.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.photo.download.widget.h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicOptDialog$a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class d extends Accessor	// class@000f42
{
    public final DownloadPicOptDialog$a c;
    public final h d;

    public void d(h p0,DownloadPicOptDialog$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
