package ind.b$a$d;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import java.util.Objects;
import faa.a;
import q87.c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import bod.d;
import java.util.concurrent.atomic.AtomicBoolean;
import lod.u;
import io.reactivex.g;
import brd.t;
import io.reactivex.internal.functions.Functions;
import crd.b;
import crd.a;

public final class b$a$d implements g	// class@00102b
{
    public final TextKeyboardDataViewModelV3 b;

    public void b$a$d(TextKeyboardDataViewModelV3 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$d.class, "1")) {
       }else {
          p0 = this.b.q0();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, TextTemplateRepo.class, "8")) {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("TextTemplateRepo", "preDownloadAllTextTemplate", objArray);
             Iterator iterator = p0.f.iterator();
             while (iterator.hasNext()) {
                d uod = iterator.next();
                if (p0.c.get()) {
                   Object[] objArray1 = new Object[i];
                   a.D().w("TextTemplateRepo", "stopPreDownloadFlag true", objArray1);
                   break ;
                }else if(uod.j()){
                   continue ;
                }
                p0.j = true;
                p0.b.c(t.create(new u(p0, uod)).subscribe(Functions.d(), Functions.d()));
             }
          }
       }
       return;
    }
}
