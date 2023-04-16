package id1.b;
import bq5.d;
import id1.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.System;
import s81.a;
import com.yxcorp.gifshow.util.DateUtils;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;

public class b implements d	// class@002899
{
    public final LiveGenericCommentNoticeInfo a;
    public final d b;

    public void b(d p0,LiveGenericCommentNoticeInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "8")) {
          int i = 1;
          if (!DateUtils.I(System.currentTimeMillis(), a.p())) {
             a.O(i);
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putLong(b.d("user")+"liveRecruitNoticeShowTimestamp", System.currentTimeMillis());
             g.a(uEditor);
          }else {
             a.O((a.q() + i));
          }
       }
       b ta = this.a;
       a.d(this.b.f.a(), this.b.f.c0(), String.valueOf(this.a.mNoticeType), ta.mBizId, this.b.d(ta.mExtraInfoStr, ta.mBizType));
       this.b.e(757);
       return;
    }
}
