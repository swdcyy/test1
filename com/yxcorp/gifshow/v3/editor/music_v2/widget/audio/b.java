package com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.b;
import erd.g;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.g;
import java.lang.Object;
import nsc.u;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsc.r;
import osc.b;
import osc.b$a;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.AudioRecorderFragment$a;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.a;
import java.util.List;
import ok.h;
import com.google.common.collect.Lists;
import java.lang.Iterable;
import java.util.ArrayList;
import com.yxcorp.gifshow.media.builder.b;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i$c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import nsc.c;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import nsc.e;
import erd.a;
import nsc.g;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.f;
import crd.b;
import nsc.a;
import java.lang.Runnable;
import t45.c;

public final class b implements g	// class@001135
{
    public final g b;

    public void b(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       boolean b;
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.g != null) {
          tb.n = p0.b;
       }
       g og = g.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tb, og, "9")) {
          p0 = p0.a;
          Object[] objArray = null;
          g og1 = 1;
          if (p0 != og1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 != 4) {
                      if (p0 == 5) {
                         tb.b();
                         p0 = PatchProxyResult.class;
                         if (PatchProxy.applyVoid(objArray, tb, og, "13") || (tb.l == null || (tb.k != null && tb.d != null))) {
                            if (!r.a(tb.h)) {
                               tb.d.j(0);
                               tb.c(objArray);
                               tb.k.e();
                               tb.k.d(objArray, tb.n, tb.h.e);
                               tb.k.onDismiss(objArray);
                               tb.i.dismiss();
                            }else {
                               Object[] objArray1 = new Object[0];
                               a.D().w("AudioRecord", "accept audio", objArray1);
                               i e = tb.l.e;
                               g d = tb.d;
                               ArrayList uArrayList = Lists.c(Lists.h(e, a.b));
                               g l = tb.l;
                               Objects.requireNonNull(l);
                               b uob = PatchProxy.apply(objArray, l, i.class, "6");
                               if (uob != p0) {
                               }else {
                                  i h = l.h;
                                  uob = (h != null)? h.c: Lists.b();
                               }
                               d.c = uArrayList;
                               d.b = Lists.c(uob);
                               d.f = tb.h.i;
                               if (!tb.d.i()) {
                                  d = tb.d;
                                  d.g = objArray;
                                  d.h = 0;
                               }
                               i = (tb.h.i != null)? e.size() + og1: e.size();
                               AttrAnimProgressFragment obj = PatchProxy.applyOneRefs(e, tb, og, "14");
                               if (obj != p0) {
                                  b = obj.booleanValue();
                               }else if(q.f(e)){
                                  p0 = e.iterator();
                                  while (true) {
                                     if (p0.hasNext()) {
                                        i$c uoc = p0.next();
                                        if (uoc != null && uoc.b == null) {
                                           b = false;
                                           break ;
                                        }
                                     }
                                  }
                               }
                               b = true;
                               if (b && i == tb.d.f()) {
                                  og1 = false;
                               }
                               tb.d.j(i);
                               tb.c(tb.d.d());
                               if (tb.i.getActivity() == null) {
                                  i1.c(new RuntimeException("AudioRecord, failed to save file, activity = null"));
                               }else {
                                  b = tb.d;
                                  obj = new AttrAnimProgressFragment();
                                  obj.setCancelable(0);
                                  obj.show(tb.i.getActivity().getSupportFragmentManager(), "AudioRecord");
                                  g og2 = new g(tb, b);
                                  tb.a(t.fromCallable(new c(tb, b, og1)).subscribeOn(d.c).observeOn(d.a).doAfterTerminate(new e(tb, obj)).subscribe(og2, f.b));
                               }
                            }
                         }
                      }
                   }else {
                      tb.l.a();
                      tb.i.dismiss();
                   }
                }else {
                   tb.b();
                }
             }else {
                tb.b();
             }
          }else if(!PatchProxy.applyVoid(objArray, tb, og, "11") && tb.p == null){
             c.a(new a(tb));
          }
       }
       return;
    }
}
