package j4a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class a	// class@0028fa
{
    public QPhoto a;
    public PlcEntryStyleInfo b;
    public int c;

    public void a(QPhoto p0){
       super();
       this.c = 0;
       this.a = p0;
    }
    public PlcEntryStyleInfo a(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          PlcEntryStyleInfo plcEntryStyl = this.a.getPlcEntryStyleInfo();
       }
       return obj;
    }
    public void b(){
    }
    public void c(){
    }
    public void d(){
    }
    public void e(){
    }
    public void f(PlcEntryStyleInfo p0){
       this.b = p0;
    }
    public void g(){
    }
    public void h(){
    }
    public void i(){
    }
    public void j(){
    }
    public void k(){
    }
    public void l(){
    }
    public void m(int p0){
       this.c = p0;
    }
}
