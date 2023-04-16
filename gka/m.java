package gka.m;
import erd.g;
import com.yxcorp.gifshow.fragment.ObservableBox$d;
import java.lang.Object;
import com.yxcorp.gifshow.fragment.ObservableBox$CancelException;

public final class m implements g	// class@002b12
{
    public final ObservableBox$d b;

    public void m(ObservableBox$d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       if (this.b.a == null) {
          return;
       }
       throw new ObservableBox$CancelException();
    }
}
