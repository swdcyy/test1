package com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$a;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$b;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o63.d;
import o63.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleObserver;

public class LiveAudienceWishRoomKrnDialogPresenter$a implements LiveAudienceWishRoomKrnDialogPresenter$b	// class@001293
{
    public final LiveAudienceWishRoomKrnDialogPresenter a;

    public void LiveAudienceWishRoomKrnDialogPresenter$a(LiveAudienceWishRoomKrnDialogPresenter p0){
       this.a = p0;
       super();
    }
    public void a(String p0,boolean p1){
       LiveAudienceWishRoomKrnDialogPresenter$a uoa = LiveAudienceWishRoomKrnDialogPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       uoa = this.a;
       LiveAudienceWishRoomKrnDialogPresenter n = uoa.N;
       if (n != null) {
          uoa.M = n.v2(p0);
          if (p1) {
             LiveAudienceWishRoomKrnDialogPresenter m = this.a.M;
             if (m != null) {
                m.getLifecycle().addObserver(this.a.O);
             }
          }
       }
       return;
    }
}
