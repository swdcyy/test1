package com.kuaishou.growth.pendant.task.tk.bridge.TaskPendantJs2NativeInvoker;
import sx4.e$a;
import com.kuaishou.growth.pendant.task.tk.bridge.TaskPendantJs2NativeInvoker$a;
import nsd.u;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.task.tk.bridge.TaskPendantJs2NativeInvoker$mParams$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tx4.h;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import zsd.u;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import gf0.a;
import android.widget.FrameLayout;
import java.util.Objects;
import java.lang.Float;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Map$Entry;
import qrd.l1;
import k2b.u1;
import lf0.b;
import android.view.View;
import com.yxcorp.gifshow.widget.m;
import lf0.a;
import com.google.gson.Gson;
import he0.a;
import com.google.gson.TypeAdapter;
import kf0.f;
import jf0.a;
import kf0.f$b;
import kf0.f$a;
import java.util.Map;
import crd.b;
import lnc.b9;
import kf0.g;
import java.util.concurrent.Callable;
import brd.t;
import kf0.h;
import erd.o;
import t45.d;
import brd.z;
import kf0.i;
import kf0.j;
import erd.g;
import kf0.r;
import java.lang.Boolean;

public final class TaskPendantJs2NativeInvoker implements e$a	// class@0006db
{
    public final p b;
    public final TkActivityTaskPendant c;
    public static final TaskPendantJs2NativeInvoker$a d;

