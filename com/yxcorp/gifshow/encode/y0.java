package com.yxcorp.gifshow.encode.y0;
import io.reactivex.g;
import com.yxcorp.gifshow.encode.RxExportApi$a;
import com.kwai.video.clipkit.mv.TemplateImportHandler;
import java.lang.Object;
import brd.v;
import pr3.d;
import com.yxcorp.gifshow.encode.d1;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportHandlerListener;
import pca.d2;
import erd.f;
import gq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class y0 implements g	// class@000d5a
{
    public final RxExportApi$a b;
    public final TemplateImportHandler c;

    public void y0(RxExportApi$a p0,TemplateImportHandler p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       y0 tb = this.b;
       y0 tc = this.c;
       tc.setImportHandlerListener(new d1(tb, new d(), p0));
       p0.setCancellable(new d2(tb, tc));
       Object[] objArray = new Object[0];
       a.D().w("RxExportApi", "rxSdkTemplateExportHandlerTask: start export mediaPath="+tb.b, objArray);
       tc.run();
    }
}
