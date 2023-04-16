package com.oasisfeng.condom.CondomProcess$CondomProcessPackageManager;
import com.oasisfeng.condom.CondomProcess$CondomSystemService;
import com.oasisfeng.condom.CondomCore;
import java.lang.Object;
import java.lang.String;
import android.content.Intent;
import java.lang.reflect.Method;
import java.util.List;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Objects;
import android.content.pm.ProviderInfo;
import java.lang.Integer;
import com.oasisfeng.condom.OutboundType;
import com.oasisfeng.condom.CondomProcess$CondomProcessPackageManager$1;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedureThrows;
import com.oasisfeng.condom.CondomCore$Function;
import com.oasisfeng.condom.CondomProcess;
import com.oasisfeng.condom.CondomProcess$CondomProcessPackageManager$2;

public class CondomProcess$CondomProcessPackageManager extends CondomProcess$CondomSystemService	// class@000a90
{
    public final Intent e;
    public CondomCore f;
    public Method g;
    public Method h;

    public void CondomProcess$CondomProcessPackageManager(CondomCore p0,Object p1){
       super(p1, "IPackageManager.", p0.DEBUG);
       this.e = new Intent();
       this.f = p0;
    }
    public static Object a(CondomProcess$CondomProcessPackageManager p0,Object p1,Method p2,Object[] p3){
       return super.invoke(p1, p2, p3);
    }
    public static Object b(CondomProcess$CondomProcessPackageManager p0,Object p1,Method p2,Object[] p3){
       return super.invoke(p1, p2, p3);
    }
    public List c(Object p0){
       if (p0 instanceof List) {
          return p0;
       }
       Class class = p0.getClass();
       if (!("android.content.pm.ParceledListSlice").equals(class.getName())) {
          throw new IllegalArgumentException("Neither List nor ParceledListSlice: "+class);
       }
       if (this.h == null) {
          Class[] uClassArray = new Class[0];
          this.h = class.getMethod("getList", uClassArray);
       }
       Object[] objArray = new Object[0];
       return this.h.invoke(p0, objArray);
    }
    public final Object d(Object p0,Method p1,Object[] p2){
       String name = p1.getName();
       Objects.requireNonNull(name);
       String str = 1;
       int i = 0;
       int i1 = -1;
       switch (name.hashCode()){
           case 0xee461b29:
             if (name.equals("resolveService")) {
                i1 = 0;
             }
             break;
           case 0xf7015dd1:
             if (name.equals("getInstalledPackages")) {
                i1 = 1;
             }
             break;
           case 0xf9753602:
             if (name.equals("queryIntentServices")) {
                i1 = 2;
             }
             break;
           case 0x4f0ab5fe:
             if (name.equals("resolveContentProvider")) {
                i1 = 3;
             }
             break;
           case 0x5f659c07:
             if (name.equals("getInstalledApplications")) {
                i1 = 4;
             }
             break;
           case 0x6a75e340:
             if (name.equals("queryIntentReceivers")) {
                i1 = 5;
             }
             break;
           default:
       }
    label_0053 :
       ProviderInfo providerInfo = null;
       switch (i1){
           case 0:
             object oobject = p2[i];
             CondomProcess$CondomProcessPackageManager$2 uCondomProce = new CondomProcess$CondomProcessPackageManager$2(this, p0, p1, p2, oobject, oobject.getFlags());
             return this.f.proceed(OutboundType.QUERY_SERVICES, oobject, providerInfo, v11);
           case 1:
           case 4:
             this.f.logConcern(CondomProcess.FULL_TAG, "IPackageManager."+name);
          label_00cd :
             return super.invoke(p0, p1, p2);
             break;
           case 2:
             OutboundType qUERY_SERVIC = OutboundType.QUERY_SERVICES;
             if (this.g == null) {
                this.g = p1;
             }
             if (p2[i] == this.e) {
                return providerInfo;
             }else {
                providerInfo = qUERY_SERVIC;
             label_0087 :
                if (providerInfo == null) {
                   providerInfo = OutboundType.QUERY_RECEIVERS;
                }
                p0 = super.invoke(p0, p1, p2);
                CondomProcess$CondomProcessPackageManager tf = this.f;
                object oobject1 = p2[i];
                CondomProcess$CondomProcessPackageManager$1 uCondomProce1 = new CondomProcess$CondomProcessPackageManager$1(this, p0);
                CondomCore$Function sERVICE_PACK = (providerInfo == OutboundType.QUERY_SERVICES)? CondomCore.SERVICE_PACKAGE_GETTER: CondomCore.RECEIVER_PACKAGE_GETTER;
                if (tf.proceedQuery(providerInfo, oobject1, uCondomProce1, sERVICE_PACK).isEmpty()) {
                   this.c(p0).clear();
                }
                return p0;
             }
             break;
           case 3:
             p0 = super.invoke(p0, p1, p2);
             if (p2[str].intValue() & 0x20000) {
                return p0;
             }
             if (this.f.shouldAllowProvider(p0)) {
                providerInfo = p0;
             }
             return providerInfo;
             break;
           case 5:
             goto label_0087 ;
           default:
             goto label_00cd ;
       }
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       try{
          return this.d(p0, p1, p2);
       }catch(java.lang.Exception e0){
          if (this.d != null) {
             "Error proceeding "+p1;
          }
          return super.invoke(p0, p1, p2);
       }
    }
}
