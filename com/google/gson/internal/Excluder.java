package com.google.gson.internal.Excluder;
import zk.j;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import com.google.gson.internal.Excluder$1;
import java.lang.AssertionError;
import al.d;
import java.lang.annotation.Annotation;
import al.e;
import java.util.Iterator;
import zk.a;
import java.lang.reflect.Field;
import al.a;
import zk.b;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Collection;

public final class Excluder implements j, Cloneable	// class@000567
{
    public double b;
    public int c;
    public boolean d;
    public boolean e;
    public List f;
    public List g;
    public static final Excluder h;

    static {
       Excluder.h = new Excluder();
    }
    public void Excluder(){
       super();
       this.b = 0xbff0000000000000;
       this.c = 136;
       this.d = true;
       this.f = Collections.emptyList();
       this.g = Collections.emptyList();
    }
    public TypeAdapter a(Gson p0,a p1){
       Class rawType = p1.getRawType();
       boolean b = this.d(rawType);
       boolean b1 = (b || this.e(rawType, true))? true: false;
       boolean b2 = (b || this.e(rawType, false))? true: false;
       if (!b1 && !b2) {
          return null;
       }else {
          Excluder$1 u1 = new Excluder$1(this, b2, b1, p0, p1);
          return rawType;
       }
    }
    public Excluder b(){
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError(e0);
       }
    }
    public boolean c(Class p0,boolean p1){
       boolean b = (this.d(p0) || this.e(p0, p1))? true: false;
       return b;
    }
    public Object clone(){
       return this.b();
    }
    public final boolean d(Class p0){
       if (this.b - 0xbff0000000000000 && !this.i(p0.getAnnotation(d.class), p0.getAnnotation(e.class))) {
          return true;
       }
       if (this.d == null && this.h(p0)) {
          return true;
       }
       if (this.g(p0)) {
          return true;
       }
       return false;
    }
    public final boolean e(Class p0,boolean p1){
       Excluder tf = (p1)? this.f: this.g;
       Iterator iterator = tf.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().shouldSkipClass(p0)) {
             break ;
          }
       }
       return true;
    }
    public boolean f(Field p0,boolean p1){
       Excluder tf;
       if (this.c & p0.getModifiers()) {
          return true;
       }
       if (this.b - 0xbff0000000000000 && !this.i(p0.getAnnotation(d.class), p0.getAnnotation(e.class))) {
          return true;
       }
       if (p0.isSynthetic()) {
          return true;
       }
       if (this.e != null) {
          a annotation = p0.getAnnotation(a.class);
          if (annotation != null) {
             if (p1) {
                if (annotation.serialize()) {
                label_004f :
                   if (this.d == null && this.h(p0.getType())) {
                      return true;
                   }else if(this.g(p0.getType())){
                      return true;
                   }else if(p1){
                      tf = this.f;
                   }else {
                      tf = this.g;
                   }
                   if (!tf.isEmpty()) {
                      b uob = new b(p0);
                      Iterator iterator = tf.iterator();
                      while (iterator.hasNext()) {
                         if (iterator.next().shouldSkipField(uob)) {
                            return true;
                         }
                      }
                   }
                   return false;
                }
             }else if(!annotation.deserialize()){
             }
          }
          return true;
       }else {
          goto label_004f ;
       }
    }
    public final boolean g(Class p0){
       boolean b = (!Enum.class.isAssignableFrom(p0) && (p0.isAnonymousClass() || p0.isLocalClass()))? true: false;
       return b;
    }
    public final boolean h(Class p0){
       boolean b = true;
       if (p0.isMemberClass()) {
          int i = (p0.getModifiers() & 0x08)? 1: 0;
          if (!i) {
          label_0017 :
             return b;
          }
       }
       b = false;
       goto label_0017 ;
    }
    public final boolean i(d p0,e p1){
       boolean b = false;
       double d = (p0 != null && p0.value() - this.b > 0)? 0: Double.MIN_VALUE;
       if (d) {
          d = (p1 != null && p1.value() - this.b <= 0)? 0: 1;
          if (d) {
             b = true;
          }
       }
       return b;
    }
    public Excluder j(a p0,boolean p1,boolean p2){
       ArrayList uArrayList;
       Excluder uExcluder = this.b();
       if (p1) {
          uArrayList = new ArrayList(this.f);
          uExcluder.f = uArrayList;
          uArrayList.add(p0);
       }
       if (p2) {
          uArrayList = new ArrayList(this.g);
          uExcluder.g = uArrayList;
          uArrayList.add(p0);
       }
       return uExcluder;
    }
}
