package com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment$a$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment$a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyTicketTask;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyTicketPickupResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment;
import io.reactivex.subjects.PublishSubject;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;
import java.lang.Integer;

public class LiveGzoneAudienceAccompanyTicketFragment$a$a implements g	// class@000c4b
{
    public final LiveGzoneAccompanyTicketTask b;
    public final LiveGzoneAudienceAccompanyTicketFragment$a c;

    public void LiveGzoneAudienceAccompanyTicketFragment$a$a(LiveGzoneAudienceAccompanyTicketFragment$a p0,LiveGzoneAccompanyTicketTask p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceAccompanyTicketFragment$a$a.class, "1")) {
       }else {
          i.a(R.style.arg_RES_7f110669, 0x7f1023d0);
          this.b.mTaskStatus = 3;
          this.c.b.g7().l0(this.c.b.g7().P0(this.b));
          this.c.b.Gh(p0.mUserTicketCount);
          this.c.b.K.n1().onNext(Integer.valueOf(p0.mUserTicketCount));
       }
       return;
    }
}
