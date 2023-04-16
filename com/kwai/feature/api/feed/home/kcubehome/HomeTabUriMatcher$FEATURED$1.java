package com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher$FEATURED$1;
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

public final class HomeTabUriMatcher$FEATURED$1 extends Lambda implements l	// class@000ef8
{
    public static final HomeTabUriMatcher$FEATURED$1 INSTANCE;

    static {
       HomeTabUriMatcher$FEATURED$1.INSTANCE = new HomeTabUriMatcher$FEATURED$1();
    }
    public void HomeTabUriMatcher$FEATURED$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeTabUriMatcher$FEATURED$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$receiver");
       boolean b = (a.g("kwai", p0.getScheme()) && a.g("featured", p0.getHost()))? true: false;
       return b;
    }
}
