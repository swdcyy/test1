package com.yxcorp.gifshow.camera.record.widget.e;
import erd.c;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.graphics.Bitmap$Config;
import xm6.a;

public final class e implements c	// class@000fe7
{
    public final int a;
    public final int b;

    public void e(int p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object a(Object p0,Object p1){
       Bitmap uBitmap = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (uBitmap != PatchProxyResult.class) {
       }else {
          a.p(p0, "pendantBmp");
          a.p(p1, "avatarBmp");
          p1 = BitmapUtil.k(p1);
          a.o(p1, "BitmapUtil.createCircleImage\(avatarBmp\)");
          p1 = BitmapUtil.T(p1, this.a, this.a, Bitmap$Config.ARGB_8888);
          a.o(p1, "BitmapUtil.scale\(\n      ¡­g.ARGB_8888\n            \)");
          p0 = BitmapUtil.T(p0, this.b, this.b, Bitmap$Config.ARGB_8888);
          a.o(p0, "newPendantBmp");
          uBitmap = a.a.c(p1, p0);
       }
       return uBitmap;
    }
}
