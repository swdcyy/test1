package cf6.c;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import cf6.b;
import ok.x;
import java.lang.Object;
import cf6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class c extends ConfigAutoParseJsonConsumer	// class@0006b2
{

    public void c(){
       super(b.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("RatingEntity", b.e(p0.mRatingEntity));
          g.a(uEditor);
       }
       return;
    }
}
