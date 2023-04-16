package com.oasisfeng.condom.CondomProcess$CondomProcessActivityManager;
import com.oasisfeng.condom.CondomProcess$CondomSystemService;
import com.oasisfeng.condom.CondomCore;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Method;
import java.util.Objects;
import java.lang.Integer;
import android.content.Intent;
import com.oasisfeng.condom.OutboundType;
import com.oasisfeng.condom.CondomProcess$CondomProcessActivityManager$3;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedureThrows;
import android.content.ComponentName;
import com.oasisfeng.condom.CondomProcess;
import com.oasisfeng.condom.CondomCore$CondomEvent;
import com.oasisfeng.condom.CondomProcess$CondomProcessActivityManager$2;
import com.oasisfeng.condom.CondomProcess$CondomProcessActivityManager$1;
import java.lang.Class;
import android.os.Bundle;
import java.lang.Boolean;
import android.content.Context;
import java.lang.StringBuilder;

public class CondomProcess$CondomProcessActivityManager extends CondomProcess$CondomSystemService	// class@000a8d
{
    public CondomCore e;

    public void CondomProcess$CondomProcessActivityManager(CondomCore p0,Object p1){
       super(p1, "IActivityManager.", p0.DEBUG);
       this.e = p0;
    }
    public static Object a(CondomProcess$CondomProcessActivityManager p0,Object p1,Method p2,Object[] p3){
       return super.invoke(p1, p2, p3);
    }
    public static Object b(CondomProcess$CondomProcessActivityManager p0,Object p1,Method p2,Object[] p3){
       return super.invoke(p1, p2, p3);
    }
    public static Object c(CondomProcess$CondomProcessActivityManager p0,Object p1,Method p2,Object[] p3){
       return super.invoke(p1, p2, p3);
    }
    public final Object d(Object p0,Method p1,Object[] p2){
       int i3;
       Class tYPE;
       Class tYPE1;
       String name = p1.getName();
       Objects.requireNonNull(name);
       CondomProcess$CondomProcessActivityManager uCondomProce = 3;
       CondomCore uCondomCore = 2;
       int i = 0;
       Integer integer = Integer.valueOf(i);
       int i1 = -1;
       switch (name.hashCode()){
           case 0x39fbe754:
             if (name.equals("getContentProvider")) {
                i1 = 0;
             }
             break;
           case 0x44dcb6bd:
             if (name.equals("broadcastIntent")) {
                i1 = 1;
             }
             break;
           case 0x54856bb8:
             if (name.equals("bindService")) {
                i1 = 2;
             }
             break;
           case 0x6e4047f3:
             if (name.equals("startService")) {
                i1 = 3;
             }
             break;
           default:
       }
    label_0043 :
       Object[] obj = null;
       switch (i1){
           case 0:
             uCondomProce = this.e;
             if (!uCondomProce.shouldAllowProvider(uCondomProce.mBase, p2[1], 0x20000)) {
                return obj;
             }
             break;
           case 1:
             int i2 = Integer.MIN_VALUE;
             i3 = this.e.proceed(OutboundType.BROADCAST, p2[1], Integer.valueOf(i2), new CondomProcess$CondomProcessActivityManager$1(this, p0, p1, p2)).intValue();
             object oobject = p2[uCondomProce];
             if (i3 != i2) {
                return Integer.valueOf(i3);
             }else if(oobject == null){
                return integer;
             }else {
                Class[] uClassArray = new Class[]{Intent.class,tYPE,String.class,Bundle.class,tYPE1,tYPE1,tYPE};
                tYPE = Integer.TYPE;
                tYPE1 = Boolean.TYPE;
                i3 = oobject.getClass().getMethod("performReceive", uClassArray);
                obj = new Object[]{p2[1],p2[4],p2[5],p2[6],p2[(p2.length - uCondomProce)],p2[(p2.length - uCondomCore)],p2[(p2.length - 1)]};
                i3.invoke(oobject, obj);
                return integer;
             }
             break;
           case 2:
             object oobject1 = p2[uCondomCore];
             i3 = this.e.proceed(OutboundType.BIND_SERVICE, oobject1, integer, new CondomProcess$CondomProcessActivityManager$2(this, p0, p1, p2)).intValue();
             if (i3 > 0) {
                this.e.logIfOutboundPass(CondomProcess.FULL_TAG, oobject1, CondomCore.getTargetPackage(oobject1), CondomCore$CondomEvent.BIND_PASS);
             }
             return Integer.valueOf(i3);
             break;
           case 3:
             object oobject2 = p2[1];
             p0 = this.e.proceed(OutboundType.START_SERVICE, oobject2, obj, new CondomProcess$CondomProcessActivityManager$3(this, p0, p1, p2));
             if (p0 != null) {
                this.e.logIfOutboundPass(CondomProcess.FULL_TAG, oobject2, p0.getPackageName(), CondomCore$CondomEvent.START_PASS);
             }
             return p0;
             break;
           default:
       }
       return super.invoke(p0, p1, p2);
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
