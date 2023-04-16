package com.kuaishou.miniapploader.internal.PackageFileLoader$fileNames$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.miniapploader.internal.PackageFileLoader;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.miniapploader.internal.PackageParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class PackageFileLoader$fileNames$2 extends Lambda implements a	// class@0009ea
{
    public final PackageFileLoader this$0;

    public void PackageFileLoader$fileNames$2(PackageFileLoader p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       PackageFileLoader obj = PatchProxy.apply(objArray, this, PackageFileLoader$fileNames$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, PackageParser.class, str);
       if (obj1 != patchProxyRe) {
       }else {
          String[] stringArray = obj.nativeGetFileNames(obj.a);
          Object obj2 = PatchProxy.applyOneRefs(stringArray, objArray, PackageParser.class, "7");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
             ArrayList uArrayList = new ArrayList();
             if (stringArray != null && stringArray.length > 0) {
                Collections.addAll(uArrayList, stringArray);
             }
             obj1 = uArrayList;
          }
       }
       return obj1;
    }
}
