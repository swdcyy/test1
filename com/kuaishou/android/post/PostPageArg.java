package com.kuaishou.android.post.PostPageArg;
import java.io.Serializable;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import android.content.Intent;
import java.lang.UnsupportedOperationException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.Objects;
import java.util.Arrays;
import android.os.Bundle;

public abstract class PostPageArg implements Serializable	// class@000ea5
{
    public boolean b;
    public Integer c;
    public final String d;
    public final String e;
    public final PostArguments f;
    public final boolean g;
    public Object value;

    public void PostPageArg(String p0,String p1,PostArguments p2,boolean p3){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
    }
    public void PostPageArg(String p0,String p1,PostArguments p2,boolean p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static boolean read$default(PostPageArg p0,Intent p1,boolean p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
       }
       if (p3 & 0x02) {
          p2 = false;
       }
       return p0.read(p1, p2);
    }
    public final boolean a(Intent p0){
       Uri obj = PatchProxy.applyOneRefs(p0, this, PostPageArg.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.getData();
       boolean b = false;
       if (obj != null && obj.isHierarchical() == true) {
          Uri data = p0.getData();
          String query = (data != null)? data.getQuery(): null;
          PostPageArg postPageArg = (query == null || !query.length())? 1: null;
          if (!postPageArg) {
             postPageArg = this.e;
             postPageArg = (postPageArg == null || !postPageArg.length())? 1: 0;
             if (!postPageArg) {
                b = true;
             }
          }
       }
    label_004c :
       return b;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, PostPageArg.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostArgType", "onActivityDestroy clear "+this.d+" level="+this.c, objArray);
       this.value = null;
       this.c = null;
       return;
    }
    public final Object get(){
       Object obj = PatchProxy.apply(null, this, PostPageArg.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f.getWriteable()) {
          Object[] objArray = new Object[0];
          p3.D().A("PostArgType", "read a data from a writeable object "+this.d, objArray);
       }
       return this.value;
    }
    public final Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostPageArg.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.get();
       if (obj != null) {
          p0 = obj;
       }
       return p0;
    }
    public final String getIntentKey(){
       return this.d;
    }
    public final boolean getLiveWithSession(){
       return this.b;
    }
    public final Integer getPageId(){
       return this.c;
    }
    public final boolean getRewritableByIntent(){
       return this.g;
    }
    public final String getSchemeJsKey(){
       return this.e;
    }
    public final Object getValue(){
       return this.value;
    }
    public final boolean hasValue(){
       boolean b = (this.value != null)? true: false;
       return b;
    }
    public final void initPageId(int p0){
       if (PatchProxy.isSupport(PostPageArg.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostPageArg.class, "4")) {
          return;
       }
       if (this.c != null) {
          PostUtils.D("PostArgType", "initPageLevel already has a pageId="+this.c, new IllegalStateException("already has pageId="+this.c+' '+this));
       }
       this.c = Integer.valueOf(p0);
       return;
    }
    public final boolean read(Intent p0,boolean p1){
       PostPageArg obj;
       if (PatchProxy.isSupport(PostPageArg.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, PostPageArg.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "intent");
       obj = this.value;
       char c = ']';
       String str = "] old=[";
       String str1 = "=[";
       int i = 0;
       if (p0.hasExtra(this.d)) {
          this.readIntent(p0);
          Object[] objArray = new Object[i];
          p3.D().w("PostArgType", "read\(\) intent "+this.d+str1+this.value+str+obj+c, objArray);
          if (this.value == null) {
             objArray = new Object[i];
             p3.D().A("PostArgType", "read\(\) a null for intent key=`"+this.d+'`', objArray);
          }
       }
       if (this.a(p0)) {
          this.readScheme(p0);
          Object[] objArray1 = new Object[i];
          p3.D().w("PostArgType", "read\(\) scheme "+this.e+str1+this.value+str+obj+c, objArray1);
       }
       int i1 = 1;
       boolean b = (obj == null && this.value != null)? true: false;
       if (obj != null && (a.g(obj, this.value) ^ i1)) {
          i = 1;
       }
       if (i && (this.g == null && !p1)) {
          char c1 = ' ';
          String str2 = " old=";
          str = "read\(\) rewrite  ";
          if (obj instanceof int[]) {
             PostPageArg tvalue = this.value;
             Objects.requireNonNull(tvalue, "null cannot be cast to non-null type kotlin.IntArray");
             if (!Arrays.equals(obj, tvalue)) {
                String str3 = Arrays.toString(obj);
                a.o(str3, "java.util.Arrays.toString\(this\)");
                PostPageArg tvalue1 = this.value;
                Objects.requireNonNull(tvalue1, "null cannot be cast to non-null type kotlin.IntArray");
                String str4 = Arrays.toString(tvalue1);
                a.o(str4, "java.util.Arrays.toString\(this\)");
                PostUtils.D("PostArgType", "read\(\)", new IllegalStateException(str+this.d+str2+str3+c1+"value="+str4));
             }
          }else {
             PostUtils.D("PostArgType", "read\(\)", new IllegalStateException(str+this.d+str2+obj+" value="+this.value+c1));
          }
       }
       return b;
    }
    public abstract void readFromStr(String p0);
    public abstract void readIntent(Intent p0);
    public abstract void readScheme(Intent p0);
    public void set(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostPageArg.class, "3")) {
          return;
       }
       if (!this.f.getWriteable()) {
          PostUtils.D("PostArgType", "set\(\) this argument not support intentKey="+this.d, new IllegalStateException("not support intentKey="+this.d));
          return;
       }else if(this.hasValue()){
          Object[] objArray = new Object[0];
          p3.D().A("PostArgType", "set\(\) already has value"+this.value+"  new one="+p0, objArray);
          if (p0 == null) {
             return;
          }
       }
       this.value = p0;
       return;
    }
    public final void setLiveWithSession(boolean p0){
       this.b = p0;
    }
    public final void setPageId(Integer p0){
       this.c = p0;
    }
    public final void setValue(Object p0){
       this.value = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostPageArg.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostPageArgType {"+this.d+", "+this.e+", pageId="+this.c+", value="+this.value+'}';
    }
    public abstract void writeBundle(Bundle p0);
    public abstract void writeIntent(Intent p0);
}
