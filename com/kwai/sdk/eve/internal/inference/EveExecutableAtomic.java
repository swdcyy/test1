package com.kwai.sdk.eve.internal.inference.EveExecutableAtomic;
import cn7.a;
import com.kuaishou.eve.packageinfo.model.TypedExecutable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.inference.EveExecutableAtomic$idHash$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.eve.packageinfo.model.InlineExecutableInfo;
import com.kuaishou.eve.packageinfo.model.ExecutableInfo;
import com.kuaishou.eve.packageinfo.model.InPackExecutableInfo;
import java.lang.StringBuilder;
import com.kuaishou.eve.packageinfo.model.ModelExecutableInfo;
import com.kwai.sdk.eve.internal.inference.ExecutableAtomicType;
import ml5.a;
import sm7.k;
import java.lang.UnsupportedOperationException;

public abstract class EveExecutableAtomic implements a	// class@001544
{
    public final p b;
    public final TypedExecutable c;

    public void EveExecutableAtomic(TypedExecutable p0){
       a.p(p0, "executableInfo");
       super();
       this.c = p0;
       this.b = s.c(new EveExecutableAtomic$idHash$2(this));
    }
    public final TypedExecutable a(){
       return this.c;
    }
    public final String b(){
       String str;
       EveExecutableAtomic obj = PatchProxy.apply(null, this, EveExecutableAtomic.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj instanceof InlineExecutableInfo) {
          str = obj.e();
       }else if(obj instanceof InPackExecutableInfo){
          str = this.c.e()+'@'+this.c.h();
       }else if(obj instanceof ModelExecutableInfo){
          str = obj.e();
       }else {
          str = "";
       }
       return str;
    }
    public abstract ExecutableAtomicType c();
    public abstract a d(a p0,k p1);
    public String dc(){
       Object obj = PatchProxy.apply(null, this, EveExecutableAtomic.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, EveExecutableAtomic.class, "1")) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EveExecutableAtomic.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "processor: "+this.c;
    }
}
