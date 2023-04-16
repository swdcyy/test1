package f52.a;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.a;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import android.view.View;
import com.google.gson.JsonArray;
import java.util.List;
import java.lang.Math;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$AuthorLabel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.TextView;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.google.gson.JsonElement;
import j52.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a implements g	// class@00287f
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mEnableShowUserOperationModule == null || q.f(p0.mAuthorLabels)) {
          tb.r.setVisibility(8);
       }else {
          int i = 0;
          tb.r.setVisibility(i);
          JsonArray jsonArray = new JsonArray();
          int i1 = Math.min(3, p0.mAuthorLabels.size());
          int i2 = 0;
          while (i2 < i1) {
             QLivePushEndInfo$AuthorLabel uAuthorLabel = p0.mAuthorLabels.get(i2);
             if (uAuthorLabel != null) {
                a uoa = a.class;
                if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), uAuthorLabel, tb, uoa, "5")) {
                   if (!i2) {
                      tb.s.setVisibility(i);
                      tb.P8(tb.s, uAuthorLabel);
                   }else if(i2 == 1){
                      tb.t.setVisibility(i);
                      tb.P8(tb.t, uAuthorLabel);
                   }else if(i2 == 2){
                      tb.u.setVisibility(i);
                      tb.P8(tb.u, uAuthorLabel);
                   }
                }
                jsonArray.a0(uAuthorLabel.mText);
             }
             i2 = i2 + 1;
          }
          p0 = tb.p.Z2.a();
          String str = jsonArray.toString();
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(p0, str, Integer.valueOf(i1), null, b.class, "8")) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             showEvent.elementPackage = uElementPack;
             uElementPack.action2 = "AUTHOR_DATA_CARD";
             i3 oi3 = i3.f();
             oi3.d("detail", str);
             oi3.c("number", Integer.valueOf(i1));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             showEvent.contentPackage = uContentPack;
             uContentPack.liveStreamPackage = p0;
             u1.g0(showEvent);
          }
       }
       return;
    }
}
