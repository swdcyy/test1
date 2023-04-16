package com.yxcorp.gifshow.featured.offline.a;
import ho5.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.featured.offline.a$e;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xea.h;
import iea.b;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import xea.j;
import com.yxcorp.gifshow.featured.offline.JsGetAllOfflineCacheList;
import wkd.b;
import com.yxcorp.gifshow.featured.offline.b;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import jda.a;
import java.util.Iterator;
import xea.b;
import com.yxcorp.gifshow.featured.offline.OfflineCacheModel;
import yea.a;
import java.util.Collection;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Long;
import lea.b;
import com.yxcorp.gifshow.entity.QPhoto;
import xea.c;
import com.yxcorp.gifshow.featured.feedprefetcher.g;
import ekd.q;
import com.kwai.video.hodor.Hodor;
import com.yxcorp.gifshow.featured.offline.c;
import com.yxcorp.gifshow.featured.offline.c$a;
import yea.f;
import yea.g;
import iea.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.featured.offline.a$a;
import com.yxcorp.gifshow.featured.offline.c$b;
import com.yxcorp.gifshow.featured.offline.a$b;
import com.yxcorp.gifshow.featured.offline.a$c;
import com.yxcorp.gifshow.featured.offline.a$f;
import android.content.Context;
import lnc.a1;
import ekd.p0;
import com.yxcorp.gifshow.featured.offline.a$d;
import xea.d;
import t45.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import xea.e;

public class a implements a	// class@000fe4
{

