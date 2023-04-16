package dy0.a$a;
import dy0.e;
import dy0.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g$a;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ay0.h;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.util.Iterator;
import java.util.List;
import dy0.e$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;

public class a$a implements e	// class@00205f
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,boolean p1){
       BaseEditorFragment$g obj;
       Iterator iterator;
       BaseEditorFragment$g$a og$a1;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), uoa, uoa1, "4") && (uoa.q.Sh() && !uoa.q.Rh()))) {
          String str = TextUtils.G(uoa.s).toString();
          boolean b = true;
          if (!TextUtils.isEmpty(str)) {
             BaseEditorFragment$g$a og$a = new BaseEditorFragment$g$a();
             og$a.l(str);
             og$a.i(uoa.s.j());
             og$a.f(p0);
             obj = PatchProxy.apply(null, uoa, uoa1, "7");
             if (obj != PatchProxyResult.class) {
                obj = obj.booleanValue();
             }else {
                a t = uoa.t;
                if (t == null || t.getVisibility()) {
                   b = 0;
                }
                t = b;
             }
             og$a.e(obj);
             og$a.b(uoa.r.b());
             og$a.m = p1;
             obj = og$a.a();
          }else if(uoa.p.mEnableEmpty != null){
             og$a1 = new BaseEditorFragment$g$a();
             og$a1.l("");
             obj = og$a1.a();
          }else {
             og$a1 = new BaseEditorFragment$g$a();
             og$a1.d(b);
             og$a1.l("");
             obj = og$a1.a();
          }
          if (!PatchProxy.applyVoidOneRefs(obj, uoa, uoa1, "5")) {
             iterator = uoa.u.iterator();
             while (iterator.hasNext()) {
                iterator.next().b(obj);
             }
          }
          if (uoa.q.Lh() != null) {
             uoa.q.Lh().a(obj);
          }
          if (!PatchProxy.applyVoidOneRefs(obj, uoa, uoa1, "6")) {
             iterator = uoa.u.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(obj);
             }
          }
          if (uoa.p.mDismissAfterEntryComplete != null) {
             uoa.q.dismiss();
          }else {
             uoa.s.setText("");
          }
       }
    label_0127 :
       return;
    }
    public void b(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       if (!this.a.u.contains(p0)) {
          this.a.u.add(p0);
       }
       return;
    }
    public void c(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       if (this.a.u.contains(p0)) {
          this.a.u.remove(p0);
       }
       return;
    }
}
