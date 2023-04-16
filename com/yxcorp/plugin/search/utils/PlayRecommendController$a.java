package com.yxcorp.plugin.search.utils.PlayRecommendController$a;
import java.lang.Runnable;
import com.yxcorp.plugin.search.utils.PlayRecommendController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import z6d.l;
import z6d.k;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import nfd.y;
import java.lang.reflect.Type;
import el.a;
import x6d.a;
import android.content.SharedPreferences;
import km8.b;
import java.util.Map;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Integer;
import com.search.common.entity.SearchBaseItem;
import brd.t;
import cjd.e;
import erd.o;
import nfd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class PlayRecommendController$a implements Runnable	// class@000781
{
    public SearchItem b;
    public final PlayRecommendController c;

    public void PlayRecommendController$a(PlayRecommendController p0){
       this.c = p0;
       super();
    }
    public void run(){
       int i;
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlayRecommendController$a.class, "1")) {
          return;
       }
       PlayRecommendController$a tb = this.b;
       if (tb != null && !TextUtils.x(tb.getId())) {
          if (this.c.g(this.b)) {
             this.c.a(this.b);
          }else if(PatchProxy.applyVoid(objArray, this, PlayRecommendController$a.class, "2")){
             SearchKeywordContext mMajorKeywor = this.b.mKeywordContext.mMajorKeyword;
             l ol = k.b();
             String id = this.b.getId();
             int typeValue = this.b.mItemType.getTypeValue();
             tb = this.c;
             Objects.requireNonNull(tb);
             String obj = PatchProxy.apply(objArray, tb, PlayRecommendController.class, "25");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                Type type = new y(tb).getType();
                obj = a.a.getString("showFeedbackCountMap", "null");
                if (obj != null && obj != "") {
                   objArray = b.a(obj, type);
                }
                String str = DateUtils.y(System.currentTimeMillis());
                if (objArray == null || objArray.get(str) == null) {
                   i1 = 0;
                label_00aa :
                   ol.r(mMajorKeywor, id, typeValue, i1, false, this.b.mSessionId, 2).map(new e()).subscribe(new z(this), Functions.d());
                }else {
                   i = objArray.get(str).intValue();
                }
             }
             i1 = i;
             goto label_00aa ;
          }
       }
       return;
    }
}
