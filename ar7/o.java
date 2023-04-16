package ar7.o;
import androidx.lifecycle.Observer;
import ar7.n;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoCreateInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import java.lang.Math;
import qp7.c;
import qp7.d;
import ar7.q;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import java.util.Map;
import android.view.View;
import android.view.ViewStub;
import ar7.m;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.widget.ImageView;

public final class o implements Observer	// class@000359
{
    public final n b;

    public void o(n p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i2;
       int b;
       View view1;
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          CoCreateInfo mMembers = p0.mMembers;
          if (mMembers != null) {
             o tb = this.b;
             int i = mMembers.size();
             Objects.requireNonNull(tb);
             int i1 = 1;
             if (PatchProxy.isSupport(on)) {
                Map$Entry obj = PatchProxy.applyOneRefs(Integer.valueOf(i), tb, on, "5");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                label_0079 :
                   q d = this.b.l().d;
                   if (d != null) {
                      d.onNext(Integer.valueOf(i));
                   }
                   tb = this.b;
                   p0 = p0.mMembers;
                   a.o(p0, "it.mMembers");
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i), tb, on, "4")) {
                      i2 = 0;
                      while (i2 < i) {
                         CoCreateInfo$CoCreateMember uCoCreateMem = p0.get(i2);
                         if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), uCoCreateMem, tb, on, "6")) {
                            b = 2;
                            if (i2 <= b && i2 >= 0) {
                               View view = tb.l.get(Integer.valueOf(i2));
                               if (view == null) {
                                  if (i2) {
                                     if (i2 != i1) {
                                        if (i2 == b) {
                                           view1 = tb.j0().findViewById(R.id.co_creator_stub_3).inflate();
                                        }
                                     }else {
                                        view1 = tb.j0().findViewById(R.id.co_creator_stub_2).inflate();
                                     }
                                  }else {
                                     view1 = tb.j0().findViewById(R.id.co_creator_stub_1).inflate();
                                  }
                                  view = view1;
                                  a.o(view, "itemViewRoot");
                                  tb.l.put(Integer.valueOf(i2), view);
                                  view.setOnClickListener(new m(tb, i2));
                               }
                               view1 = view.findViewById(R.id.co_creator_item_icon);
                               a.m(view1);
                               view1.U(uCoCreateMem.mHeadIconUrls);
                               view1 = view.findViewById(R.id.co_creator_item_label);
                               a.m(view1);
                               view1.setText(uCoCreateMem.mRole);
                               view1 = view.findViewById(R.id.co_creator_item_name);
                               a.m(view1);
                               view1.setText(uCoCreateMem.mAliasName);
                            }
                         }
                         i2 = i2 + 1;
                      }
                      Iterator iterator = tb.l.entrySet().iterator();
                      while (iterator.hasNext()) {
                         obj = iterator.next();
                         if (obj.getKey().intValue() < i) {
                            obj.getValue().setVisibility(0);
                         }else {
                            obj.getValue().setVisibility(8);
                         }
                      }
                      if (p0.size() == i) {
                         p0 = tb.v(R.id.co_creator_more);
                         a.o(p0, "co_creator_more");
                         p0.setVisibility(8);
                      }else {
                         p0 = tb.v(R.id.co_creator_more);
                         a.o(p0, "co_creator_more");
                         p0.setVisibility(0);
                      }
                   }
                }
             }
             int i3 = tb.m - a1.d(0x7f070355);
             i2 = a1.d(R.dimen.arg_RES_7f0702fe);
             int i4 = a1.d(R.dimen.arg_RES_7f070344);
             b = a1.d(R.dimen.arg_RES_7f07031b);
             String str = null;
             int i5 = 0;
             while (str < i) {
                i3 = i3 - i4;
                if (str > 0) {
                   i3 = i3 - b;
                }
                int i6 = i - 1;
                String str1 = (str < i6)? 1: null;
                if (str1 && i3 < i2) {
                   break ;
                }else if(i3 > 0){
                   i5 = i5 + 1;
                }
                str = str + 1;
             }
             i = Math.min(i5, 3);
             goto label_0079 ;
          }
       }
       return;
    }
}
