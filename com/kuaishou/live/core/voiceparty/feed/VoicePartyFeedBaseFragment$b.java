package com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment$b;
import com.yxcorp.gifshow.fragment.f;
import com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;

public class VoicePartyFeedBaseFragment$b extends f	// class@0014ee
{
    public final VoicePartyFeedBaseFragment l;

    public void VoicePartyFeedBaseFragment$b(VoicePartyFeedBaseFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public View J0(){
       View obj = PatchProxy.apply(null, this, VoicePartyFeedBaseFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.J0();
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.h(R.string.arg_RES_7f102e50);
       uoa.k(R.drawable.arg_RES_7f0805fc);
       uoa.a(obj);
       return obj;
    }
}
