package aq4.k;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import aq4.j;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.library.widget.specific.misc.SpectrumView;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Integer;
import o07.o;

public class k implements PopupInterface$h	// class@0002cc
{
    public final j b;

    public void k(j p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       p0.z().findViewById(R.id.spectrum).a();
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("mood_auto_select_music_bubble_showed", true);
       g.a(uEditor);
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, k.class, "2")) {
          return;
       }
       p0.z().findViewById(R.id.spectrum).b();
       return;
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
