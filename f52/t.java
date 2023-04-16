package f52.t;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import j52.b;
import wkd.b;
import nf6.i;
import android.net.Uri;
import l52.a;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public final class t implements View$OnClickListener	// class@002899
{
    public final k b;

    public void t(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str2;
       t tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, k.class, "12")) {
       }else if(tb.getActivity() == null || tb.y == null){
          b.a(tb.p.Z2.a(), tb.E);
          tb.getActivity().startActivity(b.a(0x66dce92a).a(tb.getActivity(), a.a(String.valueOf(tb.y), objArray)));
       }
       String str = "0";
       String str1 = "NULL";
       if (tb.F != null) {
          str2 = (tb.C != null)? "1": str;
       }else {
          str2 = str1;
       }
       if (tb.t.getVisibility()) {
          str = str1;
       }else if(tb.p.c.getUser().isFollowingOrFollowRequesting()){
          str = "1";
       }
       b.c(tb.p.Z2.a(), "VIEW", str, str2, "1");
       return;
    }
}
