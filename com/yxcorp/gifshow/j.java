package com.yxcorp.gifshow.j;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.events.realaction.RealAction;
import uv8.i0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import uv8.i0$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import zy5.k;
import com.kwai.feature.component.photofeatures.filter.info.BrowsePage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import zy5.d;
import f3b.o;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zy5.l;
import zy5.f;

public final class j implements g	// class@001e3d
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, null, i0.class, "3")) {
       }else {
          Iterator iterator = i0.c.iterator();
          BrowsePage uBrowsePage = 1;
          while (iterator.hasNext()) {
             i0$a uoa = iterator.next();
             Objects.requireNonNull(uoa);
             Object obj = PatchProxy.applyOneRefs(p0, uoa, i0$a.class, "1");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(uoa.a == p0.mActionType && uoa.b.contains(p0.mPage)){
                uoa = uoa.c;
                if (uoa == null || uoa.contains(p0.mSource)) {
                label_0058 :
                   b = uBrowsePage;
                }
             }
             uBrowsePage = null;
             goto label_0058 ;
             if (b != null) {
                b.a(-275376108).f(new BrowsePage(p0.mPage, p0.mSource), new QPhoto(p0.mFeed));
             }
          }
          if (uBrowsePage == p0.mActionType) {
             boolean d = i0.d;
             String str = (d)? "HOT": o.i(uBrowsePage);
             if (!TextUtils.n(str, p0.mPage)) {
                String str1 = (d)? "FIND": o.i(3);
                if (!TextUtils.n(str1, p0.mPage)) {
                label_00bd :
                   if (uBrowsePage == p0.mActionType && TextUtils.n("TV_STATION", p0.mPage)) {
                      b.a(-1702094407).f(new BrowsePage(p0.mPage, p0.mSource), new QPhoto(p0.mFeed));
                   }
                }
             }
             b.a(0x17e660dd).f(new BrowsePage(p0.mPage, p0.mSource), new QPhoto(p0.mFeed));
             goto label_00bd ;
          }else {
             goto label_00bd ;
          }
       }
       return;
    }
}
