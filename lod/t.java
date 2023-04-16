package lod.t;
import erd.o;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class t implements o	// class@001c90
{
    public final TextTemplateDownloadHelper b;

    public void t(TextTemplateDownloadHelper p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, t.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "p");
          integer = Integer.valueOf(this.b.a(p0.intValue(), 90, 99));
       }
       return integer;
    }
}
