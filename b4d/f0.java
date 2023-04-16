package b4d.f0;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import b4d.a0;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.util.Objects;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import kotlin.jvm.internal.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.util.Set;
import android.content.Context;
import b4d.b0;
import com.kwai.feature.api.social.SelectUserView;
import wkd.b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$l;
import zu5.b;
import android.view.View;
import qrd.l1;
import android.widget.EditText;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.EmojiEditText;

public final class f0 extends AnimatorListenerAdapter	// class@000364
{
    public final ViewGroup a;
    public final a0 b;

    public void f0(ViewGroup p0,a0 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationStart(Animator p0){
       a0 w;
       int b2;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a0 uoa0 = a0.class;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, obj, f0.class, "1")) {
          return;
       }
       boolean b = true;
       a0.R8(obj.b).Ri(b);
       obj.b.j9();
       f0 b1 = obj.b;
       f0 a = obj.a;
       Objects.requireNonNull(b1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoidOneRefs(a, b1, uoa0, "12")) {
          w = b1.w;
          if (w != null && w.getText() != null) {
             SelectUsersBundle selectUsersB = new SelectUsersBundle();
             a0 q = b1.q;
             String str = "mArguments";
             if (q == null) {
                a.S(str);
             }
             selectUsersB = selectUsersB.setBizId(q.mSelectUserBizId).setNewPanelV3(b);
             q = b1.q;
             if (q == null) {
                a.S(str);
             }
             selectUsersB = selectUsersB.setLimitNum(q.mAtFriendMaxLimit);
             q = b1.q;
             if (q == null) {
                a.S(str);
             }
             SelectUsersBundle selectUsersB1 = selectUsersB.setLimitToast(q.mAtFriendMaxLimitToastResId).setCheckedUsers(b1.b9());
             Context context = a.getContext();
             a.o(context, "container.context");
             a.o(selectUsersB1, "bundle");
             b0 uob0 = new b0(b1, a);
             b0 uob01 = uob0;
             b0 uob02 = uob0;
             SelectUserView selectUserVi = PatchProxy.applyThreeRefs(context, selectUsersB1, uob01, b1, a0.class, "11");
             if (selectUserVi != patchProxyRe) {
             }else {
                selectUserVi = b.a(-1592401538).S0(context, selectUsersB1, uob02);
                a.o(selectUserVi, "Singleton.get\(OnSelectUs¡­bundle, activityCallback\)");
             }
             if (selectUserVi != null) {
                a.addView(selectUserVi);
                l1 a1 = l1.a;
             }else {
                selectUserVi = objArray;
             }
             b1.v = selectUserVi;
          }
       }
       obj.a.setVisibility(0);
       b1 = obj.b;
       Objects.requireNonNull(b1);
       if (!PatchProxy.applyVoid(objArray, b1, uoa0, "14")) {
          w = b1.w;
          if (w != null && w.getSelectionStart() == w.getSelectionEnd()) {
             int selectionSta = w.getSelectionStart();
             if (PatchProxy.isSupport(uoa0)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(selectionSta), b1, uoa0, "30");
                if (obj1 != patchProxyRe) {
                   b2 = obj1.booleanValue();
                }else if(selectionSta >= 1){
                   a0 w1 = b1.w;
                   b2 = (w1 != null)? w1.length(): 0;
                   if (b2 >= selectionSta) {
                      w1 = b1.w;
                      if (w1 != null) {
                         Editable text = w1.getText();
                         if (text != null) {
                            objArray = text.subSequence((selectionSta - 1), selectionSta).toString();
                         }
                      }
                      b2 = b1.d9(objArray);
                   }
                }
                b2 = false;
             }else {
                goto label_00fc ;
             }
             if (!b2) {
                b1.B = true;
                w.h("@");
                b1.B = false;
             }
          }
       }
       obj.b.S8();
       PatchProxy.onMethodExit(f0.class, "1");
       return;
    }
}
