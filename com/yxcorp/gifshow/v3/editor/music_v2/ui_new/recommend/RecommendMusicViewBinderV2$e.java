package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$e;
import voc.y;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import jn9.b;
import java.util.Collection;
import om8.a;
import android.content.SharedPreferences;
import java.util.Objects;
import lnc.a1;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import isc.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import kotlin.jvm.internal.a;
import isc.f;
import android.animation.Animator;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class RecommendMusicViewBinderV2$e implements y	// class@001110
{
    public final RecommendMusicViewBinderV2 b;

    public void RecommendMusicViewBinderV2$e(RecommendMusicViewBinderV2 p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       x.a(this);
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       x.j(this);
    }
    public void z2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecommendMusicViewBinderV2$e.class, "1")) {
          return;
       }
       if (this.b.e.o().isEmpty() ^ 1) {
          SharedPreferences a = a.a;
          boolean b = false;
          if (!a.getBoolean("edit_music_guidance", b)) {
             RecommendMusicViewBinderV2$e tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, RecommendMusicViewBinderV2.class, "13")) {
                int i = a1.e((float)200);
                AnimatorSet uAnimatorSet = new AnimatorSet();
                int[] ointArray = new int[2];
                ointArray[b] = b;
                ointArray[1] = i;
                ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
                valueAnimato.addUpdateListener(new e(tb));
                a.o(valueAnimato, "forward");
                valueAnimato.setDuration((long)480);
                int[] ointArray1 = new int[]{- i,b};
                ValueAnimator valueAnimato1 = ValueAnimator.ofInt(ointArray1);
                valueAnimato1.addUpdateListener(new f(tb, i));
                a.o(valueAnimato1, "backward");
                valueAnimato1.setDuration((long)600);
                Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
                uAnimatorSet.playSequentially(uAnimatorArr);
                uAnimatorSet.setStartDelay((long)200);
                uAnimatorSet.start();
             }
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean("edit_music_guidance", 1);
             g.a(uEditor);
          }
       }
       return;
    }
}
