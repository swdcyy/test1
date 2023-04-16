package com.kwai.component.newuseraction.NewUserActionManagerImpl;
import zc5.b;
import java.lang.Object;
import com.kwai.component.newuseraction.NewUserActionManagerImpl$FixSizeLinkedList;
import java.lang.String;
import oe6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import zc5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.init.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.newuseraction.NewUserActionInitModule;
import com.kwai.component.newuseraction.NewerAction;
import java.util.ArrayList;
import fg6.a;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import pe6.a;
import java.lang.Number;
import java.util.concurrent.atomic.AtomicLong;
import oe6.e;
import com.kwai.sdk.switchconfig.a;
import com.kwai.component.newuseraction.ExploreNewerReport;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Collection;
import java.lang.Boolean;
import o56.a;
import km8.b;
import java.util.Arrays;
import java.util.Map;
import ekd.q;
import zc5.c;
import com.kwai.component.newuseraction.NewUserActionManagerImpl$FixSizeLinkedList$a;

public class NewUserActionManagerImpl implements b	// class@0009e9
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final NewUserActionManagerImpl$FixSizeLinkedList e;
    public final NewUserActionManagerImpl$FixSizeLinkedList f;
    public final NewUserActionManagerImpl$FixSizeLinkedList g;
    public boolean h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public final String m;

    public void NewUserActionManagerImpl(){
       super();
       this.a = "exploreNewerReport";
       this.b = "addClick";
       this.c = "addLike";
       this.d = "addFollow";
       this.e = new NewUserActionManagerImpl$FixSizeLinkedList();
       this.f = new NewUserActionManagerImpl$FixSizeLinkedList();
       this.g = new NewUserActionManagerImpl$FixSizeLinkedList();
       this.h = false;
       this.i = 200;
       this.j = -5;
       this.k = false;
       this.l = false;
       this.m = "{\"click\":[],\"follow\":[],\"like\":[]}";
       if (TextUtils.isEmpty(a.s())) {
          this.k = true;
          if (!a.a()) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("feed_request_new_user", true);
             g.a(uEditor);
          }
       }else if(a.a()){
          this.k = true;
       }
       if (!TextUtils.isEmpty(a.s()) && !a.a()) {
          this.h = true;
       }
       return;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewUserActionManagerImpl.class, "9")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.g.remove(p0);
       this.n("addFollow", this.g);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewUserActionManagerImpl.class, "8")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.g.add(p0);
       this.n("addFollow", this.g);
       return;
    }
    public a c(){
       Object obj = PatchProxy.apply(null, this, NewUserActionManagerImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NewUserActionInitModule();
    }
    public void clean(){
       if (PatchProxy.applyVoid(null, this, NewUserActionManagerImpl.class, "10")) {
          return;
       }
       this.e.clear();
       this.f.clear();
       this.g.clear();
       this.n("addClick", this.e);
       this.n("addLike", this.f);
       this.n("addFollow", this.g);
       return;
    }
    public String d(){
       Object[] objArray = null;
       NewerAction obj = PatchProxy.apply(objArray, this, NewUserActionManagerImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l()) {
          return objArray;
       }
       obj = new NewerAction();
       obj.mClick = this.o(this.e);
       obj.mLike = this.o(this.f);
       obj.mFollow = this.o(this.g);
       return a.a.q(obj);
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewUserActionManagerImpl.class, "6")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.f.add(p0);
       this.n("addLike", this.f);
       return;
    }
    public boolean f(){
       return this.l;
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, NewUserActionManagerImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l()) {
          return null;
       }
       if (this.e.isEmpty() && (this.f.isEmpty() && this.g.isEmpty())) {
          return "{\"click\":[],\"follow\":[],\"like\":[]}";
       }
       return this.d();
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NewUserActionManagerImpl.class, "16")) {
          return;
       }
       if (this.k != null && this.l == null) {
          if (this.j - -1 < 0) {
             this.j();
          }
          if (this.j - 0x5f5e100 >= 0) {
             this.l = true;
             return;
          }else {
             Object obj = PatchProxy.apply(objArray, objArray, a.class, "3");
             long l = (obj != PatchProxyResult.class)? obj.longValue(): a.c.incrementAndGet();
             this.j = l;
             e.Z(l);
          }
       }
       return;
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewUserActionManagerImpl.class, "7")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.f.remove(p0);
       this.n("addLike", this.f);
       return;
    }
    public void init(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NewUserActionManagerImpl.class, "1")) {
          return;
       }
       ExploreNewerReport value = a.t().getValue("exploreNewerReport", ExploreNewerReport.class, objArray);
       if (value != null) {
          this.i = value.reportActionThreshold;
       }
       if (this.l()) {
          return;
       }else {
          this.e.addAll(this.m("addClick"));
          this.f.addAll(this.m("addLike"));
          this.g.addAll(this.m("addFollow"));
          return;
       }
    }
    public long j(){
       Object obj = PatchProxy.apply(null, this, NewUserActionManagerImpl.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.k == null) {
          return -1;
       }
       if (this.j - -1 < 0) {
          this.j = e.g();
       }
       return this.j;
    }
    public void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewUserActionManagerImpl.class, "5")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.e.add(p0);
       this.n("addClick", this.e);
       return;
    }
    public final boolean l(){
       Object obj = PatchProxy.apply(null, this, NewUserActionManagerImpl.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.h == null && (this.j() - -1 && (this.j() - (long)this.i > 0 || this.l != null))) {
          this.h = true;
       }
       return this.h;
    }
    public final List m(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewUserActionManagerImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = b.c(a.w, 0).getString(p0, "");
       if (TextUtils.isEmpty(p0)) {
          return new ArrayList();
       }
       return Arrays.asList(TextUtils.split(p0, ","));
    }
    public final void n(String p0,NewUserActionManagerImpl$FixSizeLinkedList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewUserActionManagerImpl.class, "11")) {
          return;
       }
       if (q.h(p1)) {
          return;
       }
       g.a(b.c(a.w, 0).edit().putString(p0, p1.join(",")));
       return;
    }
    public final ArrayList o(NewUserActionManagerImpl$FixSizeLinkedList p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, NewUserActionManagerImpl.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       p0.forEach(new c(obj));
       return obj;
    }
}
