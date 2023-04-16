package com.kwaishou.merchant.troubleshooting.core.model.PageLogContext$OriginDataModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class PageLogContext$OriginDataModel implements Serializable	// class@001355
{
    public String content;
    public String keyMsg;
    public String name;
    public long timeStamp;
    public String type;

    public void PageLogContext$OriginDataModel(){
       super();
       this.name = "";
       this.type = "";
       this.keyMsg = "";
       this.content = "";
    }
    public final String getContent(){
       return this.content;
    }
    public final String getKeyMsg(){
       return this.keyMsg;
    }
    public final String getName(){
       return this.name;
    }
    public final long getTimeStamp(){
       return this.timeStamp;
    }
    public final String getType(){
       return this.type;
    }
    public final void setContent(String p0){
       a.p(p0, "<set-?>");
       this.content = p0;
    }
    public final void setKeyMsg(String p0){
       a.p(p0, "<set-?>");
       this.keyMsg = p0;
    }
    public final void setName(String p0){
       a.p(p0, "<set-?>");
       this.name = p0;
    }
    public final void setTimeStamp(long p0){
       this.timeStamp = p0;
    }
    public final void setType(String p0){
       a.p(p0, "<set-?>");
       this.type = p0;
    }
}
