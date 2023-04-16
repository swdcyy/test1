package e63.o;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;

public final class o implements View$OnClickListener	// class@002668
{
    public final e b;
    public final ExpandEmojiTextView c;
    public final UserProfile d;

    public void o(e p0,ExpandEmojiTextView p1,UserProfile p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       o tb = this.b;
       o tc = this.c;
       o td = this.d;
       if (tb.u1 != null) {
          tc.v(td.mProfile.mText, tb.t1);
          tb.u1 = false;
       }else {
          tc.setText(td.mProfile.mText);
          tb.u1 = true;
       }
       return;
    }
}