    public void a(){
       super();
    }
    public void A(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "20")) {
          return;
       }
       k1.r(new a$e(this, p0), 0);
       return;
    }
    public boolean B(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, h.class, "6");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): b.a.getBoolean(b.d("user")+"isFirstUseOffline", true);
       return b;
    }
    public boolean C(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, a.class, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, h.class, "5");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): h.e().enableHls;
       return b;
    }
    public boolean D(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, h.class, "14");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(h.d() - (double)h.e().offlineCacheGroupSizeM < 0){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public String E(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, h.class, "10");
       if (obj != patchProxyRe) {
       }else {
          obj = h.e().offlineRNUrl;
       }
       return obj;
    }
    public String F(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       JsGetAllOfflineCacheList obj = PatchProxy.apply(objArray, this, a.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new JsGetAllOfflineCacheList();
       b uob = b.a(0x260f527b);
       Objects.requireNonNull(uob);
       ArrayList uArrayList = PatchProxy.apply(objArray, uob, b.class, "3");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = uob.b.iterator();
          while (iterator.hasNext()) {
             uob = iterator.next();
             if (uob != null && uob.downloadStatus == 1) {
                uArrayList.add(h.a(uob));
             }
          }
       }
       ArrayList uArrayList1 = new ArrayList();
       obj.mList = uArrayList1;
       uArrayList1.addAll(uArrayList);
       obj.mList.addAll(b.a(-730154612).g());
       obj.currentCacheSize = h.d();
       obj.maxCacheSize = (double)h.e().offlineCacheGroupSizeM;
       return a.a.q(obj);
    }
    public boolean G(){
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return h.c();
    }
    public void H(long p0,String p1){
       a b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uoa, "19")) {
          return;
       }
       b uob = b.a(0x260f527b);
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, uob, uob1, "11")) {
          b = uob.b;
          _monitor_enter(b);
          int i = 0;
          while (true) {
             if (i < uob.b.size()) {
                if ((uob.b.get(i).mQPhoto.getPhotoId()).equals(p1) && p0 - -0.00f) {
                   p1.currentPlayDuration = (double)p0;
                   c.a(uob.b.get(i).mQPhoto.getCaption()+"::"+p0);
                   uob.l();
                   _monitor_exit(b);
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                _monitor_exit(b);
                break ;
             }
          }
       }
       return;
    }
    public void I(List p0,boolean p1){
       a b;
       Iterator iterator;
       f a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "16")) {
          return;
       }
       if (p1) {
          b uob = b.a(0x260f527b);
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, "6") && uob.a != null) {
             b = uob.b;
             _monitor_enter(b);
             iterator = uob.b.iterator();
             while (iterator.hasNext()) {
                b uob1 = iterator.next();
                if (uob1 != null && p0.contains(uob1.mQPhoto.getPhotoId())) {
                   iterator.remove();
                   ArrayList uArrayList = g.h(g.e(uob1.mQPhoto));
                   if (!q.f(uArrayList)) {
                      Iterator iterator1 = uArrayList.iterator();
                      while (iterator1.hasNext()) {
                         Hodor.instance().deleteCacheByKey(iterator1.next(), 0);
                      }
                   }
                   c.a.a(uob1.coverPath);
                }
             }
             uob.l();
             h.h();
             _monitor_exit(b);
          }
       }else {
          a uoa1 = b.a(-730154612);
          Objects.requireNonNull(uoa1);
          if (!PatchProxy.applyVoidOneRefs(p0, uoa1, a.class, "6") && uoa1.a != null) {
             Iterator iterator2 = p0.iterator();
             while (iterator2.hasNext()) {
                String str = iterator2.next();
                b uob2 = uoa1.b(str);
                if (uob2 != null) {
                   c.a.a(uob2.coverPath);
                   f uof = b.a(0x60e4a25a);
                   uob2 = uob2.mQPhoto;
                   Objects.requireNonNull(uof);
                   if (!PatchProxy.applyVoidOneRefs(uob2, uof, f.class, "8")) {
                      a = uof.a;
                      if (a != null && (a.j()).equals(uob2.getPhotoId())) {
                         uof.a.a();
                         g og = null;
                         uof.a = og;
                         uof.c(og);
                      }
                      ArrayList uArrayList1 = g.h(g.e(uob2));
                      if (!q.f(uArrayList1)) {
                         iterator = uArrayList1.iterator();
                         while (iterator.hasNext()) {
                            Hodor.instance().deleteCacheByKey(iterator.next(), 0);
                         }
                      }
                   }
                   uoa1.d(str);
                }
             }
             h.h();
          }
       }
       return;
    }
    public void a(boolean p0,QPhoto p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (b.a(-730154612).f(p1.getPhotoId())) {
          return;
       }
       c.a.b(p1.getCoverThumbnailUrls(), new a$a(this, p1, p0));
       return;
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (b.a(-730154612).f(p0.getPhotoId())) {
          return;
       }
       c.a.b(p0.getCoverThumbnailUrls(), new a$b(this, p0));
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       k1.r(new a$c(this, p0), 0);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "21")) {
          return;
       }
       k1.r(new a$f(this), 0);
       return;
    }
    public String k(){
       Object obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(b.a(-730154612).g());
    }
    public void s(){
       f a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "22")) {
          return;
       }
       if (!p0.C(a1.c())) {
          h.j();
          return;
       }else {
          f uof = b.a(0x60e4a25a);
          Objects.requireNonNull(uof);
          if (!PatchProxy.applyVoid(objArray, uof, f.class, "10")) {
             a = uof.a;
             if (a != null) {
                a.a();
                uof.a = objArray;
             }
             Iterator iterator = b.a(-730154612).h().iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                uob.downloadStatus = 3;
                b.a(-730154612).e(uob);
             }
          }
          return;
       }
    }
    public void t(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       k1.r(new a$d(this, p0), 0);
       return;
    }
    public boolean u(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return h.b();
    }
    public void v(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (b.a(0x260f527b).j()) {
          this.b(p0);
       }else {
          c.a(new d(this, p0));
       }
       return;
    }
    public void w(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, oh, "7")) {
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putBoolean(b.d("user")+"isFirstUseOffline", p0);
          g.a(uEditor);
       }
       return;
    }
    public void x(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "8")) {
          return;
       }
       h.g(p0);
       return;
    }
    public void y(boolean p0,QPhoto p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (b.a(0x260f527b).j()) {
          this.a(p0, p1);
       }else {
          c.a(new e(this, p0, p1));
       }
       return;
    }
    public boolean z(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "13";
       b obj = PatchProxy.applyOneRefs(p0, this, a.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object obj1 = null;
       obj = PatchProxy.applyOneRefs(p0, obj1, h.class, str);
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = b.a(0x260f527b);
          Objects.requireNonNull(obj);
          Object obj2 = PatchProxy.applyOneRefs(p0, obj, b.class, "12");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
             int i = 0;
             while (i < obj.b.size()) {
                if ((obj.b.get(i).mQPhoto.getPhotoId()).equals(p0)) {
                   obj1 = obj.b.get(i);
                   break ;
                }
                i = i + 1;
             }
          }
          b = true;
          if (obj1 == null || obj1.downloadStatus != b) {
             b = false;
          }
       }
       return b;
    }
}
