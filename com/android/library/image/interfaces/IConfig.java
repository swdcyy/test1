package com.android.library.image.interfaces.IConfig;
import x7.c;
import jd.c;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import ub.a;
import x7.d;
import xb.t$b;
import uc.d;
import dd.d;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import com.android.library.image.interfaces.IConfig$CacheType;

public interface abstract IConfig implements c	// class@000eff
{

    IConfig A(c p0);
    IConfig D(Drawable p0);
    IConfig F(boolean p0);
    IConfig G(int p0);
    IConfig a(ImageRequest$CacheChoice p0);
    IConfig b(a p0);
    IConfig c(int p0);
    IConfig d(boolean p0);
    IConfig e(Drawable p0);
    IConfig g(boolean p0);
    IConfig h(Drawable p0);
    IConfig i(d p0);
    IConfig j(t$b p0);
    IConfig k(d p0);
    IConfig m(d p0);
    IConfig o(int p0);
    IConfig q(Priority p0);
    IConfig r(Drawable p0);
    IConfig s(boolean p0);
    IConfig u(int p0);
    IConfig v(RoundingParams p0);
    IConfig w(ImageRequest$RequestLevel p0);
    IConfig y(IConfig$CacheType p0);
    IConfig z(t$b p0);
}
