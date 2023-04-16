package com.kwai.live.gzone.accompanyplay.anchor.k$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.live.gzone.accompanyplay.anchor.k;
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
import ag6.a;
import o07.n;

public class k$a implements PopupInterface$f	// class@000b1c
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, k$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.c(p1, 0x7f0d0b6e, p2, true);
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
