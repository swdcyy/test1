package com.yxcorp.gifshow.photo.download.widget.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.photo.download.widget.h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicOptDialog$a;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;

public class e extends Accessor	// class@000f43
{
    public final DownloadPicOptDialog$a c;
    public final h d;

    public void e(h p0,DownloadPicOptDialog$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
