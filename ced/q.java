package ced.q;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.plugin.search.result.hashtag.presenters.h;
import android.animation.Animator;
import ded.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.hashtag.entity.TagPageCollectButtonConfig;
import java.lang.Integer;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import x6d.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class q extends AnimatorListenerAdapter	// class@000577
{
    public final h a;

    public void q(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       p0.M = true;
    }
    public void onAnimationStart(Animator p0){
       TagPageCollectButtonConfig xDaysShowOnc;
       SharedPreferences$Editor uEditor;
       j oj = j.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, str)) {
          return;
       }
       q ta = this.a;
       ta.M = true;
       String str1 = "user";
       Object obj = null;
       if (ta.O != null) {
          xDaysShowOnc = ta.N.xDaysShowOnce;
          if (PatchProxy.isSupport(oj) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(xDaysShowOnc), obj, oj, str) && xDaysShowOnc > null)) {
             uEditor = a.a.edit();
             uEditor.putLong(b.d(str1)+"nextTagCollectAniTime", (System.currentTimeMillis() + TimeUnit.DAYS.toMillis((long)xDaysShowOnc)));
             g.a(uEditor);
          }
       }else {
          xDaysShowOnc = ta.N.xDaysShowOnce;
          if (PatchProxy.isSupport(oj) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(xDaysShowOnc), obj, oj, "3") && xDaysShowOnc > null)) {
             uEditor = a.a.edit();
             uEditor.putLong(b.d(str1)+"nextTagMusicCollectAniTime", (System.currentTimeMillis() + TimeUnit.DAYS.toMillis((long)xDaysShowOnc)));
             g.a(uEditor);
          }
       }
       return;
    }
}
