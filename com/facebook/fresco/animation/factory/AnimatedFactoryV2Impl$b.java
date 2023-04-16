package com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$b;
import yc.b;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import bd.d;
import bd.h;
import uc.b;
import com.facebook.imagepipeline.image.a;
import pc.d;

public class AnimatedFactoryV2Impl$b implements b	// class@000465
{
    public final Bitmap$Config a;
    public final AnimatedFactoryV2Impl b;

    public void AnimatedFactoryV2Impl$b(AnimatedFactoryV2Impl p0,Bitmap$Config p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public a decode(d p0,int p1,h p2,b p3){
       return this.b.e().a(p0, p3, this.a);
    }
}
