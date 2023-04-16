package ie0.o$b;
import ie0.o$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.growth.pendant.core.demotion.PendantAnimPlan;
import java.lang.System;
import ie0.a;
import java.lang.Throwable;
import ce0.b;
import java.lang.StringBuilder;
import q87.c;
import ie0.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.google.gson.JsonArray;

public class o$b implements o$a	// class@0028af
{
    public final o$a a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public String g;
    public long h;

    public void o$b(o$a p0,String p1,String p2,String p3,String p4,boolean p5){
       super();
       this.g = "none";
       this.h = -1;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final void a(String p0,boolean p1){
       o$b uob = o$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "5")) {
          return;
       }
       if (p1) {
          a.b(this.e, this.b, PendantAnimPlan.a(), (System.currentTimeMillis() - this.h), this.g, this.c, this.d, p0, this.f);
       }
       return;
    }
    public void b(String p0){
       this.g = p0;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "4")) {
          return;
       }
       o$b ta = this.a;
       if (ta != null) {
          ta.onError(p0);
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().w("SkinResourceHelper", "fetch resource error, activityId = "+this.b+", resourceUrl = "+this.c+", key = "+this.d+", isTk = "+this.f, objArray);
       Object[] objArray1 = new Object[i];
       b.C().u("SkinResourceHelper", p0, objArray1);
       if (b.b(i) && !TextUtils.n(this.g, "cache")) {
          i = true;
       }
       this.a("error", i);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, o$b.class, "2")) {
          return;
       }
       this.h = System.currentTimeMillis();
       return;
    }
    public void onSuccess(Object p0){
       int i;
       o$b uob = o$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "3")) {
          return;
       }
       o$b ta = this.a;
       if (ta != null) {
          ta.onSuccess(p0);
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(p0 instanceof List){
          i = p0.size();
       }else if(p0 instanceof JsonArray){
          i = p0.size();
       }else {
          i = -1;
       }
       int i1 = 0;
       Object[] objArray = new Object[i1];
       b.C().w("SkinResourceHelper", "fetchSkinResource success activityId = "+this.b+", resourceUrl = "+this.c+", key = "+this.d+",size = "+i+" isBitmap = "+p0 instanceof List+", isTk = "+this.f, objArray);
       i = (i <= 0)? 1: 0;
       String str = (i)? "empty": "success";
       if (b.b((i ^ 1)) && !TextUtils.n(this.g, "cache")) {
          i1 = true;
       }
       this.a(str, i1);
       return;
    }
}
