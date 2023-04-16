package c3c.a$a;
import androidx.lifecycle.Observer;
import c3c.a;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.util.a;
import com.yxcorp.gifshow.profile.util.a$a;
import java.util.Objects;
import com.yxcorp.gifshow.profile.model.CommonRoleLabel;
import u3c.h;
import java.util.ArrayList;
import java.util.List;
import z5c.a3;
import java.util.Collection;
import z5c.v1;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.common.model.TagLabel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.q;
import java.util.Iterator;
import com.kwai.page.component.b;
import c3c.b;
import com.kwai.framework.model.user.User;
import z5c.s1;
import java.util.Map;
import com.yxcorp.gifshow.profile.util.u;
import java.util.Comparator;
import java.util.Collections;
import com.yxcorp.gifshow.profile.components.common.tag.ProfileHeadTagUI;
import qrd.l1;

public final class a$a implements Observer	// class@000513
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       CommonRoleLabel obj;
       boolean b;
       TagLabel tagLabel;
       TagLabel tagLabel1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a.p(p0, "profile");
          if (!a.e.b(p0)) {
             a$a tb = this.b;
             Objects.requireNonNull(tb);
             String str = "6";
             if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, str)) {
                CommonRoleLabel uCommonRoleL = h.d(p0);
                ArrayList uArrayList = new ArrayList();
                if (uCommonRoleL != null) {
                   List list = a3.a(uCommonRoleL);
                   if (list != null) {
                      uArrayList.addAll(list);
                   }
                   CommonRoleLabel mLabelGroup = uCommonRoleL.mLabelGroup;
                   if (PatchProxy.isSupport(v1.class)) {
                      obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(mLabelGroup), uArrayList, null, v1.class, "10");
                      str = PatchProxyResult.class;
                      if (obj != str) {
                         uArrayList = obj;
                      }else if(!str.b(p0)){
                         if (mLabelGroup != 3) {
                            if (mLabelGroup != 4) {
                               tagLabel1 = new TagLabel();
                               tagLabel1.mLabelType = "social_ip";
                               uArrayList.add(tagLabel1);
                            }
                         }else if(!TextUtils.x(p0.mCityName) && !q.f(uArrayList)){
                            Iterator iterator = uArrayList.iterator();
                            while (iterator.hasNext()) {
                               tagLabel = iterator.next();
                               if (("social_location").equals(tagLabel.mLabelType)) {
                                  tagLabel.mLabelType = "social_ip";
                                  uArrayList.set(uArrayList.indexOf(tagLabel), tagLabel);
                                  break ;
                               }
                            }
                         }else {
                            tagLabel1 = new TagLabel();
                            tagLabel1.mLabelType = "social_ip";
                            uArrayList.add(tagLabel1);
                         }
                      }
                   }else {
                      goto label_0068 ;
                   }
                   a.o(uArrayList, "ProfileIpLocationManager¡­   roleLabelsList\n      \)");
                   p0 = s1.a(tb.d.d(), p0, uCommonRoleL.mLabelGroup);
                   obj = null;
                   if (p0 != null) {
                      uArrayList.add(p0);
                      b = true;
                   }else {
                      b = false;
                   }
                   tb.n = b;
                   if (!PatchProxy.applyVoidOneRefs(uArrayList, null, a3.class, "2")) {
                      b = uArrayList.iterator();
                      while (b.hasNext()) {
                         tagLabel = b.next();
                         Integer integer = TagLabel.TAG_PRIORITY_MAP.get(tagLabel.mLabelType);
                         if (integer != null) {
                            tagLabel.mPriority = integer.intValue();
                         }else {
                            tagLabel.mPriority = obj;
                         }
                      }
                      Collections.sort(uArrayList, u.b);
                   }
                   b d = tb.d;
                   a.o(d, "mData");
                   tb.c.h(uArrayList, uCommonRoleL.mLabelGroup, d);
                }else if(str.b(p0)){
                   p0 = new TagLabel();
                   p0.mLabelType = "social_ip";
                   uArrayList.add(p0);
                   b d1 = tb.d;
                   a.o(d1, "mData");
                   tb.c.h(uArrayList, 3, d1);
                }
             }
          }
       }
       return;
    }
}
