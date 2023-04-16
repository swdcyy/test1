package com.yxcorp.gifshow.share.screenshot.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.screenshot.m;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$a;
import java.lang.Object;
import android.net.Uri;

public class l extends Accessor	// class@001c5e
{
    public final ScreenShotShareDialog$a c;
    public final m d;

    public void l(m p0,ScreenShotShareDialog$a p1){
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
