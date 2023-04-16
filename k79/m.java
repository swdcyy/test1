package k79.m;
import g79.a;
import android.app.Application;
import android.util.SparseArray;
import jlb.b;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import java.lang.Iterable;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Environment;
import android.os.Build$VERSION;
import java.lang.NullPointerException;
import k79.m$a;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import k79.m$b;
import w69.m0;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Objects;
import java.util.Arrays;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class m	// class@002b5a
{
    public static final Application a;
    public static final SparseArray b;
    public static final SparseArray c;
    public static final b d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static boolean h;
    public static final m i;

    static {
       m.i = new m();
       m.a = a.c.b();
       SparseArray sparseArray = new SparseArray();
       m.b = sparseArray;
       SparseArray sparseArray1 = new SparseArray();
       m.c = sparseArray1;
       m.d = new b("", "");
       m.e = "photo_album";
       m.f = "video_album";
       m.g = "photo_video_album";
       sparseArray.put(2, new LinkedHashMap());
       sparseArray.put(0, new LinkedHashMap());
       sparseArray.put(1, new LinkedHashMap());
       sparseArray1.put(2, "photo_video_album");
       sparseArray1.put(0, "video_album");
       sparseArray1.put(1, "photo_album");
    }
    public void m(){
       super();
    }
    public final void a(int p0,QMedia p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "7")) {
          return;
       }
       File uFile = new File(p1.path);
       File parentFile = uFile.getParentFile();
       if (parentFile != null && parentFile.exists()) {
          SparseArray b = m.b;
          b uob = b.get(p0).get(parentFile.getAbsolutePath());
          if (uob == null) {
             uob = new b(parentFile.getName(), parentFile.getAbsolutePath());
             uob.g(uFile.getAbsolutePath());
             Object obj = b.get(p0);
             a.h(obj, "mAlbumsMap[type]");
             String absolutePath = parentFile.getAbsolutePath();
             a.h(absolutePath, "parent.absolutePath");
             obj.put(absolutePath, uob);
          }
          p1.mAlbum = uob.a();
          uob.f((uob.b() + 1));
       }
       return;
    }
    public synchronized final void b(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "3")) {
          return;
       }
       this.h(p0);
       m.h = true;
       return;
    }
    public synchronized final void c(int p0,QMedia p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "2")) {
          return;
       }
       a.q(p1, "media");
       this.a(p0, p1);
       return;
    }
    public synchronized final List d(int p0){
       SparseArray obj;
       Object obj4;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = m.b;
       if (obj.get(p0).isEmpty()) {
          this.f(p0);
       }
       ArrayList uArrayList = new ArrayList();
       Application a = m.a;
       String str = a.getString(R.string.arg_RES_7f101895);
       a.h(str, "context.getString\(R.string.ksalbum_camera_album\)");
       if (p0 == 1) {
          str = a.getString(R.string.arg_RES_7f101893);
          a.h(str, "context.getString\(R.string.ksalbum_all_photos\)");
       }else if(!p0){
          str = a.getString(R.string.arg_RES_7f101894);
          a.h(str, "context.getString\(R.string.ksalbum_all_videos\)");
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator obj1 = obj.get(p0);
       a.h(obj1, "mAlbumsMap[type]");
       obj1 = obj1.entrySet().iterator();
       while (obj1.hasNext()) {
          uArrayList1.add(obj1.next().getValue());
       }
       m.d.f(0);
       obj1 = uArrayList1.iterator();
       while (obj1.hasNext()) {
          b uob = obj1.next();
          b d = m.d;
          if (TextUtils.isEmpty(d.d())) {
             d.g(uob.d());
          }
          int i = d.b() + uob.b();
          d.f(i);
       }
       b d1 = m.d;
       d1.e(str);
       uArrayList.add(d1);
       File externalStor = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
       a.h(externalStor, "Environment.getExternalS¡­nment.DIRECTORY_PICTURES\)");
       String name = externalStor.getName();
       if (Build$VERSION.SDK_INT >= 29) {
          File externalStor1 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_SCREENSHOTS);
          a.h(externalStor1, "Environment.getExternalS¡­nt.DIRECTORY_SCREENSHOTS\)");
          str = externalStor1.getName();
       }else {
          str = "Screenshots";
       }
       File externalStor2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
       a.h(externalStor2, "Environment.getExternalS¡­ment.DIRECTORY_DOWNLOADS\)");
       String name1 = externalStor2.getName();
       File externalStor3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
       a.h(externalStor3, "Environment.getExternalS¡­vironment.DIRECTORY_DCIM\)");
       String name2 = externalStor3.getName();
       File externalStor4 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
       a.h(externalStor4, "Environment.getExternalS¡­ronment.DIRECTORY_MOVIES\)");
       String name3 = externalStor4.getName();
       ArrayList uArrayList2 = new ArrayList();
       Iterator iterator = uArrayList1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Object obj2 = iterator.next();
             String obj3 = obj2;
             if (!a.g(obj3.a(), name) && (!a.g(obj3.a(), str) && (!a.g(obj3.a(), name2) && (!a.g(obj3.a(), name3) && !a.g(obj3.a(), name1))))) {
                String str1 = obj3.a();
                a.h(str1, "it.name");
                if (str1 != null) {
                   str1 = str1.toLowerCase();
                   a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
                   if (!a.g(str1, "camera")) {
                      str1 = obj3.a();
                      a.h(str1, "it.name");
                      if (str1 != null) {
                         str1 = str1.toLowerCase();
                         a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
                         if (!a.g(str1, "video")) {
                            str1 = obj3.a();
                            a.h(str1, "it.name");
                            if (str1 != null) {
                               str1 = str1.toLowerCase();
                               a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
                               if (!a.g(str1, "qq")) {
                                  str1 = obj3.a();
                                  a.h(str1, "it.name");
                                  if (str1 != null) {
                                     str1 = str1.toLowerCase();
                                     a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
                                     if (!a.g(str1, "weixin")) {
                                        obj3 = obj3.a();
                                        a.h(obj3, "it.name");
                                        if (obj3 != null) {
                                           obj3 = obj3.toLowerCase();
                                           a.o(obj3, "\(this as java.lang.String\).toLowerCase\(\)");
                                           if (!a.g(obj3, "wechat")) {
                                              obj4 = null;
                                           label_021d :
                                              if (obj4) {
                                                 uArrayList2.add(obj2);
                                              }
                                           }
                                        }else {
                                           break ;
                                        }
                                     }
                                  }else {
                                     throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                  }
                               }
                            }else {
                               throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                         }
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                      }
                   }
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
             }
             obj4 = 1;
             goto label_021d ;
          }else {
             List list = CollectionsKt___CollectionsKt.f5(uArrayList2, new m$a());
             uArrayList.addAll(list);
             uArrayList1.removeAll(list);
             uArrayList.addAll(CollectionsKt___CollectionsKt.f5(uArrayList1, new m$b()));
             return uArrayList;
          }
       }
       throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
    public final boolean e(){
       return m.h;
    }
    public final void f(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "5")) {
          return;
       }
       m.b.get(p0).clear();
       a c = a.c;
       Object obj = m.c.get(p0);
       a.h(obj, "mPrefKeyMap[type]");
       SharedPreferences sharedPrefer = c.h().b(m.a, obj, 0);
       String[] stringArray = new String[0];
       Object[] objArray = c.h().a(sharedPrefer).toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       Arrays.sort(objArray);
       int len = objArray.length;
       int i = 0;
       while (i < len) {
          object oobject = objArray[i];
          if (!TextUtils.isEmpty(oobject)) {
             File uFile = new File(oobject);
             File parentFile = uFile.getParentFile();
             if (parentFile != null && parentFile.exists()) {
                b uob = new b(parentFile.getName(), parentFile.getAbsolutePath());
                uob.g(uFile.getAbsolutePath());
                uob.f(sharedPrefer.getInt(oobject, 0));
                Object obj1 = m.b.get(p0);
                a.h(obj1, "mAlbumsMap[type]");
                String absolutePath = parentFile.getAbsolutePath();
                a.h(absolutePath, "dirPath.absolutePath");
                obj1.put(absolutePath, uob);
             }
          }
          i = i + 1;
       }
       return;
    }
    public synchronized final void g(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "1")) {
          return;
       }
       m.b.get(p0).clear();
       m.d.g("");
       m.h = false;
       return;
    }
    public final void h(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "6")) {
          return;
       }
       String obj = m.c.get(p0);
       a.h(obj, "mPrefKeyMap[type]");
       SharedPreferences$Editor uEditor = a.c.h().b(m.a, obj, 0).edit();
       uEditor.clear();
       Iterator iterator = m.b.get(p0).values().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          a.h(uob, "album");
          obj = uob.d();
          if (!TextUtils.isEmpty(obj)) {
             uEditor.putInt(obj, uob.b());
          }
       }
       g.a(uEditor);
       return;
    }
}
