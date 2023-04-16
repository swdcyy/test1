package com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$a;
import yc.b;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import bd.d;
import bd.h;
import uc.b;
import com.facebook.imagepipeline.image.a;
import pc.d;

public class AnimatedFactoryV2Impl$a implements b	// class@000464
{
    public final Bitmap$Config a;
    public final AnimatedFactoryV2Impl b;

    public void AnimatedFactoryV2Impl$a(AnimatedFactoryV2Impl p0,Bitmap$Config p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public a decode(d p0,int p1,h p2,b p3){
       return this.b.e().b(p0, p3, this.a);
    }
}
