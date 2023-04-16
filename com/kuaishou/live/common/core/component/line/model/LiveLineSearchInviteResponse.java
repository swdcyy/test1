package com.kuaishou.live.common.core.component.line.model.LiveLineSearchInviteResponse;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineInviteUserInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteTitleItem;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.common.core.component.pk.model.LiveLineSearchEmptyItem;
import java.lang.Boolean;
import la6.a;

public class LiveLineSearchInviteResponse extends LiveLineInviteResponse	// class@00148b
{
    public boolean isFirstPage;
    public String mPCursor;
    public LiveLineInviteResponse$LiveLineInviteUserInfo mSearchInviteeInfo;
    public String mSearchSessionId;
    public static final long serialVersionUID = 0x7c1a0282190dc723;

    public void LiveLineSearchInviteResponse(){
       super();
    }
    public List getItems(){
       ArrayList obj = PatchProxy.apply(null, this, LiveLineSearchInviteResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       LiveLineSearchInviteResponse tmSearchInvi = this.mSearchInviteeInfo;
       if (tmSearchInvi == null) {
          return obj;
       }
       if (!TextUtils.isEmpty(tmSearchInvi.mTitle) && this.isFirstPage != null) {
          obj.add(new LiveLineInviteTitleItem(this.mSearchInviteeInfo.mTitle));
       }
       if (q.f(this.mSearchInviteeInfo.mInviteeUsers)) {
          obj.add(new LiveLineSearchEmptyItem());
       }else {
          obj.addAll(this.mSearchInviteeInfo.getItems("SEARCH_LIST_INVITE"));
       }
       return obj;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveLineSearchInviteResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mPCursor);
    }
}
