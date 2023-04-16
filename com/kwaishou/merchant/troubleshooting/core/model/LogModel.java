package com.kwaishou.merchant.troubleshooting.core.model.LogModel;
import java.io.Serializable;
import java.lang.Object;
import com.kwaishou.merchant.troubleshooting.core.model.LogType;
import java.lang.System;
import com.kwaishou.merchant.troubleshooting.core.model.LogLevel;
import java.lang.String;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.StringBuilder;
import java.lang.Long;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Enum;
import java.util.Map;
import com.google.gson.Gson;
import u08.a;
import java.lang.CharSequence;
import zsd.u;
import t08.b;
import t08.b$a;
import java.lang.Throwable;

public final class LogModel implements Serializable	// class@001351
{
    public int b;
    public String belong;
    public boolean c;
    public int logLevel;
    public LogType logType;
    public CopyOnWriteArrayList mergedTimeStamps;
    public String msg;
    public Map params;
    public String tag;
    public String throwable;
    public long timeStamp;

    public void LogModel(){
       super();
       this.belong = "";
       this.tag = "";
       this.msg = "";
       this.logType = LogType.DETAIL;
       this.timeStamp = System.currentTimeMillis();
       this.logLevel = LogLevel.NORMAL.getLevel();
       this.b = -1;
    }
    public final String getBelong(){
       return this.belong;
    }
    public final int getLogLevel(){
       return this.logLevel;
    }
    public final LogType getLogType(){
       return this.logType;
    }
    public final CopyOnWriteArrayList getMergedTimeStamps(){
       if (this.mergedTimeStamps == null) {
          this.mergedTimeStamps = new CopyOnWriteArrayList();
       }
       return this.mergedTimeStamps;
    }
    public final String getMsg(){
       return this.msg;
    }
    public final int getMsgHashCode(){
       return this.b;
    }
    public final String getOnlineMsg(){
       String str;
       try{
          str = a.C("[", Long.valueOf(this.timeStamp));
          LogModel tmergedTimeS = this.mergedTimeStamps;
          if (tmergedTimeS == null) {
          }else {
             Iterator iterator = tmergedTimeS.iterator();
             while (iterator.hasNext()) {
                Long longx = iterator.next();
                a.o(longx, "it");
                str = str+","+longx.longValue();
             }
          }
          str = str+"]"+'['+this.logType.name()+"]: "+this.msg;
          tmergedTimeS = this.logType;
          int i = 0;
          if (tmergedTimeS == LogType.ERROR || tmergedTimeS == LogType.WARNING) {
             tmergedTimeS = this.params;
             String str1 = (tmergedTimeS == null || tmergedTimeS.isEmpty())? 1: null;
             if (!str1) {
                str = str+a.C("  [params]:", a.a().q(this.params));
             }
          }
          tmergedTimeS = this.throwable;
          if (tmergedTimeS == null || u.S1(tmergedTimeS)) {
             i = 1;
          }
          if (!i) {
             str = str+a.C(" [error]:", this.throwable);
          }
          str = str;
          a.o(str, "{\n      val onLineMsg = ¡­nLineMsg.toString\(\)\n    }");
       }catch(java.lang.Exception e0){
          b$a.c(b.a, "LogModel.getOnlineMsg error", e0, null, 4, null);
          str = "getOnlineMsg error";
       }
       return str;
    }
    public final Map getParams(){
       return this.params;
    }
    public final String getTag(){
       return this.tag;
    }
    public final String getThrowable(){
       return this.throwable;
    }
    public final long getTimeStamp(){
       return this.timeStamp;
    }
    public final boolean isBasicSame(LogModel p0){
       int i;
       int i1;
       a.p(p0, "logModel");
       boolean b = false;
       if (a.g(this.msg, p0.msg) && (this.logType == p0.logType && (a.g(this.tag, p0.tag) && a.g(this.belong, p0.belong)))) {
          LogModel tparams = this.params;
          tparams = (tparams == null)? null: tparams.size();
          LogModel params = p0.params;
          params = (params == null)? 0: params.size();
          if (tparams == params && a.g(this.throwable, p0.throwable)) {
             b = true;
          }
       }
    label_004b :
       return b;
    }
    public final boolean isImportantLog(){
       LogModel tlogType = this.logType;
       boolean b = (tlogType != LogType.ERROR && (tlogType != LogType.WARNING && (tlogType == LogType.KEY || this.logLevel >= LogLevel.HIGH.getLevel())))? true: false;
       return b;
    }
    public final boolean isMarkSuccessLog(){
       return this.c;
    }
    public final void setBelong(String p0){
       a.p(p0, "<set-?>");
       this.belong = p0;
    }
    public final void setLogLevel(int p0){
       this.logLevel = p0;
    }
    public final void setLogType(LogType p0){
       a.p(p0, "<set-?>");
       this.logType = p0;
    }
    public final void setMarkSuccessLog(boolean p0){
       this.c = p0;
    }
    public final void setMsg(String p0){
       a.p(p0, "<set-?>");
       this.msg = p0;
    }
    public final void setMsgHashCode(int p0){
       this.b = p0;
    }
    public final void setParams(Map p0){
       this.params = p0;
    }
    public final void setTag(String p0){
       a.p(p0, "<set-?>");
       this.tag = p0;
    }
    public final void setThrowable(String p0){
       this.throwable = p0;
    }
    public final void setTimeStamp(long p0){
       this.timeStamp = p0;
    }
}
