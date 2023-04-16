package laa.j;
import erd.g;
import java.io.File;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard;
import java.util.List;

public final class j implements g	// class@002d8b
{
    public final File b;
    public final String c;
    public final c d;

    public void j(File p0,String p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       p0 = DraftFileGuard.b;
       p0.a(this.b, this.c, p0.e(this.d));
    }
}
