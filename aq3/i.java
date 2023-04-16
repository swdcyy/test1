package aq3.i;
import msd.a;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;

public final class i implements a	// class@0002a4
{
    public final Exception b;

    public void i(Exception p0){
       this.b = p0;
    }
    public final Object invoke(){
       Object[] objArray = new Object[]{this.b.getMessage()};
       return String.format("parse TunaButtonModel error: %s", objArray);
    }
}
