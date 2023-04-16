package com.yxcorp.gifshow.photo.download.widget.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.photo.download.widget.h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicOptDialog$a;
import java.lang.Object;
import androidx.fragment.app.DialogFragment;

public class a extends Accessor	// class@000f3f
{
    public final DownloadPicOptDialog$a c;
    public final h d;

    public void a(h p0,DownloadPicOptDialog$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
