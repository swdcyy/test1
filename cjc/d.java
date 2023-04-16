package cjc.d;
import erd.o;
import com.yxcorp.gifshow.share.weibo.WeiboPictureForward;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.lang.System;
import wkd.b;
import j80.c;
import java.io.File;
import qkd.b;
import brd.t;
import pic.h;

public final class d implements o	// class@0005b9
{
    public final WeiboPictureForward b;
    public final KwaiOperator c;

    public void d(WeiboPictureForward p0,KwaiOperator p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "bmp");
          System.currentTimeMillis();
          String absolutePath = b.Y(b.a(-1504323719).o(), "system_share_photo", ".jpg").getAbsolutePath();
          if (absolutePath == null) {
             absolutePath = "";
          }
          this.b.A0(absolutePath, this.c, p0);
          ot = this.b.i(this.c);
       }
       return ot;
    }
}
