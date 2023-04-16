package f52.u;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import java.lang.Object;
import android.view.View;
import android.widget.TextView;
import t02.a0;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.lang.String;
import j52.b;

public final class u implements View$OnClickListener	// class@00289a
{
    public final k b;

    public void u(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str2;
       u tb = this.b;
       String str = "0";
       String str1 = "NULL";
       if (tb.t.getVisibility()) {
          str2 = str1;
       }else if(tb.p.c.getUser().isFollowingOrFollowRequesting()){
          str2 = "1";
       }else {
          str2 = str;
       }
       if (tb.C != null) {
          tb.X8(true);
          ClientContent$LiveStreamPackage liveStreamPa = tb.p.Z2.a();
          if (tb.A != null) {
             str1 = "1";
          }
          b.c(liveStreamPa, "ORDER", str2, "1", str1);
       }else {
          tb.W8(true);
          ClientContent$LiveStreamPackage liveStreamPa1 = tb.p.Z2.a();
          if (tb.A != null) {
             str1 = "1";
          }
          b.c(liveStreamPa1, "ORDER", str2, str, str1);
       }
       return;
    }
}
