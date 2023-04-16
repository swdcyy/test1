package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.CheckBox;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lsc.g0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import urc.e;
import urc.f;
import urc.i;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import urc.k;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicUnSelectedAction;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.SwitchTab;
import esc.a;
import java.lang.Enum;
import kotlin.Pair;
import androidx.recyclerview.widget.RecyclerView;
import qrd.p;
import jn9.b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import mn9.a;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicItemClickedAction;
import src.b;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import src.n;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.v3.editor.music_v2.action.RapStyleSwitchAction;
import faa.a;
import java.lang.StringBuilder;
import w46.b;

public final class EditMusicMainViewBinder$c implements View$OnClickListener	// class@0010f6
{
    public final EditMusicMainViewBinder b;

    public void EditMusicMainViewBinder$c(EditMusicMainViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       Pair pair;
       Object obj1;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditMusicMainViewBinder$c.class, "1")) {
          return;
       }
       EditMusicMainViewBinder$c tb = this.b;
       EditMusicMainViewBinder g = tb.g;
       a.o(g, "musicCheckbox");
       int b = g.isChecked();
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EditMusicMainViewBinder uEditMusicMa = EditMusicMainViewBinder.class;
       if (!PatchProxy.isSupport(uEditMusicMa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uEditMusicMa, "9")) {
          g0 og0 = g0.class;
          int i = 1;
          Object obj = null;
          if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), obj, og0, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLOSE_MUSIC";
             i3 oi3 = i3.f();
             oi3.a("is_check", Boolean.valueOf(b));
             uElementPack.params = oi3.e();
             u1.u(i, uElementPack, obj);
          }
          if (!b) {
             i oi = tb.j.o0().s().i();
             if (oi != null) {
                SelectSource selectSource = oi.h();
                if (selectSource != null) {
                   tb.j.t0(new MusicUnSelectedAction(tb.j.o0().v().d(), selectSource));
                }
             }
          }else {
             b = a.a[tb.j.o0().s().c().ordinal()];
             if (b != i) {
                if (b != 2) {
                   if (b != 3) {
                      if (b != 4) {
                         pair = new Pair(obj, obj);
                      }else {
                         obj1 = PatchProxy.apply(obj, tb, uEditMusicMa, "5");
                         if (obj1 != patchProxyRe) {
                         }else {
                            obj1 = tb.t.getValue();
                         }
                         pair = new Pair(obj1, tb.p);
                      }
                   }else {
                      obj1 = PatchProxy.apply(obj, tb, uEditMusicMa, "4");
                      if (obj1 != patchProxyRe) {
                      }else {
                         obj1 = tb.s.getValue();
                      }
                      pair = new Pair(obj1, tb.o);
                   }
                }else {
                   obj1 = PatchProxy.apply(obj, tb, uEditMusicMa, "3");
                   if (obj1 != patchProxyRe) {
                   }else {
                      obj1 = tb.r.getValue();
                   }
                   pair = new Pair(obj1, tb.n);
                }
             }else {
                obj1 = PatchProxy.apply(obj, tb, uEditMusicMa, "2");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = tb.q.getValue();
                }
                pair = new Pair(obj1, tb.m);
             }
             RecyclerView recyclerView = pair.component1();
             obj = pair.component2();
             if (recyclerView != null && obj != null) {
                RecyclerView$LayoutManager layoutManage = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int i1 = layoutManage.h();
                b = 0;
                if (i1 < 0 || i1 >= obj.m().size()) {
                   Object[] objArray = new Object[b];
                   a.D().t("EditMusicMainViewBinder", "firstVisibleItemPosition out of index: "+i1, objArray);
                }else {
                   a uoa = obj.m().get(i1);
                   tb.j.t0(new MusicItemClickedAction());
                   if (!uoa instanceof b) {
                      b.E(obj, (i1 + i), false, null, 6, null);
                   }else if(uoa instanceof n){
                      String id = uoa.b().getId();
                      if (id != null && id.length()) {
                         i = 0;
                      }
                      if (i) {
                         tb.j.t0(new RapStyleSwitchAction());
                      }
                   }
                   b.E(obj, i1, false, null, 6, null);
                }
             }
          }
       }
    label_01ce :
       return;
    }
}
