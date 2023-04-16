package ekd.i1;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.CharSequence;
import java.util.regex.Pattern;

public class i1 implements FileFilter	// class@000d51
{

    public void i1(){
       super();
    }
    public boolean accept(File p0){
       if (Pattern.matches("cpu[0-9]+", p0.getName())) {
          return true;
       }
       return false;
    }
}
