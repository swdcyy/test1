package lxd.c;
import org.tensorflow.lite.DataType;
import java.lang.Object;
import kxd.c;
import lxd.c$a;

public class c	// class@001cf5
{
    public final c$a a;

    public void c(){
       super(DataType.UINT8);
    }
    public void c(DataType p0){
       super();
       boolean b = (p0 == DataType.UINT8 || p0 == DataType.FLOAT32)? true: false;
       c.a(b, "Illegal data type for TensorImage: Only FLOAT32 and UINT8 are accepted");
       this.a = new c$a(p0);
       return;
    }
}
