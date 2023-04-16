package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$photoScoreTaskBuilder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.kve.SmartCoverTaskBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kve.VisionEngine;

public final class MultiTakePictureController$photoScoreTaskBuilder$2 extends Lambda implements a	// class@000ee5
{
    public static final MultiTakePictureController$photoScoreTaskBuilder$2 INSTANCE;

    static {
       MultiTakePictureController$photoScoreTaskBuilder$2.INSTANCE = new MultiTakePictureController$photoScoreTaskBuilder$2();
    }
    public void MultiTakePictureController$photoScoreTaskBuilder$2(){
       super(0);
    }
    public final SmartCoverTaskBuilder invoke(){
       Object obj = PatchProxy.apply(null, this, MultiTakePictureController$photoScoreTaskBuilder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VisionEngine.createSmartCoverTaskBuilder();
    }
    public Object invoke(){
       return this.invoke();
    }
}
