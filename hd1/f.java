package hd1.f;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.LiveRechargeNoticeInfo;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import s81.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import hd1.g;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;
import w91.a;
import lp3.c;
import lp3.e;
import java.util.Map;
import rw1.b;

public class f implements d	// class@002674
{
    public final LiveRechargeNoticeInfo a;
    public final b b;

    public void f(b p0,LiveRechargeNoticeInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, f.class, str)) {
          return;
       }
       f tb = this.b;
       f ta = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(ta, tb, b.class, "5")) {
          LiveLogTag lIVE_COMMENT = LiveLogTag.LIVE_COMMENT_NOTICE;
          b.c0(lIVE_COMMENT, "HIGH_VALUE_RECHARGE_NOTICE show", "info", ta);
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean(b.d("user")+"hasShownHighValueRechargeCard", true);
          g.a(uEditor);
          if (!PatchProxy.applyVoid(objArray, objArray, g.class, str)) {
             int i = a.z() + true;
             a.Q(i);
             b.c0(lIVE_COMMENT, "[HIGH_VALUE_RECHARGE] So far, already shown: ", "showTimes", Integer.valueOf(i));
          }
          a.e(tb.c.a(), String.valueOf(ta.mNoticeType), ta.mBizId);
          b.c(tb.c.a(), "LIVE_ROOM_COMMENT_NOTICE", tb.d.a(a.class).d6());
       }
       return;
    }
}
