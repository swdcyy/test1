package com.yxcorp.gifshow.photo.download.widget.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.photo.download.widget.h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicOptDialog$a;
import java.lang.Object;
import java.lang.Integer;

public class c extends Accessor	// class@000f41
{
    public final DownloadPicOptDialog$a c;
    public final h d;

    public void c(h p0,DownloadPicOptDialog$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.g);
    }
    public void set(Object p0){
       this.c.g = p0.intValue();
    }
}
