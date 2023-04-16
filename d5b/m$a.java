package d5b.m$a;
import erd.g;
import d5b.m;
import java.lang.Object;
import a5b.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.utility.n;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.widget.TextView;
import java.lang.Boolean;
import java.util.List;
import e5b.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import j8c.b;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g9c.a;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class m$a implements g	// class@00244a
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       m q;
       List list;
       m q1;
       int i3;
       boolean b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, str)) {
       }else {
          int i = 4;
          if (TextUtils.x(p0.a())) {
             n.Y(this.b.P8(), i, false);
          }else {
             n.Y(this.b.P8(), false, false);
             m$a tb = this.b;
             a.o(p0, "it");
             Objects.requireNonNull(tb);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, m.class, "14")) {
                int i1 = 1;
                int i2 = a.g(p0.a(), tb.s) ^ i1;
                tb.s = p0.a();
                String str1 = "magicSearchPanelFragment";
                if (p0.d()) {
                   q = tb.q;
                   if (q == null) {
                      a.S("tvEmptyHintView");
                   }
                   q.setText(a1.p(R.string.arg_RES_7f103161));
                label_00a4 :
                   list = null;
                }else {
                   ArrayList obj = PatchProxy.apply(null, p0, h.class, str);
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else {
                      h b1 = p0.b;
                      b = (b1 != null && b1.isEmpty())? true: false;
                   }
                   i3 = 0x7f103162;
                   if (b) {
                      q = tb.q;
                      if (q == null) {
                         a.S("tvEmptyHintView");
                      }
                      q.setText(a1.p(i3));
                      goto label_00a4 ;
                   }else if(!p0.e()){
                      p0 = tb.r;
                      if (p0 == null) {
                         a.S("magicFaceListContainer");
                      }
                      n.Y(p0, i, false);
                   }else {
                      list = c.a.a(p0.b());
                      m u2 = tb.u;
                      if (u2 == null) {
                         a.S(str1);
                      }
                      Objects.requireNonNull(u2);
                      Object obj1 = PatchProxy.applyOneRefs(list, u2, MagicSearchFragment.class, "23");
                      if (obj1 != patchProxyRe) {
                         list = obj1;
                      }else {
                         a.p(list, "magicFaceList");
                         if (u2.l == null) {
                            b.d("MagicSearchFragment", "updateSupportMagicFaces magicEmoji is empty!!!");
                            obj = new ArrayList();
                         }
                      }
                      if (q.f(list)) {
                         q1 = tb.q;
                         if (q1 == null) {
                            a.S("tvEmptyHintView");
                         }
                         q1.setText(a1.p(i3));
                      }else {
                         i1 = 0;
                      }
                   }
                }
                q1 = tb.q;
                if (q1 == null) {
                   a.S("tvEmptyHintView");
                }
                i3 = (i1)? 0: 4;
                n.Y(q1, i3, false);
                q1 = tb.p;
                if (q1 == null) {
                   a.S("magicListRecyclerView");
                }
                if (!i1) {
                   i = 0;
                }
                n.Y(q1, i, false);
                if (!i1) {
                   m u = tb.u;
                   if (u == null) {
                      a.S(str1);
                   }
                   u.Fh(list, p0.c(), p0.a());
                   m u1 = tb.u;
                   if (u1 == null) {
                      a.S(str1);
                   }
                   Objects.requireNonNull(u1);
                   if (!PatchProxy.isSupport(MagicSearchFragment.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(i2), u1, MagicSearchFragment.class, "20")) {
                      a.p(p0, "result");
                      if (u1.p != null && u1.s != null) {
                         if (TextUtils.x(p0.c())) {
                            if (i2) {
                               p0 = u1.p;
                               a.o(p0, "mRecyclerView");
                               p0 = p0.getLayoutManager();
                               if (p0 != null) {
                                  p0.scrollToPosition(false);
                               }
                            }
                         }else {
                            MagicFaceFragment s = u1.s;
                            a.o(s, "mMagicFaceAdapter");
                            list = s.Q0();
                            int i4 = -1;
                            Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                               MagicEmoji$MagicFace magicFace = iterator.next();
                               i4 = i4 + 1;
                               SimpleMagicFace mId = (magicFace != null)? magicFace.mId: null;
                               if (mId != null && a.g(p0.c(), magicFace.mId)) {
                                  break ;
                               }
                            }
                            if (i4 >= 0 && i4 < list.size()) {
                               if (i4 <= (list.size() - 5)) {
                                  p0 = u1.p;
                                  a.o(p0, "mRecyclerView");
                                  p0 = p0.getLayoutManager();
                                  if (p0 != null) {
                                     p0.scrollToPositionWithOffset(i4, n.c(u1.getContext(), 80.00f));
                                  }
                               }else {
                                  p0 = u1.p;
                                  a.o(p0, "mRecyclerView");
                                  p0 = p0.getLayoutManager();
                                  if (p0 != null) {
                                     p0.scrollToPosition(i4);
                                  }
                               }
                            }else if(i2){
                               p0 = u1.p;
                               a.o(p0, "mRecyclerView");
                               p0 = p0.getLayoutManager();
                               if (p0 != null) {
                                  p0.scrollToPosition(false);
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_0208 :
       return;
    }
}
