package in8.o$o;
import in8.o$a0;
import in8.o$k;
import java.lang.Double;

public final class o$o extends o$a0	// class@0026d7
{

    public void o$o(){
       super(null);
    }
    public boolean b(Double p0,Double p1){
       boolean b = false;
       if (p0 == null || (p1 != null && p0.doubleValue() - p1.doubleValue() > 0)) {
          b = true;
       }
    label_0013 :
       return b;
    }
}
