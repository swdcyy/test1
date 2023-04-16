package a11.g;
import androidx.lifecycle.Observer;
import a11.l;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveUserRightsInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;
import com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper;
import a11.m;

public final class g implements Observer	// class@000020
{
    public final l b;

    public void g(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "3")) {
       }else if(p0 != null){
          tb.a.setUserRightsId(p0.a());
          tb.a.d(p0.b(), LiveUserRightsInfoHelper.c(p0));
          tb.c.p0(p0.b());
       }else {
          tb.a.setUserRightsId("defaultDataId");
          String a = LiveUserRightsInfoHelper.a;
          tb.a.d(a, false);
          tb.c.p0(a);
       }
       return;
    }
}
