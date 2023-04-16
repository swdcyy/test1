package cb3.b;
import vb3.d;
import mrd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import vb3.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.layoutmanager.LiveLiteDialogType;
import brd.y;

public final class b implements d	// class@0004dc
{
    public final c a;
    public final c b;

    public void b(c p0,c p1){
       a.p(p0, "commentPanelTopNotifier");
       a.p(p1, "giftPanelHeightNotifier");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(b p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.p(p0, "type");
       b.d0(LiveLiteLogTag.LAYOUT_MANAGER, "LiveDialogNotifyService notifyShowDialog", "type", p0, "dialog height", Integer.valueOf(p1));
       if (p0 == LiveLiteDialogType.GiftPanel) {
          this.b.onNext(Integer.valueOf(p1));
       }else if(p0 == LiveLiteDialogType.CommentInputPanel){
          this.a.onNext(Integer.valueOf(p1));
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "type");
       b.c0(LiveLiteLogTag.LAYOUT_MANAGER, "LiveDialogNotifyService notifyDismissDialog", "type", p0);
       if (p0 == LiveLiteDialogType.GiftPanel) {
          this.b.onNext(Integer.valueOf(-1));
       }else if(p0 == LiveLiteDialogType.CommentInputPanel){
          this.a.onNext(Integer.valueOf(-1));
       }
       return;
    }
}
