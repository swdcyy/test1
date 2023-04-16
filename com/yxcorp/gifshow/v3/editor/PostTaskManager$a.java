package com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public abstract class PostTaskManager$a	// class@000d99
{
    public final String a;
    public final Object b;
    public List c;

    public void PostTaskManager$a(String p0,Object p1,List p2){
       a.p(p0, "taskId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void PostTaskManager$a(String p0,Object p1,List p2,int p3,u p4){
       super(p0, p1, null);
    }
    public final List a(){
       return this.c;
    }
    public abstract Object b();
    public final Object c(){
       return this.b;
    }
    public final String d(){
       return this.a;
    }
    public abstract void e();
    public final void f(List p0){
       this.c = p0;
    }
    public boolean g(){
       return true;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostTaskManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostTask\(taskId=\'"+this.a+"\', taskData="+this.b+", resultData="+this.b()+')';
    }
}
