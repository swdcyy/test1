package com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment$c;
import com.yxcorp.gifshow.fragment.f;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;

public class LiveGzoneAudienceAccompanyTicketFragment$c extends f	// class@000c4e
{
    public View l;
    public final LiveGzoneAudienceAccompanyTicketFragment m;

    public void LiveGzoneAudienceAccompanyTicketFragment$c(LiveGzoneAudienceAccompanyTicketFragment p0,RecyclerFragment p1){
       this.m = p0;
       super(p1);
    }
    public View J0(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LiveGzoneAudienceAccompanyTicketFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = super.J0();
          obj = KwaiEmptyStateView.e();
          obj.b();
          obj.a(this.l);
       }
       return this.l;
    }
    public KwaiEmptyStateView$a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceAccompanyTicketFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiEmptyStateView$a uoa = super.c(p0);
       uoa.b();
       return uoa;
    }
}
