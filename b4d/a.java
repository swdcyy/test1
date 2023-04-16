package b4d.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b4d.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qk5.e;
import qk5.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewStub;
import pk5.l;
import qk5.d;
import android.view.View$OnAttachStateChangeListener;
import ekd.m1;
import android.widget.EditText;
import a4d.s;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;

public class a extends PresenterV2	// class@000356
{
    public s p;
    public EmotionFloatEditorFragment q;
    public PublishSubject r;
    public EmotionFloatEditConfig s;
    public EditText t;
    public ViewStub u;
    public e v;
    public b w;

    public void a(){
       super();
       this.w = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       e uoe = new e(this.w);
       this.v = uoe;
       a tu = this.u;
       a tt = this.t;
       Objects.requireNonNull(uoe);
       if (PatchProxy.applyTwoRefs(tu, tt, uoe, e.class, "1") != PatchProxyResult.class) {
       }else {
          tu.setLayoutResource(R.layout.arg_RES_7f0d03d7);
          uoe.d = tu.inflate();
          uoe.c = tt;
          l ol = new l();
          uoe.e = ol;
          ol.f(uoe.d);
          Object[] objArray = new Object[]{uoe};
          uoe.e.i(objArray);
          uoe.d.addOnAttachStateChangeListener(new d(uoe));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0ca8);
       this.u = m1.f(p0, 0x7f0a026c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(s.class);
       this.q = this.r8("floateditor");
       this.r = this.t8("emotion_preview");
       this.s = this.r8("emotion_edit_float_config");
       return;
    }
}
