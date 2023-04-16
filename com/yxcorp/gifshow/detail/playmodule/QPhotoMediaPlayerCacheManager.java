package com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager$1;
import java.util.HashMap;
import com.yxcorp.gifshow.detail.playmodule.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import v5a.a$b;
import q3a.j;
import msd.l;
import v5a.a;
import v5a.f;
import p5a.c;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.System;
import java.lang.Runnable;
import ekd.k1;

public class QPhotoMediaPlayerCacheManager	// class@001650
{
    public static final Map a;
    public static final Map b;
    public static final Runnable c;

    static {
       QPhotoMediaPlayerCacheManager.a = new QPhotoMediaPlayerCacheManager$1(3, 0x3f400000, true);
       QPhotoMediaPlayerCacheManager.b = new HashMap();
       QPhotoMediaPlayerCacheManager.c = c.b;
    }
    public void QPhotoMediaPlayerCacheManager(){
       super();
    }
    public static void a(QPhoto p0,long p1,int p2,boolean p3){
       Boolean fALSE;
       QPhotoMediaPlayerCacheManager qPhotoMediaP = QPhotoMediaPlayerCacheManager.class;
       if (PatchProxy.isSupport(qPhotoMediaP) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), null, QPhotoMediaPlayerCacheManager.class, "3")) {
          return;
       }
       int i = -1;
       if (PatchProxy.isSupport(qPhotoMediaP)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Integer.valueOf(p2),fALSE,Boolean.valueOf(p3),Integer.valueOf(i),fALSE};
          fALSE = Boolean.FALSE;
          if (!PatchProxy.applyVoid(objArray, null, qPhotoMediaP, "5")) {
          label_005d :
             if (p0 != null) {
                a$b uob = new a$b(p0);
                j oj = new j(p0, p2, p1, false, p3, -1);
                uob.b(i);
                f uof = new f();
                if (uof.J(uob.a())) {
                   uof.prepareAsync();
                }
                QPhotoMediaPlayerCacheManager.f(p0, uof);
             }
          }
       }else {
          goto label_005d ;
       }
       return;
    }
    public static synchronized void b(){
       _monitor_enter(QPhotoMediaPlayerCacheManager.class);
       if (PatchProxy.applyVoid(null, null, QPhotoMediaPlayerCacheManager.class, "7")) {
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          return;
       }else {
          Iterator iterator = QPhotoMediaPlayerCacheManager.a.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().release();
          }
          QPhotoMediaPlayerCacheManager.a.clear();
          QPhotoMediaPlayerCacheManager.b.clear();
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          return;
       }
    }
    public static synchronized boolean c(QPhoto p0){
       boolean b;
       _monitor_enter(QPhotoMediaPlayerCacheManager.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, QPhotoMediaPlayerCacheManager.class, "9");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          return obj.booleanValue();
       }else if(p0 != null && (p0.getEntity() != null && QPhotoMediaPlayerCacheManager.a.containsKey(p0.getPhotoId()))){
          b = true;
       }else {
          b = false;
       }
       _monitor_exit(QPhotoMediaPlayerCacheManager.class);
       return b;
    }
    public static synchronized c d(QPhoto p0){
       _monitor_enter(QPhotoMediaPlayerCacheManager.class);
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, QPhotoMediaPlayerCacheManager.class, "8");
       if (obj1 != PatchProxyResult.class) {
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          return obj1;
       }else if(p0 == null){
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          return obj;
       }else {
          QPhotoMediaPlayerCacheManager.b.remove(p0.getPhotoId());
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          return QPhotoMediaPlayerCacheManager.a.remove(p0.getPhotoId());
       }
    }
    public static void e(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, QPhotoMediaPlayerCacheManager.class, "11")) {
          return;
       }
       c uoc = QPhotoMediaPlayerCacheManager.d(p0);
       if (uoc != null) {
          uoc.release();
       }
       return;
    }
    public static synchronized void f(QPhoto p0,c p1){
       _monitor_enter(QPhotoMediaPlayerCacheManager.class);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, QPhotoMediaPlayerCacheManager.class, "6")) {
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          return;
       }else if(p0 == null){
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          return;
       }else {
          p1 = QPhotoMediaPlayerCacheManager.a.put(p0.getPhotoId(), p1);
          QPhotoMediaPlayerCacheManager.b.put(p0.getPhotoId(), Long.valueOf(System.currentTimeMillis()));
          if (!PatchProxy.applyVoid(null, null, QPhotoMediaPlayerCacheManager.class, "13")) {
             Runnable c = QPhotoMediaPlayerCacheManager.c;
             k1.m(c);
             k1.r(c, 5000);
          }
          if (p1 != null) {
             p1.release();
          }
          _monitor_exit(QPhotoMediaPlayerCacheManager.class);
          return;
       }
    }
}
