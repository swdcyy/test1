package com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper$a;
import nsd.u;
import android.content.Context;
import gb7.d;
import c0d.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper$mDownloadListeners$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper$mDownloadingTasks$2;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper$mResourceIndex$2;
import java.util.List;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.middleware.resourcemanager.download.exception.DownloadTaskException;
import java.lang.Throwable;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper$b;
import java.lang.Runnable;
import t45.c;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.io.File;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import fb7.a;
import com.yxcorp.gifshow.model.CDNUrl;
import android.net.Uri;
import ekd.w0;
import java.util.Locale;
import c0d.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import fb7.a$a;
import android.net.Uri$Builder;
import fb7.a$c;
import wsd.m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import ib7.a;

public class BaseResourceDownloadHelper	// class@000f49
{
    public final boolean a;
    public final p b;
    public final p c;
    public final p d;
    public final Context e;
    public final d f;
    public final a g;
    public static final BaseResourceDownloadHelper$a h;

    static {
       BaseResourceDownloadHelper.h = new BaseResourceDownloadHelper$a(null);
    }
    public void BaseResourceDownloadHelper(Context p0,d p1,a p2){
       a.p(p0, "context");
       a.p(p1, "downloader");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.a = true;
       this.b = s.c(BaseResourceDownloadHelper$mDownloadListeners$2.INSTANCE);
       this.c = s.c(BaseResourceDownloadHelper$mDownloadingTasks$2.INSTANCE);
       this.d = s.c(BaseResourceDownloadHelper$mResourceIndex$2.INSTANCE);
    }
    public final void a(int p0,List p1,String p2,DownloadConfig p3,c p4){
       a.p(p1, "urls");
       a.p(p2, "cacheKey");
       a.p(p3, "downloadConfig");
       Log.g("[RMDownload] BaseHelper", "addDownloadTask\(\) called with: index = ["+p0+"], cacheKey = ["+p2+"], downloadConfig = ["+p3.getId()+']');
       String id = p3.getId();
       if (this.f().containsKey(id)) {
          if (p4 != null) {
             p4.onFailed(p3.getId(), new DownloadTaskException("download id exists"), null, null);
          }
          return;
       }else {
          BaseResourceDownloadHelper$b uob = new BaseResourceDownloadHelper$b(this, p3, p0, p1, id, p4, p2);
          c.a(v0);
          return;
       }
    }
    public final void b(String p0){
       Log.g("[RMDownload] BaseHelper", "cancel\(\) called with: downloadId = ["+p0+']');
       if (p0 == null) {
          return;
       }
       Object obj = this.f().get(p0);
       if (obj != null) {
          this.f.a(obj);
          this.g().remove(p0);
          this.f().remove(p0);
          this.e().remove(p0);
       }
       return;
    }
    public final void c(){
       String str = "[RMDownload] BaseHelper";
       Log.g(str, "cancelAll\(\) called");
       Iterator iterator = this.f().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Log.g(str, "cancelAll\(\) called with id="+uEntry.getKey());
          this.f.a(uEntry.getValue());
       }
       this.g().clear();
       this.f().clear();
       this.e().clear();
       return;
    }
    public void d(DownloadConfig p0,c p1){
       String url;
       Object obj = p0;
       c uoc = p1;
       a.p(obj, "downloadConfig");
       char c = ']';
       Log.g("[RMDownload] BaseHelper", "download\(\) called with: downloadConfig = ["+p0.getId()+','+p0.getSaveFile()+c);
       a.p(obj, "downloadConfig");
       int i = 0;
       Log.g("[RMDownload] BaseHelper", "download\(\) called with: index = ["+i+"], downloadConfig = ["+p0.getId()+c);
       List resourceUrls = p0.getResourceUrls();
       String str = null;
       List list = (resourceUrls != null)? CollectionsKt___CollectionsKt.d2(resourceUrls): str;
       int i1 = 1;
       String str1 = (list == null || list.isEmpty())? 1: null;
       if (str1) {
          if (uoc) {
             uoc.onFailed(p0.getId(), new DownloadTaskException("url list is empty"), str, str);
          }
          int i2 = this;
       }else {
          a uoa = new a(list, p0.getEnableDnsResolver());
          uoa.c = this.g;
          _monitor_enter(uoa);
          if ((uoa.b.isEmpty() ^ i1) || uoa.a.isEmpty()) {
             _monitor_exit(uoa);
          }else {
             Iterator iterator = uoa.a.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                if (uoa.d != null) {
                   a c1 = uoa.c;
                   if (c1 != null) {
                      try{
                         Uri uri = w0.f(obj1.getUrl());
                         a.o(uri, "uri");
                         String host = uri.getHost();
                         if (host != null) {
                            a.o(host, "it");
                            String str2 = (host.length() > 0)? 1: null;
                            if (!str2) {
                               host = str;
                            }
                            if (host != null) {
                               a.o(host, "host");
                               Locale uS = Locale.US;
                               a.o(uS, "Locale.US");
                               host = host.toLowerCase(uS);
                               a.o(host, "\(this as java.lang.String\).toLowerCase\(locale\)");
                               resourceUrls = c1.a(host);
                               a.o(resourceUrls, "dnsResolver.resolveHost\(¡­t.toLowerCase\(Locale.US\)\)");
                               Iterator iterator1 = resourceUrls.iterator();
                               while (iterator1.hasNext()) {
                                  d uod1 = iterator1.next();
                                  if (!TextUtils.isEmpty(uod1.c)) {
                                     String str3 = uri.buildUpon().authority(uod1.c).build().toString();
                                     a.o(str3, "uri.buildUpon\(\).authorit¡­p.mIP\).build\(\).toString\(\)");
                                     uoa.b.add(new a$a(obj1, uod1, str3));
                                     a$a uoa2 = 1;
                                  }
                               }
                            }
                         }
                      }catch(java.lang.Exception e0){
                         Log.a("[RMDownload] CdnUrlSourceGroup", e0);
                      }
                   }
                }
                url = obj1.getUrl();
                a.o(url, "url.url");
                uoa.b.add(new a$a(obj1, str, url));
                d uod = 1;
             }
             _monitor_exit(uoa);
          }
          resourceUrls = SequencesKt___SequencesKt.V2(SequencesKt__SequencesKt.h(new a$c(uoa)));
          a uoa1 = (resourceUrls == null || resourceUrls.isEmpty())? 1: null;
          if (uoa1) {
             if (uoc != null) {
                uoc.onFailed(p0.getId(), new DownloadTaskException("resolved cdn list is empty"), str, str);
             }
          }else {
             this.a(0, resourceUrls, a.b(a.b, list, i, 2, str), p0, p1);
          }
       }
       return;
    }
    public final ConcurrentHashMap e(){
       return this.b.getValue();
    }
    public final ConcurrentHashMap f(){
       return this.c.getValue();
    }
    public final ConcurrentHashMap g(){
       return this.d.getValue();
    }
}
