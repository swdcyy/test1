package com.kwaishou.merchant.troubleshooting.core.util.LogParams;
import java.io.Serializable;
import java.lang.Object;
import u08.b;
import java.util.Objects;
import java.lang.System;
import com.kwaishou.merchant.troubleshooting.core.model.LogLevel;
import java.util.List;
import java.lang.String;
import java.util.Map;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;

public final class LogParams implements Serializable	// class@001359
{
    public List batchLogs;
    public String biz;
    public String bundleId;
    public String componentName;
    public boolean isMarkSuccess;
    public int logLevel;
    public int logType;
    public String msg;
    public String nodeId;
    public String pageId;
    public Map params;
    public RubasParams rubasParams;
    public String tag;
    public long timeStamp;

    public void LogParams(){
       super();
       Objects.requireNonNull(b.a);
       this.logType = b.b;
       this.timeStamp = System.currentTimeMillis();
       this.logLevel = LogLevel.NORMAL.getLevel();
    }
    public final List getBatchLogs(){
       return this.batchLogs;
    }
    public final String getBiz(){
       return this.biz;
    }
    public final String getBundleId(){
       return this.bundleId;
    }
    public final String getComponentName(){
       return this.componentName;
    }
    public final int getLogLevel(){
       return this.logLevel;
    }
    public final int getLogType(){
       return this.logType;
    }
    public final String getMsg(){
       return this.msg;
    }
    public final String getNodeId(){
       return this.nodeId;
    }
    public final String getPageId(){
       return this.pageId;
    }
    public final Map getParams(){
       return this.params;
    }
    public final RubasParams getRubasParams(){
       return this.rubasParams;
    }
    public final String getTag(){
       return this.tag;
    }
    public final long getTimeStamp(){
       return this.timeStamp;
    }
    public final boolean isMarkSuccess(){
       return this.isMarkSuccess;
    }
    public final void setBatchLogs(List p0){
       this.batchLogs = p0;
    }
    public final void setBiz(String p0){
       this.biz = p0;
    }
    public final void setBundleId(String p0){
       this.bundleId = p0;
    }
    public final void setComponentName(String p0){
       this.componentName = p0;
    }
    public final void setLogLevel(int p0){
       this.logLevel = p0;
    }
    public final void setLogType(int p0){
       this.logType = p0;
    }
    public final void setMarkSuccess(boolean p0){
       this.isMarkSuccess = p0;
    }
    public final void setMsg(String p0){
       this.msg = p0;
    }
    public final void setNodeId(String p0){
       this.nodeId = p0;
    }
    public final void setPageId(String p0){
       this.pageId = p0;
    }
    public final void setParams(Map p0){
       this.params = p0;
    }
    public final void setRubasParams(RubasParams p0){
       this.rubasParams = p0;
    }
    public final void setTag(String p0){
       this.tag = p0;
    }
    public final void setTimeStamp(long p0){
       this.timeStamp = p0;
    }
}
