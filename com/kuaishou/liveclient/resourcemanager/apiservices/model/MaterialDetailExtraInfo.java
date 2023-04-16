package com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailExtraInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MaterialDetailExtraInfo	// class@00105e
{
    public String fileName;
    public int fileType;

    public void MaterialDetailExtraInfo(){
       a.p("", "fileName");
       super();
       this.fileType = 0;
       this.fileName = "";
    }
    public final String a(){
       return this.fileName;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MaterialDetailExtraInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MaterialDetailExtraInfo && (this.fileType == p0.fileType && a.g(this.fileName, p0.fileName)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, MaterialDetailExtraInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.fileType * 31;
       MaterialDetailExtraInfo tfileName = this.fileName;
       int i1 = (tfileName != null)? tfileName.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MaterialDetailExtraInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MaterialDetailExtraInfo\(fileType="+this.fileType+", fileName="+this.fileName+"\)";
    }
}
