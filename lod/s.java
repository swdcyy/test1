package lod.s;
import erd.o;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class s implements o	// class@001c8f
{
    public final TextTemplateDownloadHelper b;

    public void s(TextTemplateDownloadHelper p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, s.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "p");
          integer = Integer.valueOf(this.b.a(p0.intValue(), 0, 90));
       }
       return integer;
    }
}
