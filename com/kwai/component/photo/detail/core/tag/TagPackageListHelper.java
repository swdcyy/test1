package com.kwai.component.photo.detail.core.tag.TagPackageListHelper;
import java.lang.Object;
import com.kwai.component.photo.detail.core.tag.TagPackageListHelper$mTagPackageList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;

public final class TagPackageListHelper	// class@000a37
{
    public final p a;

    public void TagPackageListHelper(){
       super();
       this.a = s.c(TagPackageListHelper$mTagPackageList$2.INSTANCE);
    }
    public final void a(ClientContent$TagPackage p0){
       ClientContent$TagPackage tagPackage;
       if (PatchProxy.applyVoidOneRefs(p0, this, TagPackageListHelper.class, "2")) {
          return;
       }
       a.p(p0, "tagPackage");
       Iterator iterator = this.d().iterator();
       int i = 0;
       while (true) {
          if (iterator.hasNext()) {
             tagPackage = iterator.next();
             boolean b = (a.g(tagPackage.identity, p0.identity) && (tagPackage.type == p0.type && a.g(tagPackage.name, p0.name)))? true: false;
             if (b) {
             label_004b :
                if (i == -1) {
                   this.d().add(p0);
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             goto label_004b ;
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, TagPackageListHelper.class, "3")) {
          return;
       }
       this.d().clear();
       return;
    }
    public final List c(){
       Object obj = PatchProxy.apply(null, this, TagPackageListHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d();
    }
    public final List d(){
       Object obj = PatchProxy.apply(null, this, TagPackageListHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
