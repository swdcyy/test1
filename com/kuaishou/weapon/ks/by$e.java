package com.kuaishou.weapon.ks.by$e;
import java.lang.Object;
import java.lang.ClassLoader;
import java.io.File;
import java.lang.String;
import java.lang.reflect.Field;
import com.kuaishou.weapon.ks.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Iterator;

public final class by$e	// class@0011ff
{

    public void by$e(){
       super();
    }
    public static void a(ClassLoader p0,File p1){
       by$e.b(p0, p1);
    }
    public static void b(ClassLoader p0,File p1){
       String path = p1.getPath();
       Field uField = e.a(p0, "libPath");
       String str = String.valueOf(uField.get(p0));
       str = (!TextUtils.isEmpty(str))? str+":"+path: path;
       uField.set(p0, str);
       uField = e.a(p0, "libraryPathElements");
       List list = uField.get(p0);
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (path.equals(iterator.next())) {
                break ;
             }
          }else {
             list.add(path);
             uField.set(p0, list);
             return;
          }
       }
       return;
    }
}
