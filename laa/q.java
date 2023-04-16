package laa.q;
import java.io.FileFilter;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Object;
import java.io.File;
import java.util.Objects;
import java.lang.String;
import l46.a;

public final class q implements FileFilter	// class@002d99
{
    public final DraftFileManager b;
    public final long c;

    public void q(DraftFileManager p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean accept(File p0){
       q tb = this.b;
       q tc = this.c;
       Objects.requireNonNull(tb);
       boolean b = (p0.canRead() && (p0.isDirectory() && (!(p0.getName()).startsWith(".corrupt-") && (!(p0.getName()).startsWith(".ignore-") && (!(p0.getName()).endsWith(".trash") && (!(p0.getName()).endsWith("-editing") && (!tb.i.b(p0.getName()) && p0.lastModified() - tc <= 0)))))))? true: false;
       return b;
    }
}
