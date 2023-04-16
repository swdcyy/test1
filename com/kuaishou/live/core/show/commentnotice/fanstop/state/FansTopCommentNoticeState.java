package com.kuaishou.live.core.show.commentnotice.fanstop.state.FansTopCommentNoticeState;
import java.io.Serializable;
import com.kuaishou.live.core.show.commentnotice.fanstop.state.FansTopCommentNoticeState$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FansTopCommentNoticeState implements Serializable	// class@000a4d
{
    public final int actionType;
    public final String buttonText;
    public final long displayDurationMs;
    public final String elementAction;
    public final String subTitle;
    public final String title;
    public final String toast;
    public static final FansTopCommentNoticeState$a Companion;
    public static final long serialVersionUID;

    static {
       FansTopCommentNoticeState.Companion = new FansTopCommentNoticeState$a(null);
    }
    public void FansTopCommentNoticeState(String p0,String p1,String p2,int p3,String p4,String p5,long p6){
       super();
       this.title = p0;
       this.subTitle = p1;
       this.buttonText = p2;
       this.actionType = p3;
       this.elementAction = p4;
       this.toast = p5;
       this.displayDurationMs = p6;
    }
    public void FansTopCommentNoticeState(String p0,String p1,String p2,int p3,String p4,String p5,long p6,int p7,u p8){
       int i = (p7 & 0x08)? 0: p3;
       long l = (p7 & 0x40)? 0: p6;
       super(p0, p1, p2, i, p4, p5, l);
       return;
    }
    public static FansTopCommentNoticeState copy$default(FansTopCommentNoticeState p0,String p1,String p2,String p3,int p4,String p5,String p6,long p7,int p8,Object p9){
       FansTopCommentNoticeState uFansTopComm = p0;
       FansTopCommentNoticeState title = (p8 & 0x01)? uFansTopComm.title: p1;
       FansTopCommentNoticeState subTitle = (p8 & 0x02)? uFansTopComm.subTitle: p2;
       FansTopCommentNoticeState buttonText = (p8 & 0x04)? uFansTopComm.buttonText: p3;
       FansTopCommentNoticeState actionType = (p8 & 0x08)? uFansTopComm.actionType: p4;
       FansTopCommentNoticeState elementActio = (p8 & 0x10)? uFansTopComm.elementAction: p5;
       FansTopCommentNoticeState toast = (p8 & 0x20)? uFansTopComm.toast: p6;
       FansTopCommentNoticeState displayDurat = (p8 & 0x40)? uFansTopComm.displayDurationMs: p7;
       return p0.copy(title, subTitle, buttonText, actionType, elementActio, toast, displayDurat);
    }
    public final String component1(){
       return this.title;
    }
    public final String component2(){
       return this.subTitle;
    }
    public final String component3(){
       return this.buttonText;
    }
    public final int component4(){
       return this.actionType;
    }
    public final String component5(){
       return this.elementAction;
    }
    public final String component6(){
       return this.toast;
    }
    public final long component7(){
       return this.displayDurationMs;
    }
    public final FansTopCommentNoticeState copy(String p0,String p1,String p2,int p3,String p4,String p5,long p6){
       Object obj;
       if (PatchProxy.isSupport(FansTopCommentNoticeState.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5,Long.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, FansTopCommentNoticeState.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       FansTopCommentNoticeState uFansTopComm = new FansTopCommentNoticeState(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FansTopCommentNoticeState.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FansTopCommentNoticeState && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.buttonText, p0.buttonText) && (this.actionType == p0.actionType && (a.g(this.elementAction, p0.elementAction) && (a.g(this.toast, p0.toast) && !this.displayDurationMs - p0.displayDurationMs)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       FansTopCommentNoticeState obj = PatchProxy.apply(null, this, FansTopCommentNoticeState.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FansTopCommentNoticeState tsubTitle = this.subTitle;
       int i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.buttonText;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.actionType) * 31;
       tsubTitle = this.elementAction;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.toast;
       if (tsubTitle != null) {
          i = tsubTitle.hashCode();
       }
       FansTopCommentNoticeState tdisplayDura = this.displayDurationMs;
       return (((i1 + i) * 31) + (int)(tdisplayDura ^ (tdisplayDura >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FansTopCommentNoticeState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FansTopCommentNoticeState\(title="+this.title+", subTitle="+this.subTitle+", buttonText="+this.buttonText+", actionType="+this.actionType+", elementAction="+this.elementAction+", toast="+this.toast+", displayDurationMs="+this.displayDurationMs+"\)";
    }
}
