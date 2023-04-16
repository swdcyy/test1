package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$e;
import q96.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import q96.c;

public final class MagicEditionHandler$e implements d	// class@001bbe
{
    public final MagicEditionHandler a;

    public void MagicEditionHandler$e(MagicEditionHandler p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       if (PatchProxy.isSupport(MagicEditionHandler$e.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, MagicEditionHandler$e.class, "1")) {
          return;
       }
       a.p(p1, "locationCityInfo");
       this.a.f();
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
