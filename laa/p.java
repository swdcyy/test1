package laa.p;
import java.io.FileFilter;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Object;
import java.io.File;
import java.util.Objects;
import java.lang.String;
import l46.a;

public final class p implements FileFilter	// class@002d98
{
    public final DraftFileManager b;

    public void p(DraftFileManager p0){
       this.b = p0;
    }
    public final boolean accept(File p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0.canRead() && (p0.isDirectory() && (!(p0.getName()).startsWith(".corrupt-") && (!(p0.getName()).startsWith(".ignore-") && (!(p0.getName()).endsWith(".trash") && (!(p0.getName()).endsWith("-editing") && !tb.i.b(p0.getName())))))))? true: false;
       return b;
    }
}
