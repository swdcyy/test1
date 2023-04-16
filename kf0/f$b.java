package kf0.f$b;
import kf0.f$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kf0.r;
import java.lang.System;
import ie0.a;
import java.lang.Throwable;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import ce0.b;
import q87.c;
import ie0.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.google.gson.JsonArray;

public final class f$b implements f$a	// class@002d0b
{
    public String a;
    public long b;
    public final f$a c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public void f$b(f$a p0,String p1,String p2,String p3,String p4,boolean p5){
       a.p(p2, "mResourceUrl");
       a.p(p3, "mKey");
       a.p(p4, "mReason");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.a = "none";
       this.b = -1;
    }
    public final void a(String p0,boolean p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "6")) {
          return;
       }
       if (p1) {
          a.b(this.g, this.d, r.a.b(), (System.currentTimeMillis() - this.b), this.a, this.e, this.f, p0, this.h);
       }
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       a.p(p0, "resourceOrigin");
       this.a = p0;
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "5")) {
          return;
       }
       f$b tc = this.c;
       if (tc != null) {
          tc.onError(p0);
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskAnimResourceFetcher", "fetch resource error, activityId = "+this.d+", resourceUrl = "+this.e+", key = "+this.f+", isTk = "+this.h, false, 4, null);
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().u("TaskAnimResourceFetcher", p0, objArray);
       if (b.b(i) && !TextUtils.n(this.a, "cache")) {
          i = true;
       }
       this.a("error", i);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "3")) {
          return;
       }
       this.b = System.currentTimeMillis();
       return;
    }
    public void onSuccess(Object p0){
       int i;
       f$b uob = f$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "4")) {
          return;
       }
       f$b tc = this.c;
       if (tc != null) {
          tc.onSuccess(p0);
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "2");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(p0 instanceof List){
          i = p0.size();
       }else if(p0 instanceof JsonArray){
          i = p0.size();
       }else {
          i = -1;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskAnimResourceFetcher", "fetchAnimResource success activityId = "+this.d+", resourceUrl = "+this.e+", key = "+this.f+",size = "+i+" isBitmap = "+p0 instanceof List+", isTk = "+this.h, false, 4, null);
       boolean b = false;
       i = (i <= 0)? 1: 0;
       String str = (i)? "empty": "success";
       if (b.b((i ^ 1)) && !TextUtils.n(this.a, "cache")) {
          b = true;
       }
       this.a(str, b);
       return;
    }
}
