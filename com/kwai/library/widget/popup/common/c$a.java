package com.kwai.library.widget.popup.common.c$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.library.widget.popup.common.c;
import java.lang.String;
import android.animation.Animator;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class c$a extends AnimatorListenerAdapter	// class@00098e
{
    public final int a;
    public final String b;
    public final c c;

    public void c$a(c p0,int p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       c$a tc = this.c;
       tc.k = false;
       tc.T(this.a);
       Log.g("Popup#Popup", "dismiss success with anim end "+this.b);
    }
}
