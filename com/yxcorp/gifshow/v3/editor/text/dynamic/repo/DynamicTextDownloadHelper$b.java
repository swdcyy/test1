package com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper$b;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper;
import nuc.c;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import eb7.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper$a;
import hqc.i;
import puc.a;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;

public final class DynamicTextDownloadHelper$b implements g	// class@0013d8
{
    public final DynamicTextDownloadHelper b;
    public final c c;

    public void DynamicTextDownloadHelper$b(DynamicTextDownloadHelper p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTextDownloadHelper$b.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       DynamicTextDownloadHelper$b tb = this.b;
       DynamicTextDownloadHelper$b tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(tc, p0, tb, DynamicTextDownloadHelper.class, "5")) {
          Object[] objArray = new Object[0];
          a.D().s("DynamicTextDownloadHelper", "innerDownload: "+tc.b(), objArray);
          tb.c().d(new DynamicTextDownloadHelper$a(tb, tc, tb.c, tb.d), new a(tb, tc, p0));
       }
       return;
    }
}
