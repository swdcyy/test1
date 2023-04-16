package bmd.b$d;
import androidx.lifecycle.Observer;
import bmd.b;
import java.lang.Object;
import mmd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import voc.n;
import tvc.e;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import yld.l;
import kotlin.jvm.internal.a;
import xld.a;
import faa.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import w46.b;

public final class b$d implements Observer	// class@00027a
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       try{
          if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
          }else {
             b uob = this.b.T().u0();
             Iterator iterator = this.b.v.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                if (uoa instanceof l) {
                   a.o(p0, "newState");
                   uoa.x(p0, uob);
                }
             }
          }
       }catch(java.lang.Exception e5){
          Object[] objArray = new Object[0];
          a.D().t("StickerEditorV2", "stateObserver error :"+e5.getMessage(), objArray);
       }
       return;
    }
}
