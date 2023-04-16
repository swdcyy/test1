package pm7.j;
import java.io.FileFilter;
import java.util.List;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.util.Iterator;
import java.lang.CharSequence;
import com.kwai.robust2.patchmanager.b;

public final class j implements FileFilter	// class@0021dc
{
    public final List b;

    public void j(List p0){
       this.b = p0;
    }
    public final boolean accept(File p0){
       int i;
       String path = p0.getPath();
       Iterator iterator = this.b.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (path.contains(iterator.next())) {
                i = 1;
                break ;
             }
          }else {
             i = b.q(p0);
             break ;
          }
       }
       return (i ^ 1);
    }
}
