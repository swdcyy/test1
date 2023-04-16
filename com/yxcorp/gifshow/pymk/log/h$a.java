package com.yxcorp.gifshow.pymk.log.h$a;
import g7c.a;
import com.yxcorp.gifshow.pymk.log.h;
import java.lang.Object;
import rq4.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import h7c.a;
import rq4.m;

public class h$a implements a	// class@0016cc
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public r a(r p0){
       r obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.e;
          if (obj != null) {
             obj.i = this.a.b.a().toString();
             p0.e.g = this.a.b.a().optString("profileUserId");
          }
       }
       return p0;
    }
}
