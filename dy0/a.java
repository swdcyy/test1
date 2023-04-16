package dy0.a;
import im8.g;
import k51.c;
import java.util.LinkedList;
import dy0.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.kwai.robust.PatchProxyResult;
import dy0.d;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import ay0.h;

public class a extends c implements g	// class@002060
{
    public BaseEditorFragment$Arguments p;
    public BaseEditorFragment q;
    public h r;
    public EmojiEditText s;
    public View t;
    public final List u;
    public e v;
    public static String sLivePresenterClassName = "LiveFloatEditorCompletePresenter";

    public void a(){
       super();
       this.u = new LinkedList();
       this.v = new a$a(this);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.u.clear();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0ca8);
       this.t = m1.f(p0, 0x7f0a1cc9);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("EDITOR_ARGS");
       this.q = this.r8("EDITOR_FRAGMENT");
       this.r = this.r8("ASR_SERVICE");
       return;
    }
}
