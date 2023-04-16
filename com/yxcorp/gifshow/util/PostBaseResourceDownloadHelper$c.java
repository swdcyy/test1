package com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$c;
import gb7.c;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.System;
import java.lang.String;
import java.lang.Throwable;
import k2b.g;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import lnc.m6;
import java.lang.Runnable;
import ekd.k1;
import lnc.l6;

public class PostBaseResourceDownloadHelper$c implements c	// class@001f15
{
    public final List a;
    public final PostBaseResourceDownloadHelper$InfoWithResource b;
    public final long c;

    public void PostBaseResourceDownloadHelper$c(PostBaseResourceDownloadHelper$InfoWithResource p0,PostBaseResourceDownloadHelper$a p1){
       super();
       ArrayList uArrayList = Lists.b();
       this.a = uArrayList;
       this.b = p0;
       this.c = System.currentTimeMillis();
       if (p1 != null) {
          uArrayList.add(p1);
       }
       return;
    }
    public void a(String p0,Throwable p1,int p2){
       long l = System.currentTimeMillis() - this.c;
       g og = new g();
       og.g(p0);
       og.n(38);
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       og.r(TextUtils.k(e0.c(this.b.getResourceUrls().toArray(uCDNUrlArray))));
       og.h("");
       og.i(0);
       og.k(p2);
       og.l(l);
       og.p(l);
       og.q(l);
       og.c(p1);
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.cdnResourceLoadStatEvent = og.a();
       b.a(0x4b316083).j(statPackage);
    }
    public void onCancel(String p0,String p1){
       this.a(p0, null, 2);
    }
    public void onCompleted(String p0,String p1,String p2){
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       k1.o(new m6(this, p1, p0));
    }
    public void onProgress(String p0,long p1,long p2){
       if (!p2 - -1) {
          return;
       }
       l6 ol6 = new l6(this, p1, p2);
       k1.o(p2 - -1);
       return;
    }
}
