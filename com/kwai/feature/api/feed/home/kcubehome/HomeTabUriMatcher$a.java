package com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher$a;
import on5.p;
import msd.l;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class HomeTabUriMatcher$a implements p	// class@000efb
{
    public final l a;

    public void HomeTabUriMatcher$a(l p0){
       this.a = p0;
       super();
    }
    public boolean a(Uri p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeTabUriMatcher$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          Boolean uBoolean = this.a.invoke(p0);
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          label_0025 :
             return b;
          }
       }
       b = false;
       goto label_0025 ;
    }
}
