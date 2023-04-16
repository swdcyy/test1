package com.yxcorp.gifshow.homepage.presenter.i$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.homepage.presenter.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import jo5.a;
import ko5.b;
import com.kwai.kcube.TabIdentifier;
import com.kwai.component.homepage_interface.log.HomeCommonLogInfo;

public class i$a extends ViewPager$l	// class@0017cb
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.S8(uoa.x.c(p0).c());
       this.b.P8();
       String str = this.b.x.c(p0).a();
       i v = this.b.v;
       if (v != null) {
          v.mCurrentTopTab = str;
       }
       return;
    }
}
