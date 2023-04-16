package e8a.v$a;
import d6a.a;
import e8a.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import e8a.v$a$a;
import android.view.View$OnClickListener;
import android.view.View;

public final class v$a extends a	// class@0020dd
{
    public final v b;

    public void v$a(v p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, v$a.class, "2")) {
          return;
       }
       this.b.s = false;
       return;
    }
    public void i2(){
       v q;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v$a.class, "1")) {
          return;
       }
       v$a tb = this.b;
       tb.s = true;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, v.class, "8") && tb.s != null) {
          v t = tb.t;
          if (t == null) {
             a.S("mPhoto");
          }
          String str = "mForwardIcon";
          if (t.isQuestionnaire()) {
             t = tb.p;
             if (t == null) {
                a.S(str);
             }
             t.setImageResource(R.drawable.arg_RES_7f080aa8);
             t = tb.p;
             if (t == null) {
                a.S(str);
             }
             t.setAlpha(0x3f000000);
          }else {
             t = tb.p;
             if (t == null) {
                a.S(str);
             }
             t.setImageResource(R.drawable.arg_RES_7f0819b6);
             t = tb.p;
             if (t == null) {
                a.S(str);
             }
             t.setAlpha(0x3f800000);
          }
          q = tb.r;
          if (q == null) {
             a.S("mForwardText");
          }
          q.setText(R.string.arg_RES_7f104725);
       }
       q = this.b.q;
       if (q == null) {
          a.S("mForwardButton");
       }
       q.setOnClickListener(new v$a$a(this));
       return;
    }
}
