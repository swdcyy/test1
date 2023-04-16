package com.yxcorp.gifshow.util.cdnresource.d;
import android.animation.Animator$AnimatorListener;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import java.lang.Object;
import android.animation.Animator;
import com.yxcorp.gifshow.util.cdnresource.e;

public class d implements Animator$AnimatorListener	// class@001f6a
{
    public final String a;
    public final ClientContent$ContentPackage b;
    public final CdnResource$ResourceKey c;

    public void d(String p0,ClientContent$ContentPackage p1,CdnResource$ResourceKey p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       e.k(this.a, this.b, this.c);
    }
}
