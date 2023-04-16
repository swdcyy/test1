package com.yxcorp.gifshow.util.cdnresource.m;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.util.cdnresource.k;
import java.lang.String;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import android.graphics.Bitmap;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.gifshow.util.cdnresource.CdnResource;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import java.util.List;
import com.yxcorp.gifshow.like.resource.SearchLikeResourceConfig$a;
import brd.t;
import com.yxcorp.gifshow.util.cdnresource.l;
import erd.o;
import t45.d;
import brd.z;
import pnc.p;
import pnc.o;
import erd.g;
import crd.b;

public class m	// class@001f75
{
    public static Map a;
    public static k b;

    static {
       m.a = new ConcurrentHashMap();
       m.b = new k();
    }
    public static Bitmap a(String p0,CdnResource$ResourceKey p1){
       m.b.e();
       Map a = m.a;
       Bitmap uBitmap = null;
       CdnResource uCdnResource = (a != null)? a.get(p0): uBitmap;
       if (p1 != null && uCdnResource != null) {
          uBitmap = uCdnResource.a(p1);
       }
       return uBitmap;
    }
    public static CdnResource$a b(String p0,CdnResource$ResourceKey p1){
       m.b.e();
       Map a = m.a;
       CdnResource$a uoa = null;
       CdnResource uCdnResource = (a != null)? a.get(p0): uoa;
       if (p1 != null && uCdnResource != null) {
          uoa = uCdnResource.b(p1);
       }
       return uoa;
    }
    public static void c(List p0,int p1){
       if (p0 == null || (p1 < p0.size() && p1 >= 0)) {
          SearchLikeResourceConfig$a uoa = p0.get(p1);
          if (uoa == null || m.a.containsKey(uoa.mUniqId)) {
             p1++;
             m.c(p0, p1);
          }else {
             t.just(uoa).flatMap(l.b).subscribeOn(d.c).observeOn(d.a).subscribe(new p(p0, p1), new o(p0, p1));
             return;
          }
       }
       return;
    }
}
