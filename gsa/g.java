package gsa.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import uv8.r0;
import java.lang.Boolean;
import tra.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import tra.b;
import q87.c;
import o07.o;

public final class g implements PopupInterface$h	// class@002bec
{
    public final BottomFeatureGuideInitModule b;

    public void g(BottomFeatureGuideInitModule p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       g tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, BottomFeatureGuideInitModule.class, "5")) {
          b uob = 1;
          r0 or0 = r0.class;
          if (!PatchProxy.isSupport(or0) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, objArray, or0, "8")) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("HasShownFeatureBottomDialog", uob);
             g.a(uEditor);
          }
       }
       Object[] objArray1 = new Object[0];
       b.C().s("BottomFeatureGuideInitModule", "dialog show...", objArray1);
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
