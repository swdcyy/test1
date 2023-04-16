package com.yxcorp.gifshow.encode.m;
import erd.a;
import java.lang.Object;
import pca.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import qkd.b;

public final class m implements a	// class@000d31
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, null, x.class, "4")) {
       }else {
          File uFile = x.c("clip_kit_export_tmp");
          if (uFile.exists()) {
             b.m(uFile);
          }
       }
       return;
    }
}
