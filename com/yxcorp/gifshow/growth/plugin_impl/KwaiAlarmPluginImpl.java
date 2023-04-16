package com.yxcorp.gifshow.growth.plugin_impl.KwaiAlarmPluginImpl;
import fkd.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.util.ArrayList;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.growth.plugin_impl.KwaiAlarmPluginImpl$a;
import java.lang.reflect.Type;
import el.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.growth.plugin_impl.KwaiAlarmPluginImpl$RomAlarmDisableConfig;
import nsd.u;
import java.lang.Integer;
import kotlin.collections.CollectionsKt__CollectionsKt;
import cra.w;
import java.lang.StringBuilder;
import java.lang.Exception;
import q87.c;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.RomUtils;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Build$VERSION;
import zsd.u;

public class KwaiAlarmPluginImpl implements a	// class@001477
{
    public final String b;
    public final ArrayList c;
    public Boolean d;
    public Boolean e;

    public void KwaiAlarmPluginImpl(){
       int i;
       KwaiAlarmPluginImpl kwaiAlarmPlu = this;
       super();
       kwaiAlarmPlu.b = KwaiAlarmPluginImpl.class.getSimpleName();
       ArrayList uArrayList = new ArrayList();
       kwaiAlarmPlu.c = uArrayList;
       try{
          i = 0;
          ArrayList value = a.t().getValue("alarm_api_disable_rom", new KwaiAlarmPluginImpl$a().getType(), new ArrayList());
          int i1 = 1;
          if (value != null && (value.isEmpty() ^ i1)) {
             Iterator iterator = value.iterator();
             while (iterator.hasNext()) {
                kwaiAlarmPlu.c.add(iterator.next());
             }
          }else {
             KwaiAlarmPluginImpl$RomAlarmDisableConfig[] romAlarmDisa = new KwaiAlarmPluginImpl$RomAlarmDisableConfig[3];
             KwaiAlarmPluginImpl$RomAlarmDisableConfig romAlarmDisa1 = new KwaiAlarmPluginImpl$RomAlarmDisableConfig("VIVO", 0, null, true, 4, null);
             romAlarmDisa[i] = v13;
             KwaiAlarmPluginImpl$RomAlarmDisableConfig romAlarmDisa2 = new KwaiAlarmPluginImpl$RomAlarmDisableConfig("VIVO", 1, null, true, 4, null);
             romAlarmDisa[i1] = romAlarmDisa1;
             Integer[] integerArray = new Integer[5];
             integerArray[i] = Integer.valueOf(21);
             integerArray[i1] = Integer.valueOf(22);
             integerArray[2] = Integer.valueOf(23);
             integerArray[3] = Integer.valueOf(24);
             integerArray[4] = Integer.valueOf(25);
             KwaiAlarmPluginImpl$RomAlarmDisableConfig romAlarmDisa3 = new KwaiAlarmPluginImpl$RomAlarmDisableConfig(1, CollectionsKt__CollectionsKt.r(integerArray), false, 4, null);
             romAlarmDisa[2] = romAlarmDisa1;
             uArrayList.addAll(CollectionsKt__CollectionsKt.r(romAlarmDisa));
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[i];
          w.C().t(kwaiAlarmPlu.b, "e: "+e0.getMessage(), objArray);
       }
       return;
    }
    public boolean Qy(){
       Boolean fALSE;
       KwaiAlarmPluginImpl obj = PatchProxy.apply(null, this, KwaiAlarmPluginImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       if (obj != null) {
          return obj.booleanValue();
       }
       if (this.n(1)) {
          fALSE = Boolean.FALSE;
          this.e = fALSE;
          a.m(fALSE);
          return fALSE.booleanValue();
       }else {
          fALSE = Boolean.TRUE;
          this.e = fALSE;
          a.m(fALSE);
          return fALSE.booleanValue();
       }
    }
    public boolean isAvailable(){
       return true;
    }
    public final boolean n(int p0){
       String obj;
       KwaiAlarmPluginImpl kwaiAlarmPlu = KwaiAlarmPluginImpl.class;
       if (PatchProxy.isSupport(kwaiAlarmPlu)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kwaiAlarmPlu, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = RomUtils.f();
       Object[] objArray = new Object[0];
       w.C().w(this.b, "romName: "+obj, objArray);
       if (TextUtils.x(obj)) {
          return true;
       }else {
          Object[] objArray1 = new Object[0];
          w.C().w(this.b, "type: "+p0, objArray1);
          objArray1 = new Object[0];
          w.C().w(this.b, "SDK_INT: "+Build$VERSION.SDK_INT, objArray1);
          objArray1 = new Object[0];
          w.C().w(this.b, "disableRomConfigs.size: "+this.c.size(), objArray1);
          Iterator iterator = this.c.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return 0;
             }
             KwaiAlarmPluginImpl$RomAlarmDisableConfig romAlarmDisa = iterator.next();
             Object[] objArray2 = new Object[0];
             w.C().w(this.b, "config: "+romAlarmDisa, objArray2);
             if (romAlarmDisa.isAllRom() || (u.I1(obj, romAlarmDisa.getRomName(), true) && (romAlarmDisa.getType() == p0 && (romAlarmDisa.isAllVersion() || romAlarmDisa.getVersions().contains(Integer.valueOf(Build$VERSION.SDK_INT)))))) {
                break ;
             }
          }
          return true;
       }
    }
    public boolean xi(){
       Boolean fALSE;
       KwaiAlarmPluginImpl obj = PatchProxy.apply(null, this, KwaiAlarmPluginImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       if (obj != null) {
          return obj.booleanValue();
       }
       if (this.n(0)) {
          fALSE = Boolean.FALSE;
          this.d = fALSE;
          a.m(fALSE);
          return fALSE.booleanValue();
       }else {
          fALSE = Boolean.TRUE;
          this.d = fALSE;
          a.m(fALSE);
          return fALSE.booleanValue();
       }
    }
}
