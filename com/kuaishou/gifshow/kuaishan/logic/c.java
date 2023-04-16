package com.kuaishou.gifshow.kuaishan.logic.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.utils.e;

public final class c implements g	// class@001a05
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          e.v(p0, "Download AE builtin res failed, 请联系客户端开发同学处理");
       }
       return;
    }
}
