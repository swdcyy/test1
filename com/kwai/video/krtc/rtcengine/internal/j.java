package com.kwai.video.krtc.rtcengine.internal.j;
import com.kwai.video.krtc.rtcengine.internal.a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import com.kwai.video.krtc.rtcengine.internal.j$a;
import java.lang.Boolean;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.kwai.video.krtc.rtcengine.internal.j$1;
import java.util.Iterator;

public class j implements a	// class@00087d
{
    public ArrayList a;

    public void j(){
       super();
       this.a = new ArrayList();
    }
    public int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
       j$a uoa = this.e(p0);
       if (uoa != null) {
          return (int)(l - uoa.d);
       }
       return 0;
    }
    public String a(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oj, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       j$a uoa = this.b(p0);
       if (uoa != null) {
          return uoa.a;
       }else {
          return null;
       }
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       String str = this.a(true);
       if (!TextUtils.isEmpty(str)) {
          obj.add(str);
       }
       str = this.a(false);
       if (!TextUtils.isEmpty(str)) {
          obj.add(str);
       }
       return obj;
    }
    public void a(String p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oj, "1")) {
          return;
       }
       j$a uoa = new j$a(null);
       uoa.a = p0;
       uoa.c = p1;
       int i = 1;
       if (p1 != i) {
          i = false;
       }
       uoa.b = i;
       uoa.d = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
       uoa.e = new ArrayList();
       this.a.add(uoa);
       return;
    }
    public final j$a b(boolean p0){
       Iterator obj;
       j$a uoa;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oj, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uoa = obj.next();
          if (uoa.b == p0) {
             break ;
          }
       }
       return uoa;
    }
    public String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       j$a uoa = this.d(p0);
       if (uoa != null) {
          return uoa.a;
       }
       return null;
    }
    public ArrayList b(){
       ArrayList obj = PatchProxy.apply(null, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().a);
       }
       return obj;
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       j$a uoa = this.e(p0);
       if (uoa != null) {
          return uoa.c;
       }
       return 2;
    }
    public final j$a d(String p0){
       j$a uoa;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uoa = obj.next();
          if (uoa.e.contains(p0)) {
             break ;
          }
       }
       return uoa;
    }
    public final j$a e(String p0){
       j$a uoa;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uoa = obj.next();
          if ((uoa.a).equals(p0)) {
             break ;
          }
       }
       return uoa;
    }
}