    static {
       TaskPendantJs2NativeInvoker.d = new TaskPendantJs2NativeInvoker$a(null);
    }
    public void TaskPendantJs2NativeInvoker(TkActivityTaskPendant p0){
       a.p(p0, "mPendant");
       super();
       this.c = p0;
       this.b = s.c(new TaskPendantJs2NativeInvoker$mParams$2(this));
    }
    public final TaskCommonParams a(){
       Object obj = PatchProxy.apply(null, this, TaskPendantJs2NativeInvoker.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public Object b(String p0,String p1,h p2){
       boolean b;
       String str5;
       String str6;
       TaskCenterLogUtil taskCenterLo;
       a uoa;
       JsonElement jsonElement;
       JsonObject jsonObject;
       String str8;
       Throwable throwable;
       boolean i2;
       object oobject;
       ClickMetaData uClickMetaDa;
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       JsonElement jsonElement2;
       Set set;
       JsonElement jsonElement3;
       JsonObject jsonObject1;
       ArrayList uArrayList;
       Iterator iterator;
       Map$Entry uEntry;
       int i3;
       TaskPendantJs2NativeInvoker taskPendantJ = this;
       Object[] obj = p0;
       String str = p1;
       String obj1 = p2;
       TaskPendantJs2NativeInvoker taskPendantJ1 = TaskPendantJs2NativeInvoker.class;
       TaskCenterLogUtil obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TaskPendantJs2NativeInvoker.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj, "functionName");
       int i = 0;
       int i1 = 1;
       obj2 = (taskPendantJ.c.o != null)? 1: null;
       if (!obj2) {
          return null;
       }else {
          obj2 = TaskCenterLogUtil.b;
          TaskCenterLogUtil.d(obj2, "TaskPendantJs2NativeInvoker", "onJSInvokeNativeWithJSONString "+obj+"; "+str, false, 4, null);
          String str1 = 2;
          String str2 = "JsonParser.parseString\(jsonData\)";
          String str3 = "3";
          switch (p0.hashCode()){
              case 0xd894115e:
                if (!obj.equals("isDemote") || (!PatchProxy.applyVoidTwoRefs(str, obj1, taskPendantJ, taskPendantJ1, "6") && obj1 != null)) {
                   obj = new Object[i1];
                   obj[i] = Boolean.valueOf(r.a.b());
                   obj1.call(obj);
                }
                break;
              case 0xf2a76d07:
                String str4 = str3;
                if (obj.equals("findResPaths") && !PatchProxy.applyVoidTwoRefs(str, obj1, taskPendantJ, taskPendantJ1, str4)) {
                   Gson gson = (str == null || u.S1(p1))? 1: null;
                   if (!gson) {
                      b = false;
                      str5 = "TaskPendantJs2NativeInvoker";
                      str6 = "invokeFindResPath";
                      taskCenterLo = obj2;
                      try{
                         TaskCenterLogUtil.d(taskCenterLo, str5, str6, b, 4, null);
                         uoa = new Gson().k(a.class).fromJson(str);
                      }catch(java.lang.Exception e0){
                         TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskPendantJs2NativeInvoker", "invokeFindResPath error ", e0, false, 8, null);
                         uoa = null;
                      }
                      if (uoa != null) {
                         a mResourceKey = uoa.mResourceKey;
                         TaskPendantJs2NativeInvoker taskPendantJ2 = (mResourceKey == null || u.S1(mResourceKey))? 1: null;
                         if (!taskPendantJ2) {
                            f animResource = taskPendantJ.c.getAnimResourceFetcher();
                            a mActivityId = uoa.mActivityId;
                            a.o(mActivityId, "pendantFindResPathParams.mActivityId");
                            a mResourceUrl = uoa.mResourceUrl;
                            a.o(mResourceUrl, "pendantFindResPathParams.mResourceUrl");
                            uoa = uoa.mResourceKey;
                            a.m(uoa);
                            a.o(uoa, "pendantFindResPathParams.mResourceKey!!");
                            a uoa1 = new a(obj1);
                            Objects.requireNonNull(animResource);
                            if (!PatchProxy.applyVoidFourRefs(mActivityId, mResourceUrl, uoa, uoa1, animResource, f.class, "1")) {
                               a.p(mActivityId, "activityId");
                               a.p(mResourceUrl, "resourceUrl");
                               a.p(uoa, "resourceKey");
                               a.p(uoa1, "callBack");
                               TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskAnimResourceFetcher", "tk findAnimResource start ,activityId = "+mActivityId+", resourceUrl = "+mResourceUrl+", key = "+uoa, false, 4, null);
                               f$b uob = new f$b(uoa1, mActivityId, mResourceUrl, uoa, animResource.b, true);
                               String str7 = mResourceUrl+uoa;
                               b9.a(animResource.a.get(str7));
                               str1.onStart();
                               b uob1 = t.fromCallable(new g(mResourceUrl, uoa)).map(new h(str1)).subscribeOn(d.c).observeOn(d.a).subscribe(new i(str1), new j(str1));
                               a.o(uob1, "disposable");
                               animResource.a.put(str7, uob1);
                            }
                         }
                      }
                      if (obj1 != null) {
                         obj = new Object[i1];
                         obj[i] = null;
                         obj1.call(obj);
                      }
                   }
                }
                break;
              case 0x57770040:
                if (obj.equals("handleClick") && !PatchProxy.applyVoidTwoRefs(str, obj1, taskPendantJ, taskPendantJ1, "5")) {
                   jsonElement = (str == null || u.S1(p1))? 1: null;
                   if (!jsonElement) {
                      try{
                         jsonElement = c.d(p1);
                         a.o(jsonElement, str2);
                         jsonElement = jsonElement.r().e0("type");
                         a.o(jsonElement, "jsonObject[\"type\"]");
                         i = jsonElement.p();
                         TaskCenterLogUtil.d(obj2, "TaskPendantJs2NativeInvoker", "invokeHandleClick type:"+i, false, 4, null);
                      }catch(java.lang.Exception e0){
                         TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskPendantJs2NativeInvoker", "invokeHandleClick error ", e0, false, 8, null);
                      }
                      if (i != i1) {
                         if (i == str1) {
                            new b(this.a()).onClick(taskPendantJ.c);
                         }
                      }else {
                         new a(this.a()).onClick(taskPendantJ.c);
                      }
                   }
                }
                break;
              case 0x76789ca4:
                if (obj.equals("logClick") && !PatchProxy.applyVoidTwoRefs(str, obj1, taskPendantJ, taskPendantJ1, "4")) {
                   jsonElement = (str == null || u.S1(p1))? 1: null;
                   if (!jsonElement) {
                      try{
                         jsonElement = c.d(p1);
                         a.o(jsonElement, str2);
                         jsonObject = jsonElement.r();
                         JsonElement jsonElement1 = jsonObject.e0("action2");
                         a.o(jsonElement1, "jsonObject[\"action2\"]");
                         str = jsonElement1.w();
                         obj1 = "jsonObject[\"action2\"].asString";
                         try{
                            a.o(str, obj1);
                            jsonElement = jsonObject.e0("params");
                            a.o(jsonElement, "jsonObject[\"params\"]");
                            oobject = jsonElement.w();
                            String str9 = "jsonObject[\"params\"].asString";
                            try{
                               a.o(oobject, str9);
                               str5 = "TaskPendantJs2NativeInvoker";
                               str6 = "invokeLogClick action2:"+str+", params:"+oobject;
                               b = false;
                               i2 = 4;
                               taskCenterLo = obj2;
                               str8 = str3;
                               try{
                                  int i4 = i2;
                                  TaskCenterLogUtil.d(taskCenterLo, str5, str6, b, i4, null);
                               label_0102 :
                                  uoa = (str == null || u.S1(str))? 1: null;
                                  if (!uoa) {
                                     uoa = a.a;
                                     TaskCommonParams taskCommonPa = this.a();
                                     float x = taskPendantJ.c.getX();
                                     float y = taskPendantJ.c.getY();
                                     Objects.requireNonNull(uoa);
                                     if (PatchProxy.isSupport(a.class)) {
                                        Object[] objArray = new Object[]{taskCommonPa,Float.valueOf(x),Float.valueOf(y),str,oobject};
                                        if (!PatchProxy.applyVoid(objArray, uoa, a.class, str8)) {
                                        }
                                     }else {
                                     }
                                  }
                               }catch(java.lang.Exception e0){
                               }
                               i3 = oobject;
                            }catch(java.lang.Exception e0){
                               str8 = str3;
                               goto label_00e7 ;
                            }
                         }catch(java.lang.Exception e0){
                            str8 = str3;
                         }
                         throwable = e0;
                         i2 = "";
                         i3 = str;
                      }catch(java.lang.Exception e0){
                         str8 = str3;
                         throwable = e0;
                         i2 = "";
                      }
                      TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TaskPendantJs2NativeInvoker", "invokeLogClick error ", throwable, false, 8, null);
                      oobject = i2;
                      str = "";
                      goto label_0102 ;
                   }
                }
                break;
              default:
          }
       label_03eb :
          return null;
       }
    }
}
