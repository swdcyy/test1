package b53.g;
import android.view.View$OnLongClickListener;
import com.kuaishou.live.gzone.barrage.h;
import java.lang.Object;
import android.view.View;
import t02.a0;
import j47.a;
import jp3.a;
import java.lang.String;
import android.content.SharedPreferences;
import com.lsjwzh.widget.text.FastTextView;
import ft5.b;
import java.lang.CharSequence;
import com.kuaishou.live.comments.view.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.common.core.component.comments.util.LiveCommentLogger$LongClickMessageType;
import com.kuaishou.live.common.core.component.comments.util.LiveCommentLogger;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView;

public final class g implements View$OnLongClickListener	// class@00030c
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       a0 h;
       g tb = this.b;
       h s = tb.s;
       boolean b = false;
       if (s != null && s.g2 != null) {
          a0 e1 = s.E1;
          if (e1 != null) {
             if (!e1.uk() && a.a.getBoolean("live_comments_long_press_copy", b)) {
                s = tb.s;
                s.i = true;
                s.j = true;
                e1 = s.Y1;
                if (p0 instanceof FastTextView) {
                   if (e1.v5()) {
                      e1.Y3(p0.getText().toString());
                   }else if(!e1.M()){
                      h = tb.s.H;
                      if (h != null) {
                         h.do(b);
                      }
                      LiveCommentLogger.e(tb.s.Z2.a(), LiveCommentLogger$LongClickMessageType.BARRAGE, p0.getText().toString(), "");
                      e1.ed(p0.getText().toString(), b, "LONG_PRESS_COPY");
                   }
                }else if(p0 instanceof LiveComboCommentView){
                   String comboContent = p0.getComboContent();
                   if (e1.v5()) {
                      e1.Y3(comboContent);
                   }else if(!e1.M()){
                      h = tb.s.H;
                      if (h != null) {
                         h.do(b);
                      }
                      LiveCommentLogger.e(tb.s.Z2.a(), LiveCommentLogger$LongClickMessageType.BATTER, comboContent, "");
                      e1.ed(comboContent, b, "LONG_PRESS_COPY");
                   }
                }
             }
             b = true;
          }
       }
       return b;
    }
}
