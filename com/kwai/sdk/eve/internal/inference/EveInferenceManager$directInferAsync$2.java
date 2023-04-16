package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import zn7.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$a;
import java.lang.StringBuilder;
import ao7.a;
import sm7.p;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import kn7.h;
import vn7.a;
import java.lang.System;
import org.json.JSONObject;

public final class EveInferenceManager$directInferAsync$2 extends Lambda implements a	// class@00154a
{
    public final String $inferenceId;
    public final a $task;
    public final EveInferenceManager this$0;

    public void EveInferenceManager$directInferAsync$2(EveInferenceManager p0,a p1,String p2){
       this.this$0 = p0;
       this.$task = p1;
       this.$inferenceId = p2;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       String str1;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, EveInferenceManager$directInferAsync$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.$task.j();
       StringBuilder str = 1;
       if (obj == null || this.this$0.d.a(this.$task.n(), obj)) {
          return str;
       }
       str = "EveInferenceManager#directInfer "+this.$task.n()+' '+this.$inferenceId+' ';
       a uoa = this.$task.h();
       if (uoa != null) {
          p op = uoa.S3();
          if (op != null) {
             str1 = op.b();
             if (str1 != null) {
             label_0064 :
                EveLog.e$default(str+str1+" localGuard disable inference", false, 2, objArray);
                h oh = new h();
                oh.b(this.$task.n());
                oh.c(obj);
                oh.put("timeStamp", System.currentTimeMillis());
                oh.d();
                return false;
             }
          }
       }
       str1 = "";
       goto label_0064 ;
    }
}
