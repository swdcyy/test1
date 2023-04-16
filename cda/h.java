package cda.h;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import com.google.common.collect.HashMultimap;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.g0;

public class h	// class@0004e1
{
    public final String a;
    public final g0 b;

    public void h(String p0,String p1,List p2){
       super();
       HashMultimap hashMultimap = HashMultimap.create();
       this.b = hashMultimap;
       this.a = p0;
       if (!TextUtils.isEmpty(p1) && !q.f(p2)) {
          hashMultimap.putAll(p1, p2);
       }
       return;
    }
    public void h(String p0,g0 p1){
       super();
       HashMultimap hashMultimap = HashMultimap.create();
       this.b = hashMultimap;
       hashMultimap.putAll(p1);
       this.a = p0;
    }
}
