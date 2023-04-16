package in8.o$m;
import in8.o$a0;
import in8.o$k;
import java.lang.Double;

public final class o$m extends o$a0	// class@0026d5
{

    public void o$m(){
       super(null);
    }
    public boolean b(Double p0,Double p1){
       boolean b = false;
       if (p0 == null || (p1 != null && p0.doubleValue() - p1.doubleValue() < 0)) {
          b = true;
       }
    label_0013 :
       return b;
    }
}
