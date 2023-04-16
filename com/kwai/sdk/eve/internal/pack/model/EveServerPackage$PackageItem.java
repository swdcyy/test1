package com.kwai.sdk.eve.internal.pack.model.EveServerPackage$PackageItem;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class EveServerPackage$PackageItem	// class@0015a5
{
    public int a;
    public int b;
    public String md5;
    public long size;
    public String taskId;
    public List urls;
    public String version;

    public void EveServerPackage$PackageItem(){
       super();
    }
    public final String a(){
       String str;
       EveServerPackage$PackageItem obj = PatchProxy.apply(null, this, EveServerPackage$PackageItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.urls;
       if (obj != null) {
          str = CollectionsKt___CollectionsKt.p2(obj);
          if (str != null) {
          label_001f :
             return str;
          }
       }
       str = "";
       goto label_001f ;
    }
}
