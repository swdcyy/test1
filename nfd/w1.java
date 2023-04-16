package nfd.w1;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.like.resource.SearchLikeResourceConfig;
import java.lang.reflect.Type;
import m0b.a;
import java.util.Collection;
import ekd.q;
import java.util.HashMap;
import java.util.List;
import com.yxcorp.gifshow.like.resource.SearchLikeResourceConfig$a;
import java.lang.Long;
import x6d.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class w1 implements Runnable	// class@001e1c
{

    public void w1(){
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, w1.class, "1")) {
          return;
       }
       SearchLikeResourceConfig searchLikeRe = a.a(SearchLikeResourceConfig.class);
       if (searchLikeRe != null && !q.f(searchLikeRe.mPkgLists)) {
          HashMap hashMap = new HashMap();
          for (int i = 0; i < searchLikeRe.mPkgLists.size(); i = i + 1) {
             SearchLikeResourceConfig$a uoa = searchLikeRe.mPkgLists.get(i);
             hashMap.put(uoa.mUniqId, Long.valueOf(uoa.mInvalidTime));
          }
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("lastLikeResource", b.e(hashMap));
          g.a(uEditor);
       }
       return;
    }
}
