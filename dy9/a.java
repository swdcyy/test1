package dy9.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import az6.a;
import android.content.Context;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.FansTopDisplayStyle;
import lnc.a1;
import sd5.f;

public final class a	// class@001ff5
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(QPhoto p0,PhotoDetailParam p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       a.p(p1, "detailParam");
       if (this.c(p0, p1)) {
          a mSource = p1.mSource;
          if (mSource != 204 && (mSource != 16 && mSource != 262)) {
             b = true;
          label_0034 :
             return b;
          }
       }
       b = false;
       goto label_0034 ;
    }
    public final String b(Context p0,QPhoto p1,PhotoDetailParam p2,boolean p3){
       PhotoMeta obj;
       boolean b;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "photo");
       a.p(p2, "detailParam");
       obj = p1.getPhotoMeta();
       CommonMeta commonMeta = p1.getCommonMeta();
       CommonMeta uCommonMeta = null;
       PhotoMeta mDisplayTime = (!p1.enableTimeStamp() && obj != null)? obj.mDisplayTime: uCommonMeta;
       a.m(commonMeta);
       CommonMeta mCreated = commonMeta.mCreated;
       if (p3) {
          mDisplayTime = ((System.currentTimeMillis() - mCreated) - 0xa4cb800 >= 0 && p2.getSource() == 9)? "": uCommonMeta;
       }
    label_0062 :
       if (mDisplayTime == null) {
          String str = (this.c(p1, p2) || p1.isMine())? DateUtils.c(mCreated, "-"): DateUtils.w(p0, mCreated);
          mDisplayTime = str;
          a.o(mDisplayTime, "if \(isFromProfile\(photo,¡­activity, time\)\n        }");
       }
       p0 = PatchProxy.applyOneRefs(p1, this, a.class, "4");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else {
          CommonMeta commonMeta1 = p1.getCommonMeta();
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          User user = p1.getUser();
          a.o(user, "photo.user");
          if (a.g(mE.getId(), user.getId())) {
             if (commonMeta1 != null) {
                uCommonMeta = commonMeta1.mFansTopDisplayStyle;
             }
             if (uCommonMeta != null && commonMeta1.mFansTopDisplayStyle.shouldShowFansTopOwnnerStyle()) {
                b = true;
             }
          }
       label_00c4 :
          b = false;
       }
       if (b) {
          mDisplayTime = f.a(a1.d(R.dimen.arg_RES_7f070be2), mDisplayTime, obj);
       }
       return mDisplayTime;
    }
    public final boolean c(QPhoto p0,PhotoDetailParam p1){
       boolean b;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (p1.getSource() != -1) {
          a mSource = p1.mSource;
          if (mSource == 173 || (mSource != 165 && mSource != 42)) {
             b = false;
          label_002c :
             return b;
          }
       }
       b = true;
       goto label_002c ;
    }
}
