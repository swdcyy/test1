package com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher;
import com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher$FEATURED$1;
import msd.l;
import on5.p;
import com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher$FOLLOW$1;
import com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher$LOCAL$1;
import java.lang.Object;
import android.net.Uri;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher$a;

public final class HomeTabUriMatcher	// class@000efc
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final HomeTabUriMatcher d;

    static {
       HomeTabUriMatcher homeTabUriMa = new HomeTabUriMatcher();
       HomeTabUriMatcher.d = homeTabUriMa;
       HomeTabUriMatcher.a = homeTabUriMa.b(HomeTabUriMatcher$FEATURED$1.INSTANCE);
       HomeTabUriMatcher.b = homeTabUriMa.b(HomeTabUriMatcher$FOLLOW$1.INSTANCE);
       HomeTabUriMatcher.c = homeTabUriMa.b(HomeTabUriMatcher$LOCAL$1.INSTANCE);
    }
    public void HomeTabUriMatcher(){
       super();
    }
    public final boolean a(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HomeTabUriMatcher.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       List pathSegments = p0.getPathSegments();
       int i = 0;
       if (pathSegments.size() > 0) {
          i = a.g(p1, pathSegments.get(i));
       }
       return i;
    }
    public final p b(l p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeTabUriMatcher.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HomeTabUriMatcher$a(p0);
    }
}
