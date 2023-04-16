package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import huc.o1;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;

public final class TextPanelDialogFragment$c implements PopupInterface$h	// class@0014b8
{
    public final TextPanelDialogFragment b;

    public void TextPanelDialogFragment$c(TextPanelDialogFragment p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o1 a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TextPanelDialogFragment$c.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("recommend_text_bubble_shown", true);
       g.a(uEditor);
       a = o1.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(null, a, o1.class, "2")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 29;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TRY_INSPIRE_BUBBLE";
          u1.y0(urlPackage, 7, uElementPack, null);
       }
       a.B = true;
       PatchProxy.onMethodExit(TextPanelDialogFragment$c.class, "1");
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport2(TextPanelDialogFragment$c.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, TextPanelDialogFragment$c.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       TextPanelDialogFragment$c tb = this.b;
       tb.B = false;
       tb.A = null;
       PatchProxy.onMethodExit(TextPanelDialogFragment$c.class, "2");
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
