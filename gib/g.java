package gib.g;
import erd.g;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.IMBeautifyResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u4d.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import dc5.c;

public final class g implements g	// class@002af3
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"im_beautify_response", b.e(p0));
          g.a(uEditor);
          c.g("IMBeautyDataStore", "save BeautifyData success "+p0+' ');
       }
       return;
    }
}
