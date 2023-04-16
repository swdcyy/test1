package bl5.h$a;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$c;
import bl5.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.emotionsdk.widget.EmojiPopupWindow;
import java.lang.Integer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import vk5.b;
import com.kwai.robust.PatchProxyResult;
import ql8.a;
import pl8.a;
import bk5.c;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import lnc.a1;
import com.kwai.emotionsdk.util.ActivityContext;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import jl5.h;
import com.yxcorp.gifshow.model.CDNUrl;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import com.kwai.emotionsdk.widget.FrescoImageView;
import android.widget.TextView;
import android.view.ViewParent;
import androidx.fragment.app.c;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;

public class h$a implements EmotionLongClickRecyclerView$c	// class@0004d7
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$a.class, "2")) {
          return;
       }
       h$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, h.class, "6")) {
          h q = ta.q;
          if (q != null) {
             q.Ug();
          }
       }
       return;
    }
    public void b(int p0,int p1){
       a uoa1;
       EmojiPopupWindow uEmojiPopupW;
       int[] ointArray;
       int i2;
       c b;
       c a;
       h$a uoa = h$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, str)) {
          return;
       }
       h$a ta = this.a;
       Objects.requireNonNull(ta);
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, oh, "5")) {
          oh = ta.p;
          int childAdapter = oh.getChildAdapterPosition(oh.getChildAt(p1));
          h p = ta.p;
          if (childAdapter != -1) {
             b adapter = p.getAdapter();
             Objects.requireNonNull(adapter);
             b uob = b.class;
             if (PatchProxy.isSupport(uob)) {
                uoa1 = PatchProxy.applyOneRefs(Integer.valueOf(childAdapter), adapter, uob, str);
                if (uoa1 != PatchProxyResult.class) {
                label_0069 :
                   if (uoa1 instanceof a && (uoa1.b instanceof c && (double)ta.p.getChildAt(p1).getAlpha() - 0x3fe6666666666666 > 0)) {
                      if (ta.q == null) {
                         uEmojiPopupW = new EmojiPopupWindow();
                         ta.q = uEmojiPopupW;
                         uEmojiPopupW.k = ta.t.isEnableForceDarkStyle();
                         ta.q.l = ta.t.isEnableForceLightStyle();
                      }
                      adapter = 0;
                      int i = 2;
                      if (!ta.r - adapter) {
                         ta.r = (float)((- (a1.d(0x7f0703b4) - a1.d(0x7f0703b7))) / i);
                      }
                      if (!ta.s - adapter) {
                         ta.s = (float)(- ((a1.d(0x7f0703b3) + a1.d(0x7f0703b6)) + a1.d(0x7f0702cc)));
                      }
                      int i1 = 0;
                      if (ActivityContext.d().e()) {
                         ointArray = new int[i];
                         ta.p.getLocationOnScreen(ointArray);
                         childAdapter = - ointArray[i1];
                         i2 = n.A(ta.getContext());
                      }else {
                         childAdapter = 0;
                         i2 = 0;
                      }
                      uoa1 = uoa1.b;
                      b = uoa1.b;
                      if (TextUtils.x(b)) {
                         h q = ta.q;
                         if (q != null) {
                            q.Ug();
                         }
                      }else {
                         a = uoa1.a;
                         if (!TextUtils.x(a) && a.length() > i) {
                            a = a.substring(1, (a.length() - 1));
                         }
                         ArrayList uArrayList = new ArrayList();
                         uArrayList.add(new CDNUrl(null, h.b(b)));
                         if (ta.getActivity() != null && ta.getActivity() instanceof FragmentActivity) {
                            h q1 = ta.q;
                            FragmentActivity activity = ta.getActivity();
                            View childAt = ta.p.getChildAt(p1);
                            int i3 = (int)ta.r + childAdapter;
                            ta = (int)ta.s + i2;
                            Objects.requireNonNull(q1);
                            if (PatchProxy.isSupport(EmojiPopupWindow.class)) {
                               Object[] objArray = new Object[]{activity,childAt,Integer.valueOf(i3),Integer.valueOf(ta),uArrayList,a};
                               if (!PatchProxy.applyVoid(objArray, q1, EmojiPopupWindow.class, "6")) {
                               }
                            }else if(activity != null && (activity.isFinishing() || childAt == null)){
                               uEmojiPopupW = q1.c;
                               if (uEmojiPopupW != null) {
                                  uEmojiPopupW.y(uArrayList);
                               }
                               uEmojiPopupW = q1.d;
                               if (uEmojiPopupW != null) {
                                  uEmojiPopupW.setText(a);
                               }
                               ointArray = new int[i];
                               childAt.getLocationOnScreen(ointArray);
                               if (childAt.getParent() != null) {
                                  int[] ointArray1 = new int[i];
                                  childAt.getParent().getLocationOnScreen(ointArray1);
                                  if (ointArray1[1] > ointArray[1]) {
                                     ointArray[1] = ointArray1[1];
                                  }
                               }
                               q1.g = uArrayList;
                               q1.h = a;
                               q1.e = ointArray[i1] + i3;
                               q1.f = ((ointArray[1] + childAt.getMeasuredHeight()) + ta) - q1.j;
                               q1.show(activity.getSupportFragmentManager(), "emoji");
                               if (q1.getDialog() != null && q1.getDialog().getWindow() != null) {
                                  Window window = q1.getDialog().getWindow();
                                  WindowManager$LayoutParams attributes = window.getAttributes();
                                  attributes.width = -2;
                                  attributes.height = -2;
                                  attributes.flags = 40;
                                  attributes.gravity = 51;
                                  attributes.x = ointArray[i1] + i3;
                                  attributes.y = ((ointArray[1] + childAt.getMeasuredHeight()) + ta) - q1.j;
                                  window.setAttributes(attributes);
                               }
                            }
                         }
                      }
                   }
                }
             }
             uoa1 = adapter.i.get(childAdapter);
             goto label_0069 ;
          }
       }
    label_0233 :
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "3")) {
          return;
       }
       this.a.S8();
       return;
    }
}
