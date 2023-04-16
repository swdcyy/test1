package dfc.v$a;
import com.yxcorp.gifshow.widget.m;
import dfc.v;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.yxcorp.gifshow.reminder.news.data.NewsEntranceResponse;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dfc.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import brd.y;
import java.lang.Boolean;
import im8.f;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.user.base.RichTextMetaExt;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Math;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import cfc.a;
import java.lang.Long;
import lnc.i3;
import java.lang.Number;
import k2b.h;
import dfc.u;
import java.lang.Runnable;
import ekd.k1;

public class v$a extends m	// class@0021b4
{
    public final v c;

    public void v$a(v p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       a uoa;
       int i3;
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
          return;
       }
       NewsEntranceResponse newsEntrance = this.c.B.i();
       v$a tc = this.c;
       v a = tc.A;
       int i = tc.z.f();
       NewsEntranceResponse mExtraInfo = (newsEntrance != null)? newsEntrance.mExtraInfo: null;
       NewsEntranceResponse newsEntrance1 = (newsEntrance != null)? newsEntrance.mPhotos: null;
       int i1 = 1;
       if (PatchProxy.isSupport(a.class)) {
          uoa = PatchProxy.applyThreeRefs(Integer.valueOf(i), mExtraInfo, newsEntrance1, null, a.class, "2");
          if (uoa != PatchProxyResult.class) {
          label_0059 :
             a.onNext(uoa);
             this.c.C.set(Boolean.TRUE);
             if (newsEntrance != null) {
                String str = RichTextMetaExt.g(newsEntrance.mRecoTextInfo);
                NewsEntranceResponse mExtraInfo1 = newsEntrance.mExtraInfo;
                mExtraInfo = newsEntrance.mLlsid;
                int i2 = 2;
                if (newsEntrance.mShowUserHeads != null) {
                   NewsEntranceResponse mRecoTextInf = newsEntrance.mRecoTextInfo;
                   if (mRecoTextInf != null && !q.f(mRecoTextInf.mShowUsers)) {
                      i3 = Math.min(newsEntrance.mRecoTextInfo.mShowUsers.size(), i2);
                   label_0091 :
                      NewsEntranceResponse mRecoTextInf1 = newsEntrance.mRecoTextInfo;
                      RichTextMeta mUserCount = (mRecoTextInf1 != null)? mRecoTextInf1.mUserCount: 0;
                      str = (String.valueOf((TextUtils.x(str) ^ i1))).toUpperCase();
                      boolean b = (!this.c.u.getVisibility())? true: false;
                      a uoa1 = a.class;
                      if (PatchProxy.isSupport(uoa1)) {
                         Object[] objArray = new Object[]{mExtraInfo1,Long.valueOf(mExtraInfo),Integer.valueOf(i3),Integer.valueOf(mUserCount),str,Boolean.valueOf(b)};
                         if (PatchProxy.applyVoid(objArray, null, uoa1, "2")) {
                         label_012d :
                            newsEntrance.mExtraInfo = null;
                            newsEntrance.mRecoTextInfo = null;
                            newsEntrance.mShowUserHeads = false;
                            newsEntrance.mPhotos = null;
                            k1.r(new u(this, newsEntrance), 1000);
                         }
                      }
                      i3 oi3 = i3.f();
                      oi3.d("extra_info", mExtraInfo1);
                      oi3.c("llsid", Long.valueOf(mExtraInfo));
                      oi3.c("head_count", Integer.valueOf(i3));
                      oi3.c("user_count", Integer.valueOf(mUserCount));
                      oi3.d("has_reason", str);
                      str = (b)? "TRUE": "FALSE";
                      oi3.d("has_redpoint", str);
                      h oh = h.m("2895536", "NEWS_FEED_ENTRY_BUTTON");
                      oh.n(oi3.toString());
                      oh.h();
                      goto label_012d ;
                   }
                }
                i3 = 0;
                goto label_0091 ;
             }
             return;
          }
       }
       uoa = new a();
       uoa.b = i1;
       uoa.c = i;
       uoa.d = mExtraInfo;
       uoa.e = newsEntrance1;
       goto label_0059 ;
    }
}
