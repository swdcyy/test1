package com.yxcorp.gifshow.page.cost.PageStageTracker;
import ed5.g;
import java.lang.String;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.util.HashMap;
import kuaishou.perf.page.impl.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import dd5.i;
import androidx.fragment.app.c$b;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.page.cost.PageStageTracker$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import com.yxcorp.gifshow.page.cost.PageStageTracker$a;
import rvb.d;
import q87.c;
import java.lang.Long;
import com.yxcorp.utility.SystemUtil;
import java.io.File;
import cc6.b;
import fg6.a;
import com.google.gson.Gson;
import java.nio.charset.Charset;
import qkd.b;
import java.io.IOException;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import gd5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.StringBuilder;
import java.lang.System;
import gd5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class PageStageTracker implements g	// class@000e18
{
    public final String a;
    public boolean b;
    public final Map c;
    public final b d;
    public String e;

    public void PageStageTracker(String p0,LifecycleOwner p1,String p2,boolean p3){
       super();
       this.c = new HashMap();
       this.a = p0;
       this.e = p2;
       b uob = (TextUtils.isEmpty(p0))? null: new b(p0, "");
       this.d = uob;
       if (p1 instanceof Fragment) {
          c fragmentMana = p1.getFragmentManager();
          if (fragmentMana != null) {
             fragmentMana.registerFragmentLifecycleCallbacks(new i(true, this), true);
          }
       }
       if (p3) {
          p1.getLifecycle().addObserver(new PageStageTracker$1(this, p1));
       }
       return;
    }
    public void a(){
       Object[] objArray3;
       boolean b = this;
       PageStageTracker pageStageTra = PageStageTracker.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, pageStageTra, "5")) {
          return;
       }
       if (!this.l()) {
          return;
       }
       b.b = false;
       if (!TextUtils.x(b.e) && !b.c.containsKey(b.e)) {
          return;
       }
       Iterator iterator = b.c.keySet().iterator();
       String str = "PageStageTracker";
       int i = 1;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          Object obj = b.c.get(str1);
          int i1 = 3;
          if (!PageStageTracker$a.a(obj)) {
             Object[] objArray1 = new Object[i1];
             objArray1[0] = b.a;
             objArray1[i] = str1;
             objArray1[2] = obj;
             Object[] objArray2 = new Object[false];
             d.C().w(str, String.format("%s-%s,stage invalid : %s", objArray1), objArray2);
          }else {
             b.d.g(str1, obj.a, obj.b);
             objArray3 = new Object[3];
             objArray3[0] = b.a;
             objArray3[i] = str1;
             long l = obj.b - obj.a;
             objArray3[2] = Long.valueOf(l);
             String.format("%s-%s,stage cost : %s", objArray3);
          }
       }
       try{
          Object[] objArray4 = new Object[i];
          objArray4[0] = b.a;
          Object[] objArray5 = new Object[false];
          d.C().w(str, String.format("%s end", objArray4), objArray5);
          if (SystemUtil.P() && !PatchProxy.applyVoid(objArray, b, pageStageTra, "6")) {
             HashMap hashMap = new HashMap();
             boolean b1 = 4;
             String str2 = "enterToListRender";
             String[] stringArray = new String[]{"dataToListRender","reqNetToDataParsed","enterToReqNet",str2};
             int i2 = 0;
             while (i2 < b1) {
                object oobject = stringArray[i2];
                PageStageTracker$a uoa = b.c.get(oobject);
                if (PageStageTracker$a.a(uoa)) {
                   long l1 = uoa.b - uoa.a;
                   hashMap.put(oobject, Long.valueOf(l1));
                }
                i2 = i2 + 1;
             }
             if (hashMap.containsKey(str2)) {
                hashMap.put("totalCost", hashMap.get(str2));
             }
             File uFile = b.b();
             if (uFile != null) {
                objArray3 = new Object[i];
                objArray3[0] = b.a;
                b.w0(new File(uFile, String.format("stage_%s_coast.json", objArray3)), a.a.q(hashMap), Charset.defaultCharset(), false);
             }
          }
       }catch(java.io.IOException e0){
          e0.printStackTrace();
       }
       b.c.clear();
       b.d.c();
       return;
    }
    public void b(String p0,MainThreadScatterPresenterGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PageStageTracker.class, "13")) {
          return;
       }
       if (this.l()) {
          p1.a(new a(p0, this));
       }
       return;
    }
    public void c(String p0,long p1,long p2){
       if (PatchProxy.isSupport(PageStageTracker.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, PageStageTracker.class, "10")) {
          return;
       }
       if (this.c.get(p0) != null) {
          return;
       }
       PageStageTracker$a uoa = new PageStageTracker$a();
       uoa.a = p1;
       uoa.b = p2;
       this.c.put(p0, uoa);
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageStageTracker.class, "9")) {
          return;
       }
       if (!this.l()) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       PageStageTracker$a uoa = this.c.get(p0);
       if (uoa == null) {
          Object[] objArray = new Object[0];
          d.C().w("PageStageTracker", this.a+" not start "+p0, objArray);
          return;
       }else {
          uoa.b = System.currentTimeMillis();
          return;
       }
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageStageTracker.class, "7")) {
          return;
       }
       this.j(p0, -1);
       return;
    }
    public void f(String p0,MainThreadScatterPresenterGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PageStageTracker.class, "14")) {
          return;
       }
       if (this.l()) {
          p1.a(new b(p0, this));
       }
       return;
    }
    public void g(String p0,PresenterV2 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PageStageTracker.class, "11")) {
          return;
       }
       if (this.l()) {
          p1.U7(new b(p0, this));
       }
       PatchProxy.onMethodExit(PageStageTracker.class, "11");
       return;
    }
    public void h(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageStageTracker.class, "2")) {
          return;
       }
       if (!p0.isEmpty()) {
          this.d.b(p0);
       }
       return;
    }
    public void i(String p0,PresenterV2 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PageStageTracker.class, "12")) {
          return;
       }
       if (this.l()) {
          p1.U7(new a(p0, this));
       }
       PatchProxy.onMethodExit(PageStageTracker.class, "12");
       return;
    }
    public void j(String p0,long p1){
       PageStageTracker pageStageTra = PageStageTracker.class;
       if (PatchProxy.isSupport(pageStageTra) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, pageStageTra, "8")) {
          return;
       }
       if (!this.l()) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       if (this.c.containsKey(p0)) {
          Object[] objArray = new Object[0];
          d.C().w("PageStageTracker", this.a+" already start "+p0, objArray);
          return;
       }else {
          PageStageTracker$a uoa = new PageStageTracker$a();
          uoa.a = (p1 > 0)? p1: System.currentTimeMillis();
          this.c.put(p0, uoa);
          return;
       }
    }
    public void k(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PageStageTracker.class, "1")) {
          return;
       }
       if (!TextUtils.x(p0) && !TextUtils.x(p1)) {
          this.d.a(p0, p1);
       }
       return;
    }
    public final boolean l(){
       Object obj = PatchProxy.apply(null, this, PageStageTracker.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b != null) {
          return true;
       }
       Object[] objArray = new Object[0];
       d.C().s("PageStageTracker", this.a+" scope not start yet or already exit.", objArray);
       return 0;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, PageStageTracker.class, "4")) {
          return;
       }
       if (this.l()) {
          return;
       }
       this.b = true;
       this.d.i();
       this.d.j(0x3f800000);
       this.d.k();
       return;
    }
}
