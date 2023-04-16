package mxb.z0;
import mxb.j;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import com.kuaishou.android.model.feed.k;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.Map;
import java.util.HashMap;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import uh5.e;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public abstract class z0 extends j	// class@00365a
{
    public static final Map l;
    public static final AtomicReference m;

    static {
       z0.l = new ConcurrentHashMap(2);
       z0.m = new AtomicReference("");
    }
    public void z0(BaseFeed p0){
       super();
       this.a = p0;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, z0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.a.get("AD") == null) {
          return 0;
       }
       return this.a.get("AD").mCreativeId;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, z0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.a.get("AD") == null) {
          return 0;
       }
       return this.a.get("AD").mSourceType;
    }
    public List g(){
       ArrayList obj = PatchProxy.apply(null, this, z0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (k.x(this.a) != null && !q.f(k.x(this.a).mTrackInfos)) {
          obj.addAll(k.x(this.a).mTrackInfos);
       }
       PhotoAdvertisement photoAdverti = this.a.get("AD");
       if (photoAdverti != null && !q.f(photoAdverti.mTracks)) {
          obj.addAll(photoAdverti.mTracks);
       }
       return obj;
    }
    public boolean h(){
       return this.a instanceof LiveStreamFeed;
    }
    public String p(){
       boolean b;
       Iterator iterator1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z0 oz0 = z0.class;
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, this, oz0, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, oz0, "7");
       if (obj != patchProxyRe) {
       }else {
          obj = new HashMap(2);
          obj.put("browseType", String.valueOf(e.d().getParamType()));
          j tf = this.f;
          if (tf != null && !tf.isEmpty()) {
             iterator1 = this.f.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry2 = iterator1.next();
                Object obj2 = this.f.get(uEntry2.getKey());
                if (obj2 != null) {
                   obj.put(uEntry2.getKey(), obj2.toString());
                }
             }
          }
       }
       Map obj1 = PatchProxy.applyOneRefs(obj, this, oz0, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!TextUtils.x(z0.m.get())){
          Map l = z0.l;
          if (obj.size() == l.size()) {
             iterator1 = l.entrySet().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   Map$Entry uEntry1 = iterator1.next();
                   String str1 = obj.get(uEntry1.getKey());
                   if (str1 != null && str1.equals(uEntry1.getValue())) {
                      continue ;
                   }
                }else {
                   b = false;
                }
             }
          }
       }
       b = true;
       if (b) {
          obj1 = z0.l;
          obj1.clear();
          obj1.putAll(obj);
          AtomicReference m = z0.m;
          String str = PatchProxy.apply(objArray, this, oz0, "5");
          if (str != patchProxyRe) {
          }else {
             JsonObject jsonObject = new JsonObject();
             Iterator iterator = obj1.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                jsonObject.c0(key, uEntry.getValue());
             }
             str = jsonObject.toString();
          }
          m.set(str);
       }
       return z0.m.get();
    }
}
