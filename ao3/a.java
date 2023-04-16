package ao3.a;
import erd.g;
import ao3.c;
import java.lang.Object;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;

public final class a implements g	// class@000283
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.n.setValue(Boolean.valueOf((p0.booleanValue() ^ 0x01)));
    }
}
