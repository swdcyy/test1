package com.yxcorp.gifshow.log.model.ClientStExParams;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Character;
import com.kwai.robust.PatchProxyResult;
import zk.g;
import com.google.gson.JsonElement;
import java.lang.Exception;
import java.lang.Double;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.log.utils.FeedLogCtxLenConfigManager;
import java.lang.StringBuilder;
import java.util.Set;

public class ClientStExParams	// class@001b12
{
    public JsonObject mParamsCache;
    public static final String TAG = "ClientStExParams";

    public void ClientStExParams(){
       super();
       this.mParamsCache = new JsonObject();
    }
    public ClientStExParams add(String p0,char p1){
       ClientStExParams uClientStExP = ClientStExParams.class;
       if (PatchProxy.isSupport(uClientStExP)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Character.valueOf(p1), this, uClientStExP, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.check(p0, 2)) {
          try{
             this.mParamsCache.G(p0, new g(Character.valueOf(p1)));
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public ClientStExParams add(String p0,double p1){
       ClientStExParams uClientStExP = ClientStExParams.class;
       if (PatchProxy.isSupport(uClientStExP)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, uClientStExP, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.check(p0, 8)) {
          try{
             this.mParamsCache.G(p0, new g(Double.valueOf(p1)));
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public ClientStExParams add(String p0,int p1){
       ClientStExParams uClientStExP = ClientStExParams.class;
       if (PatchProxy.isSupport(uClientStExP)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uClientStExP, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.check(p0, 4)) {
          try{
             this.mParamsCache.G(p0, new g(Integer.valueOf(p1)));
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public ClientStExParams add(String p0,long p1){
       ClientStExParams uClientStExP = ClientStExParams.class;
       if (PatchProxy.isSupport(uClientStExP)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uClientStExP, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.check(p0, 8)) {
          try{
             this.mParamsCache.G(p0, new g(Long.valueOf(p1)));
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public ClientStExParams add(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ClientStExParams.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (p1 != null)? p1.length(): 0;
       if (this.check(p0, i)) {
          try{
             this.mParamsCache.G(p0, new g(p1));
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public ClientStExParams add(String p0,boolean p1){
       ClientStExParams uClientStExP = ClientStExParams.class;
       if (PatchProxy.isSupport(uClientStExP)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uClientStExP, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.check(p0, 1)) {
          try{
             this.mParamsCache.G(p0, new g(Boolean.valueOf(p1)));
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public final boolean check(String p0,int p1){
       ClientStExParams uClientStExP = ClientStExParams.class;
       if (PatchProxy.isSupport(uClientStExP)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uClientStExP, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (TextUtils.isEmpty(p0)) {
          Log.g("ClientStExParams", "添加参数的key 不能为空");
          return false;
       }else if(p0.length() > FeedLogCtxLenConfigManager.getClientParamsKeyMaxLen()){
          Log.g("ClientStExParams", "添加参数的key="+p0+" 长度："+p0.length()+" 大于限制长度："+FeedLogCtxLenConfigManager.getClientParamsKeyMaxLen());
          return false;
       }else if(!p1){
          Log.g("ClientStExParams", "添加参数的value 不能为空");
          return false;
       }else if(p1 > FeedLogCtxLenConfigManager.getClientParamsValueMaxLen()){
          Log.g("ClientStExParams", "添加参数的value长度："+p1+" 大于限制长度："+FeedLogCtxLenConfigManager.getClientParamsValueMaxLen());
          return false;
       }else {
          return true;
       }
    }
    public int getKeySetSize(){
       Object obj = PatchProxy.apply(null, this, ClientStExParams.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mParamsCache.entrySet().size();
    }
    public JsonObject getParams(){
       return this.mParamsCache;
    }
}
