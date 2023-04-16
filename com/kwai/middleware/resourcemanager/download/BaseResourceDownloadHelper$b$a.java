package com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper$b$a;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import java.lang.Throwable;
import android.content.Context;
import ekd.p0;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.utility.Log;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;

public final class BaseResourceDownloadHelper$b$a implements c	// class@000f44
{
    public final BaseResourceDownloadHelper$b a;

    public void BaseResourceDownloadHelper$b$a(BaseResourceDownloadHelper$b p0){
       this.a = p0;
       super();
    }
    public void onCancel(String p0,String p1){
       a.p(p0, "id");
       a.p(p1, "downloadUrl");
       BaseResourceDownloadHelper$b g = this.a.g;
       if (g != null) {
          g.onCancel(p0, p1);
       }
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       a.p(p0, "id");
       a.p(p1, "path");
       a.p(p2, "downloadUrl");
       this.a.b.g().remove(this.a.f);
       this.a.b.f().remove(this.a.f);
       this.a.b.e().remove(this.a.f);
       BaseResourceDownloadHelper$b g = this.a.g;
       if (g != null) {
          g.onCompleted(p0, p1, p2);
       }
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       BaseResourceDownloadHelper$b g;
       a.p(p0, "id");
       a.p(p1, "e");
       if (!p0.C(this.a.b.e)) {
          g = this.a.g;
          if (g != null) {
             g.onFailed(p0, p1, p2, p3);
          }
          return;
       }else {
          Integer integer = this.a.b.g().get(this.a.f);
          if (integer != null) {
             int i = integer.intValue() + 1;
             Log.d("[RMDownload] BaseHelper", "failed try next index="+i+", total="+this.a.e.size());
             if (i >= this.a.e.size()) {
                BaseResourceDownloadHelper$b g1 = this.a.g;
                if (g1 != null) {
                   g1.onFailed(p0, p1, null, p3);
                }
                this.a.b.g().remove(this.a.f);
                this.a.b.f().remove(this.a.f);
                this.a.b.e().remove(this.a.f);
             }else {
                this.a.b.g().remove(this.a.f);
                this.a.b.f().remove(this.a.f);
                this.a.b.e().remove(this.a.f);
                BaseResourceDownloadHelper$b$a ta = this.a;
                ta.b.a(i, ta.e, ta.h, ta.c, ta.g);
             }
             return;
          }else {
             Log.d("[RMDownload] BaseHelper", "downloadId not exist");
             g = this.a.g;
             if (g != null) {
                g.onFailed(p0, p1, p2, p3);
             }
             return;
          }
       }
    }
    public void onProgress(String p0,long p1,long p2){
       a.p(p0, "id");
       BaseResourceDownloadHelper$b g = this.a.g;
       if (g != null) {
          g.onProgress(p0, p1, p2);
       }
       return;
    }
}
