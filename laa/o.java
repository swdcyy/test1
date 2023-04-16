package laa.o;
import java.io.FileFilter;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Object;
import java.io.File;
import java.util.Objects;
import java.lang.String;
import l46.a;

public final class o implements FileFilter	// class@002d97
{
    public final DraftFileManager b;

    public void o(DraftFileManager p0){
       this.b = p0;
    }
    public final boolean accept(File p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0.canRead() && (p0.isDirectory() && tb.i.g(p0.getName())))? true: false;
       return b;
    }
}
