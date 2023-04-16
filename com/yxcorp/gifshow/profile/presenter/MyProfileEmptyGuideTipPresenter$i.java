package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$i;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.ProfileEmptyUserGuideInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Integer;

public final class MyProfileEmptyGuideTipPresenter$i implements Comparator	// class@00140f
{
    public static final MyProfileEmptyGuideTipPresenter$i b;

    static {
       MyProfileEmptyGuideTipPresenter$i.b = new MyProfileEmptyGuideTipPresenter$i();
    }
    public void MyProfileEmptyGuideTipPresenter$i(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       ProfileEmptyUserGuideInfo obj = PatchProxy.applyTwoRefs(p0, p1, this, MyProfileEmptyGuideTipPresenter$i.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = p0.mStatus;
          ProfileEmptyUserGuideInfo mStatus = p1.mStatus;
          if (obj != mStatus) {
             if (obj == 1) {
                i = 1;
             }else if(mStatus == 1){
                i = -1;
             }
          }
          Map f = MyProfileEmptyGuideTipPresenter.F;
          p0 = p0.mType;
          a.o(p0, "info1.mType");
          p0 = f.get(p0);
          if (p0 == null) {
             p0 = Integer.valueOf(-1);
          }
          i = p0.intValue();
          p1 = p1.mType;
          a.o(p1, "info2.mType");
          p1 = f.get(p1);
          if (p1 == null) {
             p1 = Integer.valueOf(-1);
          }
          i = i - p1.intValue();
       }
       return i;
    }
}
