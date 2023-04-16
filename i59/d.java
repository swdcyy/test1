package i59.d;
import android.text.style.ClickableSpan;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import mxb.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh5.c;
import android.app.Activity;
import e3a.a;
import com.kwai.framework.activitycontext.ActivityContext;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import nl9.u;
import android.content.Context;
import i59.c;
import erd.g;
import nl9.m;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import i59.b;
import com.yxcorp.download.b;
import i59.d$a;
import z1.a;
import android.text.TextPaint;
import com.yxcorp.gifshow.util.ColorURLSpan;

public class d extends ClickableSpan	// class@002632
{
    public final BaseFeed b;
    public int c;
    public String d;
    public int e;
    public boolean f;

    public void d(BaseFeed p0){
       super();
       this.c = -1;
       this.b = p0;
    }
    public static void a(QPhoto p0,Integer p1){
       i0.a().y(i0.a().g(p0.mEntity), 4, p1.intValue());
    }
    public d b(int p0){
       this.e = p0;
       return this;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       if (this.b != null && !c.b()) {
          Activity uActivity = a.a(p0);
          if (uActivity == null) {
             uActivity = ActivityContext.g().e();
          }
          if (this.f != null) {
             uActivity.finish();
             return;
          }else {
             QPhoto qPhoto = new QPhoto(this.b);
             int i = -1694791652;
             if (!TextUtils.x(this.d)) {
                d.a(i).RQ(uActivity, qPhoto.mEntity, this.d);
                i0.a().e(100, qPhoto.mEntity).d(new c(this.c)).a();
             }else {
                b[] uobArray = new b[]{new d$a(this, uActivity)};
                d.a(i).v6(uActivity, d.a(-2125799450).Pl(qPhoto.mEntity), new b(qPhoto), uobArray);
             }
          }
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       d te = this.e;
       if (te == null) {
          te = ColorURLSpan.u;
       }
       p0.setColor(te);
       return;
    }
}
