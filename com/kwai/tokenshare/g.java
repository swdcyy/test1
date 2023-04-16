package com.kwai.tokenshare.g;
import pp5.a;
import java.lang.Object;
import java.lang.String;
import m4d.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.kwaitoken.KwaiToken;
import java.util.concurrent.atomic.AtomicReference;
import brd.t;
import t45.d;
import brd.z;
import j4d.v;
import erd.g;
import brd.x;
import j4d.h;
import j4d.i;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import du7.a;
import java.util.Objects;
import com.kwai.tokenshare.localtoken.LocalTokenModel;
import fg6.a;
import com.google.gson.Gson;
import qkd.b;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import android.util.Base64;
import java.lang.Exception;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import du7.f;
import com.kwai.tokenshare.localtoken.LocalTokenConfig;
import ekd.j;
import java.util.Random;
import com.kwai.tokenshare.KwaiTokenInitModule;
import bu7.i;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Boolean;
import com.kwai.framework.init.a;
import m4d.f;

public class g implements a	// class@001922
{

    public void g(){
       super();
    }
    public void Bj(String p0,String p1,h p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "6")) {
          return;
       }
       KwaiToken kwaiToken = KwaiToken.k();
       if (kwaiToken.D1()) {
          kwaiToken.r(3);
          AtomicReference uAtomicRefer = new AtomicReference();
          uAtomicRefer.set("");
          kwaiToken.m(p0, p1, false).subscribeOn(d.c).doOnNext(new v(uAtomicRefer)).compose(kwaiToken.s()).observeOn(d.a).subscribe(new h(kwaiToken, p2, uAtomicRefer, p1), super(kwaiToken, p2, uAtomicRefer, p1));
       }
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       KwaiToken.k().H();
       return;
    }
    public void Iu(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "9")) {
          return;
       }
       KwaiToken.k().F1(p0);
       return;
    }
    public String Iz(String p0,String p1,String p2){
       Object[] objArray;
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c();
       Objects.requireNonNull(obj);
       LocalTokenModel obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, obj, a.class, "2");
       if (obj1 != PatchProxyResult.class) {
       }else {
          try{
             obj1 = new LocalTokenModel(p0, p1, p2);
             p0 = PatchProxy.applyOneRefs(obj1, obj, a.class, "1");
             objArray = null;
             if (p0 != PatchProxyResult.class) {
             }else {
                p0 = obj.b()+"="+Base64.encodeToString((a.a.q(obj1)).getBytes(b.b), 2);
             }
             obj1 = p0;
          }catch(java.lang.Exception e9){
             e9.printStackTrace();
             obj1 = objArray;
          }
          if (TextUtils.x(obj1)) {
             obj1 = objArray;
          }else {
             p0 = PatchProxy.apply(objArray, objArray, f.class, "2");
             if (p0 != PatchProxyResult.class) {
                objArray = p0;
             }else {
                f.a();
                if (f.a != null) {
                   objArray = f.a.shareMessage;
                }
             }
             if (!j.h(objArray)) {
                objArray = new Object[]{obj1};
                obj1 = String.format((objArray[new Random().nextInt(objArray.length)]).replace("%@", "%1$s"), objArray);
             }
          }
       }
       return obj1;
    }
    public String L00(){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, KwaiTokenInitModule.class, "19");
       if (obj != patchProxyRe) {
       }else if(KwaiTokenInitModule.B){
          if (KwaiTokenInitModule.D && KwaiTokenInitModule.E) {
          label_003e :
             str = "firstColdLaunchToday";
          }else if(KwaiTokenInitModule.D){
          label_0041 :
             str = "coldLaunch";
          }else {
             str = "hotLaunch";
          }
       }else if(!DateUtils.H(i.a())){
          goto label_003e ;
       }else {
          goto label_0041 ;
       }
       obj = str;
       return obj;
    }
    public boolean N4(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.c().d(p0);
    }
    public a ZL(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiTokenInitModule();
    }
    public void f00(String p0,String p1,f p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "5")) {
          return;
       }
       KwaiToken.k().I1(p0, p1, false, false, p2);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean z1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KwaiToken.k().z1(p0);
    }
}
