package com.yxcorp.gifshow.i;
import erd.g;
import java.lang.Object;
import jsa.e;
import uv8.i0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import zy5.k;
import com.kwai.feature.component.photofeatures.filter.info.BrowsePage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import zy5.d;

public final class i implements g	// class@001e37
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i0.class, "2")) {
       }else {
          e a = p0.a;
          if (a == null) {
             a = "";
          }
          b.a(-275376108).f(new BrowsePage(a, p0.c), new QPhoto(p0.a()));
       }
       return;
    }
}
