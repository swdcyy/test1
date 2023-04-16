package com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$d;
import erd.g;
import d0c.d;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import huc.u$a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import di0.b;
import yuc.f;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontPayload;

public final class FontViewModel$d implements g	// class@00144a
{
    public final d b;
    public final FontViewModel c;
    public final int d;
    public final u$a e;

    public void FontViewModel$d(d p0,FontViewModel p1,int p2,u$a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FontViewModel$d.class, "1")) {
       }else {
          FontViewModel$d tc = this.c;
          FontViewModel$d td = this.d;
          a.o(p0, "progress");
          int i = p0.intValue();
          FontViewModel$d tb = this.b;
          Objects.requireNonNull(tc);
          if (!PatchProxy.isSupport(FontViewModel.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(td), Integer.valueOf(i), tb, tc, FontViewModel.class, "15")) {
             int i1 = 0;
             Object[] objArray = new Object[i1];
             String str = "FontBIZ";
             a.D().s(str, "changeDownloadState position:"+td+", progress:"+i, objArray);
             if (i != 200) {
                tb.n(i);
                b.z(tc.w0(), td, tb, null, 4, null);
             }else {
                f.a.a(tb);
                char c = ' ';
                if (td == tc.h && tb.j()) {
                   objArray1 = new Object[i1];
                   a.D().s(str, "download success DOWNLOAD_SUCCESS_WITH_SELECT: "+tc.h+c+td, objArray1);
                   tc.h = -1;
                   tc.w0().y(td, tb, FontPayload.DOWNLOAD_SUCCESS_WITH_SELECT);
                }else {
                   objArray1 = new Object[i1];
                   a.D().s(str, "download success: "+tc.h+c+td, objArray1);
                   tc.w0().y(td, tb, FontPayload.BIND_WITHOUT_LOG_EVENT);
                }
             }
          }
          tc = this.e;
          if (tc != null) {
             tc.a(this.d, p0.intValue(), this.b);
          }
          PatchProxy.onMethodExit(FontViewModel$d.class, "1");
       }
       return;
    }
}
