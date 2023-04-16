package androidx.appcompat.widget.a$d;
import androidx.appcompat.widget.a$c;
import java.lang.Object;
import java.util.HashMap;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import androidx.appcompat.widget.a$b;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import java.lang.String;
import androidx.appcompat.widget.a$e;
import java.util.Collections;

public final class a$d implements a$c	// class@000639
{
    public final Map a;

    public void a$d(){
       super();
       this.a = new HashMap();
    }
    public void a(Intent p0,List p1,List p2){
       a$d ta = this.a;
       ta.clear();
       int i = p1.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          a$b uob = p1.get(i1);
          uob.c = 0;
          ResolveInfo activityInfo = uob.b.activityInfo;
          ta.put(new ComponentName(activityInfo.packageName, activityInfo.name), uob);
       }
       i = p2.size() - 1;
       float f = 0x3f800000;
       while (i >= 0) {
          a$e uoe = p2.get(i);
          a$b uob1 = ta.get(uoe.a);
          if (uob1 != null) {
             float f1 = uoe.c * f;
             float f2 = uob1.c + f1;
             uob1.c = f2;
             f = f * 0x3f733333;
          }
          i = i - 1;
       }
       Collections.sort(p1);
       return;
    }
}
