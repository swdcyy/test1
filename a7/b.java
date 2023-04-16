package a7.b;
import java.lang.String;
import g6.a;
import java.lang.Object;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.StringBuilder;
import x6.b;
import org.json.JSONObject;

public final class b	// class@0000fc
{
    public File a;
    public a b;

    public void b(String p0,a p1){
       super();
       this.a = null;
       this.b = null;
       this.a = new File(p0);
       this.b = p1;
    }
    public static void a(b p0){
       _monitor_enter(p0);
       b a = p0.a;
       if (a == null || (!a.exists() || (p0.a.isDirectory() && p0.a.list().length))) {
          ArrayList uArrayList = new ArrayList();
          String[] stringArray = p0.a.list();
          int len = stringArray.length;
          int i = 0;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             uArrayList.add(stringArray[i1]);
          }
          Collections.sort(uArrayList);
          int i2 = uArrayList.size() - 1;
          String str = uArrayList.get(i2);
          len = uArrayList.size();
          if (str.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime())+".log")) {
             i1 = 2;
             if (uArrayList.size() >= i1) {
                i2 = uArrayList.size() - i1;
                str = uArrayList.get(i2);
                len = len - 1;
             }
          }
          str = b.a(p0.a.getAbsolutePath(), str);
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "id");
             jSONObject.put("error", str);
             str = jSONObject.toString();
          }catch(java.lang.Exception e0){
             str = "";
          }
          if (!p0.b.logCollect(str)) {
             len = len - 1;
          }
          while (i < len) {
             new File(p0.a, e0.get(i)).delete();
             i = i + 1;
          }
       }
    label_0005 :
       _monitor_exit(p0);
       return;
    }
}
