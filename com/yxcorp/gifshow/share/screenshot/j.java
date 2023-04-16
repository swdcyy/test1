package com.yxcorp.gifshow.share.screenshot.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.screenshot.m;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$a;
import java.lang.Object;
import androidx.fragment.app.DialogFragment;

public class j extends Accessor	// class@001c5c
{
    public final ScreenShotShareDialog$a c;
    public final m d;

    public void j(m p0,ScreenShotShareDialog$a p1){
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
