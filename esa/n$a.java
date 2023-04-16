package esa.n$a;
import hka.g;
import esa.n;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import esa.a;
import io.reactivex.subjects.PublishSubject;

public class n$a implements g	// class@0027ce
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,Configuration p1){
       if (PatchProxy.isSupport(n$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, n$a.class, "1")) {
          return;
       }
       this.a.h.c.onNext(Boolean.valueOf(p0));
       return;
    }
}
