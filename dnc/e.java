package dnc.e;
import erd.g;
import java.util.Map;
import java.lang.Object;
import qq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class e implements g	// class@002299
{
    public final Map b;

    public void e(Map p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0.putAll(this.b);
       Object[] objArray = new Object[0];
       a.D().w("CloudVideoUploader", "uploadVideo: needSharePageParams num="+p0.size(), objArray);
    }
}
