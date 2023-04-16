package com.yxcorp.gifshow.edit.previewer.loaderv2.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.edit.previewer.loaderv2.MagicEffectLoaderException;
import java.lang.String;

public final class i implements g	// class@001b41
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void accept(Object p0){
       throw new MagicEffectLoaderException("magic emoji check failure", p0);
    }
}
