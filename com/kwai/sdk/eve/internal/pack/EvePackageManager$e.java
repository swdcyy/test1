package com.kwai.sdk.eve.internal.pack.EvePackageManager$e;
import erd.g;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import java.lang.Object;
import v97.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import xa7.c;
import rn7.a;
import com.kwai.sdk.eve.internal.pack.api.EveKeepServerPackageDetail;
import java.util.Collection;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Objects;
import java.util.Iterator;
import tn7.a;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage$PackageItem;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage;

public final class EvePackageManager$e implements g	// class@001582
{
    public final EvePackageManager b;

    public void EvePackageManager$e(EvePackageManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageManager$e.class, "1")) {
       }else {
          EveLog.i$default("EPM#requestServerPackage : updateTaskPackageByResponse ===> onResponse", false, 2, null);
          p0 = p0.data;
          if (p0 != null) {
             p0 = p0.data;
             if (p0 != null) {
                p0 = p0.updateList;
                if (p0 != null && (p0.isEmpty() ^ 0x01)) {
                   EvePackageManager$e tb = this.b;
                   p0 = CollectionsKt___CollectionsKt.d2(p0);
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.applyVoidOneRefs(p0, tb, EvePackageManager.class, "5")) {
                      p0 = p0.iterator();
                      while (p0.hasNext()) {
                         a uoa = p0.next();
                         EveServerPackage$PackageItem packageItem = new EveServerPackage$PackageItem();
                         packageItem.urls = uoa.urls;
                         a bizId = uoa.bizId;
                         packageItem.taskId = bizId;
                         packageItem.md5 = uoa.md5;
                         packageItem.size = uoa.size;
                         packageItem.version = uoa.packageId;
                         packageItem.a = uoa.taskId;
                         packageItem.b = uoa.version;
                         EveServerPackage uEveServerPa = new EveServerPackage();
                         uEveServerPa.isIncremental = false;
                         uEveServerPa.taskId = bizId;
                         uEveServerPa.fullPack = packageItem;
                         EvePackageManager.z(tb, uEveServerPa, false, 2, null);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
