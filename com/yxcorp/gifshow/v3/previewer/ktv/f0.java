package com.yxcorp.gifshow.v3.previewer.ktv.f0;
import ok.h;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.models.QMedia;
import java.io.File;
import lxa.a;

public final class f0 implements h	// class@0015be
{
    public static final f0 b;

    static {
       f0.b = new f0();
    }
    public void f0(){
       super();
    }
    public final Object apply(Object p0){
       QMedia qMedia = PatchProxy.applyOneRefs(p0, null, KtvSongEditPreviewFragment.class, "25");
       if (qMedia != PatchProxyResult.class) {
       }else {
          File uFile = new File(p0);
          String absolutePath = uFile.getAbsolutePath();
          long l = uFile.lastModified();
          QMedia qMedia1 = new QMedia((long)uFile.hashCode(), absolutePath, 0, a.a(l, uFile.getAbsolutePath()), 0);
          qMedia = p0;
       }
       return qMedia;
    }
}
