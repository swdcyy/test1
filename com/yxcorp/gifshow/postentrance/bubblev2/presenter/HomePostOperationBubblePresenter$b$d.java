package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b$d;
import erd.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.postentrance.util.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ezb.k;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Long;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.Integer;
import km8.b;
import rzb.d;
import kotlin.jvm.internal.a;

public final class HomePostOperationBubblePresenter$b$d implements g	// class@00102a
{
    public final Ref$ObjectRef b;

    public void HomePostOperationBubblePresenter$b$d(Ref$ObjectRef p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostOperationBubblePresenter$b$d.class, "1")) {
       }else {
          Object[] objArray = null;
          PublishGuideInfo obj = PatchProxy.apply(objArray, objArray, uod, "27");
          String str = "home_post_bubble_last_failed_time";
          long l = (obj != PatchProxyResult.class)? obj.longValue(): k.a.getLong(str, 0);
          boolean b = DateUtils.J(l);
          if (!b) {
             long l1 = DateUtils.l();
             if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), objArray, uod, "28")) {
                SharedPreferences$Editor uEditor1 = k.a.edit();
                uEditor1.putLong(str, l1);
                g.a(uEditor1);
             }
          }
          Ref$ObjectRef element = this.b.element;
          if (element != null) {
             Map map = d.c();
             if (map == null) {
                map = new LinkedHashMap();
             }
             if (b) {
                map.clear();
             }
             obj = element.mId;
             Integer integer = map.get(obj);
             int i = (integer != null)? integer.intValue(): 0;
             map.put(obj, Integer.valueOf((i + 1)));
             if (!PatchProxy.applyVoidOneRefs(map, objArray, uod, "26")) {
                SharedPreferences$Editor uEditor = k.a.edit();
                uEditor.putString("home_post_bubble_failed_id_map", b.e(map));
                g.a(uEditor);
             }
          }
          a.o(p0, "it");
          d.a.a(p0);
       }
       return;
    }
}
