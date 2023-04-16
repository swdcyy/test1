package com.kwaishou.merchant.daccore.data.PendantDataServer$b;
import java.lang.Runnable;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import java.util.Map;
import java.lang.Object;
import f08.f;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.List;
import b08.a;
import f08.f$a;
import c08.a;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import com.kuaishou.bowl.data.center.data.model.MaterialMapItem;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import com.kwaishou.merchant.daccore.util.PendantUtil$Companion;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import d08.a;
import com.google.gson.JsonObject;
import nsd.u;
import java.lang.Throwable;
import io.reactivex.subjects.PublishSubject;

public final class PendantDataServer$b implements Runnable	// class@00130d
{
    public final PendantDataServer b;
    public final DataSource c;
    public final Map d;
    public final int e;

    public void PendantDataServer$b(PendantDataServer p0,DataSource p1,Map p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       ArrayList uArrayList;
       f$a a;
       String str;
       PendantDataServer$b uob2;
       MaterialMapItem data;
       MaterialMap materialMap;
       String str4;
       PendantDataServer$b uob = this;
       f$a.k(f.a, uob.b.h, "startNotifyBusinessData source:"+uob.c+" data:"+a.h(uob.d), null, 4, null);
       try{
          uArrayList = new ArrayList();
          PendantDataServer$b d = uob.d;
          if (d != null) {
             Iterator iterator = d.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                long l = uEntry.getKey().longValue();
                MaterialMap value = uEntry.getValue();
                value = (value != null)? value.pendantCode: null;
                MaterialMap value1 = uEntry.getValue();
                value1 = (value1 != null)? value1.datas: null;
                PendantDataServer$b uob1 = (value1 == null || value1.isEmpty())? 1: null;
                if (uob1) {
                   a = f.a;
                   PendantDataServer h = uob.b.h;
                   str = "materialMap datas is null";
                   String str1 = value+'_'+l;
                   PendantDataServer$b c = uob.c;
                   PendantDataServer h1 = uob.b.h;
                   String str2 = (h1 != null)? h1.e(): null;
                   int i = a.g(str2, "LIVE_WATCH") ^ 0x01;
                   a.p(h, str, str1, c, i);
                }
                value1 = uEntry.getValue();
                if (value1 != null) {
                   value1 = value1.datas;
                   if (value1 != null) {
                      Iterator iterator1 = value1.iterator();
                      while (iterator1.hasNext()) {
                         String obj = iterator1.next();
                         if (!uob.b.a(obj, l, value, uob.c)) {
                            continue ;
                         }else {
                            str = PendantUtil.a.a(uob.b.g, l, obj.uniqueId);
                            if (uob.c == DataSource.SIGNAL) {
                               uob.b.i(uEntry.getValue(), obj, str);
                            }
                            uob1 = uob.e;
                            if (uob1 <= null) {
                               value1 = uEntry.getValue();
                               if (value1 != null) {
                                  value1 = value1.signalPendant;
                                  if (value1 != null) {
                                     SignalPendant action = value1.action;
                                  }
                               }
                               uob2 = 0;
                            label_0117 :
                               data = obj.data;
                               obj = null;
                               String str3 = null;
                               PendantDataServer$b c1 = uob.c;
                               value1 = uEntry.getValue();
                               materialMap = (value1 != null)? value1.renderType: 0;
                               value1 = uEntry.getValue();
                               MaterialMap materialMap1 = (value1 != null)? value1.token: 0;
                               value1 = uEntry.getValue();
                               MaterialMap materialMap2 = (value1 != null)? value1.pendantCode: 0;
                               a uoa = new a(uob2, l, str, data, obj, str3, c1, materialMap, materialMap1, materialMap2, 0, 1024, 0);
                               uArrayList.add(v13);
                               l = l;
                            }
                            uob2 = uob1;
                            goto label_0117 ;
                         }
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e0){
          f$a.o(f.a, uob.b.i, "notifyBusinessData error", e0, null, 8, null);
       }
       uob.b.c().onNext(uArrayList);
       if (uArrayList.isEmpty()) {
          f$a.k(f.a, uob.b.h, "notifyBusinessData result:data is empty, source:"+uob.c, null, 4, null);
       }
       return;
    }
}
