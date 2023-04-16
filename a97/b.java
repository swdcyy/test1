package a97.b;
import java.util.zip.ZipOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Integer;
import java.lang.StringBuilder;

public class b extends ZipOutputStream	// class@00007f
{
    public Map b;

    public void b(OutputStream p0){
       super(p0);
       this.b = new HashMap();
    }
    public void putNextEntry(ZipEntry p0){
       ZipEntry zipEntry;
       Integer integer1;
       String name = p0.getName();
       Integer integer = this.b.get(name);
       if (integer != null && integer.intValue() > 0) {
          zipEntry = new ZipEntry((p0.getName()).replaceFirst("\\.", "\("+integer+"\)."));
          integer1 = Integer.valueOf((integer.intValue() + 1));
       }else {
          zipEntry = p0;
          integer1 = Integer.valueOf(1);
       }
       this.b.put(name, integer1);
       super.putNextEntry(zipEntry);
       return;
    }
}
