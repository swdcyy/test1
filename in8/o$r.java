package in8.o$r;
import in8.o$a0;
import in8.o$k;
import java.lang.Double;

public final class o$r extends o$a0	// class@0026da
{

    public void o$r(){
       super(null);
    }
    public boolean b(Double p0,Double p1){
       boolean b = true;
       if (p0 == null || p1 == null) {
          if (p0 != p1) {
             b = false;
          }
          return b;
       }else if(p0.doubleValue() - p1.doubleValue()){
          b = false;
       }
       return b;
    }
}