package bh.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.animation.Animator;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.gifshow.kanim.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import gh.d;
import android.animation.AnimatorSet;
import java.util.Collection;
import bh.o;
import java.lang.Integer;
import java.lang.Thread;
import android.os.Looper;
import java.lang.IllegalThreadStateException;
import android.content.Context;
import ih.c;
import java.lang.StringBuilder;
import ih.b;
import bh.p;
import bh.g;
import com.gifshow.kanim.b;

public class d	// class@000b30
{
    public static d a;

    public void d(){
       super();
    }
    public static d c(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.a == null) {
          d.a = new d();
       }
       return d.a;
    }
    public Animator a(View p0,String p1,String p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Animator obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       if (!TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p2)) {
          a uoa = new a(p0, p1, p2, true);
          p0 = PatchProxy.apply(obj, uoa, a.class, "8");
          if (p0 != patchProxyRe) {
             obj = p0;
          }else if(uoa.i.isEmpty()){
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = uoa.i.iterator();
             while (iterator.hasNext()) {
                AnimatorSet uAnimatorSet = iterator.next().a();
                if (uAnimatorSet.isRunning()) {
                   uAnimatorSet.cancel();
                }
                uArrayList.add(uAnimatorSet);
             }
             if (!uArrayList.isEmpty()) {
                AnimatorSet uAnimatorSet1 = new AnimatorSet();
                a uoa1 = null;
                if (!uoa.i.isEmpty()) {
                   uoa1 = (long)uoa.i.get(0).b();
                }
                uAnimatorSet1.setDuration(uoa1);
                uAnimatorSet1.playTogether(uArrayList);
             }
          }
       }
       return obj;
    }
    public o b(View p0,String p1,String p2){
       o obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       if (!TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p2)) {
          a uoa = new a(p0, p1, p2);
       }
       return obj;
    }
    public void d(View p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "4")) {
          return;
       }
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(1), this, d.class, "5")) {
          object oobject = null;
          if (PatchProxy.isSupport(uod)) {
             Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(1),oobject};
             if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
             }
          }else if(Thread.currentThread() == Looper.getMainLooper().getThread()){
             if (p0 == null || (!TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p2))) {
                new a(p0, p1, p2).f(1);
             }
          }else {
             throw new IllegalThreadStateException("must be call on main thread !!!");
          }
       }
    label_0076 :
       return;
    }
    public void e(Context p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (c.e(str)) {
             String str1 = "preload url -> "+str;
             if (!PatchProxy.applyVoidOneRefs(str1, null, b.class, "1")) {
                b.a.info(str1);
             }
             b.f(p0.getApplicationContext(), str);
          }
       }
       return;
    }
}
