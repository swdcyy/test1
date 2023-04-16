package com.yxcorp.gifshow.v3.editor.enhancefilter.c;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;

public final class c implements o	// class@000f87
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
}
