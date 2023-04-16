package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import o07.n;

public final class TextPanelDialogFragment$e implements PopupInterface$f	// class@0014ba
{
    public static final TextPanelDialogFragment$e b;

    static {
       TextPanelDialogFragment$e.b = new TextPanelDialogFragment$e();
    }
    public void TextPanelDialogFragment$e(){
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, TextPanelDialogFragment$e.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "inflater");
       a.p(p2, "container");
       return a.g(p1, 0x7f0d0146, p2, false);
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
