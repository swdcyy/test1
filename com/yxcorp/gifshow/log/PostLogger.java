package com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostLogger$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import nsd.r0;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.utility.Log$LEVEL;
import k2b.u2;
import java.lang.Enum;
import gq.a;
import q87.c;
import java.lang.Throwable;
import w46.b;

public final class PostLogger	// class@001aee
{
    public String a;
    public String b;
    public PostLogger$FeatureName c;
    public String d;
    public Log$LEVEL e;
    public String f;
    public PostSubTaskEvent g;
    public String h;
    public PostLogger$Status i;
    public String j;
    public Throwable k;
    public static final PostLogger$a l;

    static {
       PostLogger.l = new PostLogger$a(null);
    }
    public void PostLogger(){
       super();
    }
    public final String a(){
       Object[] objArray;
       String str;
       String obj = PatchProxy.apply(null, this, PostLogger.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "[KSPM]";
       PostLogger tb = this.b;
       if (tb != null) {
          objArray = new Object[]{"taskId",tb};
          str = String.format("[%s:%s]", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          obj = obj+str;
       }
       tb = this.c;
       if (tb != null) {
          objArray = new Object[]{"featureName",tb};
          str = String.format("[%s:%s]", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          obj = obj+str;
       }
       tb = this.d;
       if (tb != null) {
          objArray = new Object[]{"fileName",tb};
          str = String.format("[%s:%s]", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          obj = obj+str;
       }
       tb = this.f;
       if (tb != null) {
          objArray = new Object[]{"function",tb};
          str = String.format("[%s:%s]", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          obj = obj+str;
       }
       tb = this.g;
       if (tb != null) {
          objArray = new Object[]{"subTask",tb.getValue()};
          a.m(tb);
          str = String.format("[%s:%s]", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          obj = obj+str;
       }
       tb = this.h;
       if (tb != null) {
          objArray = new Object[]{"subTaskId",tb};
          str = String.format("[%s:%s]", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          obj = obj+str;
       }
       tb = this.i;
       if (tb != null) {
          objArray = new Object[]{"subTaskState",tb.getValue()};
          a.m(tb);
          str = String.format("[%s:%s]", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          obj = obj+str;
       }
       tb = this.j;
       if (tb != null) {
          objArray = new Object[]{"message",tb};
          str = String.format("[%s:%s]", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          obj = obj+str;
       }
       obj = obj;
       a.o(obj, "stringBuilder.toString\(\)");
       return obj;
    }
    public final PostLogger b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       this.e = Log$LEVEL.ERROR;
       this.a = p0;
       return this;
    }
    public final PostLogger c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       this.e = Log$LEVEL.INFO;
       this.a = p0;
       return this;
    }
    public final void d(){
       a uoa;
       StringBuilder str2;
       PostLogger ta;
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, PostLogger.class, "14")) {
          return;
       }
       PostLogger te = this.e;
       int i = 0;
       String str = "mTag";
       String str1 = "PostLogger_";
       if (te == null) {
       label_002a :
          uoa = a.D();
          str2 = str1;
          ta = this.a;
          if (ta == null) {
             a.S(str);
          }
          objArray = new Object[i];
          uoa.s(str2+ta, this.a(), objArray);
       }else {
          int i1 = u2.a[te.ordinal()];
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 != 4) {
                      goto label_002a ;
                   }else if(this.k == null){
                      uoa = a.D();
                      str2 = str1;
                      ta = this.a;
                      if (ta == null) {
                         a.S(str);
                      }
                      objArray = new Object[i];
                      uoa.A(str2+ta, this.a(), objArray);
                   }else {
                      uoa = a.D();
                      StringBuilder str3 = str1;
                      ta = this.a;
                      if (ta == null) {
                         a.S(str);
                      }
                      uoa.e(str3+ta, this.a(), this.k);
                   }
                }else {
                   uoa = a.D();
                   str2 = str1;
                   ta = this.a;
                   if (ta == null) {
                      a.S(str);
                   }
                   objArray = new Object[i];
                   uoa.A(str2+ta, this.a(), objArray);
                }
             }else {
                uoa = a.D();
                str2 = str1;
                ta = this.a;
                if (ta == null) {
                   a.S(str);
                }
                objArray = new Object[i];
                uoa.w(str2+ta, this.a(), objArray);
             }
          }else {
             uoa = a.D();
             str2 = str1;
             ta = this.a;
             if (ta == null) {
                a.S(str);
             }
             objArray = new Object[i];
             uoa.s(str2+ta, this.a(), objArray);
          }
       }
       return;
    }
    public final PostLogger e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fileName");
       this.d = p0;
       return this;
    }
    public final PostLogger f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       this.f = p0;
       return this;
    }
    public final PostLogger g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "message");
       this.j = p0;
       return this;
    }
    public final PostLogger h(PostSubTaskEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "task");
       this.g = p0;
       return this;
    }
    public final PostLogger i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subTaskId");
       this.h = p0;
       return this;
    }
    public final PostLogger j(PostLogger$Status p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "status");
       this.i = p0;
       return this;
    }
    public final PostLogger k(String p0){
       this.b = p0;
       return this;
    }
    public final PostLogger l(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "throws");
       this.k = p0;
       return this;
    }
    public final PostLogger m(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostLogger.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       this.e = Log$LEVEL.WARN;
       this.a = p0;
       return this;
    }
}
