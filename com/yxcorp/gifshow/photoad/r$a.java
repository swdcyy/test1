package com.yxcorp.gifshow.photoad.r$a;
import okhttp3.Callback;
import java.lang.String;
import mxb.j;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Throwable;
import yx.j0;
import java.lang.System;
import java.lang.Boolean;
import com.yxcorp.gifshow.photoad.r;
import okhttp3.Response;

public class r$a implements Callback	// class@000fa6
{
    public final String a;
    public final int b;
    public final j c;
    public final String d;
    public final long e;

    public void r$a(String p0,int p1,j p2,String p3,long p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r$a.class, "1")) {
          return;
       }
       j0.b("PhotoAdTrack", "ping url fail, url: "+this.a, p1);
       r.f(this.b, this.c, this.a, this.d, this.e, System.currentTimeMillis(), -1, null, p1.getMessage(), Boolean.FALSE);
       return;
    }
    public void onResponse(Call p0,Response p1){
       Object obj = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, r$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("PhotoAdTrack", "ping url success", objArray);
       r.f(obj.b, obj.c, obj.a, obj.d, obj.e, System.currentTimeMillis(), p1.code(), p1.message(), null, Boolean.FALSE);
       return;
    }
}
