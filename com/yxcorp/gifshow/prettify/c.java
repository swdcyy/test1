package com.yxcorp.gifshow.prettify.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import j8c.a;
import java.lang.String;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;

public final class c implements g	// class@00113f
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       a.D().u("PrettifyController", p0, objArray);
       PostUtils.D("PrettifyController", "请求美化引导信息失败", p0);
    }
}
