package d5c.q;
import erd.g;
import d5c.g0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.UserProfile;
import android.util.SparseArray;
import com.yxcorp.utility.TextUtils;
import d5c.a0;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.kwai.framework.model.user.ProfileTabModel;
import com.kwai.framework.model.user.User;
import z5c.y1;
import lnc.i3;
import java.lang.Math;
import java.lang.Number;
import k2b.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;
import z5c.y2;

public final class q implements g	// class@00210a
{
    public final g0 b;

    public void q(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i3 oi3;
       h oh;
       q tb = this.b;
       Objects.requireNonNull(tb);
       int i = p0.intValue();
       g0 u = tb.U;
       g0 og0 = g0.class;
       if (!PatchProxy.isSupport(og0) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Boolean.valueOf(u), tb, og0, "44") && !tb.d9(tb.q.mUserProfile))) {
          String str = TextUtils.I(tb.K.get(i));
          ProfileTabModel profileTabMo = y.y(tb.L, new a0(i)).orNull();
          if (profileTabMo != null) {
             g0 s = tb.s;
             String id = tb.p.getId();
             String logTabId = profileTabMo.getLogTabId();
             int i1 = tb.b9(i);
             ProfileTabModel mIndex = profileTabMo.mIndex;
             y1 oy1 = y1.class;
             if (PatchProxy.isSupport(oy1)) {
                Object[] objArray = new Object[]{s,id,logTabId,str,Boolean.valueOf(u),Integer.valueOf(i1),Integer.valueOf(mIndex)};
                if (!PatchProxy.applyVoid(objArray, null, oy1, "58")) {
                }
             }else {
             }
          }
       label_00e1 :
          String str1 = (profileTabMo == null)? String.valueOf(false): profileTabMo.getLogTabId();
          tb.Q.a(tb.s, str1, str, tb.b9(i));
       }
       tb.U = false;
       return;
    }
}
