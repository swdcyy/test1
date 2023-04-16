package lod.i;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import bod.a;
import d0c.a;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import brd.t;
import lod.i$a;
import lod.i$b;
import erd.g;
import crd.b;

public final class i implements g	// class@001c85
{
    public final TextFontRepoV3 b;
    public final List c;
    public final List d;

    public void i(TextFontRepoV3 p0,List p1,List p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Iterator iterator = this.c.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          a uoa = iterator.next();
          if (!uoa.c()) {
             String str = uoa.b().c();
             a.m(str);
             if (this.d.contains(str)) {
                break ;
             }else {
                str = uoa.b().c();
                a.m(str);
                this.d.add(str);
                this.b.b().a(uoa.b()).subscribe(new i$a(uoa, this, p0), i$b.b);
             }
          }
       }
       return;
    }
}
