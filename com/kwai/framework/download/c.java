package com.kwai.framework.download.c;
import erd.g;
import java.lang.Object;
import u56.a;
import com.kwai.framework.download.DownloadManagerInitModule;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.List;
import com.yxcorp.utility.Log;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$DownloadUpBizFt;
import com.yxcorp.download.DownloadManager;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadConfig;
import com.yxcorp.download.i;
import com.yxcorp.download.a;
import java.lang.Boolean;
import com.yxcorp.download.DownloadDispatcher;
import com.yxcorp.download.DownloadTask;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import java.util.Deque;
import com.yxcorp.download.DownloadDispatcher$PromoteTaskReason;

public final class c implements g	// class@001537
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       DownloadTask uDownloadTas;
       Boolean tRUE;
       p0 = p0.a;
       Log.g("DownloadManagerInit", "on ft download priority changed£¬ size="+p0.size());
       ArrayList uArrayList = new ArrayList();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          uArrayList.add(DownloadTask$DownloadBizExtra$DownloadUpBizFt.valueOf(p0.next()));
       }
       p0 = DownloadManager.n();
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(uArrayList, p0, DownloadManager.class, "19")) {
          Log.g("DownloadManager", "setInitPriority: "+uArrayList.toString());
          if (uArrayList.size() > 0) {
             p0.F = uArrayList;
             p0 = a.c();
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, i.class, "22")) {
                Boolean fALSE = Boolean.FALSE;
                Boolean uBoolean = Boolean.valueOf(DownloadManager.i().B);
                Iterator iterator = p0.d.iterator();
                while (iterator.hasNext()) {
                   uDownloadTas = iterator.next();
                   if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && uDownloadTas.getBizExtra() != null) {
                      tRUE = Boolean.TRUE;
                      uDownloadTas.getBizExtra().updateInitPriority(tRUE);
                      if (uBoolean.booleanValue()) {
                         uDownloadTas.updateGroupPriority(DownloadTask$DownloadBizExtra.groupPriorityWithLaunchBizFt(uDownloadTas.getBizExtra().getPluginLaunchBizFt()), tRUE);
                      }
                      fALSE = tRUE;
                   }
                }
                iterator = p0.f.iterator();
                while (iterator.hasNext()) {
                   uDownloadTas = iterator.next();
                   if (uDownloadTas.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && uDownloadTas.getBizExtra() != null) {
                      tRUE = Boolean.TRUE;
                      uDownloadTas.getBizExtra().updateInitPriority(tRUE);
                      if (uBoolean.booleanValue()) {
                         uDownloadTas.updateGroupPriority(DownloadTask$DownloadBizExtra.groupPriorityWithLaunchBizFt(uDownloadTas.getBizExtra().getPluginLaunchBizFt()), tRUE);
                      }
                      fALSE = tRUE;
                   }
                }
                iterator = p0.g.iterator();
                while (iterator.hasNext()) {
                   uDownloadTas = iterator.next();
                   if (uDownloadTas.getBizExtra() != null) {
                      tRUE = Boolean.TRUE;
                      uDownloadTas.getBizExtra().updateInitPriority(tRUE);
                      if (uBoolean.booleanValue()) {
                         uDownloadTas.updateGroupPriority(DownloadTask$DownloadBizExtra.groupPriorityWithLaunchBizFt(uDownloadTas.getBizExtra().getPluginLaunchBizFt()), tRUE);
                      }
                      fALSE = tRUE;
                   }
                }
                if (fALSE.booleanValue()) {
                   p0.i(DownloadDispatcher$PromoteTaskReason.InitPriority_Update);
                }
             }
          }
       }
       return;
    }
}
