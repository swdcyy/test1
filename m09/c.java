package m09.c;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.util.List;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import m09.b;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Long;
import java.lang.Integer;
import qrd.l1;
import com.google.gson.JsonElement;
import com.kwai.framework.model.feed.BaseFeed;
import org.json.JSONObject;
import vq4.c;
import m09.a;

public final class c	// class@002dd8
{
    public static final ConcurrentHashMap a;
    public static final ConcurrentHashMap b;
    public static final c c;

    static {
       c.c = new c();
       c.a = new ConcurrentHashMap();
       c.b = new ConcurrentHashMap();
    }
    public void c(){
       super();
    }
    public static final void a(boolean p0,List p1,JsonObject p2){
       c c;
       Object obj3;
       boolean b1;
       boolean b2;
       StringBuilder str;
       int i2;
       Iterator iterator1;
       int i3;
       int i4;
       int i5;
       String str1;
       String str2;
       String str3;
       StringBuilder str4;
       PhotoAdvertisement photoAdverti;
       JsonObject jsonObject;
       PhotoAdvertisement photoAdverti1;
       Long longx;
       Object obj = p1;
       Object obj1 = p2;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, null, c.class, "3")) {
          return;
       }
       a.p(obj, "qPhotos");
       a.p(obj1, "adJson");
       JsonArray jsonArray = new JsonArray();
       int i = 1;
       ArrayList uArrayList = new ArrayList();
       int i1 = (p1.size() - i) - i;
       boolean b = true;
       while (i1 >= 0) {
          QPhoto qPhoto = obj.get(i1);
          if (qPhoto.isAd()) {
             Long obj2 = c.b.get(qPhoto.getPhotoId());
             if (obj2 != null && obj2.b() == i) {
                break ;
             }else if(obj2 != null){
                c = c.c;
                Objects.requireNonNull(c);
                if (PatchProxy.isSupport(c.class)) {
                   obj3 = obj2;
                   if (!PatchProxy.applyVoidFourRefs(qPhoto, obj2, uArrayList, Boolean.valueOf(b), c, c.class, "4")) {
                   }
                }else {
                   obj3 = obj2;
                }
             }
          label_0173 :
             i = 0;
          label_0174 :
             b = false;
          }
          i1 = i1 - 1;
          i = 1;
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          jsonArray.G(iterator.next());
       }
       obj1.G("adPostback", jsonArray);
       if (p0) {
          c.b.clear();
       }
       return;
    }
    public static final void c(int p0,BaseFeed p1,JSONObject p2,c p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, c.class, "1")) {
          return;
       }
       a.p(p1, "feed");
       a.p(p3, "clientAdLog");
       if (p0 != 1 && (p0 != 60 && (p0 != 2 && (p0 == 68 || p0 == 160)))) {
          a uoa = c.a.get(p1.getId());
          if (uoa != null) {
             uoa.a(p1, p2, p3);
          }
       }
       return;
    }
    public final ConcurrentHashMap b(){
       return c.a;
    }
}
