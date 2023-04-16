package com.yxcorp.gifshow.camera.record.music.d$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.camera.record.music.d;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bn8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import o07.o;

public class d$a implements PopupInterface$h	// class@000e70
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("magic_auto_apply_music_bubble_shown", true);
       g.a(uEditor);
       return;
    }
    public void H(c p0,int p1){
       p0.z = null;
    }
    public void J(c p0){
       p0.z = null;
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
