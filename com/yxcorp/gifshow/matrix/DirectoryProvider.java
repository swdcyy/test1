package com.yxcorp.gifshow.matrix.DirectoryProvider;
import android.content.ContentProvider;
import com.yxcorp.gifshow.matrix.DirectoryProvider$a;
import nsd.u;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.content.ContentValues;
import android.database.Cursor;
import java.lang.System;
import o56.a;
import lnc.i3;
import k2b.u1;
import n6b.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import o6b.a;
import com.kwai.android.common.bean.Channel;

public final class DirectoryProvider extends ContentProvider	// class@00120f
{
    public static long b;
    public static final DirectoryProvider$a c;

    static {
       DirectoryProvider.c = new DirectoryProvider$a(null);
    }
    public void DirectoryProvider(){
       super();
    }
    public int delete(Uri p0,String p1,String[] p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DirectoryProvider.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       a.p(p0, "uri");
       return 0;
    }
    public String getType(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DirectoryProvider.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "uri");
       return "";
    }
    public Uri insert(Uri p0,ContentValues p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, DirectoryProvider.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "uri");
       return null;
    }
    public boolean onCreate(){
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       int i = 1;
       if (PatchProxy.isSupport(DirectoryProvider.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p1 = PatchProxy.apply(objArray, this, DirectoryProvider.class, "1");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       a.p(p0, "uri");
       DirectoryProvider$a c = DirectoryProvider.c;
       String str = p0.toString();
       a.o(str, "uri.toString\(\)");
       _monitor_enter(c);
       if (PatchProxy.applyVoidTwoRefs(str, p2, c, DirectoryProvider$a.class, "1")) {
          _monitor_exit(c);
       }else {
          long l = System.currentTimeMillis();
          if ((l - DirectoryProvider.b) - 5000 > 0) {
             if (a.g(a.a, "ANDROID_UNKNOWN") ^ i) {
                i3 oi3 = i3.f();
                oi3.d("uri", str);
                oi3.d("selection", p2);
                u1.H0(24, oi3.e());
                b.b(b.a, "CONTACT_SUC", null, 2, null);
                RxBus.f.c(new a(Channel.CONTACT, 0, 2, null));
             }else {
                RxBus.f.c(new a(Channel.CONTACT, 24));
                b.b(b.a, "CONTACT_SUC", null, 2, null);
             }
             DirectoryProvider.b = l;
          }
          _monitor_exit(c);
       }
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       p1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, DirectoryProvider.class, "5");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       a.p(p0, "uri");
       return 0;
    }
}
