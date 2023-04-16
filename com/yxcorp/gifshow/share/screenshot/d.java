package com.yxcorp.gifshow.share.screenshot.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.screenshot.m;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$a;
import java.lang.Object;
import java.lang.String;

public class d extends Accessor	// class@001c55
{
    public final ScreenShotShareDialog$a c;
    public final m d;

    public void d(m p0,ScreenShotShareDialog$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
