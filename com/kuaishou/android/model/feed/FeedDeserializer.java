package com.kuaishou.android.model.feed.FeedDeserializer;
import com.google.gson.b;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import com.kuaishou.android.model.feed.q;
import com.google.gson.JsonObject;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Throwable;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import ok.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.p;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Boolean;
import java.util.List;
import ekd.k0;
import ei5.c;
import q87.c;
import android.util.Log;
import k2b.u1;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler;
import yp.q;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler$a;
import com.kuaishou.android.model.feed.FeedDeserializer$StagFeedTypedAdapterFactor;
import com.kuaishou.android.model.feed.FeedDeserializer$a;
import zk.j;
import fg6.a;
import com.google.gson.a;
import fa6.c;
import fa6.d;

public class FeedDeserializer implements b	// class@00060d
{
    public final d a;
    public static final List b;
    public static final FeedDeserializer c;

    static {
       FeedDeserializer.b = new CopyOnWriteArrayList();
       FeedDeserializer.c = new FeedDeserializer();
    }
    public void FeedDeserializer(){
       super();
       this.a = q.a;
    }
    public static BaseFeed a(JsonObject p0){
       return FeedDeserializer.f(p0);
    }
    public static void b(BaseFeed p0,Throwable p1,JsonElement p2,Type p3){
       FeedDeserializer.g(p0, p1, p2, p3);
    }
    public static h c(){
       Object obj = PatchProxy.apply(null, null, FeedDeserializer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.b;
    }
    public static boolean e(PhotoType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FeedDeserializer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return FeedDeserializer.b.contains(p0);
    }
    public static BaseFeed f(JsonObject p0){
       int i = 0;
       int i1 = k0.f(p0, "type", i);
       if (i1 <= 0 || i1 == 1) {
          String str = "ext_params";
          if (k0.a(p0, str)) {
             i1 = k0.f(k0.e(p0, str).r(), "mtype", i);
          }
       }
       PhotoType photoType = PhotoType.fromInt(i1);
       if (photoType == PhotoType.UNKNOWN && (k0.a(p0, "main_mv_urls") || k0.a(p0, "main_mv_urls_h265"))) {
          photoType = PhotoType.VIDEO;
       }
       List b = FeedDeserializer.b;
       if (!b.contains(photoType)) {
          b.add(photoType);
       }
       return photoType.createFeed();
    }
    public static void g(BaseFeed p0,Throwable p1,JsonElement p2,Type p3){
       FeedDeserializer.i(p1, p2, p3);
       String str = "FeedDeserializer";
       String id = (p0 != null)? p0.getId(): "";
       String str1 = p2.r().e0("exp_tag").w();
       Object[] objArray = new Object[0];
       c.C().t(str, "this photo is error $feedId", objArray);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("id", id);
       jsonObject.c0("exception", Log.getStackTraceString(p1));
       jsonObject.c0("json", p2.toString());
       jsonObject.c0("type", p3.toString());
       jsonObject.c0("expTag", str1);
       u1.R("ExceptionPhotoFiltered", jsonObject.toString(), 5);
       return;
    }
    public static void h(){
       if (PatchProxy.applyVoid(null, null, FeedDeserializer.class, "1")) {
          return;
       }
       GsonLifeCycleEnabler.d().c(q.b);
       a.d(null, new FeedDeserializer$StagFeedTypedAdapterFactor(null));
       return;
    }
    public static void i(Throwable p0,JsonElement p1,Type p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, FeedDeserializer.class, "4")) {
          return;
       }
       c.C().e("FeedDeserializer", "FeedDeserializer", p0);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("exception", Log.getStackTraceString(p0));
       jsonObject.c0("json", p1.toString());
       jsonObject.c0("type", p2.toString());
       u1.R("exception", jsonObject.toString(), 5);
       return;
    }
    public BaseFeed d(JsonElement p0,Type p1,a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, FeedDeserializer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a.c(FeedDeserializer.c(), this.a).deserialize(p0, p1, p2);
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.d(p0, p1, p2);
    }
}
