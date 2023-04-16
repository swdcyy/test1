package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBaseDataBinding$2$1;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBaseDataBinding$2$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBaseDataBinding$2$3;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.multiline.model.a;
import com.kuaishou.live.viewcontroller.ViewController;
import pq1.b;
import msd.l;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class a$b implements Observer	// class@001550
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          a$b tb = this.b;
          a.o(p0, "participantList");
          LiveAudienceMultiLineBaseDataBinding$2$1 u2$1 = new LiveAudienceMultiLineBaseDataBinding$2$1(this.b);
          LiveAudienceMultiLineBaseDataBinding$2$2 u2$2 = new LiveAudienceMultiLineBaseDataBinding$2$2(this.b);
          LiveAudienceMultiLineBaseDataBinding$2$3 u2$3 = new LiveAudienceMultiLineBaseDataBinding$2$3(this.b);
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidFourRefs(p0, u2$1, u2$2, u2$3, tb, a.class, "2")) {
             ArrayList uArrayList = new ArrayList(tb.a.keySet());
             ArrayList uArrayList1 = new ArrayList();
             p0 = p0.iterator();
             while (p0.hasNext()) {
                a uoa = p0.next();
                ViewController viewControll = tb.a.get(uoa.a());
                if (viewControll != null && tb.g(viewControll, uoa)) {
                   u2$2.invoke(uoa);
                   uArrayList.remove(String.valueOf(uoa.h.userId));
                }else {
                   uArrayList1.add(uoa);
                }
             }
             p0 = uArrayList.iterator();
             while (p0.hasNext()) {
                u2$3.invoke(p0.next());
             }
             p0 = uArrayList1.iterator();
             while (p0.hasNext()) {
                u2$1.invoke(p0.next());
             }
          }
       }
       return;
    }
}
