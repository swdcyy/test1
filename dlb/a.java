package dlb.a;
import erd.g;
import com.kuaishou.android.model.mix.PhotoMeta;
import r26.a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import qr4.m$k0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import java.lang.Long;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.mockphoto.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.RecreationSettingInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.config.RecreationConfig;
import java.lang.reflect.Type;
import oa0.a;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kuaishou.android.model.feed.VisibilityExpiration;

public final class a implements g	// class@0024be
{
    public final PhotoMeta b;
    public final a c;
    public final IUploadInfo d;

    public void a(PhotoMeta p0,a p1,IUploadInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       if (p0 == null || (p0.G() != null && p0.G().b != null)) {
          p0 = p0.G().b;
          boolean b = false;
          int i = 1;
          boolean b1 = (tc.getEncodeInfo() != null && tc.getEncodeInfo().isIntelligenceAlbum())? true: false;
          tb.mIsIntelligenceAlbum = b1;
          if (!TextUtils.x(p0.i0)) {
             tb.mMoodTemplateId = Long.parseLong(p0.i0);
          }
          tb.mIsUserStatus = p0.B0;
          if (!PatchProxy.applyVoidThreeRefs(tb, p0, td, null, d.class, "3")) {
             if (p0.I0 == 2) {
                RecreationSettingInfo recreationSe = new RecreationSettingInfo();
                recreationSe.mIsRecreationPhoto = i;
                tb.mRecreationSettingInfo = recreationSe;
                tb.mEditInfo = null;
             }
             RecreationConfig obj = PatchProxy.apply(null, null, d.class, "17");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = a.o0(RecreationConfig.class);
                if (obj != null && obj.mDefaultState != null) {
                   b = true;
                }
             }
             if (b) {
                tb.mRecreationSetting = td.isDisallowRecreation() ^ i;
             }
          }
          if (p0.E0 != null) {
             VisibilityExpiration visibilityEx = new VisibilityExpiration();
             if (p0.E0 != i) {
                i = 3;
             }
             visibilityEx.mExpiryDays = i;
             tb.mVisibilityExpiration = visibilityEx;
          }
       }
    label_00c3 :
       return;
    }
}
