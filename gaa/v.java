package gaa.v;
import java.lang.Runnable;
import gaa.h0;
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
import com.kuaishou.android.model.music.Music;
import org.json.JSONObject;
import e16.b;
import com.kuaishou.android.model.music.MusicType;
import android.os.Parcelable;
import org.parceler.b;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.lang.Boolean;
import com.kwai.feature.post.api.core.model.RecreationParam;
import tkd.b;
import tkd.d;
import r16.a;
import q16.a;
import android.content.Context;
import android.content.Intent;
import r16.d;
import q46.t;
import gaa.a0;
import n3d.a;
import jkd.c;

public final class v implements Runnable	// class@002451
{
    public final h0 b;

    public void v(h0 p0){
       this.b = p0;
    }
    public final void run(){
       boolean b;
       v tb = this.b;
       if (a1.i(tb.a) && tb.a.b3()) {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "EditSourcePictureDownloadDispatcher";
          if (tb.i == null) {
             User mName = tb.b.getEntity().a(User.class).mName;
             h0 oh0 = null;
             if (tb.b.getEntity() != null) {
                oh0 = r1.r0(tb.b.getEntity());
             }
             String str1 = "";
             String str2 = "\\\(O\\d+\\\)";
             if (oh0 != null) {
                oh0 = oh0.replaceAll(str2, str1);
             }
             String bizId = tb.b.getBizId();
             Object[] objArray1 = new Object[i];
             a.D().w(str, "originUserName is "+mName+", originPhotoId is "+bizId, objArray1);
             if (TextUtils.x(bizId)) {
                PostUtils.D(str, "realGo", new IllegalArgumentException("error, originPhotoId is "+bizId));
             }else {
                a$a uoa = new a$a();
                String str3 = tb.g.d().get("comment_text");
                if (!TextUtils.x(str3)) {
                   str3 = str3.replaceAll(str2, str1);
                }
                RecreationParam$a uoa1 = new RecreationParam$a();
                uoa1.g(tb.j);
                uoa1.d(tb.k);
                uoa1.f(mName);
                uoa1.h(oh0);
                uoa1.e(bizId);
                uoa1.i(str3);
                uoa1.l = tb.t;
                uoa1.m = tb.u;
                if (tb.b.isSinglePhoto() && !tb.b.isLongPhotos()) {
                   uoa1.c("PHOTO_SINGLE_PICTURE_TYPE");
                }else if(tb.b.isAtlasPhotos()){
                   uoa1.c("PHOTO_ATLAS_TYPE");
                }else if(tb.b.isLongPhotos()){
                   uoa1.c("PHOTO_LONG_PICTURE_TYPE");
                }
                h0 c = tb.c;
                if (c != null) {
                   String str4 = b.a(c, 0, tb.o, false).toString();
                   b = (tb.c.mType == MusicType.SOUNDTRACK)? true: false;
                   uoa1.b(b);
                   uoa.K(tb.c).N(b.c(tb.c)).P(MusicSource.TAG).M(str4).Q(i).L((int)tb.o).h(tb.p).i(tb.q);
                }
                uoa.a0("picture_recreation").m(Boolean.TRUE).X(uoa1.a());
                Intent intent = d.a(0x14d6f666).NX(tb.a, uoa.f());
                t.a(intent, "fullScreenPreview");
                tb.a.t1(intent, 291, new a0(tb));
                if (tb.g.c() != null) {
                   tb.g.c().onSuccess();
                }
             }
          }
       }
       return;
    }
}
