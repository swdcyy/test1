package dfc.s;
import erd.g;
import dfc.v;
import java.lang.Object;
import com.yxcorp.gifshow.reminder.news.data.NewsEntranceResponse;
import java.util.Objects;
import com.kwai.framework.model.user.RichTextMeta;
import java.lang.String;
import dfc.p;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Math;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import cfc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import lnc.i3;
import java.lang.Number;
import k2b.f3;
import dub.z;
import com.kwai.framework.model.user.User;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import bfc.i;
import brd.t;
import dfc.r;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import android.widget.TextView;
import android.graphics.Typeface;
import im8.f;

public final class s implements g	// class@0021b1
{
    public final v b;

    public void s(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i2;
       i3 oi3;
       String str2;
       f3 uof3;
       s b = this.b;
       NewsEntranceResponse newsEntrance = p0;
       Objects.requireNonNull(b);
       v ov = v.class;
       String str = p.a(newsEntrance.mRecoTextInfo, b.y);
       int b1 = true;
       int i = 0;
       if (newsEntrance.mHasLogShown == null) {
          newsEntrance.mHasLogShown = b1;
          NewsEntranceResponse mExtraInfo = newsEntrance.mExtraInfo;
          NewsEntranceResponse mLlsid = newsEntrance.mLlsid;
          int i1 = 2;
          if (newsEntrance.mShowUserHeads != null) {
             NewsEntranceResponse mRecoTextInf = newsEntrance.mRecoTextInfo;
             if (mRecoTextInf != null && !q.f(mRecoTextInf.mShowUsers)) {
                i2 = Math.min(newsEntrance.mRecoTextInfo.mShowUsers.size(), i1);
             label_0040 :
                NewsEntranceResponse mRecoTextInf1 = newsEntrance.mRecoTextInfo;
                RichTextMeta mUserCount = (mRecoTextInf1 != null)? mRecoTextInf1.mUserCount: 0;
                String str1 = (String.valueOf((TextUtils.x(str) ^ b1))).toUpperCase();
                boolean b2 = (!b.u.getVisibility())? true: false;
                a uoa = a.class;
                if (PatchProxy.isSupport(uoa)) {
                   Object[] objArray = new Object[]{mExtraInfo,Long.valueOf(mLlsid),Integer.valueOf(i2),Integer.valueOf(mUserCount),str1,Boolean.valueOf(b2)};
                   if (!PatchProxy.applyVoid(objArray, null, uoa, "1")) {
                   }
                }else {
                }
             }
          }
          i2 = 0;
          goto label_0040 ;
       }
    label_00e0 :
       b1 = -8;
       if (newsEntrance.mShowUserHeads == null) {
          b.s.setVisibility(8);
          if (!PatchProxy.applyVoid(null, b, ov, "7") && !b.u.getVisibility()) {
             Integer[] integerArray = new Integer[]{Integer.valueOf(b1)};
             z.a("NewsEntrance", integerArray);
             b.u.setVisibility(8);
          }
       }else {
          newsEntrance = newsEntrance.mRecoTextInfo;
          RichTextMeta mShowUsers = (newsEntrance != null)? newsEntrance.mShowUsers: null;
          int i3 = 0;
          while (i3 < b.r.length) {
             User user = (mShowUsers != null && mShowUsers.size() > i3)? mShowUsers.get(i3): null;
             if (user == null) {
                b.r[i3].setVisibility(8);
             }else {
                b.s.setVisibility(0);
                b.r[i3].setVisibility(0);
                g.b(b.r[i3], user, HeadImageSize.MIDDLE);
             }
             i3 = i3 + 1;
          }
          if (!PatchProxy.applyVoid(null, b, ov, "5") && (!i.a() || (!b.s.getVisibility() && b.u.getVisibility() == 8))) {
             b.P8();
             b.X7(z.l("newsSlideNotify", Integer.valueOf(b1)).subscribe(new r(b), Functions.d()));
          }
       }
    label_0195 :
       b.q.setTextSize(0, (float)a1.e(15.00f));
       b.q.setTextColor(a1.a(R.color.arg_RES_7f061641));
       b.p.setTextColor(a1.a(R.color.arg_RES_7f061641));
       b.p.setTypeface(Typeface.defaultFromStyle(1));
       if (!TextUtils.x(str)) {
          b.q.setText(str);
          b.C.set(Boolean.FALSE);
          b.q.setVisibility(0);
          b.p.setTextSize(0, (float)a1.e(15.00f));
       }else {
          b.q.setVisibility(8);
          b.p.setTextSize(0, (float)a1.e(15.00f));
       }
       return;
    }
}
