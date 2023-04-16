package com.yxcorp.gifshow.util.resource.c;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.yxcorp.gifshow.util.resource.c$a;
import java.lang.String;
import java.lang.Object;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DownloadResourcePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ResourceProgressPackage;
import java.util.Set;
import java.util.Iterator;
import boc.b;
import java.lang.Float;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import android.os.SystemClock;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.yxcorp.gifshow.util.resource.g;
import boc.c;
import z3b.t0;
import com.yxcorp.gifshow.util.resource.f;
import com.yxcorp.gifshow.util.resource.b;
import com.yxcorp.gifshow.util.resource.f$c;

public final class c	// class@000cdf
{
    public static long a;
    public static String b;
    public static ClientEvent$UrlPackage c;

    public static void a(int p0,boolean p1,Map p2){
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = a.a.q(new c$a(c.b));
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.downloadResourcePackage = new ClientContent$DownloadResourcePackage();
       ClientContent$ResourceProgressPackage[] resourceProg = new ClientContent$ResourceProgressPackage[p2.size()];
       Iterator iterator = p2.keySet().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          b uob = iterator.next();
          resourceProg[i] = new ClientContent$ResourceProgressPackage();
          resourceProg[i].name = uob.getResourceName();
          resourceProg[i].progress = (double)p2.get(uob).floatValue();
          i = i + 1;
       }
       p2.resourceProgressPackage = resourceProg;
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       long l = (p1)? SystemClock.elapsedRealtime() - c.a: 0;
       resultPackag.timeCost = l;
       h$b uob1 = h$b.e(p0, "DOWNLOAD_RESOURCE_TASK");
       uob1.q(resultPackag);
       uob1.h(uContentPack);
       uob1.k(uElementPack);
       uob1.u(c.c);
       u1.r0(uob1);
       return;
    }
    public static void b(g p0,ClientEvent$UrlPackage p1,String p2){
       g m = p0.m;
       c.a = 0;
       c.b = null;
       c.c = null;
       c.b = p2;
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       c.c = urlPackage;
       urlPackage.page = p1.page;
       urlPackage.params = p1.params;
       p0.i(new c(m));
       p0.h(new b(m));
    }
    public static void c(Map p0){
       c.a(8, true, p0);
    }
}
