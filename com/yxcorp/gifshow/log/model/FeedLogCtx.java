package com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.io.Serializable;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Object;
import ekd.k0;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ClientStExParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import f3b.o;
import com.yxcorp.gifshow.log.model.FeedLogCtx$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import y2b.a;
import java.util.Objects;
import com.yxcorp.gifshow.log.utils.FeedLogCtxLenConfigManager;
import f3b.u;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import java.util.List;

public class FeedLogCtx implements Serializable	// class@001b16
{
    public String stExParams;
    public String stidContainer;
    public static final String KEY_STID_CONTAINER = "stidContainer";
    public static final String KEY_ST_EX_PARAMS = "stExParams";
    public static final long serialVersionUID = 0x41d07e2548aee6a0;

    public void FeedLogCtx(){
       super(null, "");
    }
    public void FeedLogCtx(JsonObject p0){
       super();
       this.stExParams = "";
       if (p0 != null) {
          try{
             this.stidContainer = k0.h(p0, "stidContainer", "");
             this.stExParams = TextUtils.k(k0.h(p0, "stExParams", ""));
          }catch(java.lang.Exception e0){
             this.stExParams = TextUtils.k(this.stExParams);
          }
       }
    }
    public void FeedLogCtx(String p0){
       super(p0, "");
    }
    public void FeedLogCtx(String p0,String p1){
       super();
       this.stExParams = "";
       this.stidContainer = TextUtils.k(p0);
       this.stExParams = TextUtils.k(p1);
    }
    public synchronized void addStExParams(String p0,ClientStExParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeedLogCtx.class, "2")) {
          return;
       }
       long l = System.currentTimeMillis();
       Log.g("ClientStExParams", "addStExParams 添加前 stExParams="+this.stExParams);
       if (this.checkArgs(p0, p1)) {
          try{
             Gson f = o.f;
             JsonObject jsonObject = f.i(this.stExParams, new FeedLogCtx$a(this).getType());
             Log.g("ClientStExParams", "addStExParams 解析时间 ="+(System.currentTimeMillis() - l));
             if (jsonObject != null) {
                Log.g("ClientStExParams", "addStExParams 当前总Map size="+jsonObject.size());
                if (jsonObject.s0(p0)) {
                   JsonElement jsonElement = jsonObject.e0(p0);
                   if (jsonElement != null && jsonElement.E()) {
                      Log.g("ClientStExParams", "addStExParams 顶层key="+p0+" topKeyJsonObj size"+jsonElement.r().size());
                      k0.b(jsonElement.r(), p1.getParams());
                   }else {
                      jsonObject.G(p0, p1.getParams());
                   }
                }else {
                   jsonObject.G(p0, p1.getParams());
                }
             }else {
                jsonObject = new JsonObject();
                jsonObject.G(p0, p1.getParams());
             }
             if (jsonObject.size() > 0) {
                this.stExParams = TextUtils.k(f.p(jsonObject));
             }
             Log.g("ClientStExParams", "addStExParams 添加时间 ="+(System.currentTimeMillis() - l));
             Log.g("ClientStExParams", "addStExParams 添加后 stExParams="+this.stExParams);
          }catch(java.lang.Exception e10){
             e10.printStackTrace();
          }
       }
    }
    public final boolean checkArgs(String p0,ClientStExParams p1){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FeedLogCtx.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (TextUtils.x(p0)) {
          Log.g("ClientStExParams", "客户端扩展参数顶层key为空");
          return false;
       }else if(p1 == null || !p1.getKeySetSize()){
          Log.g("ClientStExParams", "params为空");
          return false;
       }else {
          obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(TextUtils.x(p0)){
             Objects.requireNonNull(p0);
             b = -1;
             switch (p0.hashCode()){
                 case 0xae5eac9a:
                   if (p0.equals("c_orid")) {
                      b = 0;
                   }
                   break;
                 case 0xae5f2d76:
                   if (p0.equals("c_push")) {
                      b = 1;
                   }
                   break;
                 case 0xae5fd83b:
                   if (p0.equals("c_reco")) {
                      b = 2;
                   }
                   break;
                 case 0xae60856f:
                   if (p0.equals("c_stgy")) {
                      b = 3;
                   }
                   break;
                 case 0x2e717f:
                   if (p0.equals("c_ad")) {
                      b = 4;
                   }
                   break;
                 case 0x2e71e8:
                   if (p0.equals("c_dp")) {
                      b = 5;
                   }
                   break;
                 case 0x2e73bc:
                   if (p0.equals("c_ss")) {
                      b = 6;
                   }
                   break;
                 default:
             }
             switch (b){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 1:
                   break;
                 default:
             }
             b = true;
          }
          b = false;
          if (!b) {
             Log.g("ClientStExParams", " 不支持此客户端扩展参数顶层key="+p0);
             return false;
          }else if(p1.getKeySetSize() > FeedLogCtxLenConfigManager.getClientParamsMaxCount()){
             Log.g("ClientStExParams", "添加参数的K-V个数超过限制 限制数量："+FeedLogCtxLenConfigManager.getClientParamsMaxCount());
             return false;
          }else {
             return true;
          }
       }
    }
    public String toJsonString(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FeedLogCtx obj = PatchProxy.apply(objArray, this, FeedLogCtx.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.stidContainer;
       FeedLogCtx tstExParams = this.stExParams;
       String str = PatchProxy.applyFourRefs(obj, tstExParams, null, null, null, u.class, "14");
       if (str != patchProxyRe) {
       }else {
          Log.b("StidContainerUtils", "stidDataToJsonString t="+(System.currentTimeMillis() - System.currentTimeMillis()));
          str = u.q(u.c(obj), tstExParams, objArray, objArray);
       }
       return str;
    }
}
