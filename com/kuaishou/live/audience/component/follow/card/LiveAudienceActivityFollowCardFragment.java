package com.kuaishou.live.audience.component.follow.card.LiveAudienceActivityFollowCardFragment;
import com.kuaishou.live.audience.component.follow.card.LiveAudienceBaseActivityFollowCardFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.utility.n;
import qy0.b;
import ml8.c;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import z8c.a;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import d61.y;
import lnc.a1;

public class LiveAudienceActivityFollowCardFragment extends LiveAudienceBaseActivityFollowCardFragment	// class@000ac4
{
    public static final int G;

    public void LiveAudienceActivityFollowCardFragment(){
       super();
    }
    public f Gh(ViewGroup p0,int p1){
       if (PatchProxy.isSupport(LiveAudienceActivityFollowCardFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, LiveAudienceActivityFollowCardFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(n.H(p0, 0x7f0d09e9), new b());
    }
    public int getLayoutResId(){
       return 0x7f0d09e7;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceActivityFollowCardFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAudienceActivityFollowCardFragment.class, null);
       return objectsByTag;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceActivityFollowCardFragment.class, "3")) {
          return;
       }
       super.th();
       a uoa = new a(1, false, false);
       uoa.o(this.getResources().getDrawable(R.drawable.arg_RES_7f0810da));
       this.h0().addItemDecoration(uoa);
       FrameLayout$LayoutParams layoutParams = this.h0().getLayoutParams();
       layoutParams.width = (y.d(this.getActivity()))? a1.e(360.00f): -1;
       this.h0().setLayoutParams(layoutParams);
       return;
    }
}
