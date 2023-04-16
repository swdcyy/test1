package me9.g;
import erd.o;
import java.lang.String;
import java.lang.Object;
import okhttp3.ResponseBody;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.io.File;
import i4b.g;
import j8c.a;
import q87.c;
import android.util.Pair;
import java.lang.Integer;
import brd.t;
import tkd.b;
import tkd.d;
import n46.g;
import n46.h;

public final class g implements o	// class@002fee
{
    public final String b;

    public void g(String p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          File uFile = g.g();
          a.o(uFile, "MagicFaceResourceHelper.¡­DependentResourceFolder\(\)");
          String str = uFile.getAbsolutePath()+File.separator+this.b;
          uFile = new File(str);
          if (uFile.exists() && uFile.length() - null > 0) {
             Object[] objArray = new Object[0];
             a.D().w("MagicRequestDownloadHandler", "file exits, path:"+str, objArray);
             ot = t.just(new Pair(Integer.valueOf(100), str));
          }else {
             ot = d.a(0x745a6c00).cz(p0, str);
          }
       }
       return ot;
    }
}
