package ae3.j;
import yh3.a;
import com.yxcorp.gifshow.entity.QPhoto;
import z1.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;

public class j extends a	// class@0000a5
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final a c;

    public void j(QPhoto p0,a p1){
       super();
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.a = mutableLiveD;
       this.b = new MutableLiveData(Boolean.FALSE);
       mutableLiveD.setValue(p0);
       this.c = p1;
    }
}
