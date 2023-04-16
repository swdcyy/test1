package com.kwai.sdk.eve.internal.statistics.EveLogger;
import vn7.e;
import java.lang.Object;
import sm7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vn7.b;
import vn7.c;
import java.util.Map;
import org.json.JSONObject;
import java.lang.Throwable;

public final class EveLogger implements e	// class@0015b3
{
    public static final EveLogger INSTANCE;
    public static e logger;

    static {
       EveLogger.INSTANCE = new EveLogger();
    }
    public void EveLogger(){
       super();
    }
    public final void init(a p0){
       b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, EveLogger.class, "1")) {
          return;
       }
       a.p(p0, "config");
       if (p0.d != null) {
          p0 = p0.c;
          if (p0 == null) {
             uob = new b();
          }
       }else {
          uob = new c();
       }
       EveLogger.logger = p0;
       return;
    }
    public void logCustomEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveLogger.class, "4")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       e logger = EveLogger.logger;
       if (logger == null) {
          a.S("logger");
       }
       logger.logCustomEvent(p0, p1);
       return;
    }
    public void logCustomEvent(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveLogger.class, "3")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       e logger = EveLogger.logger;
       if (logger == null) {
          a.S("logger");
       }
       logger.logCustomEvent(p0, p1);
       return;
    }
    public void logCustomEvent(String p0,JSONObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveLogger.class, "2")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       e logger = EveLogger.logger;
       if (logger == null) {
          a.S("logger");
       }
       logger.logCustomEvent(p0, p1);
       return;
    }
    public void logExceptionEvent(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveLogger.class, "6")) {
          return;
       }
       a.p(p0, "taskId");
       a.p(p1, "throwable");
       e logger = EveLogger.logger;
       if (logger == null) {
          a.S("logger");
       }
       logger.logExceptionEvent(p0, p1);
       return;
    }
    public final void logExceptionEvent(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveLogger.class, "7")) {
          return;
       }
       a.p(p0, "throwable");
       e logger = EveLogger.logger;
       if (logger == null) {
          a.S("logger");
       }
       logger.logExceptionEvent("eve", p0);
       return;
    }
    public void logTaskEvent(String p0,String p1,String p2,String p3,String p4){
       EveLogger uEveLogger = EveLogger.class;
       if (PatchProxy.isSupport(uEveLogger)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uEveLogger, "5")) {
             return;
          }
       }
       a.p(p0, "taskId");
       a.p(p1, "action");
       a.p(p2, "status");
       e logger = EveLogger.logger;
       if (logger == null) {
          a.S("logger");
       }
       logger.logTaskEvent(p0, p1, p2, p3, p4);
       return;
    }
}
