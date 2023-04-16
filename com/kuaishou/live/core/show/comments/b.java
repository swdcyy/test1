package com.kuaishou.live.core.show.comments.b;
import lf3.g;
import com.kuaishou.live.core.show.comments.f;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w51.a;
import p91.m;
import uf1.a;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import da1.c;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ComboCommentFeed;
import com.kuaishou.live.basic.model.QLiveMessage;
import ca1.a;
import da1.a;
import java.util.List;
import ekd.q;
import ne1.g;
import n52.e;
import java.lang.Iterable;
import ok.o;
import qk.y;
import qk.m;
import com.kuaishou.live.core.show.comments.e;
import com.kuaishou.live.core.show.comments.a;
import ok.h;
import re1.h;
import re1.e;
import re1.f;
import com.kuaishou.live.core.show.comments.LiveCommentsAreaConfig$UserMatchedFeature;
import re1.c;
import re1.g;
import java.util.Comparator;
import java.util.Collections;
import re1.d;
import re1.k;
import com.kuaishou.live.common.core.component.comments.display.e;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Exception;
import pp.c;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class b implements g	// class@000a57
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       f b1;
       ArrayList value;
       h a;
       b tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "8")) {
       }else if(p0 == null || a.C()){
          if (tb.R != null) {
             LiveStreamMessages$SCFeedPush comboComment = p0.comboCommentFeed;
             if (comboComment == null || !comboComment.length) {
                boolean b = false;
                tb.R = b;
                b1 = tb.B;
                if (b1 != null) {
                   ArrayList obj = b1.wb(tb.t.getLiveStreamId(), "COMBO_COMMENT");
                   if (obj instanceof Collection) {
                      ArrayList uArrayList = new ArrayList(obj);
                      obj = new ArrayList(uArrayList.size());
                      Iterator iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         value = iterator.next().getValue();
                         if (value instanceof ComboCommentMessage) {
                            LiveStreamMessages$ComboCommentFeed uComboCommen = PatchProxy.applyOneRefs(value, null, c.class, "14");
                            if (uComboCommen != patchProxyRe) {
                            }else {
                               uComboCommen = new LiveStreamMessages$ComboCommentFeed();
                               if (value != null) {
                                  uComboCommen.id = value.mId;
                                  uComboCommen.comboCount = value.mComboCount;
                                  uComboCommen.content = value.mContent;
                                  uComboCommen.time = value.mTime;
                               }
                            }
                            obj.add(uComboCommen);
                         }else if(value instanceof LiveStreamMessages$ComboCommentFeed){
                            obj.add(value);
                         }
                      }
                      LiveStreamMessages$ComboCommentFeed[] uComboCommen1 = new LiveStreamMessages$ComboCommentFeed[b];
                      p0.comboCommentFeed = obj.toArray(uComboCommen1);
                   }
                }
             }
          }
          List list = tb.C.c(p0).a();
          if (!q.f(list)) {
             f d = tb.D;
             if (d != null) {
                d.a(list);
             }
             y.q(list, new e(tb));
             if (tb.K != null) {
                ArrayList uArrayList1 = new ArrayList();
                m.s(list).p(e.b).F(a.b).n(uArrayList1);
                list.removeAll(uArrayList1);
                b1 = tb.O;
                Objects.requireNonNull(b1);
                h oh = h.class;
                value = PatchProxy.applyOneRefs(uArrayList1, b1, oh, "2");
                if (value != patchProxyRe) {
                }else {
                   value = new ArrayList();
                   if (!q.f(uArrayList1)) {
                      a = b1.a;
                      if (uArrayList1.size() > a) {
                         b1.b(uArrayList1, value, a, new e(value));
                         a = b1.a;
                         if (value.size() < a) {
                            b1.b(uArrayList1, value, (a - value.size()), new f(value));
                         }
                         if (value.size() < b1.a) {
                            Iterator iterator1 = b1.b.iterator();
                            while (iterator1.hasNext()) {
                               int i = b1.a - value.size();
                               b1.b(uArrayList1, value, i, new c(b1, iterator1.next(), value));
                            }
                         }
                         if (value.size() < b1.a) {
                            if (!PatchProxy.applyVoidOneRefs(uArrayList1, b1, oh, "5")) {
                               Collections.sort(uArrayList1, g.b);
                            }
                            b1.b(uArrayList1, value, (b1.a - value.size()), new d(value));
                         }
                         b1.a(value, b1.b);
                      }
                   }
                   value.addAll(uArrayList1);
                   b1.a(value, b1.b);
                }
                tb.P.a(value);
                tb.G = tb.G + value.size();
                tb.I.h(value);
             }
             tb.P.a(list);
             tb.P8(list);
          }
       }
    }
    public boolean V(){
       return f.a(this);
    }
}
