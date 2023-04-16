package com.kwai.performance.fluency.page.monitor.tracker.Tracker;
import com.kwai.performance.monitor.base.Monitor;
import java.lang.Object;
import msd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yf7.h;
import ef7.b;
import java.lang.CharSequence;
import java.lang.Class;
import kotlin.text.StringsKt__StringsKt;
import vsd.d;
import lsd.a;
import java.util.Map;
import yf7.l;

public class Tracker extends Monitor	// class@0010cc
{

    public void Tracker(){
       super();
    }
    public final void checkInit(Object p0,a p1){
       a.p(p1, "notInit");
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          p1.invoke();
          return;
       }else {
          p0 = this.getPageName(p0);
          if (p0 == null) {
             p1.invoke();
          }else if(!b.n.l(p0)){
             p1.invoke();
          }
          return;
       }
    }
    public final String getPageKey(Object p0){
       String name;
       String str = null;
       if (p0 == null) {
       }else if(p0 instanceof String){
          int i = (!p0.length())? 1: 0;
          if (!i) {
             str = p0;
          }
       }else if(p0 instanceof Class){
          name = p0.getName();
          a.o(name, "obj.name");
          str = StringsKt__StringsKt.j5(name, "$", str, 2, str)+'@'+p0.hashCode();
       }else if(p0 instanceof d){
          name = a.c(p0).getName();
          a.o(name, "obj.java.name");
          str = StringsKt__StringsKt.j5(name, "$", str, 2, str)+'@'+p0.hashCode();
       }else {
          name = p0.getClass().getName();
          a.o(name, "obj.javaClass.name");
          str = StringsKt__StringsKt.j5(name, "$", str, 2, str)+'@'+p0.hashCode();
       }
       return str;
    }
    public final String getPageName(Object p0){
       String str = null;
       if (p0 == null) {
       }else if(p0 instanceof String){
          p0 = StringsKt__StringsKt.j5(p0, "$", str, 2, str);
          int i = (!p0.length())? 1: 0;
          if (!i) {
             str = p0;
          }
       }else if(p0 instanceof Class){
          p0 = p0.getName();
          a.o(p0, "obj.name");
          str = StringsKt__StringsKt.j5(p0, "$", str, 2, str);
       }else if(p0 instanceof d){
          p0 = a.c(p0).getName();
          a.o(p0, "obj.java.name");
          str = StringsKt__StringsKt.j5(p0, "$", str, 2, str);
       }else {
          p0 = p0.getClass().getName();
          a.o(p0, "obj.javaClass.name");
          str = StringsKt__StringsKt.j5(p0, "$", str, 2, str);
       }
       return str;
    }
    public final String getPageSimpleName(Object p0){
       String str = null;
       if (p0 == null) {
       }else if(p0 instanceof String){
          p0 = StringsKt__StringsKt.f5(p0, ".", str, 2, str);
          int i = (!p0.length())? 1: 0;
          if (!i) {
             str = p0;
          }
       }else if(p0 instanceof Class){
          p0 = p0.getName();
          a.o(p0, "obj.name");
          str = StringsKt__StringsKt.f5(StringsKt__StringsKt.j5(p0, "$", str, 2, str), ".", str, 2, str);
       }else if(p0 instanceof d){
          p0 = a.c(p0).getName();
          a.o(p0, "obj.java.name");
          str = StringsKt__StringsKt.f5(StringsKt__StringsKt.j5(p0, "$", str, 2, str), ".", str, 2, str);
       }else {
          p0 = p0.getClass().getName();
          a.o(p0, "obj.javaClass.name");
          str = StringsKt__StringsKt.f5(StringsKt__StringsKt.j5(p0, "$", str, 2, str), ".", str, 2, str);
       }
       return str;
    }
    public final boolean hasPageCreated(Object p0){
       p0 = this.getPageKey(p0);
       boolean b = false;
       if (p0 != null && b.n.j().get(p0) != null) {
          b = true;
       }
       return b;
    }
    public final void markTraceSection(String p0,String p1){
       l a;
       a.p(p0, "pageName");
       a.p(p1, "section");
       if (b.n.m(p0)) {
          a = l.a;
          a.a("page_monitor_"+p1);
          a.b();
       }
       return;
    }
    public final void traceBegin(String p0){
       a.p(p0, "pageName");
       if (b.n.m(p0)) {
          l.a.d(p0);
       }
       return;
    }
    public final void traceEnd(String p0){
       a.p(p0, "pageName");
       if (b.n.m(p0)) {
          l.a.c();
       }
       return;
    }
}
