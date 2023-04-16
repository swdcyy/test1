package com.yxcorp.gifshow.detail.util.DetailSpecialCameraHelper$postShowStartUpInfoMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.util.DetailSpecialCameraHelper$postShowStartUpInfoMap$2$a;
import java.lang.reflect.Type;
import el.a;
import uw9.c;
import android.content.SharedPreferences;
import km8.b;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.android.model.mix.PostShowStartUpInfo;
import java.lang.Integer;

public final class DetailSpecialCameraHelper$postShowStartUpInfoMap$2 extends Lambda implements a	// class@001a26
{
    public static final DetailSpecialCameraHelper$postShowStartUpInfoMap$2 INSTANCE;

    static {
       DetailSpecialCameraHelper$postShowStartUpInfoMap$2.INSTANCE = new DetailSpecialCameraHelper$postShowStartUpInfoMap$2();
    }
    public void DetailSpecialCameraHelper$postShowStartUpInfoMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, DetailSpecialCameraHelper$postShowStartUpInfoMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DetailSpecialCameraHelper$postShowStartUpInfoMap$2$a().getType();
       String str = c.a.getString("posterShowStartConfig", "null");
       Object[] objArray1 = (str == null || str == "")? objArray: b.a(str, obj);
       if (objArray1 != null) {
          objArray = new HashMap();
          Iterator iterator = objArray1.iterator();
          while (iterator.hasNext()) {
             PostShowStartUpInfo postShowStar = iterator.next();
             objArray.put(Integer.valueOf(postShowStar.mType), postShowStar);
          }
       }
       return objArray;
    }
}
