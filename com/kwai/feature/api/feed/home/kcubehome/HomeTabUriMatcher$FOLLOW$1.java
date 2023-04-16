package com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher$FOLLOW$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.net.Uri;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher;

public final class HomeTabUriMatcher$FOLLOW$1 extends Lambda implements l	// class@000ef9
{
    public static final HomeTabUriMatcher$FOLLOW$1 INSTANCE;

    static {
       HomeTabUriMatcher$FOLLOW$1.INSTANCE = new HomeTabUriMatcher$FOLLOW$1();
    }
    public void HomeTabUriMatcher$FOLLOW$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeTabUriMatcher$FOLLOW$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$receiver");
       boolean b = (a.g("kwai", p0.getScheme()) && (a.g("home", p0.getHost()) && HomeTabUriMatcher.d.a(p0, "following")))? true: false;
       return b;
    }
}
