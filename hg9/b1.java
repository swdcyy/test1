package hg9.b1;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.p;
import java.lang.Object;
import java.io.File;
import androidx.fragment.app.Fragment;
import j8c.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.camera.record.photo.p$d;

public final class b1 implements g	// class@00264e
{
    public final p b;

    public void b1(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b1 tb = this.b;
       int i = 0;
       if (tb.d.isAdded()) {
          Object[] objArray = new Object[i];
          a.D().w(tb.a, "onGetANewPicture", objArray);
          tb.e.i1(p0);
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(tb.a, "fragment is detached", objArray1);
       }
       return;
    }
}
