package hg9.d1;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.p;
import java.io.File;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import w46.b;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class d1 implements g	// class@002654
{
    public final p b;
    public final File c;
    public final Bitmap d;

    public void d1(p p0,File p1,Bitmap p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d1 tb = this.b;
       d1 tc = this.c;
       d1 td = this.d;
       Objects.requireNonNull(tb);
       int i = 0;
       if (p0.booleanValue()) {
          Object[] objArray = new Object[i];
          a.D().w(tb.a, "load success...", objArray);
          tb.f(tc, td);
          PluginDownloadExtension.k.a("live_anchor_plugin");
       }else {
          Object[] objArray1 = new Object[i];
          a.D().t(tb.a, "load fail...", objArray1);
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100a3e));
       }
       return;
    }
}
