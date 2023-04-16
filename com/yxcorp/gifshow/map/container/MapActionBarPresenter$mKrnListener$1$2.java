package com.yxcorp.gifshow.map.container.MapActionBarPresenter$mKrnListener$1$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$mKrnListener$1;
import java.util.Map;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter;

public final class MapActionBarPresenter$mKrnListener$1$2 extends Lambda implements a	// class@001c6f
{
    public final Map $value;
    public final MapActionBarPresenter$mKrnListener$1 this$0;

    public void MapActionBarPresenter$mKrnListener$1$2(MapActionBarPresenter$mKrnListener$1 p0,Map p1){
       this.this$0 = p0;
       this.$value = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MapActionBarPresenter$mKrnListener$1$2.class, "1")) {
          return;
       }
       MapActionBarPresenter$mKrnListener$1$2 t$value = this.$value;
       Object[] objArray1 = (t$value != null)? t$value.get("openSearch"): objArray;
       if (objArray1 instanceof String) {
          objArray = objArray1;
       }
       if (objArray != null && a.g(objArray, "1")) {
          this.this$0.b.Y8();
       }
       return;
    }
}
