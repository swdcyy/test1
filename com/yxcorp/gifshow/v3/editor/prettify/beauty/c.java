package com.yxcorp.gifshow.v3.editor.prettify.beauty.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import faa.a;
import w46.b;

public final class c implements g	// class@001151
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("EditBeautyPresenterV3", "mBeautifyConfigModelsObserver", p0);
       a.D().e("Edit", "error", p0);
    }
}
