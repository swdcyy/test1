package laa.i;
import ekd.q$a;
import java.io.File;
import java.lang.Object;
import java.lang.String;

public final class i implements q$a	// class@002d89
{
    public final File a;

    public void i(File p0){
       this.a = p0;
    }
    public final Object apply(Object p0){
       return new File(this.a, p0).getAbsolutePath();
    }
}
