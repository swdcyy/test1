package bu7.j0;
import bu7.k;
import java.lang.String;
import java.text.SimpleDateFormat;
import android.content.Context;
import java.util.List;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.SharedPreferences;
import oe6.o;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.photo.download.model.config.NebulaDownloadRedPacketConfig;
import java.lang.reflect.Type;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import wkd.b;
import j80.c;
import java.io.File;
import java.util.concurrent.Callable;
import java.lang.Boolean;
import android.os.Environment;
import java.lang.Exception;
import android.content.ContentResolver;
import android.provider.MediaStore$Video$Media;
import java.lang.StringBuilder;
import android.net.Uri;
import android.database.Cursor;
import android.provider.MediaStore$Images$Media;
import bu7.j0$a;
import java.util.Iterator;
import bu7.j0$b;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Long;
import java.lang.System;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.lang.Integer;
import fo7.b;
import java.util.Date;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Number;
import android.os.Build$VERSION;

public class j0 implements k	// class@00048f
{
    public SharedPreferences a;
    public final Context b;
    public final int c;
    public final List d;
    public AtomicBoolean e;
    public int f;
    public int g;
    public static k h;
    public static String[] i;
    public static final String[] j;
    public static final SimpleDateFormat k;

    static {
       String[] stringArray = new String[]{"_id","_data","duration","date_added","date_modified"};
       j0.i = stringArray;
       stringArray = new String[]{"video/mp4"};
       j0.j = stringArray;
       j0.k = new SimpleDateFormat("yyyy-MM-dd");
    }
    public void j0(Context p0,int p1,List p2){
       super();
       this.e = new AtomicBoolean(false);
       int i = Integer.MAX_VALUE;
       this.f = i;
       this.g = i;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       if (this.a == null) {
          this.a = o.c(p0, "album_videos_scanned", false);
       }
       NebulaDownloadRedPacketConfig value = a.t().getValue("kuaishouDownloadRedPacket", NebulaDownloadRedPacketConfig.class, null);
       if (value != null) {
          this.f = value.mOpenCountTotal;
          this.g = value.mOpenCountDaily;
       }
       return;
    }
    public static k g(Context p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, j0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j0.h == null) {
          _monitor_enter(j0.class);
          obj = new ArrayList(1);
          File uFile = b.a(-1504323719).o();
          if (uFile != null) {
             obj.add(uFile.getPath());
          }
          j0.h = new j0(p0, 3, obj);
          _monitor_exit(j0.class);
       }
       return j0.h;
    }
    public String a(Callable p0){
       long l;
       ArrayList uArrayList2;
       boolean b2;
       ArrayList uArrayList3;
       long longx;
       long l1;
       Bitmap obj4;
       Object obj5;
       CharSequence uCharSequenc;
       Iterator obj6;
       String str2;
       Object obj = this;
       j0$a obj1 = p0;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, j0.class, "5");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       Object[] objArray = null;
       obj2 = PatchProxy.apply(objArray, obj, j0.class, "12");
       boolean b = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): obj.i(obj.b, "android.permission.READ_EXTERNAL_STORAGE");
       if (!b) {
          return objArray;
       }else {
          obj2 = PatchProxy.applyOneRefs(obj1, obj, j0.class, "15");
          if (obj2 != PatchProxyResult.class) {
          }else {
             ArrayList uArrayList = new ArrayList();
             ArrayList uArrayList1 = new ArrayList();
             try{
                int i = 0;
                obj2 = Environment.getExternalStorageState();
                if (("mounted").equals(obj2) || ("mounted_ro").equals(obj2)) {
                   b = true;
                   try{
                   label_0060 :
                      l = this.h();
                      j0 b1 = obj.b;
                      if (PatchProxy.isSupport(j0.class)) {
                         uArrayList2 = PatchProxy.applyTwoRefs(b1, Boolean.valueOf(b), obj, j0.class, "14");
                         if (uArrayList2 != PatchProxyResult.class) {
                         }else {
                         label_007b :
                            uArrayList2 = new ArrayList();
                            ContentResolver contentResol = b1.getContentResolver();
                            String str1 = "date_added desc limit ";
                            if (b) {
                               str2 = str1;
                               uArrayList2.add(contentResol.query(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, j0.i, "mime_type=? and duration<120000", j0.j, str1+obj.c));
                            }else {
                               str2 = str1;
                            }
                            uArrayList2.add(contentResol.query(MediaStore$Images$Media.INTERNAL_CONTENT_URI, j0.i, "mime_type=? and duration<120000", j0.j, str2+obj.c));
                         }
                      }else {
                         goto label_007b ;
                      }
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                   b = uArrayList2.size();
                   boolean i1 = 0;
                   while (i1 < b) {
                      Cursor uCursor = uArrayList2.get(i1);
                      String obj3 = PatchProxy.applyOneRefs(uCursor, obj, j0.class, "16");
                      if (obj3 != PatchProxyResult.class) {
                         b2 = obj3.booleanValue();
                      }else if(uCursor == null || uCursor.isClosed()){
                         b2 = true;
                      }else {
                         b2 = false;
                      }
                      if (!b2) {
                         while (uCursor.moveToNext()) {
                            obj3 = uCursor.getString(uCursor.getColumnIndex("_data"));
                            uArrayList3 = uArrayList;
                            longx = uCursor.getLong(uCursor.getColumnIndex("date_added"));
                            uCursor.getLong(uCursor.getColumnIndex("duration"));
                            if (l - longx < 0) {
                               uArrayList1.add(new j0$a(obj, obj3, longx));
                            }
                            uArrayList = uArrayList3;
                            longx = 0;
                         }
                      }
                      i1 = i1 + 1;
                      uArrayList = uArrayList;
                      longx = 0;
                   }
                   uArrayList3 = uArrayList;
                   Iterator iterator = uArrayList2.iterator();
                   while (iterator.hasNext()) {
                      obj.f(iterator.next());
                   }
                   if (!uArrayList1.isEmpty()) {
                      Collections.sort(uArrayList1, new j0$b(obj));
                      int i2 = 0;
                      while (i2 < uArrayList1.size()) {
                         j0$a a = uArrayList1.get(i2).a;
                         l1 = uArrayList1.get(i2).a();
                         try{
                            File uFile = new File(a);
                            l1 = l1 * 1000;
                            if (PatchProxy.isSupport(j0.class)) {
                               obj6 = PatchProxy.applyOneRefs(Long.valueOf(l1), obj, j0.class, "18");
                               if (obj6 != PatchProxyResult.class) {
                                  i1 = obj6.booleanValue();
                               }else {
                               label_01b0 :
                                  long l2 = System.currentTimeMillis() - l1;
                                  i1 = (l2 - 0x5265c00 > 0)? true: false;
                               }
                            }else {
                               goto label_01b0 ;
                            }
                            if (!i1) {
                               obj6 = PatchProxy.applyOneRefs(a, obj, j0.class, "19");
                               if (obj6 != PatchProxyResult.class) {
                                  i1 = obj6.booleanValue();
                               }else if(!TextUtils.x(a)){
                                  obj6 = obj.d.iterator();
                                  while (true) {
                                     if (obj6.hasNext()) {
                                        String str = obj6.next();
                                        if (!TextUtils.x(str) && a.startsWith(str)) {
                                           i1 = true;
                                        }
                                     }
                                  }
                                  return null;
                               }
                               i1 = false;
                               if (!i1 && (uFile.exists() && uFile.isFile())) {
                                  uArrayList = uArrayList3;
                                  try{
                                     uArrayList.add(a);
                                  }catch(java.lang.Exception e0){
                                  }
                                  e0.printStackTrace();
                               }else {
                               label_020d :
                                  uArrayList = uArrayList3;
                               }
                            }else {
                               goto label_020d ;
                            }
                            if (uArrayList.size() <= obj.c) {
                               i2 = i2 + 1;
                               uArrayList3 = uArrayList;
                            }
                         }catch(java.lang.Exception e0){
                            uArrayList = uArrayList3;
                            goto label_0213 ;
                         }
                      }
                   }
                   longx = 0;
                   try{
                      if (uArrayList1.size() <= 0 || p0.call().booleanValue()) {
                         iterator = uArrayList1.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               obj1 = iterator.next();
                               j0$a a1 = obj1.a;
                               obj4 = PatchProxy.applyOneRefs(a1, obj, j0.class, "8");
                               if (obj4 != PatchProxyResult.class) {
                                  obj5 = obj4;
                               }else {
                                  obj4 = PatchProxy.applyOneRefs(a1, obj, j0.class, "6");
                                  if (obj4 != PatchProxyResult.class) {
                                  }else {
                                     MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
                                     mediaMetadat.setDataSource(a1);
                                     try{
                                        obj5 = 9;
                                        int i3 = Integer.parseInt(mediaMetadat.extractMetadata(obj5)) * 1000;
                                        l1 = (long)i3;
                                        obj4 = mediaMetadat.getFrameAtTime(l1, 3);
                                     }catch(java.lang.Exception e0){
                                        obj4 = null;
                                     }
                                  }
                               }
                               if (!obj.e.get()) {
                                  if (!TextUtils.x(obj5)) {
                                     obj1 = obj1.b;
                                     if (l - obj1 < 0) {
                                        obj.j(obj1);
                                     }
                                     uCharSequenc = obj5;
                                  }else {
                                     a1 = obj1.b;
                                     if (longx - a1 < 0) {
                                        j0$a uoa = a1;
                                     }else {
                                        continue ;
                                     }
                                  }
                               }
                            }else if(l - longx < 0){
                               obj.j(longx);
                            }
                         }
                      }
                      uCharSequenc = null;
                   }catch(java.lang.Exception e0){
                   }
                   if (i < l1) {
                      obj4.recycle();
                      obj5 = null;
                   }else {
                      obj5 = b.a(obj4);
                      obj4.recycle();
                   }
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
             b = false;
             goto label_0060 ;
          }
          if (TextUtils.x(obj2)) {
             goto label_02e4 ;
          }else {
             return obj2;
          }
       }
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, j0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.a.getInt("key_red_packet_in_total", i) >= this.f) {
          return i;
       }
       int intx = this.a.getInt("key_red_packet_in_today", i);
       if (!(j0.k.format(new Date())).equals(this.a.getString("key_red_packet_today", "")) || intx < this.g) {
          i = true;
       }
       return i;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, j0.class, "3")) {
          return;
       }
       String str = j0.k.format(new Date());
       int i = 1;
       int i1 = this.a.getInt("key_red_packet_in_total", 0) + i;
       int intx = this.a.getInt("key_red_packet_in_today", 0);
       if (str.equals(this.a.getString("key_red_packet_today", ""))) {
          i = i + intx;
       }
       if (!this.e.get()) {
          _monitor_enter(j0.class);
          g.a(this.a.edit().putInt("key_red_packet_in_total", i1).putString("key_red_packet_today", str).putInt("key_red_packet_in_today", i));
          _monitor_exit(j0.class);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, j0.class, "4")) {
          return;
       }
       _monitor_enter(j0.class);
       this.j((this.h() - 1));
       this.e.set(true);
       j0.h = null;
       _monitor_exit(j0.class);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, j0.class, "9")) {
          return;
       }
       this.j((System.currentTimeMillis() / 1000));
       return;
    }
    public final void f(Cursor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "17")) {
          return;
       }
       if (p0 != null && !p0.isClosed()) {
          p0.close();
       }
       return;
    }
    public final long h(){
       Object obj = PatchProxy.apply(null, this, j0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getLong("key_latest_time_stamp", 0);
    }
    public final boolean i(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Build$VERSION.SDK_INT < 23 || (p0 != null && !p0.checkSelfPermission(p1)))? true: false;
       return b;
    }
    public final void j(long p0){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, j0.class, "10")) {
          return;
       }
       _monitor_enter(j0.class);
       if (!this.e.get()) {
          g.a(this.a.edit().putLong("key_latest_time_stamp", p0));
       }
       _monitor_exit(j0.class);
       return;
    }
}
