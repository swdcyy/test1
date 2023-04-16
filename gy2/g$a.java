package gy2.g$a;
import java.lang.Object;
import nsd.u;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import gy2.g$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import gy2.g$a$b;
import android.app.Activity;
import android.app.Dialog;
import java.lang.Integer;
import d61.y;
import android.view.Window;
import gy2.g;
import gy2.a;
import androidx.fragment.app.c;
import gy2.b$a;
import gy2.c;
import gy2.f;
import java.util.List;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.Field;
import androidx.fragment.app.FragmentHostCallback;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class g$a	// class@002bcb
{

    public void g$a(){
       super();
    }
    public void g$a(u p0){
       super();
    }
    public final Animator a(View p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       obj = new int[]{0,- p0.getHeight()};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(obj);
       valueAnimato.setDuration(300);
       valueAnimato.setInterpolator(new DecelerateInterpolator());
       valueAnimato.addUpdateListener(new g$a$a(p0));
       a.o(valueAnimato, "ValueAnimator.ofInt\(0, -¡­as Int\)\n        }\n      }");
       return valueAnimato;
    }
    public final Animator b(View p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       obj = new int[]{- p0.getHeight(),0};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(obj);
       valueAnimato.setDuration(300);
       valueAnimato.setInterpolator(new DecelerateInterpolator());
       valueAnimato.addUpdateListener(new g$a$b(p0));
       a.o(valueAnimato, "ValueAnimator.ofInt\(- vi¡­as Int\)\n        }\n      }");
       return valueAnimato;
    }
    public final void c(Activity p0,int p1,Dialog p2){
       Window window;
       View decorView;
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, g$a.class, "6")) {
          return;
       }
       if (p1 != 1) {
          if (p1 == 2 && !y.d(p0)) {
             if (p2 != null) {
                window = p2.getWindow();
                if (window != null) {
                   window.addFlags(16);
                }
             }
             if (p2 != null) {
                window = p2.getWindow();
                if (window != null) {
                   decorView = window.getDecorView();
                   if (decorView != null) {
                      a.o(decorView, "decorView");
                      g.a.a(decorView).start();
                   }
                }
             }
          }
       }else if(p2 != null){
          window = p2.getWindow();
          if (window != null) {
             window.addFlags(16);
          }
       }
       if (p2 != null) {
          window = p2.getWindow();
          if (window != null) {
             decorView = window.getDecorView();
             if (decorView != null) {
                a.o(decorView, "it");
                decorView.setVisibility(4);
             }
          }
       }
    label_0073 :
       return;
    }
    public final c d(a p0,c p1,b$a p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, g$a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "dialog");
       a.p(p2, "delegate");
       obj = f.e;
       Activity uActivity = PatchProxy.applyOneRefs(p1, this, g$a.class, "7");
       if (uActivity != patchProxyRe) {
       }else {
          uActivity = null;
          if (p1 != null) {
             Iterator iterator = p1.getFragments().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Fragment uFragment = iterator.next();
                   a.o(uFragment, "fragment");
                   if (uFragment.getActivity() != null) {
                      uActivity = uFragment.getActivity();
                      break ;
                   }
                }else {
                   try{
                      Field declaredFiel = Class.forName("androidx.fragment.app.FragmentManagerImpl").getDeclaredField("mHost");
                      a.o(declaredFiel, "field");
                      declaredFiel.setAccessible(true);
                      p1 = declaredFiel.get(p1);
                      declaredFiel = FragmentHostCallback.class.getDeclaredField("mActivity");
                      a.o(declaredFiel, "activityField");
                      declaredFiel.setAccessible(true);
                      p1 = declaredFiel.get(p1);
                      if (p1 instanceof Activity) {
                         uActivity = p1;
                         break ;
                      }
                   }catch(java.lang.Exception e0){
                      b.Z(LiveLogTag.LIVE_ERROR_LOG_TAG, "LiveBaseDialogFragment getActivity fail");
                      break ;
                   }
                }
             }
          }
       }
    }
    public final void e(Activity p0,int p1,Dialog p2){
       Window window;
       View decorView;
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, g$a.class, "5")) {
          return;
       }
       if (p1 != 1) {
          if (p1 == 2 && !y.d(p0)) {
             if (p2 != null) {
                window = p2.getWindow();
                if (window != null) {
                   window.clearFlags(16);
                }
             }
             if (p2 != null) {
                window = p2.getWindow();
                if (window != null) {
                   decorView = window.getDecorView();
                   if (decorView != null) {
                      a.o(decorView, "decorView");
                      g.a.b(decorView).start();
                   }
                }
             }
          }
       }else if(p2 != null){
          window = p2.getWindow();
          if (window != null) {
             window.clearFlags(16);
          }
       }
       if (p2 != null) {
          window = p2.getWindow();
          if (window != null) {
             decorView = window.getDecorView();
             if (decorView != null) {
                a.o(decorView, "it");
                decorView.setVisibility(0);
             }
          }
       }
    label_0073 :
       return;
    }
}
