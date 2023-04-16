package com.kwai.feature.post.api.util.PostPermissionUtils;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import com.kwai.library.widget.popup.common.c;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.util.PostPermissionUtils$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import rq.a;
import java.util.HashMap;
import android.content.Context;
import com.kwai.feature.post.api.util.PostPermission;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.app.Activity;
import brd.t;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import lnc.a1;
import com.tbruyelle.rxpermissions2.g;
import q46.i;
import erd.g;
import t45.d;
import brd.z;
import q46.j;
import java.lang.Iterable;
import com.kwai.feature.post.api.util.b;
import erd.a;
import com.kwai.feature.post.api.util.c;
import com.kwai.feature.post.api.util.a;

public class PostPermissionUtils	// class@00145b
{
    public static Map a;
    public static WeakReference b;

    public void PostPermissionUtils(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, PostPermissionUtils.class, "7")) {
          return;
       }
       WeakReference b = PostPermissionUtils.b;
       if (b != null) {
          if (b.get() != null && PostPermissionUtils.b.get().K()) {
             PostPermissionUtils.b.get().o();
             Object[] objArray = new Object[0];
             p3.D().s("PostPermissionUtils", "dismiss popup:"+PostPermissionUtils.b.get(), objArray);
          }
          PostPermissionUtils.b.clear();
          PostPermissionUtils.b = null;
       }
       return;
    }
    public static Map b(){
       Object obj = PatchProxy.apply(null, null, PostPermissionUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PostPermissionUtils.a == null) {
          PostPermissionUtils.a = a.B(new PostPermissionUtils$1().getType());
       }
       if (PostPermissionUtils.a == null) {
          PostPermissionUtils.a = new HashMap();
       }
       return PostPermissionUtils.a;
    }
    public static boolean c(Context p0,PostPermission p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PostPermissionUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PermissionUtils.a(p0, p1.mName);
    }
    public static t d(Activity p0,PostPermission p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PostPermissionUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostPermissionUtils.e(p0, Collections.singletonList(p1), true);
    }
    public static t e(Activity p0,List p1,boolean p2){
       HashMap obj;
       boolean b;
       if (PatchProxy.isSupport(PostPermissionUtils.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, PostPermissionUtils.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && (p0.isFinishing() || p0.isDestroyed())) {
          return t.empty();
       }else {
          obj = new HashMap();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             PostPermission postPermissi = iterator.next();
             b = PermissionUtils.l(p0, postPermissi.mName);
             int i = 1;
             if (!b && PostPermissionUtils.c(p0, postPermissi)) {
                b = true;
             }
             obj.put(postPermissi.mName, Boolean.valueOf(b));
             Object[] objArray = new Object[0];
             p3.D().s("PostPermissionUtils", "name:"+postPermissi.mName+" , shouldShowRationale:"+PermissionUtils.l(p0, postPermissi.mName), objArray);
             if (PostPermissionUtils.c(p0, postPermissi)) {
                continue ;
             }
             long[] olongArray = new long[i];
             olongArray[0] = a1.k();
             uArrayList.add(PermissionUtils.h(new g(p0), p0, postPermissi.mName, 0).doOnSubscribe(new i(postPermissi, olongArray, p0)).observeOn(d.a).doOnNext(new j(olongArray, p0, postPermissi, obj)));
          }
          if (uArrayList.isEmpty()) {
             return t.empty();
          }else {
             return t.concat(uArrayList).observeOn(d.a).doOnDispose(b.b).doOnError(c.b).doOnComplete(new a(p1, p0, p2, obj));
          }
       }
    }
    public static void f(){
       if (PatchProxy.applyVoid(null, null, PostPermissionUtils.class, "5")) {
          return;
       }
       Map a = PostPermissionUtils.a;
       if (a != null) {
          a.W(a);
       }
       return;
    }
}
