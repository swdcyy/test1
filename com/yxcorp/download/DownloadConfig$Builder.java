package com.yxcorp.download.DownloadConfig$Builder;
import java.lang.Object;
import com.yxcorp.download.DownloadConfig;
import com.yxcorp.download.DownloadConfig$1;
import android.content.Context;
import java.io.File;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import zk.d;
import com.google.gson.Gson;
import com.yxcorp.download.DownloadConfig$Builder$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import nu8.c;
import java.util.List;
import com.yxcorp.download.DownloadConfig$a;
import com.yxcorp.download.DownloadConfig$Builder$2;
import java.util.HashMap;
import java.lang.Integer;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.util.Map;

public class DownloadConfig$Builder	// class@0011a1
{
    public DownloadConfig a;

    public void DownloadConfig$Builder(){
       super();
       this.a = new DownloadConfig(null);
    }
    public DownloadConfig a(){
       return this.a;
    }
    public DownloadConfig$Builder b(boolean p0){
       this.a.y = p0;
       return this;
    }
    public DownloadConfig$Builder c(boolean p0){
       this.a.z = p0;
       return this;
    }
    public DownloadConfig$Builder d(int p0){
       this.a.x = p0;
       return this;
    }
    public DownloadConfig$Builder e(Context p0){
       this.a.a = p0;
       return this;
    }
    public DownloadConfig$Builder f(File p0){
       this.a.b = p0;
       return this;
    }
    public DownloadConfig$Builder g(boolean p0){
       this.a.i = p0;
       return this;
    }
    public DownloadConfig$Builder h(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadConfig$Builder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.f = p0.booleanValue();
       return this;
    }
    public DownloadConfig$Builder i(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadConfig$Builder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.g = p0.booleanValue();
       return this;
    }
    public DownloadConfig$Builder j(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadConfig$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.e = p0.booleanValue();
       return this;
    }
    public DownloadConfig$Builder k(boolean p0){
       this.a.k = p0;
       return this;
    }
    public DownloadConfig$Builder l(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadConfig$Builder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }
       ArrayList uArrayList = new d().b().i(p0, new DownloadConfig$Builder$1(this).getType());
       if (uArrayList == null) {
          return this;
       }
       this.a.l = uArrayList;
       return this;
    }
    public DownloadConfig$Builder m(boolean p0){
       this.a.B = p0;
       return this;
    }
    public DownloadConfig$Builder n(int p0){
       this.a.w = p0;
       return this;
    }
    public DownloadConfig$Builder o(float p0){
       this.a.m = p0;
       return this;
    }
    public DownloadConfig$Builder p(boolean p0){
       this.a.h = p0;
       return this;
    }
    public DownloadConfig$Builder q(int p0){
       this.a.c = p0;
       return this;
    }
    public DownloadConfig$Builder r(c p0){
       this.a.G = p0;
       return this;
    }
    public DownloadConfig$Builder s(boolean p0){
       this.a.q = p0;
       return this;
    }
    public DownloadConfig$Builder t(List p0){
       this.a.s = p0;
       return this;
    }
    public DownloadConfig$Builder u(DownloadConfig$a p0){
       this.a.r = p0;
       return this;
    }
    public DownloadConfig$Builder v(String p0){
       Integer obj = PatchProxy.applyOneRefs(p0, this, DownloadConfig$Builder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }
       HashMap hashMap = new d().b().i(p0, new DownloadConfig$Builder$2(this).getType());
       if (hashMap == null) {
          return this;
       }
       obj = hashMap.get("Init");
       if (obj != null) {
          this.a.D.put(DownloadTask$DownloadTaskType.INIT_DOWNLOAD, obj);
       }
       obj = hashMap.get("ENQUEUE");
       if (obj != null) {
          this.a.D.put(DownloadTask$DownloadTaskType.ENQUEUE, obj);
       }
       Integer integer = hashMap.get("Pre");
       if (integer != null) {
          this.a.D.put(DownloadTask$DownloadTaskType.PRE_DOWNLOAD, integer);
       }
       return this;
    }
    public DownloadConfig$Builder w(List p0){
       this.a.t = p0;
       return this;
    }
    public DownloadConfig$Builder x(Map p0){
       this.a.u = p0;
       return this;
    }
    public DownloadConfig$Builder y(boolean p0){
       this.a.A = p0;
       return this;
    }
    public DownloadConfig$Builder z(Map p0){
       this.a.v = p0;
       return this;
    }
}
