package gib.j$b;
import java.lang.Runnable;
import gib.j;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import u4d.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import dc5.c;

public final class j$b implements Runnable	// class@002af7
{
    public final j b;
    public final List c;

    public void j$b(j p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, j$b.class, "1")) {
          return;
       }
       JsonArray jsonArray = new JsonArray();
       Iterator iterator = new ArrayList(this.c).iterator();
       while (true) {
          if (iterator.hasNext()) {
             JsonObject jsonObject = this.b.u(iterator.next());
             if (jsonObject != null) {
                jsonArray.G(jsonObject);
             }else {
                break ;
             }
          }else {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString("im_beautify_configs_v2", jsonArray.toString());
             g.a(uEditor);
             c.g("IMBeautyRepoV2", "saveConfigs finish");
             return;
          }
       }
       return;
    }
}
