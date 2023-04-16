package gaa.s0;
import java.lang.Runnable;
import gaa.w0;
import java.io.File;
import java.lang.Object;
import android.app.Activity;
import lnc.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import cq.a;
import java.lang.String;
import q87.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import tl8.d;
import kp.r1;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import q16.a$a;
import android.os.Bundle;
import nm6.d;
import com.kwai.feature.post.api.core.model.RecreationParam$a;
import com.kwai.feature.post.api.core.model.RecreationParam;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import r16.a;
import q16.a;
import android.content.Context;
import android.content.Intent;
import r16.d;
import q46.t;
import gaa.p0;
import n3d.a;
import jkd.c;
import r8c.n;

public final class s0 implements Runnable	// class@00244a
{
    public final w0 b;
    public final File c;

    public void s0(w0 p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       s0 tb = this.b;
       s0 tc = this.c;
       if (a1.i(tb.a) && tb.a.b3()) {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "EditSourcePhotoDownloadDispatcher";
          if (tb.h != null) {
          label_012b :
             return;
          }else {
             User mName = tb.b.getEntity().a(User.class).mName;
             w0 ow0 = null;
             if (tb.b.getEntity() != null) {
                ow0 = r1.r0(tb.b.getEntity());
             }
             String str1 = "";
             String str2 = "\\\(O\\d+\\\)";
             if (ow0 != null) {
                ow0 = ow0.replaceAll(str2, str1);
             }
             String bizId = tb.b.getBizId();
             Object[] objArray1 = new Object[i];
             a.D().w(str, "originUserName is "+mName+", originPhotoId is "+bizId, objArray1);
             if (TextUtils.x(bizId)) {
                PostUtils.D(str, "realGo", new IllegalArgumentException("error, originPhotoId is "+bizId));
                goto label_012b ;
             }else {
                a$a uoa = new a$a();
                str = tb.e.d().get("comment_text");
                if (!TextUtils.x(str)) {
                   str = str.replaceAll(str2, str1);
                }
                RecreationParam$a uoa1 = new RecreationParam$a();
                uoa1.g(tb.i);
                uoa1.d(tb.j);
                uoa1.a = tc.getAbsolutePath();
                uoa1.f(mName);
                uoa1.h(ow0);
                uoa1.e(bizId);
                uoa1.i(str);
                uoa.a0("recreation").m(Boolean.TRUE).X(uoa1.a());
                Intent intent = d.a(0x14d6f666).NX(tb.a, uoa.f());
                t.a(intent, "fullScreenPreview");
                tb.a.t1(intent, 291, new p0(tb));
                if (tb.e.c() != null) {
                   tb.e.c().onSuccess();
                }
             }
          }
       }
       tb.f.d();
       goto label_012b ;
    }
}
