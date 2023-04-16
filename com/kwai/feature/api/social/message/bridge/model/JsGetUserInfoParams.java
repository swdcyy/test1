package com.kwai.feature.api.social.message.bridge.model.JsGetUserInfoParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsGetUserInfoParams implements Serializable	// class@00112a
{
    public final String callback;
    public final boolean fromServer;
    public final String groupId;
    public final String subBiz;
    public final String targetId;
    public final int type;

    public void JsGetUserInfoParams(String p0,String p1,int p2,String p3,boolean p4,String p5){
       super();
       this.groupId = p0;
       this.subBiz = p1;
       this.type = p2;
       this.targetId = p3;
       this.fromServer = p4;
       this.callback = p5;
    }
    public static JsGetUserInfoParams copy$default(JsGetUserInfoParams p0,String p1,String p2,int p3,String p4,boolean p5,String p6,int p7,Object p8){
       JsGetUserInfoParams groupId;
       JsGetUserInfoParams subBiz;
       JsGetUserInfoParams type;
       JsGetUserInfoParams targetId;
       JsGetUserInfoParams fromServer;
       JsGetUserInfoParams callback;
       if (p7 & 0x01) {
          groupId = p0.groupId;
       }
       if (p7 & 0x02) {
          subBiz = p0.subBiz;
       }
       p8 = subBiz;
       if (p7 & 0x04) {
          type = p0.type;
       }
       JsGetUserInfoParams jsGetUserInf = type;
       if (p7 & 0x08) {
          targetId = p0.targetId;
       }
       JsGetUserInfoParams jsGetUserInf1 = targetId;
       if (p7 & 0x10) {
          fromServer = p0.fromServer;
       }
       JsGetUserInfoParams jsGetUserInf2 = fromServer;
       if (p7 & 0x20) {
          callback = p0.callback;
       }
       return p0.copy(groupId, p8, jsGetUserInf, jsGetUserInf1, jsGetUserInf2, callback);
    }
    public final String component1(){
       return this.groupId;
    }
    public final String component2(){
       return this.subBiz;
    }
    public final int component3(){
       return this.type;
    }
    public final String component4(){
       return this.targetId;
    }
    public final boolean component5(){
       return this.fromServer;
    }
    public final String component6(){
       return this.callback;
    }
    public final JsGetUserInfoParams copy(String p0,String p1,int p2,String p3,boolean p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(JsGetUserInfoParams.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Boolean.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, this, JsGetUserInfoParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       JsGetUserInfoParams jsGetUserInf = new JsGetUserInfoParams(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsGetUserInfoParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsGetUserInfoParams && (a.g(this.groupId, p0.groupId) && (a.g(this.subBiz, p0.subBiz) && (this.type == p0.type && (a.g(this.targetId, p0.targetId) && (this.fromServer == p0.fromServer && a.g(this.callback, p0.callback)))))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final boolean getFromServer(){
       return this.fromServer;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public final String getTargetId(){
       return this.targetId;
    }
    public final int getType(){
       return this.type;
    }
    public int hashCode(){
       JsGetUserInfoParams obj = PatchProxy.apply(null, this, JsGetUserInfoParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsGetUserInfoParams tsubBiz = this.subBiz;
       int i2 = (tsubBiz != null)? tsubBiz.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.type) * 31;
       tsubBiz = this.targetId;
       i2 = (tsubBiz != null)? tsubBiz.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubBiz = this.fromServer;
       if (tsubBiz != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tsubBiz = this.callback;
       if (tsubBiz != null) {
          i = tsubBiz.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsGetUserInfoParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsGetUserInfoParams\(groupId="+this.groupId+", subBiz="+this.subBiz+", type="+this.type+", targetId="+this.targetId+", fromServer="+this.fromServer+", callback="+this.callback+"\)";
    }
}
