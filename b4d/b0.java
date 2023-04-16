package b4d.b0;
import zu5.b;
import b4d.a0;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import e17.i;
import mrd.c;
import java.lang.Boolean;
import brd.y;
import java.util.Objects;
import com.yxcorp.utility.Log;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import wkd.b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$l;
import android.widget.EditText;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import n3d.a;
import b4d.c0;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public final class b0 implements b	// class@000357
{
    public final a0 a;
    public final ViewGroup b;

    public void b0(a0 p0,ViewGroup p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(int p0){
       if (PatchProxy.isSupport2(b0.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, b0.class, "1")) {
          return;
       }
       if (p0 != 1) {
          if (p0 == 2) {
             i.a(R.style.arg_RES_7f110668, 0x7f10398a);
             a0.P8(this.a).onNext(Boolean.FALSE);
          }
       }else {
          i.a(R.style.arg_RES_7f110668, 0x7f10398b);
          a0.P8(this.a).onNext(Boolean.FALSE);
       }
       PatchProxy.onMethodExit(b0.class, "1");
       return;
    }
    public void n2(){
       a0 p1;
       SelectUsersBundle selectUsersB2;
       c0 uoc0;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, obj, b0.class, "2")) {
          return;
       }
       a0.P8(obj.a).onNext(Boolean.FALSE);
       b0 a = obj.a;
       Objects.requireNonNull(a);
       a0 uoa0 = a0.class;
       if (!PatchProxy.applyVoid(objArray, a, uoa0, "16")) {
          Log.g("EmotionAtFloatPanelPresenter", "openAtUserActivity");
          a0 w = a.w;
          if (w != null) {
             Editable text = w.getText();
             if (text != null) {
                a0 p = a.p;
                if (p == null) {
                   a.S("mFloatEditorFragment");
                }
                boolean b = true;
                p.r1 = b;
                boolean b1 = b.a(-1592401538).R0();
                if (b1) {
                   w.clearFocus();
                   boolean b2 = false;
                   w.setSelected(b2);
                   p1 = a.p;
                   if (p1 == null) {
                      a.S("mFloatEditorFragment");
                   }
                   p1.Ui(b2);
                }
                SelectUsersBundle selectUsersB = new SelectUsersBundle();
                p1 = a.q;
                String str = "mArguments";
                if (p1 == null) {
                   a.S(str);
                }
                selectUsersB = selectUsersB.setBizId(p1.mSelectUserBizId);
                p1 = a.q;
                if (p1 == null) {
                   a.S(str);
                }
                selectUsersB = selectUsersB.setLimitNum(p1.mAtFriendMaxLimit).setHalfScreen(b1);
                p1 = a.q;
                if (p1 == null) {
                   a.S(str);
                }
                SelectUsersBundle selectUsersB1 = selectUsersB.setLimitToast(p1.mAtFriendMaxLimitToastResId).setCheckedUsers(a.b9()).setFromPanel(b);
                a.o(selectUsersB1, "bundle");
                selectUsersB1.setSearchText(a.D);
                a.o(text, "it");
                if (PatchProxy.isSupport(uoa0)) {
                   selectUsersB2 = selectUsersB1;
                   uoc0 = PatchProxy.applyThreeRefs(w, text, Boolean.valueOf(b1), a, a0.class, "17");
                   if (uoc0 != PatchProxyResult.class) {
                   label_00d8 :
                      Activity activity = a.getActivity();
                      if (activity != null) {
                         a0 p2 = a.p;
                         if (p2 == null) {
                            a.S("mFloatEditorFragment");
                         }
                         BaseEditorFragment f = p2.F;
                         if (f != null) {
                            f.T0(activity, selectUsersB2, uoc0);
                         }else {
                            b.a(-1592401538).T0(activity, selectUsersB2, uoc0);
                         }
                         activity.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
                      }
                   }
                }else {
                   selectUsersB2 = selectUsersB1;
                }
                uoc0 = new c0(a, b1, w, text);
                goto label_00d8 ;
             }
          }
       }
       PatchProxy.onMethodExit(b0.class, "2");
       return;
    }
}
