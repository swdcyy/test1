package com.kuaishou.tk.api.view.player.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tk.api.view.player.logger.KsLogTKBusinessTag;
import java.util.List;
import wx4.e;
import xx4.c;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import xx4.b;
import nsd.s0;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import tkd.b;
import tkd.d;
import rx4.i;
import java.util.HashMap;
import java.lang.Throwable;

public class a	// class@000fb6
{

    public void a(){
       super();
    }
    public static void a(String p0,String p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       KsLogTKBusinessTag pLAYER = KsLogTKBusinessTag.PLAYER;
       pLAYER.appendTag(p0);
       KsLogTKBusinessTag ksLogTKBusin = pLAYER;
       e uoe = new e(p1);
       c uoc = c.class;
       if (!PatchProxy.applyVoidTwoRefs(ksLogTKBusin, uoe, null, uoc, "2")) {
          a.p(ksLogTKBusin, "tag");
          a.p(uoe, "msg");
          ArrayList uArrayList = new ArrayList(u.Y(ksLogTKBusin, 10));
          Iterator iterator = ksLogTKBusin.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getTagName());
          }
          List list = s0.g(uArrayList);
          try{
             str = uoe.invoke();
          }catch(java.lang.Exception e0){
             str = "onInfo exception : "+e0.getMessage();
          }
          list.add(0, "tachikoma");
          String[] stringArray = new String[0];
          Object[] objArray = list.toArray(stringArray);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          String[] stringArray1 = Arrays.copyOf(objArray, objArray.length);
          if (!PatchProxy.applyVoidTwoRefs(str, stringArray1, null, uoc, "9")) {
             d.a(0x256720e1).vZ(str, null, stringArray1);
          }
       }
       return;
    }
    public static void b(String p0,String p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "5")) {
          return;
       }
       KsLogTKBusinessTag pLAYER = KsLogTKBusinessTag.PLAYER;
       pLAYER.appendTag(p0);
       KsLogTKBusinessTag ksLogTKBusin = pLAYER;
       e uoe = new e(p1);
       c uoc = c.class;
       if (!PatchProxy.applyVoidTwoRefs(ksLogTKBusin, uoe, null, uoc, "3")) {
          a.p(ksLogTKBusin, "tag");
          a.p(uoe, "msg");
          ArrayList uArrayList = new ArrayList(u.Y(ksLogTKBusin, 10));
          Iterator iterator = ksLogTKBusin.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getTagName());
          }
          List list = s0.g(uArrayList);
          try{
             str = uoe.invoke();
          }catch(java.lang.Exception e0){
             str = "onInfo exception : "+e0.getMessage();
          }
          list.add(0, "tachikoma");
          String[] stringArray = new String[0];
          Object[] objArray = list.toArray(stringArray);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          String[] stringArray1 = Arrays.copyOf(objArray, objArray.length);
          if (!PatchProxy.applyVoidTwoRefs(str, stringArray1, null, uoc, "15")) {
             d.a(0x256720e1).pf(str, null, stringArray1);
          }
       }
       return;
    }
    public static void c(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "3")) {
          return;
       }
       KsLogTKBusinessTag pLAYER = KsLogTKBusinessTag.PLAYER;
       pLAYER.appendTag(p0);
       KsLogTKBusinessTag ksLogTKBusin = pLAYER;
       e uoe = new e(p1);
       if (!PatchProxy.applyVoidThreeRefs(ksLogTKBusin, uoe, p2, null, c.class, "5")) {
          a.p(ksLogTKBusin, "tag");
          a.p(uoe, "msg");
          a.p(p2, "throwable");
          ArrayList uArrayList = new ArrayList(u.Y(ksLogTKBusin, 10));
          Iterator iterator = ksLogTKBusin.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getTagName());
          }
          List list = s0.g(uArrayList);
          try{
             uArrayList = uoe.invoke();
          }catch(java.lang.Exception e8){
             uArrayList = "onWarning exception : "+e8.getMessage();
          }
          list.add(0, "tachikoma");
          String[] stringArray = new String[0];
          Object[] objArray = list.toArray(stringArray);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          c.a(uArrayList+", throw "+p2.getMessage(), Arrays.copyOf(objArray, objArray.length));
       }
       return;
    }
}
