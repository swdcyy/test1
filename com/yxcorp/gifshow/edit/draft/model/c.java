package com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import laa.g;
import laa.a;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.Integer;
import laa.e;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.NullPointerException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.UUID;
import java.lang.System;
import iaa.a;
import j80.f;
import java.lang.IllegalArgumentException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard;
import java.util.Objects;
import java.util.Set;
import java.nio.charset.Charset;
import java.util.Iterator;
import com.yxcorp.gifshow.edit.draft.model.c$a;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import laa.b;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map$Entry;
import android.util.Pair;
import com.yxcorp.gifshow.edit.draft.model.c$b;
import laa.f;
import com.yxcorp.gifshow.edit.draft.model.b;
import java.lang.Number;
import com.yxcorp.gifshow.edit.draft.model.a;

public abstract class c	// class@001afa
{
    public final g b;
    public c c;
    public g d;
    public File e;
    public c$a f;
    public boolean g;
    public boolean h;
    public long i;
    public Map j;

    public void c(File p0,GeneratedMessageLite p1,c p2){
       List list = (p1 != null)? Collections.singletonList(p1): Collections.emptyList();
       super(p0, list, p2);
       return;
    }
    public void c(File p0,List p1,c p2){
       super();
       this.g = false;
       this.h = false;
       this.i = 0;
       this.j = new ConcurrentHashMap();
       this.c = p2;
       this.b = new g(q.g(p1, new a(this)));
       this.L();
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.e = new File(p0, this.r());
       }
       return;
    }
    private List x(){
       c obj = PatchProxy.apply(null, this, c.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.D())? this.d: this.b;
       return obj.a;
    }
    public final boolean A(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, c.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       boolean b = (this.j.get(p0) != null)? true: false;
       obj = new Object[i];
       f.D().w("BaseDraft", "hasParamVersionRegister result:"+b, obj);
       return b;
    }
    public abstract boolean B();
    public final GeneratedMessageLite$Builder C(int p0,GeneratedMessageLite p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "48");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.c(true)) {
          this.c0();
       }
       e uoe = this.i(p1);
       this.d.a.add(p0, uoe);
       return uoe.f();
    }
    public boolean D(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public final boolean E(){
       Object obj = PatchProxy.apply(null, this, c.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return q.f(this.x());
    }
    public boolean F(){
       return this.g;
    }
    public boolean G(){
       return this.h;
    }
    public final void H(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "45")) {
          return;
       }
       if (!this.c(true)) {
          return;
       }
       if (this.d.a.isEmpty()) {
          return;
       }
       e uoe = this.d.a.remove(p0);
       uoe.f();
       this.d.a.add(p1, uoe);
       return;
    }
    public void I(boolean p0){
    }
    public void J(){
    }
    public void K(){
    }
    public void L(){
    }
    public final String M(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N(p0, "jpg");
    }
    public final String N(Bitmap p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.O(p0, p1, DraftFileManager.l);
    }
    public final String O(Bitmap p0,String p1,int p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, c.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          PostUtils.D("BaseDraft", "registerBitmap\(\)", new NullPointerException("registerBitmap a null bitmap ext="+p1));
       }
       this.c(true);
       p1 = new File(this.q(), UUID.randomUUID().toString()+"_"+System.currentTimeMillis()+"."+p1).getPath();
       g b = this.d.b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p2), null, uoa, "3");
          if (uoa != PatchProxyResult.class) {
          label_0099 :
             b.put(p1, uoa);
             return p1;
          }
       }
       uoa = new a(true, p2);
       uoa.c = p0;
       goto label_0099 ;
    }
    public final String P(byte[] p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.c(true);
       p1 = new File(this.q(), UUID.randomUUID().toString()+"_"+System.currentTimeMillis()+"."+p1).getPath();
       obj = this.d.b;
       a uoa = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a(2);
          uoa.d = p0;
       }
       obj.put(p1, uoa);
       return p1;
    }
    public final String Q(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.R(p0, false);
    }
    public final String R(String p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.S(p0, p1, "");
    }
    public final String S(String p0,boolean p1,String p2){
       Object[] obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, c.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       f.D().w("BaseDraft", "registerExternalFile\(\) externalFile="+p0+" moveOrigin="+p1+" internalFile="+p2, objArray);
       if (!f.e(p0)) {
          f.D().z("BaseDraft", "registerExternalFile\(\)", new IllegalArgumentException("externalFile is not exist="+p0+" mDirectory="+this.e));
       }
       boolean b = true;
       this.c(b);
       String name = new File(p0).getName();
       int i = name.lastIndexOf(46);
       name = (i > 0)? name.substring(i): "";
       if (TextUtils.x(p2)) {
          p2 = new File(this.q(), UUID.randomUUID().toString()+"_"+System.currentTimeMillis()+name).getPath();
       }
       this.d.b.put(p2, a.a(p0, p1));
       Objects.requireNonNull(DraftFileGuard.b);
       DraftFileGuard.a = b;
       obj = new Object[0];
       f.D().w("BaseDraft", "registerExternalFile  : "+p2+" value: "+this.d.b.get(p2), obj);
       return p2;
    }
    public final void T(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "9")) {
          return;
       }
       if (!this.c(true)) {
          return;
       }
       if (!this.d.c.remove(p0)) {
          File uFile = DraftFileManager.E().B(p0, this);
          if (uFile == null && (p1 != null && p1.D())) {
             uFile = DraftFileManager.E().B(p0, p1);
          }
       label_0037 :
          g b = this.d.b;
          String str = (uFile == null)? p0: uFile.getAbsolutePath();
          boolean b1 = false;
          a uoa = a.a(str, b1);
          a uoa1 = PatchProxy.applyOneRefs(uoa, null, a.class, "1");
          if (uoa1 != PatchProxyResult.class) {
          }else {
             uoa1 = new a(3);
             uoa1.f = uoa;
          }
          b.put(p0, uoa1);
          Object[] objArray = new Object[b1];
          f.D().w("BaseDraft", "registerInternalFile  : "+p0+" value: "+this.d.b.get(p0), objArray);
       }
       return;
    }
    public final String U(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P(p0.getBytes(Charset.forName("UTF-8")), p1);
    }
    public final void V(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "41")) {
          return;
       }
       this.W(p0, true);
       return;
    }
    public final void W(int p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoc, "42")) {
          return;
       }
       if (!this.c(true)) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("BaseDraft", "remove index:"+p0+",mEditingData.mItems.size:"+this.d.a.size(), objArray);
       e uoe = this.d.a.get(p0);
       if (p1) {
          this.Z(uoe.e());
       }
       this.d.a.remove(p0);
       return;
    }
    public final void X(Set p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "43")) {
          return;
       }
       if (this.c(true) && !p0.isEmpty()) {
          int i = 0;
          Iterator iterator = this.d.a.iterator();
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             if (p0.contains(Integer.valueOf(i))) {
                this.Z(uoe.e());
                iterator.remove();
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void Y(){
       if (PatchProxy.applyVoid(null, this, c.class, "44")) {
          return;
       }
       if (!this.c(true)) {
          return;
       }
       if (this.d.a.isEmpty()) {
          return;
       }
       this.V((this.d.a.size() - true));
       return;
    }
    public final void Z(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "24")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (this.d.b.remove(str) == null) {
             this.d.c.add(str);
          }
       }
       return;
    }
    public final void a0(){
       this.g = false;
    }
    public final GeneratedMessageLite$Builder b(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, c.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.c(true)) {
          this.c0();
       }
       obj = this.i(objArray);
       this.d.a.add(obj);
       return obj.f();
    }
    public void b0(c$a p0){
       this.f = p0;
    }
    public final boolean c(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc, "46");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.D() == p0) {
          return true;
       }else {
          f.D().z("BaseDraft", "assertEditing", new DraftEditException("Illegal state, editing "+this.D()));
          return false;
       }
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (!this.c(false)) {
          return;
       }
       this.d = new g(q.g(this.b.a, new b(this)));
       this.K();
       c tf = this.f;
       if (tf != null) {
          tf.c(this);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.e(false);
       return;
    }
    public void d0(Map p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "20")) {
          return;
       }
       this.e0(this.b, p0, p1);
       return;
    }
    public void e(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("BaseDraft", "Draft : "+this.getClass().getCanonicalName()+"clear start", objArray);
       boolean b = this.D();
       if (!b) {
          this.c0();
       }
       while (!this.d.a.isEmpty()) {
          this.Y();
       }
       if (!b) {
          this.g(p0);
       }
       this.h = p0;
       Object[] objArray1 = new Object[0];
       f.D().w("BaseDraft", "Draft : "+this.getClass().getCanonicalName()+"clear finish", objArray1);
       return;
    }
    public final void e0(g p0,Map p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "22")) {
          return;
       }
       Iterator iterator = p0.b.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          a uoa = p0.b.get(str);
          if (p1.get(str) == null || (uoa != null && uoa.g != 3)) {
             uoa = p0.b.get(str);
             Objects.requireNonNull(uoa);
             p1.put(str, uoa);
          }
       }
       p0.b.clear();
       p2.addAll(p0.c);
       p0.c.clear();
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.h(false, true);
       return;
    }
    public final void g(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "5")) {
          return;
       }
       this.h(false, p0);
       return;
    }
    public final void h(boolean p0,boolean p1){
       e uoe;
       Object[] objArray1;
       g og = this;
       boolean b = p0;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), og, uoc, "6")) {
          return;
       }
       if (!og.c(true)) {
          return;
       }
       HashMap hashMap = new HashMap();
       ArrayList uArrayList = new ArrayList(og.d.c);
       Iterator iterator = og.d.a.iterator();
       int i = 0;
       List list = null;
       Object[] objArray = null;
       while (iterator.hasNext()) {
          uoe = iterator.next();
          if (!uoe.k()) {
             continue ;
          }else {
             list = uoe.e();
             if (!PatchProxy.applyVoid(objArray, uoe, e.class, "1") && uoe.k()) {
                uoe.l();
                uoe.a = uoe.f().build();
                uoe.b = objArray;
             }
             List list1 = uoe.e();
             Iterator iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                String str = iterator1.next();
                a uoa = og.d.b.get(str);
                if (uoa != null) {
                   hashMap.put(str, uoa);
                }else {
                   continue ;
                }
             }
             list.removeAll(list1);
             uArrayList.addAll(list);
             if (!q.f(uoe.d)) {
                Iterator iterator2 = uoe.d.iterator();
                while (iterator2.hasNext()) {
                   iterator2.next().d0(hashMap, uArrayList);
                }
             }
             list = 1;
          }
       }
       if (b) {
          og.d.b.clear();
          og.d.b.putAll(hashMap);
          og.d.c.clear();
          og.d.c.addAll(uArrayList);
       }else {
          og.b.b.putAll(hashMap);
          Iterator iterator3 = uArrayList.iterator();
          while (iterator3.hasNext()) {
             String str1 = iterator3.next();
             if (og.b.b.remove(str1) == null) {
                og.b.c.add(str1);
             }else {
                continue ;
             }
          }
          if (og.b.a.size() != og.d.a.size()) {
             list = 1;
          }
          uoe = (!q.f(og.b.a))? og.b.a.get(i): objArray;
          e uoe1 = (!q.f(og.d.a))? og.d.a.get(i): objArray;
          if (!PatchProxy.applyVoidTwoRefs(uoe, uoe1, og, uoc, "49")) {
             Object[] objArray3 = new Object[i];
             f.D().w("BaseDraft", "upgradeParamVersion oldItem:"+uoe+",newItem:"+uoe1, objArray3);
             Iterator iterator4 = new ArrayList(og.j.entrySet()).iterator();
             while (iterator4.hasNext()) {
                Map$Entry uEntry = iterator4.next();
                String key = uEntry.getKey();
                Pair first = uEntry.getValue().first;
                int i1 = uEntry.getValue().second.intValue();
                String str2 = "upgradeParamVersion key:";
                Iterator iterator5 = iterator4;
                Object[] objArray4 = new Object[0];
                f.D().w("BaseDraft", str2+key+",paramVersion:"+first+",version:"+i1, objArray4);
                if (first.b(uoe, uoe1)) {
                   i1 = first.c(i1);
                   objArray = new Object[0];
                   f.D().w("BaseDraft", str2+key+" changed version:"+i1, objArray);
                }
                og.j.put(key, new Pair(first, Integer.valueOf(i1)));
                iterator4 = iterator5;
                str2 = null;
             }
          }
          og.b.a = og.d.a;
          og.d = null;
          if (list != null) {
             Object[] objArray2 = new Object[0];
             f.D().w("BaseDraft", this.getClass().getCanonicalName()+" modified", objArray2);
             og.g = true;
             og.i = System.currentTimeMillis();
          }
       }
       if (og.h == null && list != null) {
          og.h = p1;
       }
       this.I(p0);
       uoc = og.f;
       if (uoc != null) {
          uoc.a(og, b);
       }
    }
    public abstract e i(GeneratedMessageLite p0);
    public final void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (!this.c(true)) {
          return;
       }
       this.d = null;
       this.J();
       c tf = this.f;
       if (tf != null) {
          tf.b(this);
       }
       return;
    }
    public final GeneratedMessageLite$Builder k(){
       Object obj = PatchProxy.apply(null, this, c.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l(null);
    }
    public final GeneratedMessageLite$Builder l(f p0){
       GeneratedMessageLite$Builder obj = PatchProxy.applyOneRefs(p0, this, c.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.c(true)) {
          this.c0();
       }
       if (!this.d.a.isEmpty()) {
          return this.d.a.get(0).f();
       }else {
          obj = this.b();
          if (p0 != null) {
             p0.a(obj);
          }
          return obj;
       }
    }
    public a m(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          a uoa = obj.b.get(p0);
          if (uoa != null) {
             return uoa;
          }
       }
       return this.b.b.get(p0);
    }
    public final GeneratedMessageLite$Builder n(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "39");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.c(true)) {
          this.c0();
       }
       return this.d.a.get(p0).f();
    }
    public final List o(){
       Object obj = PatchProxy.apply(null, this, c.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(q.g(this.b.a, b.a));
    }
    public final int p(){
       Object obj = PatchProxy.apply(null, this, c.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.x().size();
    }
    public final File q(){
       return this.e;
    }
    public abstract String r();
    public File s(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.s(p0);
    }
    public final GeneratedMessageLite t(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.b.a.isEmpty()) {
          objArray = this.b.a.get(0).h();
       }
       return objArray;
    }
    public final e u(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, c.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x();
       if (!obj.isEmpty()) {
          objArray = obj.get(0);
       }
       return objArray;
    }
    public final GeneratedMessageLite v(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, c.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x();
       if (!obj.isEmpty()) {
          objArray = (this.D())? obj.get(0).g(): obj.get(0).h();
       }
    label_0037 :
       return objArray;
    }
    public final e w(int p0){
       List obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.x();
       if (!obj.isEmpty() && (p0 >= obj.size() || p0 < 0)) {
          return null;
       }else {
          return obj.get(p0);
       }
    }
    public final GeneratedMessageLite y(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       GeneratedMessageLite generatedMes = (this.D())? this.d.a.get(p0).g(): this.b.a.get(p0).h();
       return generatedMes;
    }
    public final List z(){
       List obj = PatchProxy.apply(null, this, c.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.D())? q.g(this.d.a, a.a): q.g(this.b.a, b.a);
       return Collections.unmodifiableList(obj);
    }
}
