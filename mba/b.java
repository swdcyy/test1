package mba.b;
import erd.g;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import haa.f;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class b implements g	// class@002fa6
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       f.D().w("WorkspaceDraft", "copyFilesFromFileMap\(\) success="+p0, objArray);
       if (p0.booleanValue()) {
          tb.l0();
       }
       return;
    }
}
