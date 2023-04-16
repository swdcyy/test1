package ib1.b;
import lf3.g;
import com.kuaishou.live.common.core.component.admin.user.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAssistantStatus;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import bb1.a$a;
import lf3.f;

public final class b implements g	// class@002884
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       LiveStreamMessages$SCAssistantStatus isAdmin = p0.isAdmin;
       LiveStreamMessages$SCAssistantStatus liveAssistan = p0.liveAssistantType;
       LiveStreamMessages$SCAssistantStatus disableShowT = p0.disableShowToast;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(isAdmin), Integer.valueOf(liveAssistan), Boolean.valueOf(disableShowT), tb, a.class, "7")) {
          tb.Uo(false);
          Iterator iterator = tb.i.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(isAdmin, liveAssistan, disableShowT);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
