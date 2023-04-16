package l9a.j;
import erd.g;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$Action;

public final class j implements g	// class@002d74
{
    public final b b;

    public void j(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "8")) {
       }else if(TextUtils.n(tb.q.getUserId(), p0.b) && p0.c != null){
          tb.S8(ActionTrigger$Action.FOLLOW);
       }
       return;
    }
}
