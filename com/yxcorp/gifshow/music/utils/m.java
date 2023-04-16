package com.yxcorp.gifshow.music.utils.m;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.ArrayList;
import com.kwai.sdk.switchconfig.a;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kqb.t;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import wkd.b;
import j80.c;
import java.util.Map;
import kqb.z;
import kob.h;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.HashMap;
import java.util.List;
import brd.t;
import com.yxcorp.gifshow.music.utils.j;
import erd.o;
import java.lang.Integer;
import java.lang.Boolean;
import kqb.r;
import erd.g;
import java.util.Collection;
import com.yxcorp.gifshow.music.utils.i;
import lnc.p3;
import q87.c;
import com.yxcorp.gifshow.music.utils.h;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.music.utils.l;
import kqb.d;
import kqb.u;

public final class m	// class@0020a2
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final List h;
    public static final int i;

    static {
       m.a = m.b("music_file");
       m.b = m.b("snippet_music_file");
       m.c = m.b("lyrics_file");
       m.d = m.b("melody_file");
       m.e = m.b("object_file");
       m.f = m.b("cover_file")+".png";
       m.g = m.b("accompaniment_music_name");
       m.h = new ArrayList();
       m.i = a.t().a("maxMusicHistoryCounts", 50);
    }
    public void m(){
       super();
    }
    public static void a(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, m.class, "8")) {
          return;
       }
       k1.o(new t(p0));
       return;
    }
    public static String b(String p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, m.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       char[] uocharArray = p0.toCharArray();
       obj = "";
       int i = 0;
       while (i < uocharArray.length) {
          obj = obj+uocharArray[i];
          int i1 = uocharArray.length - 1;
          if (i != i1) {
             obj = obj+'%';
          }
          i = i + 1;
       }
       return obj;
    }
    public static File c(){
       Object obj = PatchProxy.apply(null, null, m.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).d(".music");
    }
    public static Map d(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, objArray, m.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = z.f;
       String str = h.a.getString("music_history_map", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          return new HashMap();
       }else {
          return objArray;
       }
    }
    public static t e(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isEmpty()) {
          return t.just(new ArrayList());
       }
       return t.just(p0).flatMap(new j(p0));
    }
    public static t f(int p0,boolean p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), null, om, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return m.g().doOnNext(new r(p0, p1));
    }
    public static t g(){
       Object obj = PatchProxy.apply(null, null, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = false;
       if (h.a.getBoolean("has_move_history", b)) {
          return t.just(new ArrayList(m.d().values())).doOnNext(i.b);
       }
       Object[] objArray = new Object[b];
       p3.D().w("MusicHistoryUtils", "start loadMusicHistoryList ", objArray);
       return t.fromCallable(h.b).subscribeOn(d.c).observeOn(d.a).map(l.b).doOnNext(i.b);
    }
    public static void h(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, m.class, "9")) {
          return;
       }
       m.h.add(p0);
       return;
    }
    public static void i(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, m.class, "1")) {
          return;
       }
       k1.o(new u(p0));
       return;
    }
    public static void j(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, m.class, "10")) {
          return;
       }
       m.h.remove(p0);
       return;
    }
}
