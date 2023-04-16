package com.kwaishou.merchant.daccore.PendantHolder;
import java.lang.String;
import java.lang.Object;
import com.kwaishou.merchant.daccore.PendantHolder$pendantsMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwaishou.merchant.daccore.PendantHolder$pendantExtensionMap$2;
import com.kwaishou.merchant.daccore.PendantHolder$pendantTemplateMap$2;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import n08.a;
import b08.a;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Number;
import java.lang.Long;
import java.util.Collection;
import l08.c;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.CharSequence;
import zsd.u;
import com.kwaishou.merchant.daccore.pendant.extension.PendantExtension;
import f08.f;
import java.lang.StringBuilder;
import f08.f$a;
import java.lang.Throwable;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import com.kuaishou.bowl.data.center.data.model.RenderInfo;
import com.kwaishou.merchant.daccore.pendant.ERenderType;
import java.lang.Enum;
import d08.a;

public final class PendantHolder	// class@001307
{
    public final p a;
    public final p b;
    public final p c;
    public String d;

    public void PendantHolder(String p0){
       super();
       this.d = p0;
       this.a = s.c(PendantHolder$pendantsMap$2.INSTANCE);
       this.b = s.c(PendantHolder$pendantExtensionMap$2.INSTANCE);
       this.c = s.c(PendantHolder$pendantTemplateMap$2.INSTANCE);
    }
    public final List a(String p0){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = this.g().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (a.g(a.b(uEntry.getValue()), p0)) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       ArrayList uArrayList = new ArrayList(linkedHashMa.size());
       iterator = linkedHashMa.entrySet().iterator();
       while (iterator.hasNext()) {
          uArrayList.add(Long.valueOf(iterator.next().getKey().longValue()));
       }
       return uArrayList;
    }
    public final c b(String p0){
       c uoc = (p0 != null)? this.h().get(p0): null;
       return uoc;
    }
    public final List c(String p0){
       ConcurrentHashMap uConcurrentH = (p0 == null || u.S1(p0))? 1: null;
       if (uConcurrentH) {
          return null;
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.h().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String str = a.b(uEntry.getValue().f());
             c value = (str != null && str.equals(p0) == true)? uEntry.getValue(): null;
             if (value != null) {
                uArrayList.add(value);
             }
          }
          return uArrayList;
       }
    }
    public final PendantExtension d(long p0){
       a uoa = this.g().get(Long.valueOf(p0));
       if (uoa == null) {
          f$a.o(f.a, this.d, p0+" find pendantExtension failed:can not find pendantTemplate", null, null, 12, null);
       }
       Map map = null;
       if (uoa != null) {
          MaterialDataItem materialData = uoa.c();
          if (materialData != null) {
             materialData = materialData.renderInfo;
          label_003a :
             RenderInfo renderType = (materialData != null)? materialData.renderType: map;
             if (a.g(renderType, ERenderType.RN.name())) {
                map = this.e().get("RNPendant");
             }else if(a.g(renderType, ERenderType.NATIVE.name())){
                map = this.e().get(a.b(uoa));
             }else if(a.g(renderType, ERenderType.TK.name())){
                map = this.e().get("TKPendant");
             }
             return map;
          }
       }
       Map map1 = map;
       goto label_003a ;
    }
    public final Map e(){
       return this.b.getValue();
    }
    public final a f(long p0,String p1){
       a uoa = this.g().get(Long.valueOf(p0));
       if (uoa == null) {
          f$a.d(f.a, this.d, p1, p0+" can not find pendantTemplate", null, null, 24, null);
       }
       return uoa;
    }
    public final Map g(){
       return this.c.getValue();
    }
    public final ConcurrentHashMap h(){
       return this.a.getValue();
    }
    public final List i(a p0){
       Collection uCollection;
       PendantHolder pendantHolde = this;
       ArrayList uArrayList = new ArrayList();
       String str = p0.f();
       long l = 1;
       str = (str == null || u.S1(str))? 1: null;
       if (!str) {
          c uoc = pendantHolde.j(p0.f());
          if (uoc != null) {
             uArrayList.add(uoc);
          }
       }else {
          str = "removePendant pendantId:";
          if (p0.e() - null > 0) {
             l = p0.e();
             f$a.l(f.a, pendantHolde.d, "removePendantByMaterialId materialId:"+l, null, 4, null);
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator = this.h().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (!uEntry.getValue().f().d() - l) {
                   uEntry.getValue().i();
                   uArrayList1.add(uEntry.getValue());
                   String str1 = uEntry.getValue().e();
                   f$a.t(f.a, pendantHolde.d, str1, str+str1, null, false, false, 56, null);
                   iterator.remove();
                }
             }
             uArrayList.addAll(uArrayList1);
          }else {
             String str2 = p0.b();
             str2 = (str2 == null || u.S1(str2))? 1: null;
             if (!str2) {
                str2 = p0.b();
                f$a.l(f.a, pendantHolde.d, "removePendantByComponentName componentName:"+str2, null, 4, null);
                if (str2 != null && !u.S1(str2)) {
                   l = 0;
                }
                if (l) {
                   uCollection = null;
                }else {
                   ArrayList uArrayList2 = new ArrayList();
                   Iterator iterator1 = this.h().entrySet().iterator();
                   while (iterator1.hasNext()) {
                      Map$Entry uEntry1 = iterator1.next();
                      if (a.g(str2, a.b(uEntry1.getValue().f()))) {
                         uEntry1.getValue().i();
                         uArrayList2.add(uEntry1.getValue());
                         String str3 = uEntry1.getValue().e();
                         f$a.t(f.a, pendantHolde.d, str3, str+str3, null, false, false, 56, null);
                         iterator1.remove();
                      }
                   }
                   uCollection = uArrayList2;
                }
                if (uCollection != null) {
                   uArrayList.addAll(uCollection);
                }
             }
          }
       }
       return uArrayList;
    }
    public final c j(String p0){
       f$a.t(f.a, this.d, p0, "removePendantByPendantId pendantId:"+p0, null, false, false, 56, null);
       if (p0 == null) {
          return null;
       }
       c uoc = this.h().remove(p0);
       if (uoc != null) {
          uoc.i();
       }
       return uoc;
    }
}
