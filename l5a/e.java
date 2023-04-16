package l5a.e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import l5a.d;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import l5a.a;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.System;
import o07.o;

public class e implements PopupInterface$h	// class@002d51
{
    public final d b;

    public void e(d p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, str)) {
          return;
       }
       if (this.b.getContext() != null && !PatchProxy.applyVoid(null, null, a.class, str)) {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putBoolean(b.d("user")+"shareTaskDialogHasShowed", true);
          g.a(uEditor);
          c.H(System.currentTimeMillis());
       }
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
