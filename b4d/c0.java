package b4d.c0;
import n3d.a;
import b4d.a0;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.text.Editable;
import java.lang.Object;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import b4d.c0$a;
import java.lang.Runnable;
import ekd.k1;
import android.widget.EditText;
import android.view.View;
import com.yxcorp.utility.n;
import java.util.Objects;
import java.util.Set;
import android.os.Parcelable;
import org.parceler.b;
import java.util.HashSet;
import java.util.Iterator;
import com.yxcorp.gifshow.model.ContactTargetItem;
import com.kwai.framework.model.user.User;
import java.util.Collection;
import com.yxcorp.gifshow.share.l;
import com.kwai.library.widget.edittext.SafeEditText;
import java.util.List;
import java.util.ArrayList;
import lnc.c0;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.StringsKt__StringsKt;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;

public final class c0 implements a	// class@00035b
{
    public final a0 b;
    public final boolean c;
    public final EmojiEditText d;
    public final Editable e;

    public void c0(a0 p0,boolean p1,EmojiEditText p2,Editable p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       Iterator iterator;
       a0 w;
       Editable text;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(c0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c0.class, "1")) {
          return;
       }
       if (p1 != -1 || (p2 == null || (a0.R8(this.b).getContext() != null && !a0.R8(this.b).isDetached()))) {
          boolean b = true;
          if (this.c != null) {
             Dialog dialog = a0.R8(this.b).getDialog();
             if (dialog != null && dialog.getWindow() != null) {
                if (a0.R8(this.b).z1 != null) {
                   k1.r(new c0$a(this), 300);
                }else {
                   this.d.requestFocus();
                   n.b0(a0.R8(this.b).getContext(), this.d, b);
                   this.d.setSelected(b);
                }
             }
          }
          c0 tb = this.b;
          Objects.requireNonNull(tb);
          HashSet hashSet = PatchProxy.applyOneRefs(p2, tb, uoa0, "18");
          int i = 0;
          if (hashSet != patchProxyRe) {
          }else {
             Set set = b.a(p2.getParcelableExtra("key_select_users_result_data"));
             if (set != null) {
                HashSet hashSet1 = new HashSet();
                iterator = set.iterator();
                while (iterator.hasNext()) {
                   hashSet1.add(iterator.next().mUser);
                }
                hashSet = hashSet1;
             }else {
                set = i;
             }
          }
          if (hashSet) {
             User[] userArray = new User[0];
             Object[] objArray = hashSet.toArray(userArray);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
             l.a(objArray);
             c0 tb1 = this.b;
             tb1.B = b;
             tb1.Y8(this.d, this.e);
             tb1 = this.b;
             String str = tb1.a9(hashSet, 0);
             Objects.requireNonNull(tb1);
             if (!PatchProxy.applyVoidOneRefs(str, tb1, uoa0, "21")) {
                a0 w1 = tb1.w;
                if (w1 != null && w1.getText() != null) {
                   ArrayList uArrayList = PatchProxy.apply(i, tb1, uoa0, "36");
                   if (uArrayList != patchProxyRe) {
                   }else {
                      uArrayList = new ArrayList();
                      w = tb1.w;
                      if (w != null) {
                         text = w.getText();
                         if (text != null) {
                            Matcher matcher = c0.a.matcher(text);
                            while (matcher.find()) {
                               uArrayList.add(matcher.group());
                            }
                         }
                      }
                   }
                   Iterator iterator2 = uArrayList.iterator();
                   while (iterator2.hasNext()) {
                      String str1 = iterator2.next();
                      if (StringsKt__StringsKt.O2(str, str1, 0, 2, i)) {
                         continue ;
                      }
                      tb1.Z8(str1);
                   }
                }
             }
             c0 tb2 = this.b;
             Objects.requireNonNull(tb2);
             if (!PatchProxy.applyVoidOneRefs(hashSet, tb2, uoa0, "23")) {
                w = tb2.w;
                if (w != null) {
                   text = w.getText();
                   if (text != null) {
                      Iterator iterator1 = hashSet.iterator();
                      while (iterator1.hasNext()) {
                         a.o(text, "it");
                         String atIdWithAt = iterator1.next().getAtIdWithAt();
                         a.o(atIdWithAt, "user.atIdWithAt");
                         if (StringsKt__StringsKt.O2(text, atIdWithAt, 0, 2, i)) {
                            iterator1.remove();
                         }
                      }
                   }
                }
             }
             tb2 = this.d;
             c0 tb3 = this.b;
             if (!tb2.getSelectionStart() || (this.b.h9(this.d.getSelectionStart()) || this.b.e9(this.d.getSelectionStart()))) {
                b = false;
             }
             tb2.h(tb3.a9(hashSet, b));
             iterator = hashSet.iterator();
             while (iterator.hasNext()) {
                a0.R8(this.b).n1.add(iterator.next().getId());
             }
             this.b.l9();
             iterator.B = false;
          }else {
             Log.g("EmotionAtFloatPanelPresenter", "openAtUserActivity#ActivityCallback: SelectUserResult is null");
          }
       }
    label_01e6 :
       return;
    }
}
