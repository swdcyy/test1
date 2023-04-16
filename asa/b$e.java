package asa.b$e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import asa.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import android.view.ViewGroup;
import tra.b;
import java.lang.StringBuilder;
import wra.b;
import q87.c;
import lr6.a;
import android.view.ViewTreeObserver;

public final class b$e implements ViewTreeObserver$OnPreDrawListener	// class@0002e3
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, b$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (b.P8(this.b).getWidth() <= 0 || b.P8(this.b).getHeight() <= 0) {
          i = true;
       }else {
          Object[] objArray = new Object[i];
          b.C().s("KCubeBlockActionBarPresenter", "float actionBar scrollTo: "+b.S8(this.b).e(), objArray);
          b.R8(this.b).H(b.S8(this.b).e());
          b.P8(this.b).getViewTreeObserver().removeOnPreDrawListener(this);
       }
       return i;
    }
}
