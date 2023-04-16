package mg.d2;
import java.lang.Runnable;
import f55.g;
import java.lang.Object;
import mg.v;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import android.app.Activity;
import java.lang.String;
import ekd.j0;
import java.util.HashMap;
import java.lang.Integer;

public final class d2 implements Runnable	// class@0025ee
{
    public final g b;

    public void d2(g p0){
       this.b = p0;
    }
    public final void run(){
       d2 tb = this.b;
       GifshowActivity gifshowActiv = v.c.a();
       String str = null;
       Intent intent = (gifshowActiv != null)? gifshowActiv.getIntent(): str;
       if (intent != null) {
          str = j0.f(intent, "photo_task_id");
       }
       HashMap hashMap = new HashMap();
       int i = 1;
       int i1 = (str == null || !str.length())? 1: 0;
       if (i1) {
          hashMap.put("result", Integer.valueOf(-1));
       }else {
          hashMap.put("result", Integer.valueOf(i));
          hashMap.put("taskId", str);
       }
       if (tb != null) {
          tb.onSuccess(hashMap);
       }
       return;
    }
}
