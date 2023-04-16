package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$j;
import p4b.a$a$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import p4b.a;
import java.lang.Object;
import a4b.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s5b.b;
import q87.c;
import a4b.b;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$b;
import k4b.a;
import android.app.Dialog;

public final class MagicEditionHandler$j implements a$a$b	// class@001bc3
{
    public final MagicEditionHandler a;
    public final int b;
    public final a c;

    public void MagicEditionHandler$j(MagicEditionHandler p0,int p1,a p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(a p0){
       MagicEditionHandler b;
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler$j.class, "1")) {
          return;
       }
       a.p(p0, "dialogModel");
       Object[] objArray = new Object[0];
       b.D().w("MagicEditionController", "onComplete", objArray);
       b.d.a().put(Integer.valueOf(this.b), p0);
       String str = a.a.q(p0);
       this.a.k(p0);
       MagicEditionHandler$j ta = this.a;
       b = ta.b;
       if (b != null) {
          b.mMagicUserInfo = str;
       }
       MagicEditionHandler$b uob = ta.b();
       if (uob != null) {
          uob.q(str);
       }
       this.c.dismiss();
       this.a.k(p0);
       return;
    }
}
