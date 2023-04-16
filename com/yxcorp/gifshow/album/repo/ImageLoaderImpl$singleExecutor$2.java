package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$singleExecutor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t45.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

public final class ImageLoaderImpl$singleExecutor$2 extends Lambda implements a	// class@001a81
{
    public static final ImageLoaderImpl$singleExecutor$2 INSTANCE;

    static {
       ImageLoaderImpl$singleExecutor$2.INSTANCE = new ImageLoaderImpl$singleExecutor$2();
    }
    public void ImageLoaderImpl$singleExecutor$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ThreadPoolExecutor invoke(){
       Object obj = PatchProxy.apply(null, this, ImageLoaderImpl$singleExecutor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e uoe = new e(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new b("ImageLoaderImplExecutor"));
       obj.allowCoreThreadTimeOut(true);
       return obj;
    }
}
