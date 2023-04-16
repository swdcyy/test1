package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$k;
import q96.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import erd.g;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import q96.c;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;

public final class MagicEditionHandler$k implements d	// class@001bc4
{
    public final MagicEditionHandler a;
    public final g b;

    public void MagicEditionHandler$k(MagicEditionHandler p0,g p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       MagicEditionHandler$k ok = MagicEditionHandler$k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ok, "1")) {
          return;
       }
       a.p(p1, "cityInfo");
       c.d(this, p0, p1);
       Object[] objArray = new Object[0];
       b.D().w("MagicEditionController", "onLocateSuccess\(\) called with: tencentLocation = ["+p1+']', objArray);
       this.b.accept(Boolean.TRUE);
       return;
    }
    public void onError(int p0,String p1){
       MagicEditionHandler$k ok = MagicEditionHandler$k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ok, "2")) {
          return;
       }
       c.a(this, p0, p1);
       if (!this.a.e()) {
          this.b.accept(Boolean.FALSE);
          if (p0 == 0x2721) {
             p0.g = true;
          }
          return;
       }else {
          Object[] objArray = new Object[0];
          b.D().w("MagicEditionController", "onLocateFailed\(\) called with: errorCode = ["+p0+"], reason = ["+p1+']', objArray);
          this.b.accept(Boolean.FALSE);
          return;
       }
    }
    public void onFinish(){
       c.b(this);
    }
    public void onStart(){
       c.c(this);
    }
}
