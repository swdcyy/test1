package dqa.b;
import erd.g;
import java.lang.String;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper;
import java.lang.StringBuilder;
import java.io.File;
import fg6.a;
import com.google.gson.Gson;
import java.lang.CharSequence;
import qkd.b;
import java.lang.Long;
import dqa.a;
import java.lang.Runnable;
import com.kwai.framework.init.c;

public final class b implements g	// class@0024ea
{
    public final String b;
    public final long c;

    public void b(String p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             List items = p0.getItems();
             String str = "response.items";
             a.o(items, str);
             int i = 1;
             if (items.isEmpty() ^ i) {
                p0 = p0.getItems();
                a.o(p0, str);
                p0 = CollectionsKt___CollectionsKt.m2(p0);
                a.o(p0, "response.items.first\(\)");
                BaseFeed entity = p0.getEntity();
                a.o(entity, "photo.entity");
                PreEmbeddedHelper c = PreEmbeddedHelper.c;
                char c1 = '/';
                b.q0(c.a(this.b+c1+this.c+".json", i), a.a.q(entity));
                b tc = this.c;
                String videoUrl = p0.getVideoUrl();
                a.o(videoUrl, "photo.videoUrl");
                p0 = this.b+c1+this.c+".mp4";
                if (!PatchProxy.isSupport(PreEmbeddedHelper.class) || !PatchProxy.applyVoidFourRefs(Long.valueOf(tc), "Growth PreEmbedded", videoUrl, p0, c, PreEmbeddedHelper.class, "10")) {
                   if (videoUrl.length()) {
                      i = 0;
                   }
                   if (!i) {
                      a uoa = new a(p0, videoUrl, "Growth PreEmbedded", tc);
                      c.b(entity);
                   }
                }
             }
          }
       }
       return;
    }
}
