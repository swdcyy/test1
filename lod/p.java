package lod.p;
import erd.g;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper$DownloadFailException;
import com.yxcorp.gifshow.util.PostUtils;
import e17.i;
import brd.g;
import faa.a;
import w46.b;

public final class p implements g	// class@001c8c
{
    public final v b;

    public void p(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else if(!p0 instanceof TextTemplateDownloadHelper$DownloadFailException){
          PostUtils.D("TextTemplateDownloadHelper", "downloadFontAndSk2c", p0);
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
       this.b.onError(p0);
       a.D().e("TextTemplateDownloadHelper", "downloadFontAndSk2c download fail", p0);
       return;
    }
}
