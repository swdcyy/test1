package com.yxcorp.gifshow.featured.offline.b;
import jda.a;
import com.yxcorp.gifshow.featured.offline.b$a;
import java.lang.reflect.Type;
import el.a;
import lea.b;
import xea.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.hodor.Hodor;
import iea.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.featured.feedprefetcher.g;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.featured.offline.c;
import com.yxcorp.gifshow.featured.offline.c$a;
import xea.h;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import yea.a;
import java.util.Objects;
import xea.j;
import com.kwai.video.hodor.HodorConfig;
import java.lang.Number;
import xea.a;

public class b extends a	// class@000fe6
{
    public static final Type c;

    static {
       b.c = new b$a().getType();
    }
    public void b(){
       super();
    }
    public void a(b p0){
       this.m(p0);
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "9")) {
          return;
       }
       Hodor.instance().clearCacheFilesOfCacheGroup("offline_photo_cache_group");
       SharedPreferences a = b.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putString(b.d("user")+"offlineCachedList", b.e(objArray));
       g.a(uEditor);
       uEditor = a.edit();
       uEditor.putString(b.d("user")+"offlineCachingList", b.e(objArray));
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putBoolean(b.d("user")+"isClearOffline", true);
       g.a(uEditor1);
       return;
    }
    public void c(String p0){
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       a tb = this.b;
       _monitor_enter(tb);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob != null && p0.contains(uob.mQPhoto.getPhotoId())) {
             iterator.remove();
             ArrayList uArrayList = g.h(g.e(uob.mQPhoto));
             if (!q.f(uArrayList)) {
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   Hodor.instance().deleteCacheByKey(iterator1.next(), 0);
                }
             }
             c.a.a(uob.coverPath);
          }
       }
       this.l();
       h.h();
       _monitor_exit(tb);
       return;
    }
    public void e(){
       b mQPhoto;
       a b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       List list = PatchProxy.apply(objArray, this, uob, "7");
       if (list != PatchProxyResult.class) {
       }else {
          Type c = b.c;
          String str = "";
          String str1 = b.a.getString(b.d("user")+"newOfflineCachedList", str);
          list = (str1 == null || str1 == str)? objArray: b.a(str1, c);
       }
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             b uob1 = iterator.next();
             if (uob1 != null) {
                mQPhoto = uob1.mQPhoto;
                if (mQPhoto != null) {
                   mQPhoto.setCacheType(3);
                   this.b.add(uob1);
                }
             }
          }
       }
       a uoa = b.a(-730154612);
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(objArray, uoa, a.class, "1") && uoa.a == null) {
          b = uoa.b;
          _monitor_enter(b);
          if (uoa.a != null) {
             _monitor_exit(b);
          }else {
             List list1 = uoa.i();
             if (!q.f(list1)) {
                Iterator iterator1 = list1.iterator();
                while (iterator1.hasNext()) {
                   mQPhoto = iterator1.next();
                   mQPhoto.mQPhoto.setCacheType(3);
                   uoa.b.add(mQPhoto);
                }
                uoa.j();
             }
             uoa.a = true;
             _monitor_exit(b);
          }
       }
       HodorConfig.setCacheBytesLimitForCacheGroup((((long)h.e().offlineCacheGroupSizeM * 1024) * 1024), "new_offline_photo_cache_group");
       return;
    }
    public List f(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob != null && uob.downloadStatus == 1) {
             uob.mQPhoto.setCacheType(3);
             obj.add(uob.mQPhoto);
          }
       }
       return obj;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f().size();
    }
    public int h(){
       return 3;
    }
    public List k(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.c;
       String str = b.a.getString(b.d("user")+"newOfflineCachedList", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       a tb = this.b;
       _monitor_enter(tb);
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString(b.d("user")+"newOfflineCachedList", b.e(this.b));
       g.a(uEditor);
       _monitor_exit(tb);
       return;
    }
    public void m(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       if (this.a == null) {
          a.a("not mInitCompleted");
          return;
       }else {
          a tb = this.b;
          _monitor_enter(tb);
          if (!this.b.contains(p0)) {
             this.b.add(0, p0);
             this.l();
          }
          _monitor_exit(tb);
          return;
       }
    }
}
