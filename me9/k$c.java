package me9.k$c;
import erd.o;
import ne9.b;
import java.lang.Object;
import ne9.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import java.io.File;
import java.lang.StringBuilder;
import i4b.g;
import java.lang.System;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Bitmap;
import qsd.d;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.Integer;
import java.lang.Number;
import java.lang.RuntimeException;

public final class k$c implements o	// class@002ff8
{
    public final b b;

    public void k$c(b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       JsonObject jsonObject = PatchProxy.applyOneRefs(p0, this, k$c.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          a.p(p0, "requestData");
          File uFile = g.o();
          a.o(uFile, "MagicFaceResourceHelper.¡­tMagicFacePictureFolder\(\)");
          File uFile1 = new File(uFile.getAbsolutePath()+File.separator+"img_"+System.nanoTime());
          int i = 100;
          if (TextUtils.equals(p0.a(), "jpg")) {
             BitmapUtil.S(this.b.a(), uFile1.getAbsolutePath(), d.H0((p0.b() * (float)i)));
          }else {
             BitmapUtil.O(this.b.a(), uFile1.getAbsolutePath(), d.H0((p0.b() * (float)i)));
          }
          if (uFile1.exists()) {
             p0 = new JsonObject();
             p0.c0("path", uFile1.getAbsolutePath());
             p0.a0("result", Integer.valueOf(1));
             jsonObject = p0;
          }else {
             throw new RuntimeException("saveBitmap error");
          }
       }
       return jsonObject;
    }
}
