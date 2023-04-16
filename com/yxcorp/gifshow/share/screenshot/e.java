package com.yxcorp.gifshow.share.screenshot.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.screenshot.m;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$a;
import java.lang.Object;
import java.lang.Integer;

public class e extends Accessor	// class@001c57
{
    public final ScreenShotShareDialog$a c;
    public final m d;

    public void e(m p0,ScreenShotShareDialog$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.d);
    }
    public void set(Object p0){
       this.c.d = p0.intValue();
    }
}
