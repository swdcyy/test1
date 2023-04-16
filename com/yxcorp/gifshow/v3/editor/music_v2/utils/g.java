package com.yxcorp.gifshow.v3.editor.music_v2.utils.g;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lsc.i0;
import io.reactivex.g;
import t45.d;
import brd.z;

public class g	// class@00112c
{

    public void g(){
       super();
    }
    public static t a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new i0(p0, p1)).subscribeOn(d.c);
    }
}
