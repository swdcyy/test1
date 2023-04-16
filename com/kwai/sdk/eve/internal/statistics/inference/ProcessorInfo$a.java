package com.kwai.sdk.eve.internal.statistics.inference.ProcessorInfo$a;
import java.lang.Object;
import nsd.u;
import com.kwai.sdk.eve.internal.inference.EveExecutableAtomic;
import com.kwai.sdk.eve.internal.statistics.inference.ProcessorInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.eve.packageinfo.model.TypedExecutable;
import com.kuaishou.eve.packageinfo.model.InlineExecutableInfo;
import com.kuaishou.eve.packageinfo.model.ExecutableInfo;
import com.kuaishou.eve.packageinfo.model.InPackExecutableInfo;
import com.kuaishou.eve.packageinfo.model.ModelExecutableInfo;

public final class ProcessorInfo$a	// class@0015b9
{

    public void ProcessorInfo$a(){
       super();
    }
    public void ProcessorInfo$a(u p0){
       super();
    }
    public final ProcessorInfo a(EveExecutableAtomic p0){
       ProcessorInfo obj = PatchProxy.applyOneRefs(p0, this, ProcessorInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "processor");
       TypedExecutable typedExecuta = p0.a();
       String str = null;
       if (typedExecuta instanceof InlineExecutableInfo) {
          obj = new ProcessorInfo(str, typedExecuta.e(), 1, str);
       }else if(typedExecuta instanceof InPackExecutableInfo){
          obj = new ProcessorInfo(typedExecuta.h(), typedExecuta.e());
       }else if(typedExecuta instanceof ModelExecutableInfo){
          obj = new ProcessorInfo(typedExecuta.e(), str, 2, str);
       }else {
          obj = new ProcessorInfo(str, str, 3, str);
       }
       return obj;
    }
}
