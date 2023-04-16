package com.yxcorp.gifshow.encode.z0;
import io.reactivex.g;
import java.lang.String;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Object;
import brd.v;
import pr3.d;
import com.yxcorp.gifshow.encode.e1;
import com.kwai.video.editorsdk2.ExportEventListener;
import pca.e2;
import erd.f;
import gq.a;
import java.lang.StringBuilder;
import q87.c;

public final class z0 implements g	// class@000d5c
{
    public final String b;
    public final String c;
    public final ExportTask d;

    public void z0(String p0,String p1,ExportTask p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       z0 tb = this.b;
       z0 td = this.d;
       td.setExportEventListener(new e1(tb, new d(), this.c, p0));
       p0.setCancellable(new e2(tb, td));
       Object[] objArray = new Object[0];
       a.D().w("RxExportApi", "rxSdkExport: start export exportFilePath="+tb, objArray);
       td.run();
    }
}
