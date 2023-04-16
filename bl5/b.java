package bl5.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ql8.a;
import bk5.c;
import android.widget.ImageView;
import java.util.Objects;
import java.lang.CharSequence;
import dk5.b;
import android.graphics.Bitmap;
import com.facebook.drawee.view.DraweeView;
import java.io.File;
import jl5.h;
import com.kwai.emotionsdk.widget.FrescoImageView;
import java.util.List;
import android.view.View;
import bl5.a;
import android.view.View$OnClickListener;
import jl5.w;
import android.widget.EditText;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import xk5.c;

public class b extends PresenterV2	// class@0004cd
{
    public a p;
    public EditText q;
    public EmotionPanelConfig r;
    public c s;
    public FrescoImageView t;
    public static final String u = "b";

    public void b(){
       super();
    }
    public void E8(){
       a b;
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          b = tp.b;
          if (b instanceof c) {
             if (this.t.getTag() != null && this.t.getTag().equals(b.a)) {
                return;
             }else {
                c a = b.a;
                Objects.requireNonNull(a);
                if (!a.equals("[my_spacing]")) {
                   int i = 0;
                   this.t.setVisibility(i);
                   this.t.setContentDescription(b.a);
                   if (b.e().a(b.a)) {
                      this.t.setImageBitmap(b.e().d(b.a));
                   }else {
                      File uFile = h.e(b.b);
                      if (uFile != null) {
                         this.t.v(uFile, i, i);
                      }else {
                         this.t.y(b.c);
                      }
                   }
                }else {
                   this.t.setVisibility(8);
                }
                this.t.setTag(b.a);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       p0.setOnClickListener(new a(this, p0));
       if (p0.getAlpha() - 0x3f800000 < 0) {
          p0.setAlpha(0x3f800000);
       }
       this.t = w.a(p0, 0x7f0a0cdd);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.t8("EMOJI_EDIT_TEXT");
       this.r = this.r8("EMOTION_PANEL_CONFIG");
       this.s = this.t8("EMOTION_INTERACT_CALLBACK");
       return;
    }
}
