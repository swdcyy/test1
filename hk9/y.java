package hk9.y;
import kk9.b;
import android.view.View;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import kk9.b$a;
import jl5.c;
import android.content.res.ColorStateList;
import java.lang.CharSequence;
import android.view.ViewStub;
import android.view.ViewParent;
import android.widget.LinearLayout;

public class y implements b	// class@0026b5
{
    public View a;
    public View b;
    public TextView c;
    public TextView d;

    public void y(View p0,TextView p1){
       super();
       this.a = p0;
       this.c = p1;
    }
    public void a(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy, "3")) {
          return;
       }
       oy = this.b;
       if (oy != null) {
          oy.setVisibility(p0);
       }
       return;
    }
    public boolean b(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public void c(EmotionInfo p0,QMedia p1,b$a p2){
       y td;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, y.class, "2")) {
          return;
       }
       if (p0 == null && (p1 == null && this.b == null)) {
          return;
       }
       String str = (p1 == null)? c.g(R.string.arg_RES_7f100d1f): c.g(R.string.arg_RES_7f101640);
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(str, this, y.class, "1")) {
          if (this.b != null) {
             td = this.d;
             if (td != null) {
                td.setTextColor(this.c.getTextColors());
                this.d.setText(str);
             }
          }else {
             ViewStub viewStub = this.a.findViewById(R.id.comment_editor_emotion_prefix_tip_stub);
             if (viewStub != null && viewStub.getParent() != null) {
                View view = viewStub.inflate();
                this.b = view;
                this.d = view.findViewById(0x7f0a085b);
                if (this.b.getParent() instanceof LinearLayout) {
                   this.b.getParent().setOrientation(i);
                }
                td = this.d;
                if (td != null) {
                   td.setTextColor(this.c.getTextColors());
                   this.d.setText(str);
                }
             }
          }
       }
       y tb = this.b;
       if (tb != null) {
          if (p0 == null && p1 == null) {
             i = 8;
          }
          tb.setVisibility(i);
       }
       return;
    }
}
