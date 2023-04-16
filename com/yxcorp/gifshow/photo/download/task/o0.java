package com.yxcorp.gifshow.photo.download.task.o0;
import io.reactivex.g;
import com.yxcorp.gifshow.photo.download.task.p0;
import java.io.File;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photo.download.task.n0;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.util.HashMap;
import com.yxcorp.gifshow.photo.download.task.o0$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import kotlin.jvm.internal.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import mxc.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import ixb.q;
import com.yxcorp.gifshow.entity.QPhoto;
import mxc.a;
import erd.g;

public class o0 implements g	// class@000f10
{
    public final File b;
    public final p0 c;

    public void o0(p0 p0,File p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void subscribe(v p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "1")) {
          return;
       }
       p0 b = this.c.b;
       n0 o = b.o;
       if (o.b != null) {
          str = (o.c != null)? "RED_PACKAGE": "NY_RED_PACKAGE";
       }else {
          str = null;
       }
       if (str != null) {
          b.e.mElementParams.put("afterplay_paster_type", str);
       }
       b = this.c.b;
       n0 o1 = b.o;
       b b1 = b.b;
       String absolutePath = this.b.getAbsolutePath();
       o0$a uoa = new o0$a(this, p0);
       Objects.requireNonNull(o1);
       EmptyDisposable uEmptyDispos = PatchProxy.applyThreeRefs(b1, absolutePath, uoa, o1, DownloadRedPacketHelper.class, "4");
       if (uEmptyDispos != PatchProxyResult.class) {
       }else {
          a.p(b1, "photo");
          a.p(absolutePath, "source");
          a.p(uoa, "callback");
          if (o1.b == null) {
             uoa.a(absolutePath, 0);
             uEmptyDispos = EmptyDisposable.INSTANCE;
          }else {
             uEmptyDispos = qa.s(b.class, LoadPolicy.SILENT_IMMEDIATE).Q(new q(o1, b1, uoa, absolutePath));
             a.o(uEmptyDispos, "VideoPluginManager.load\(бн             }\)\n        }");
          }
       }
       p0.setDisposable(uEmptyDispos);
       return;
    }
}
