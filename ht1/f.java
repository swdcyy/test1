package ht1.f;
import java.lang.Runnable;
import ht1.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;

public final class f implements Runnable	// class@00277a
{
    public final d b;

    public void f(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
          return;
       }
       b.P(this.b.a, "start tryDownloadResource runnable");
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, uod, "3")) {
          tb.t(tb.p("", "live_multi_pk_resource_image_honor_skin", tb.f), LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_HONOR_SKIN);
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, uod, "4")) {
          tb.t(tb.p("", "live_multi_pk_resource_image_activity_skin", tb.e), LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_ACTIVITY_SKIN);
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, uod, "5")) {
          tb.t(tb.p("", "live_multi_pk_resource_image_normal_skin", ""), LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_NORMAL_SKIN);
       }
       return;
    }
}
