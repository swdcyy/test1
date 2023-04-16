package at4.c;
import at4.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import java.util.List;
import java.lang.CharSequence;
import lnc.a1;
import d61.k;

public class c implements b	// class@000302
{
    public TextView a;
    public TextView b;
    public TextView c;
    public TextView d;

    public void c(View p0){
       super();
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.a = m1.f(p0, 0x7f0a1c53);
          this.b = m1.f(p0, 0x7f0a1c55);
          this.c = m1.f(p0, 0x7f0a1c54);
          this.d = m1.f(p0, 0x7f0a1c52);
       }
       return;
    }
    public void a(LiveQuestionnaire p0){
       int i;
       c ta;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoc, "3")) {
          i = 8;
          this.a.setVisibility(i);
          this.b.setVisibility(i);
          this.c.setVisibility(i);
          this.d.setVisibility(i);
       }
       i = 0;
       while (i < p0.mQuestionOptions.size()) {
          if (!i) {
             ta = this.a;
          }else if(i == 1){
             ta = this.b;
          }else if(i == 2){
             ta = this.c;
          }else if(i == 3){
             ta = this.d;
          }else {
             ta = null;
          }
          if (ta != null) {
             ta.setVisibility(0);
             ta.setText(p0.mQuestionOptions.get(i));
             ta.setTextColor(k.c(p0.mOptionFontColor, a1.a(R.color.arg_RES_7f0607de)));
          }
          i = i + 1;
       }
       return;
    }
}
