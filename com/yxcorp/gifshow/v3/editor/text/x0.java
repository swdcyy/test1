package com.yxcorp.gifshow.v3.editor.text.x0;
import a17.b$b;
import com.yxcorp.gifshow.v3.editor.text.b1;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import hvc.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import aw9.z;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import huc.a1;
import huc.b0;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import java.lang.CharSequence;
import huc.v;
import android.view.View$OnClickListener;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kuaishou.edit.draft.TtsAudio;
import faa.a;
import java.lang.StringBuilder;
import w46.b;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import hba.a;
import haa.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import jod.g;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.kuaishou.edit.draft.TimeRange;
import hvc.m;
import android.util.Pair;
import com.yxcorp.gifshow.v3.editor.text.tts.g;
import com.yxcorp.gifshow.v3.editor.text.tts.g$b;
import jba.a;
import com.yxcorp.gifshow.v3.editor.text.tts.e$c;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import brd.a0;
import t45.d;
import brd.z;
import huc.z;
import erd.o;
import huc.a0;
import huc.w;
import java.lang.Runnable;
import erd.a;
import huc.y;
import huc.x;
import erd.g;

public final class x0 implements b$b	// class@00150e
{
    public final b1 a;

    public void x0(b1 p0){
       this.a = p0;
    }
    public final void a(c p0,View p1,int p2){
       g$b a1;
       x0 a = this.a;
       Objects.requireNonNull(a);
       if (!p2) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, a, b1.class, "13")) {
             a.b("update", a1.p(R.string.arg_RES_7f100cb9));
             if (a.r.getActivity() != null && (a.S != null && a.z.getPlayer() instanceof VideoSDKPlayerView)) {
                b1 s = a.S;
                FragmentActivity activity = a.r.getActivity();
                View view = a.z.getPlayer();
                a1 uoa1 = new a1(a);
                Objects.requireNonNull(s);
                b0 uob0 = b0.class;
                if (!PatchProxy.applyVoidThreeRefs(activity, view, uoa1, s, b0.class, "14") && s.i != null) {
                   int i = 0;
                   if (!PatchProxy.applyVoidOneRefs(activity, s, uob0, "20")) {
                      AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
                      s.k = uAttrAnimPro;
                      uAttrAnimPro.wh(a1.p(R.string.arg_RES_7f104dda));
                      s.k.sh(a1.p(R.string.cancel));
                      s.k.th(new v(s));
                      s.k.setCancelable(i);
                      s.k.show(activity.getSupportFragmentManager(), "NormalTextHelper");
                   }
                   if (!PatchProxy.applyVoidTwoRefs(view, uoa1, s, uob0, "15")) {
                      if (s.i != null) {
                         b0 h = s.h;
                         if (h != null) {
                            TtsAudio ttsAudio = s.e(h.getDecorationId());
                            if (ttsAudio == null) {
                               objArray = new Object[i];
                               a.D().t("NormalTextHelper", "startDownloadTTSSpeech, failed to find tts audio, decorationId = "+s.h.getDecorationId(), objArray);
                            }else {
                               Object[] objArray1 = new Object[i];
                               a.D().w("NormalTextHelper", "startDownloadTTSSpeech", objArray1);
                               s.j = objArray;
                               Iterator iterator = a.r(s.c).z().iterator();
                               while (iterator.hasNext()) {
                                  Text text = iterator.next();
                                  if ((text.getResult().getIdentifier()).equals(s.h.getDecorationId())) {
                                     g og = new g(ttsAudio.getSpeakerId(), ttsAudio.getLanguageType(), s.h.getText(), text.getResult().getIdentifier(), text.getResult().getRange().getStart(), ttsAudio.getVolume());
                                     String str = m.c(v9);
                                     s.j = new Pair(v9, objArray);
                                     if (!s.i.j(str)) {
                                        g$b uob = s.i.i(str);
                                        if (uob != null) {
                                           a1 = uob.a;
                                           if (a1 != null) {
                                              v9.g = a1;
                                              g$b b = uob.b;
                                              v9.f = b;
                                              m.e(v9.a, v9.b, a1, v9.d, v9.h, v9.e, b, s.d);
                                              break ;
                                           }
                                        }
                                        s.i.k();
                                        s.i.l(s.m);
                                        s.i.m(v9);
                                        break ;
                                     }
                                  }
                                  g og1 = null;
                               }
                               s.c();
                               a0 obj = PatchProxy.applyTwoRefs(view, uoa1, s, uob0, "16");
                               if (obj != PatchProxyResult.class) {
                                  objArray = obj;
                               }else if(s.i == null){
                                  objArray = new Object[0];
                                  a.D().w("NormalTextHelper", "waitAllTaskComplete, start", objArray);
                                  z a2 = d.a;
                                  obj = s.i.n().G(a2).C(new z(s)).G(d.c).C(new a0(s)).G(a2);
                                  objArray = obj.m(new w(s, uoa1)).R(new y(s, view), new x(s));
                               }
                               s.l = objArray;
                            }
                         }
                      }
                      objArray = new Object[0];
                      a.D().t("NormalTextHelper", "startDownloadTTSSpeech failed, mTtsDownloadManager = "+s.i+", mSelectedTextElement = "+s.h, objArray);
                   }
                }
             }
          }
       }
       return;
    }
}
