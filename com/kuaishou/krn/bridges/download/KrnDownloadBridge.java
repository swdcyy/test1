package com.kuaishou.krn.bridges.download.KrnDownloadBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kuaishou.krn.c;
import kj0.l;
import hk0.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import java.lang.CharSequence;
import android.text.TextUtils;
import hk0.c;
import com.kuaishou.krn.bundle.BundleDirs;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.io.File;
import com.kuaishou.krn.bridges.download.KrnDownloadBridge$a;
import hk0.b;

public class KrnDownloadBridge extends KrnBridge	// class@00080e
{
    public a mKrnDownloadBehavior;

    public void KrnDownloadBridge(ReactApplicationContext p0){
       super(p0);
       this.mKrnDownloadBehavior = c.b().g().E();
    }
    public String getName(){
       return "KrnDownload";
    }
    public void notifyDownloadState2Js(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnDownloadBridge.class, "4")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("type", p0);
       hashMap.put("value", p1);
       this.notifyEventToJS("krn_download", Arguments.makeNativeMap(hashMap));
       return;
    }
    public void pause(int p0){
       KrnDownloadBridge krnDownloadB = KrnDownloadBridge.class;
       if (PatchProxy.isSupport(krnDownloadB) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, krnDownloadB, "2")) {
          return;
       }
       this.mKrnDownloadBehavior.pause(p0);
       return;
    }
    public void resume(int p0){
       KrnDownloadBridge krnDownloadB = KrnDownloadBridge.class;
       if (PatchProxy.isSupport(krnDownloadB) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, krnDownloadB, "3")) {
          return;
       }
       this.mKrnDownloadBehavior.a(p0);
       return;
    }
    public void start(ReadableMap p0,Promise p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnDownloadBridge.class, str)) {
          return;
       }
       String str1 = "0";
       if (p0 == null) {
          p1.reject(str1, "params is null");
          return;
       }else {
          String str2 = "url";
          String str3 = "";
          str2 = (p0.hasKey(str2))? p0.getString(str2): str3;
          String str4 = str2.trim();
          if (TextUtils.isEmpty(str4)) {
             p1.reject(str1, "download url is null");
             return;
          }else {
             str2 = "fileName";
             if (p0.hasKey(str2)) {
                str3 = p0.getString(str2);
             }
             String str5 = str3;
             if (TextUtils.isEmpty(str5)) {
                p1.reject(str1, "download fileName is null");
                return;
             }else if(str5.contains("..")){
                p1.reject(str1, "Illegally entered and refused to download");
                return;
             }else {
                boolean b = false;
                str2 = "installAfterDownload";
                if (p0.hasKey(str2)) {
                   b = p0.getBoolean(str2);
                }
                File uFile = PatchProxy.apply(null, null, BundleDirs.class, str);
                if (uFile == PatchProxyResult.class) {
                   uFile = BundleDirs.a.getValue();
                }
                c uoc = new c(str4, uFile.getAbsolutePath(), str5, c.b().g().F(), false);
                p1.resolve(Integer.valueOf(this.mKrnDownloadBehavior.b(p0, new KrnDownloadBridge$a(this, b))));
                return;
             }
          }
       }
    }
}
