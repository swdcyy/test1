package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$f;
import q96.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import android.app.Activity;
import a4b.a;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import q96.c;

public final class MagicEditionHandler$f implements d	// class@001bbf
{
    public final MagicEditionHandler a;
    public final Activity b;
    public final a c;

    public void MagicEditionHandler$f(MagicEditionHandler p0,Activity p1,a p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       MagicEditionHandler$f uof = MagicEditionHandler$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uof, "1")) {
          return;
       }
       a.p(p1, "cityInfo");
       this.a.n(this.b, this.c);
       return;
    }
    public void onError(int p0,String p1){
       c.a(this, p0, p1);
    }
    public void onFinish(){
       c.b(this);
    }
    public void onStart(){
       c.c(this);
    }
}
