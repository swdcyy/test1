package lod.j;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import java.util.List;
import brd.v;
import java.lang.Object;
import bod.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bod.b;
import brd.g;

public final class j implements g	// class@001c86
{
    public final TextFontRepoV3 b;
    public final List c;
    public final v d;

    public void j(TextFontRepoV3 p0,List p1,v p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          a.o(p0, "fontItem");
          b.a(p0);
          if (this.b.a(this.c)) {
             this.d.onNext(this.c);
             this.d.onComplete();
          }
       }
       return;
    }
}
