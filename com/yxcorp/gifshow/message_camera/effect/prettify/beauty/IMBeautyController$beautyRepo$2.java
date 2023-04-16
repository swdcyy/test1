package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController$beautyRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import h16.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cib.a;
import gib.j;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyRepo;

public final class IMBeautyController$beautyRepo$2 extends Lambda implements a	// class@001da5
{
    public static final IMBeautyController$beautyRepo$2 INSTANCE;

    static {
       IMBeautyController$beautyRepo$2.INSTANCE = new IMBeautyController$beautyRepo$2();
    }
    public void IMBeautyController$beautyRepo$2(){
       super(0);
    }
    public final n invoke(){
       IMBeautyRepo iMBeautyRepo;
       j obj = PatchProxy.apply(null, this, IMBeautyController$beautyRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (a.b())? new j(): new IMBeautyRepo();
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
