package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2$a;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import ezb.k;
import java.util.Iterator;
import com.kuaishou.android.model.mix.PostShowStartUpInfo;
import java.lang.Integer;

public final class RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2 extends Lambda implements a	// class@00105a
{
    public static final RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2 INSTANCE;

    static {
       RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2.INSTANCE = new RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2();
    }
    public void RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.a(new RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2$a().getType());
       if (obj != null) {
          objArray = new HashMap();
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             PostShowStartUpInfo postShowStar = iterator.next();
             objArray.put(Integer.valueOf(postShowStar.mType), postShowStar);
          }
       }
       return objArray;
    }
}
