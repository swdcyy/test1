package com.tachikoma.core.router.TKRouter;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import aq8.f;
import com.tachikoma.core.bridge.c;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import java.util.HashMap;
import oo8.l;
import java.lang.NullPointerException;

public class TKRouter extends TKBaseNativeModule	// class@000dcd
{

    public void TKRouter(f p0){
       super(p0);
    }
    public void navigateTo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKRouter.class, "1")) {
          return;
       }
       f uof = f.a();
       c jSContext = this.getJSContext();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoidTwoRefs(jSContext, p0, uof, f.class, "3") && (!TextUtils.isEmpty(p0) && jSContext != null)) {
          try{
             uof.a.get(jSContext).a(Uri.parse(p0));
          }catch(java.lang.NullPointerException e5){
             e5.printStackTrace();
          }
       }
    }
}
