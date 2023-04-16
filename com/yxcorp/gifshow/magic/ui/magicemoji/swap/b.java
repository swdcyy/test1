package com.yxcorp.gifshow.magic.ui.magicemoji.swap.b;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickFaceImageListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x79.e;
import android.app.Activity;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.c$a;
import i5b.f;
import n3d.a;

public final class b implements FaceMagicController$FaceMagicPickFaceImageListener	// class@001c36
{
    public final c a;

    public void b(c p0){
       this.a = p0;
    }
    public final void onRequestPickFaceImage(){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, c.class, "5")) {
       }else {
          e.f().l(ta.d.getActivity(), 145, new f(ta));
       }
       return;
    }
}
