package com.yxcorp.gifshow.activity.x;
import k2b.e0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.System;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.view.View;
import android.view.ViewParent;
import java.lang.Boolean;
import k2b.d0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.gifshow.activity.u;
import msd.l;
import com.yxcorp.gifshow.activity.t;
import java.lang.Number;
import com.yxcorp.gifshow.activity.o;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.activity.r;
import com.yxcorp.gifshow.activity.l;
import com.yxcorp.gifshow.activity.q;
import com.yxcorp.gifshow.activity.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import android.app.Activity;
import com.yxcorp.gifshow.activity.p;
import com.yxcorp.gifshow.log.h;
import k2b.b;
import k2b.c;
import com.yxcorp.gifshow.log.b;
import com.google.common.base.Optional;
import fw8.u;
import ok.h;
import com.yxcorp.gifshow.activity.w;
import com.yxcorp.gifshow.activity.k;
import com.yxcorp.gifshow.activity.v;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.activity.j;
import com.yxcorp.gifshow.activity.n;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.activity.s;

public class x implements e0	// class@0014ca
{
    public long b;
    public GifshowActivity c;
    public WeakReference d;
    public boolean e;

    public void x(GifshowActivity p0){
       super();
       this.d = new WeakReference(null);
       this.c = p0;
       this.b = System.currentTimeMillis();
       this.e = true;
    }
    public static String a(String p0,int p1){
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ox, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.isEmpty(p0)) {
          return String.valueOf(p1);
       }else {
          return p0+","+p1;
       }
    }
    public static Integer e(View p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, x.class, "31");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       while (p0 != null) {
          obj = p0.getTag(0x7f0a3d3f);
          if (obj == null && (p0.getParent() != null && p0.getParent() instanceof View)) {
             p0 = p0.getParent();
          }else {
             break ;
          }
       }
    label_0034 :
       return obj;
    }
    public static boolean g(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, x.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getPage() || (!TextUtils.isEmpty(p0.o()) && p0.M()))? true: false;
       return b;
    }
    public int D4(){
       return d0.h(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, x.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(u.b, null);
    }
    public ClientEvent$ExpTagTrans K5(){
       Object obj = PatchProxy.apply(null, this, x.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(t.b, null);
    }
    public int Lb(){
       return d0.j(this);
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, x.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       try{
          i = this.d(o.b, Integer.valueOf(i)).intValue();
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, x.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.d(r.b, null);
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public String P7(){
       Object obj = PatchProxy.apply(null, this, x.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.d(l.b, "");
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, x.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.d(q.b, null);
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, x.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.d(m.b, "");
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public ClientEvent$UrlPackage b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       Object obj = PatchProxy.apply(null, this, ox, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       ClientEvent$UrlPackage urlPackage = PatchProxy.applyOneRefs(this, null, ox, "3");
       if (urlPackage != patchProxyRe) {
       }else {
          urlPackage = new ClientEvent$UrlPackage();
          urlPackage.category = this.M();
          urlPackage.page = this.getPage();
          urlPackage.subPages = this.a2();
          urlPackage.params = this.getPageParams();
          urlPackage.expTagList = b.a(0xe0ff4fb).I1();
       }
       return urlPackage;
    }
    public Fragment c(){
       Object[] objArray = null;
       Fragment obj = PatchProxy.apply(objArray, this, x.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.get();
       if (obj != null) {
          return obj;
       }
       List fragments = this.c.getSupportFragmentManager().getFragments();
       if (fragments == null || fragments.isEmpty()) {
          return objArray;
       }
       return fragments.get(0);
    }
    public Activity cd(){
       return d0.f(this);
    }
    public final Object d(l p0,Object p1){
       x obj = PatchProxy.applyTwoRefs(p0, p1, this, x.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       Object obj1 = null;
       if (obj != null) {
          obj1 = p0.invoke(obj);
       }
       if (obj1 != null && obj1 != p1) {
          if (obj1 instanceof String) {
             TextUtils.isEmpty(obj1);
          }
          return obj1;
       }else {
          Fragment uFragment = this.c();
          if (uFragment instanceof e0) {
             return p0.invoke(uFragment);
          }else {
             return p1;
          }
       }
    }
    public boolean eg(){
       Object obj = PatchProxy.apply(null, this, x.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return this.d(p.b, Boolean.FALSE).booleanValue();
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public final boolean f(){
       boolean b;
       b obj = PatchProxy.apply(null, this, x.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(0x4b316083).l0();
       x tc = this.c;
       b = (tc != null && (!tc.isFinishing() && (obj != null && Optional.fromNullable(obj.c()).transform(new u(this)).or(Boolean.FALSE).booleanValue())))? true: false;
       return b;
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, x.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       try{
          i = this.d(w.b, Integer.valueOf(i)).intValue();
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, x.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.d(k.b, "");
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public void h(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       this.d = new WeakReference(p0);
       this.b = System.currentTimeMillis();
       return;
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, x.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(v.b, "");
    }
    public void i(boolean p0){
       this.e = p0;
    }
    public ClientEvent$ElementPackage j4(){
       return d0.c(this);
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, x.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.d(j.b, "");
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public String pg(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, this, ox, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = n.b;
       Object obj1 = PatchProxy.applyTwoRefs(obj, objArray, this, ox, "19");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          x tc = this.c;
          Object[] objArray1 = (tc != null)? obj.invoke(tc): objArray;
          if (objArray1 != null) {
             objArray = objArray1;
          }
       }
       return objArray;
    }
    public ClientContentWrapper$ContentWrapper ye(){
       Object obj = PatchProxy.apply(null, this, x.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(s.b, null);
    }
}
