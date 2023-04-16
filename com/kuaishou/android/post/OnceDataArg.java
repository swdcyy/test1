package com.kuaishou.android.post.OnceDataArg;
import com.kuaishou.android.post.StrArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.post.PostPageArg;
import java.lang.CharSequence;
import lnc.r5;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.Intent;

public final class OnceDataArg extends StrArg	// class@000ea3
{

    public void OnceDataArg(String p0,String p1,PostArguments p2){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2, false, 8, null);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, OnceDataArg.class, "7")) {
          return;
       }
       String str = this.get();
       int i = 0;
       r5 or5 = (str == null || !str.length())? 1: null;
       if (or5) {
          return;
       }else {
          Object[] objArray = new Object[i];
          p3.D().w("PostArgType", "clear\(\) OnceDataArg "+str+' '+r5.b().d(str), objArray);
          super.clear();
          return;
       }
    }
    public final Object getOnceData(Class p0){
       Object[] objArray;
       String obj = PatchProxy.applyOneRefs(p0, this, OnceDataArg.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       obj = this.get();
       int i = 0;
       String str = (obj == null || !obj.length())? 1: null;
       if (str) {
          objArray = new Object[i];
          p3.D().w("PostArgType", "popOnceData\(\) "+this.getIntentKey()+" no this arg", objArray);
          return null;
       }else {
          p0 = r5.b().a(obj, p0);
          objArray = new Object[i];
          p3.D().w("PostArgType", "popOnceData\(\) "+obj+' '+p0, objArray);
          return p0;
       }
    }
    public final Object popOnceData(){
       Object[] objArray1;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, OnceDataArg.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.get();
       int i = 0;
       StringBuilder str = (obj == null || !obj.length())? 1: null;
       String str1 = "popOnceData\(\) ";
       if (str) {
          objArray1 = new Object[i];
          p3.D().w("PostArgType", str1+this.getIntentKey()+" no this arg", objArray1);
          return objArray;
       }else {
          Object obj1 = r5.b().d(obj);
          objArray1 = new Object[i];
          p3.D().w("PostArgType", str1+obj+' '+obj1, objArray1);
          return obj1;
       }
    }
    public void readFromStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OnceDataArg.class, "2")) {
          return;
       }
       a.p(p0, "v");
       PostUtils.D("PostArgType", "OnceDataArg", new IllegalArgumentException("not support this for readFromStr"));
       return;
    }
    public void readScheme(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OnceDataArg.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       PostUtils.D("PostArgType", "OnceDataArg", new IllegalArgumentException("not support this for scheme"));
       return;
    }
    public void set(Object p0){
       this.set(p0);
    }
    public void set(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OnceDataArg.class, "3")) {
          return;
       }
       PostUtils.D("PostArgType", "OnceDataArg", new IllegalArgumentException("pls using setOnceData\(key, object\)"));
       return;
    }
    public final void setOnceData(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OnceDataArg.class, "4")) {
          return;
       }
       a.p(p0, "obj");
       super.set(r5.b().c(p0));
       return;
    }
}
