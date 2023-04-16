package hg9.s0;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.camera.record.photo.p;
import java.io.File;
import java.lang.Object;
import java.util.Objects;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import android.content.Context;
import lnc.a1;
import com.kuaishou.gifshow.files.a;
import androidx.fragment.app.Fragment;
import qkd.a;

public final class s0 implements Callable	// class@002675
{
    public final p b;
    public final File c;

    public void s0(p p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       s0 tb = this.b;
       s0 tc = this.c;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w(tb.a, "saveFileToCameraDirectory "+tc.getAbsolutePath(), objArray);
       File uFile = a.g(a1.c(), tc);
       a.b(tb.d.getContext().getApplicationContext(), uFile);
       return uFile;
    }
}
