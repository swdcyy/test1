package com.yxcorp.gifshow.prettify.beauty.m$a;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.prettify.beauty.m;
import java.lang.Object;
import com.yxcorp.gifshow.bubble.a;
import com.kwai.library.widget.popup.common.c;
import ra9.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.prettify.beauty.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class m$a implements PostBubbleManager$c	// class@00110f
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public void a(a p0,c p1,int p2){
       i.a(this, p0, p1, p2);
    }
    public void b(a p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m$a.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("has_show_medical_beautify_bubble", true);
       g.a(uEditor);
       m v = this.a.v;
       if (!PatchProxy.applyVoidOneRefs(v, null, h.class, "33")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COSMETIC_MEDICINE_BEAUTY_USE_BUBBLE";
          u1.C0("", v, 7, uElementPack, null);
       }
       return;
    }
    public void c(boolean p0){
       i.b(this, p0);
    }
}
