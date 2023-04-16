package com.kwai.framework.location.locationupload.c;
import com.kwai.framework.location.locationupload.a$a;
import com.kwai.framework.location.locationupload.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import p96.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.location.model.PoiUploadModel;
import fg6.a;
import com.google.gson.Gson;
import java.lang.CharSequence;
import android.text.TextUtils;

public class c implements a$a	// class@00163c
{
    public final double a;
    public final double b;
    public final d c;

    public void c(d p0,double p1,double p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().t(d.b, "onSearchFailed errCode="+p0, objArray);
       this.c.a(this.a, this.b, 1, null, String.valueOf(p0));
       return;
    }
    public void b(PoiUploadModel p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c.class, "1")) {
          return;
       }
       a uoa = a.C();
       String b = d.b;
       Object[] objArray = new Object[0];
       try{
          uoa.w(b, "onSearchSuccess", objArray);
          String str = a.a.q(obj1);
          if (TextUtils.isEmpty(str)) {
             obj.c.a(obj.a, obj.b, 1, str, "30000");
          }else {
             obj.c.a(obj.a, obj.b, 1, str, "success");
          }
       }catch(java.lang.Exception e0){
          e0.c.a(e0.a, e0.b, 1, null, "30001");
       }
       return;
    }
}
