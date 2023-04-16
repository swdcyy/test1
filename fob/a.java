package fob.a;
import erd.g;
import com.yxcorp.gifshow.moment_downloader.lazyfragment.ReminderMomentContainerFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import job.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;

public final class a implements g	// class@0029a5
{
    public final ReminderMomentContainerFragment b;

    public void a(ReminderMomentContainerFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       RxBus.f.b(new b());
       boolean b = p0.booleanValue();
       if (!PatchProxy.isSupport(ReminderMomentContainerFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, ReminderMomentContainerFragment.class, "4")) {
          ReminderMomentContainerFragment t = tb.t;
          if (t instanceof KwaiRnTab) {
             if (b) {
                t.A();
             }else {
                t.m0();
             }
          }
       }
       return;
    }
}
