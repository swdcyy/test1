package e83.b;
import com.kuaishou.live.viewcontroller.ViewController;
import v51.a;
import cc3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hf3.a;
import com.kuaishou.live.lite.adapter.component.merchat.LiteChatForbiddenMerchantController$watchChatReady$listener$1;
import com.kuaishou.livestream.message.nano.LiveStreamAuthorChatMessages$SCAuthorChatReady;
import e83.a;
import msd.l;
import lf3.g;
import com.kuaishou.live.lite.adapter.component.merchat.LiteChatForbiddenMerchantController$watchChatReady$1;
import androidx.lifecycle.LifecycleOwner;
import msd.a;
import u63.a;
import com.kuaishou.live.lite.adapter.component.merchat.LiteChatForbiddenMerchantController$watchChatEnd$listener$1;
import com.kuaishou.livestream.message.nano.LiveStreamAuthorChatMessages$SCAuthorChatEnd;
import com.kuaishou.live.lite.adapter.component.merchat.LiteChatForbiddenMerchantController$watchChatEnd$1;

public final class b extends ViewController	// class@0026ab
{
    public final a j;
    public final a k;

    public void b(a p0,a p1){
       a.p(p0, "longConnectionManager");
       a.p(p1, "liteMerchantForbiddenService");
       super();
       this.j = p0;
       this.k = p1;
    }
    public void F2(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "1")) {
          return;
       }
       a uoa = this.j.u();
       a.o(uoa, "liveLongConnection");
       if (!PatchProxy.applyVoidOneRefs(uoa, this, uob, "3")) {
          LiteChatForbiddenMerchantController$watchChatReady$listener$1 owatchChatRe = new LiteChatForbiddenMerchantController$watchChatReady$listener$1(this);
          uoa.u0(481, LiveStreamAuthorChatMessages$SCAuthorChatReady.class, new a(owatchChatRe));
          a.a(this, new LiteChatForbiddenMerchantController$watchChatReady$1(uoa, owatchChatRe));
       }
       if (!PatchProxy.applyVoidOneRefs(uoa, this, uob, "2")) {
          LiteChatForbiddenMerchantController$watchChatEnd$listener$1 owatchChatEn = new LiteChatForbiddenMerchantController$watchChatEnd$listener$1(this);
          uoa.u0(482, LiveStreamAuthorChatMessages$SCAuthorChatEnd.class, new a(owatchChatEn));
          a.a(this, new LiteChatForbiddenMerchantController$watchChatEnd$1(uoa, owatchChatEn));
       }
       return;
    }
}
