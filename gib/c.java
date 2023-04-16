package gib.c;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.IMBeautifyResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dc5.c;
import java.lang.System;
import java.lang.StringBuilder;
import fg6.a;
import qkd.c;
import gib.c$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;
import java.util.Objects;
import java.util.Iterator;
import h16.g;
import java.lang.Integer;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.util.ArrayList;
import gib.c$b;
import u4d.a;
import km8.b;
import android.content.SharedPreferences;

public final class c	// class@002aef
{
    public static IMBeautifyResponse a;
    public static IMBeautifyResponse b;
    public static final c c;

    static {
       c.c = new c();
    }
    public void c(){
       super();
    }
    public static final IMBeautifyResponse a(){
       IMBeautifyResponse iMBeautifyRe1;
       c uoc = c.class;
       c obj = PatchProxy.apply(null, null, uoc, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "IMBeautyDataStore";
       if (c.a != null) {
          c.g(str, "get beautify data from memory cache");
          return c.a;
       }else {
          c.g(str, "getBeautifyData - 1 ");
          obj = c.c;
          IMBeautifyResponse iMBeautifyRe = obj.c();
          long l = System.currentTimeMillis() - System.currentTimeMillis();
          if (iMBeautifyRe != null) {
             c.a = iMBeautifyRe;
             c.g(str, "get beautify data from server cache cost "+l);
             return c.a;
          }else {
             try{
                long l1 = System.currentTimeMillis();
                c.g(str, "getBeautifyData - 2 ");
                iMBeautifyRe1 = a.a.i(c.m("im_beauty"), new c$a().getType());
                if (iMBeautifyRe1 != null) {
                   iMBeautifyRe1.setBeautifyItemInfoList(obj.b());
                }
                c.g(str, "get beautify data from default file cost "+(System.currentTimeMillis() - l1));
             }catch(java.lang.Exception e0){
                c.c(str, "parse default im json failed");
                iMBeautifyRe1 = iMBeautifyRe;
             }catch(java.lang.Exception e0){
                int i = iMBeautifyRe1;
                goto label_0091 ;
             }
             if (iMBeautifyRe1 != null) {
                obj = c.c;
                List beautifyItem = iMBeautifyRe1.getBeautifyItemInfoList();
                List beautifyGrou = iMBeautifyRe1.getBeautifyGroupInfoList();
                Objects.requireNonNull(obj);
                if (!PatchProxy.applyVoidTwoRefs(beautifyItem, beautifyGrou, obj, e0, "4")) {
                   Iterator iterator = beautifyGrou.iterator();
                   while (iterator.hasNext()) {
                      g og = iterator.next();
                      Iterator iterator1 = og.mItemIds.iterator();
                   label_00c5 :
                      if (iterator1.hasNext()) {
                         Integer integer = iterator1.next();
                         Iterator iterator2 = beautifyItem.iterator();
                         while (true) {
                            if (iterator2.hasNext()) {
                               BeautyFilterItem uBeautyFilte = iterator2.next();
                               int itemId = uBeautyFilte.getItemId();
                               if (integer != null && itemId == integer.intValue()) {
                                  uBeautyFilte.mBeautifyGroupInfo = og;
                                  goto label_00c5 ;
                               }
                            }else {
                               goto label_00c5 ;
                            }
                         }
                      }else {
                         continue ;
                      }
                   }
                }
             }
             c.a = iMBeautifyRe1;
             return iMBeautifyRe1;
          }
       }
    }
    public final List b(){
       ArrayList obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new ArrayList();
          List list = a.a.i(c.m("im_beauty_parts"), new c$b().getType());
          if (list != null) {
             List list1 = list;
          }
       }catch(java.lang.Exception e1){
          c.g("IMBeautyDataStore", "parse default beautifyItem failed "+e1);
       }
       return obj;
    }
    public final IMBeautifyResponse c(){
       Object[] objArray = null;
       IMBeautifyResponse obj = PatchProxy.apply(objArray, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IMBeautifyResponse.class;
       String str = a.a.getString(b.d("user")+"im_beautify_response", "null");
       Object[] objArray1 = (str == null || str == "")? objArray: b.a(str, obj);
       if (objArray1 != null) {
          objArray = objArray1;
       }
       return objArray;
    }
    public final void d(IMBeautifyResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       if (c.a == null && p0 != null) {
          c.g("IMBeautyDataStore", "syncBeautifyData load data setDataToCache");
          c.a = p0;
       }
       return;
    }
}
