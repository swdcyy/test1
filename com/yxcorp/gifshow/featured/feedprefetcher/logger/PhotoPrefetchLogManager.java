package com.yxcorp.gifshow.featured.feedprefetcher.logger.PhotoPrefetchLogManager;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.PhotoPrefetchLogManager$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.PrefetchPhotoInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import wkd.b;
import qea.u;
import java.util.List;
import java.util.Collection;
import ekd.q;
import pea.b;
import iea.b;
import android.content.SharedPreferences;
import km8.b;
import java.lang.StringBuilder;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import lea.e;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class PhotoPrefetchLogManager	// class@000fc2
{
    public Map a;
    public static final Type b;

    static {
       PhotoPrefetchLogManager.b = new PhotoPrefetchLogManager$1().getType();
    }
    public void PhotoPrefetchLogManager(){
       super();
    }
    public PrefetchPhotoInfo a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoPrefetchLogManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (!this.d()) {
          this.b();
       }
       return this.a.get(p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, PhotoPrefetchLogManager.class, "1")) {
          return;
       }
       int i = -622777217;
       List list = b.a(i).k();
       if (q.f(list)) {
          list = b.a(i).l();
       }
       this.c(list);
       return;
    }
    public void c(List p0){
       String str;
       Type b;
       PhotoPrefetchLogManager photoPrefetc = PhotoPrefetchLogManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, photoPrefetc, "2")) {
          return;
       }
       if (this.d()) {
          b.g("log manager has init");
          return;
       }else {
          _monitor_enter(this);
          if (this.d()) {
             b.g("log manager has init");
             _monitor_exit(this);
             return;
          }else {
             Object[] objArray = null;
             Object[] objArray1 = PatchProxy.apply(objArray, this, photoPrefetc, "7");
             if (objArray1 != PatchProxyResult.class) {
             }else {
                b = PhotoPrefetchLogManager.b;
                String str2 = "";
                str = b.a.getString("photoPrefetchLog", str2);
                if (str != null && str != str2) {
                   objArray = b.a(str, b);
                }
                objArray1 = objArray;
             }
             if (objArray1 != null && (objArray1.isEmpty() || q.f(p0))) {
                this.a = new ConcurrentHashMap();
             }else {
                b.g("log manager init, log map size: "+objArray1.size()+",prefetch model size: "+p0.size());
                if (objArray1.size() != p0.size()) {
                   this.a = new ConcurrentHashMap();
                   Iterator iterator = p0.iterator();
                   while (iterator.hasNext()) {
                      e uoe = iterator.next();
                      if (uoe != null && objArray1.containsKey(uoe.photoId)) {
                         uoe = uoe.photoId;
                         this.a.put(uoe, objArray1.get(uoe));
                      }else {
                         str = "log manager init, log map not contain  ";
                         String str1 = (uoe == null)? "null": uoe.photoId;
                         b.g(str+str1);
                      }
                   }
                }else {
                   this.a = new ConcurrentHashMap(objArray1);
                }
             }
             b.h("init completed");
             this.e("init");
             _monitor_exit(this);
             return;
          }
       }
    }
    public final boolean d(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoPrefetchLogManager.class, "9")) {
          return;
       }
       if (!this.d()) {
          this.b();
       }
       if (this.a == null) {
          return;
       }else {
          _monitor_enter(this);
          if (this.a == null) {
             _monitor_exit(this);
             return;
          }else {
             b.h("print log reason: "+p0);
             if (this.a.isEmpty()) {
                b.h("empty");
                _monitor_exit(this);
                return;
             }else {
                Iterator iterator = this.a.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   b.h("photo id = "+uEntry.getKey()+", info = "+uEntry.getValue());
                }
                _monitor_exit(this);
                return;
             }
          }
       }
    }
    public void f(PrefetchPhotoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoPrefetchLogManager.class, "4")) {
          return;
       }
       if (!TextUtils.isEmpty(p0.mPhotoId)) {
          if (!this.d()) {
             this.b();
          }
          this.a.put(p0.mPhotoId, p0);
          this.e("save "+p0.mPhotoId);
       }
       return;
    }
    public void g(){
       PhotoPrefetchLogManager photoPrefetc = PhotoPrefetchLogManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoPrefetc, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, photoPrefetc, "8")) {
          if (!this.d()) {
             this.b();
          }
          b.h("writePrefetchLog to preference");
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putString("photoPrefetchLog", b.e(this.a));
          g.a(uEditor);
       }
       return;
    }
}
