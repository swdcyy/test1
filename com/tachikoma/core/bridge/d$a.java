package com.tachikoma.core.bridge.d$a;
import com.tkruntime.v8.V8$BindingObjectCreator;
import com.tachikoma.core.bridge.d;
import java.lang.Object;
import com.tkruntime.v8.V8ObjectProxy;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import no8.a;
import java.lang.Boolean;
import com.tkruntime.v8.V8;
import com.tachikoma.core.bridge.c;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8Trace;
import qp8.d;
import com.tkruntime.v8.V8Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import aq8.g;
import cq8.b;
import gx4.f$a;
import gx4.e;
import gx4.f;
import com.tkruntime.v8.V8$SeqCommandRunner;
import com.tkruntime.v8.V8$CommandRunner;
import java.lang.Throwable;
import wp8.a;
import vo8.a;
import gx4.c;
import com.tkruntime.v8.V8Function;
import java.util.Objects;
import com.tkruntime.v8.JavaVoidCallback;
import po8.d;
import com.tkruntime.v8.JavaCallback;
import po8.c;

public class d$a implements V8$BindingObjectCreator	// class@000d43
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public Object constructRealObject(V8ObjectProxy p0,String p1,Object[] p2){
       d$a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.getCliValue() > 0) {
          this.a.l = p0.getCliValue();
       }
       obj = this.a;
       if (!obj.i - null) {
          obj.i = System.currentTimeMillis();
       }
       Boolean c = a.c;
       if (c.booleanValue()) {
          d$a ta = this.a;
          if (ta.g == null) {
             ta.g = true;
             V8Trace.traceLog(ta.a.g().getTraceTag("", ""), "createFirstComponent "+p1);
          }
          d.p().g("new_"+p1, p0);
       }
       Object obj1 = null;
       if (TextUtils.isEmpty(p1)) {
          if (c.booleanValue()) {
             d.p().j();
          }
          return obj1;
       }else {
          b uob = g.e().d(p1);
          if (uob == null) {
             if (c.booleanValue()) {
                d.p().j();
             }
             return obj1;
          }else {
             f$a uoa = new f$a(this.a, p0);
             uoa.c = p2;
             p0 = uob.a(uoa.a());
             if (c.booleanValue()) {
                d.p().j();
             }
             return p0;
          }
       }
    }
    public Object onFlushCmd(V8$SeqCommandRunner p0,V8 p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return p0.exec(p1);
       }catch(java.lang.Exception e3){
          a.d(this.a, e3);
          return null;
       }
    }
    public void onJsRefDestroy(Object p0,boolean p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0 instanceof a) {
          p0.onDestroy();
       }else if(p0 instanceof c){
          p1 = (!p1)? true: false;
          p0.destroy(p1);
       }
       return;
    }
    public Object onPropCall(V8Object p0,Object p1,String p2,boolean p3,String p4,Object p5){
       d obj;
       String str;
       V8Function obj1;
       d$a a;
       V8Function v8Function;
       Object pROP_SET_HAN;
       d$a uoa = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p4;
       object oobject3 = p5;
       d$a uoa1 = d$a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,Boolean.valueOf(p3),oobject2,oobject3};
          obj = PatchProxy.apply(objArray, this, uoa1, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoa1 = uoa.a;
       if (!uoa1.i - null) {
          uoa1.i = System.currentTimeMillis();
       }
       Boolean c = a.c;
       if (c.booleanValue()) {
          obj = d.p();
          str = oobject1;
          String str1 = (p3)? "_get_": "_set_";
          obj.g(str+str1+oobject2, oobject);
       }
       Object pROP_SET_IGN = V8ObjectProxy.PROP_SET_IGNORE;
       if (TextUtils.isEmpty(p4) || !oobject instanceof V8ObjectProxy) {
          if (c.booleanValue()) {
             d.p().j();
          }
          return pROP_SET_IGN;
       }else {
          str = "_stub";
          if (oobject1.endsWith(str)) {
             oobject1 = oobject1.replace(str, "");
          }
          object oobject4 = oobject1;
          b uob = g.e().d(oobject4);
          if (uob == null) {
             if (c.booleanValue()) {
                d.p().j();
             }
             return pROP_SET_IGN;
          }else if(p1 == null){
             obj1 = uoa.a.d(oobject, uob);
          }else {
             pROP_SET_HAN = p1;
          }
          if (obj1 == null) {
             if (c.booleanValue()) {
                d.p().j();
             }
             return pROP_SET_IGN;
          }else {
             V8 v8 = uoa.a.a.g();
             int i1 = uob.h(oobject2);
             if (i1 > 0) {
                obj1 = V8ObjectProxy.PROP_SET_HANDLED;
                if (p3) {
                   if (i1 == i) {
                      a = uoa.a;
                      Objects.requireNonNull(a);
                      d uod = PatchProxy.applyThreeRefs(oobject4, p4, uob, a, d.class, "11");
                      if (uod != PatchProxyResult.class) {
                      }else {
                         uod = new d(a, oobject4, oobject2, uob);
                      }
                      v8Function = new V8Function(v8, uod);
                   }else {
                      a = uoa.a;
                      Objects.requireNonNull(a);
                      c uoc = PatchProxy.applyThreeRefs(oobject4, p4, uob, a, d.class, "12");
                      if (uoc != PatchProxyResult.class) {
                      }else {
                         uoc = new c(a, oobject4, oobject2, uob);
                      }
                      v8Function = new V8Function(v8, oobject2, uoc);
                   }
                   obj1 = v8Function;
                }
                if (c.booleanValue()) {
                   d.p().j();
                }
                return obj1;
             }else if(uob.c(oobject2)){
                if (p3) {
                   pROP_SET_IGN = uob.e(obj1, oobject2);
                }else if(uob.k(obj1, oobject2, oobject3)){
                   pROP_SET_HAN = V8ObjectProxy.PROP_SET_HANDLED;
                }else {
                   pROP_SET_HAN = V8ObjectProxy.PROP_SET_IGNORE;
                }
                pROP_SET_IGN = pROP_SET_HAN;
             }
             if (c.booleanValue()) {
                d.p().j();
             }
             return pROP_SET_IGN;
          }
       }
    }
    public String[] onPropEnumerator(V8ObjectProxy p0){
       String[] stringArray = new String[0];
       return stringArray;
    }
}
