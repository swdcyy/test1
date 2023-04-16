package com.yxcorp.gifshow.share.screenshot.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.screenshot.m;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;

public class i extends Accessor	// class@001c5b
{
    public final ScreenShotShareDialog$a c;
    public final m d;

    public void i(m p0,ScreenShotShareDialog$a p1){
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
