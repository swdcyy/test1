package com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import e17.i;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3;
import qrd.p;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;

public final class TextTimelineViewBinderV3$a extends m	// class@000b5a
{
    public final TextTimelineViewBinderV3 c;

    public void TextTimelineViewBinderV3$a(TextTimelineViewBinderV3 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTimelineViewBinderV3$a.class, str)) {
          return;
       }
       a.p(p0, "view");
       if (this.c.p.isSelected()) {
          a.o(i.a(R.style.arg_RES_7f11066a, 0x7f100c96), "KSToast.applyStyle\(R.sty¡­ng.edit_text_select_tips\)");
       }else {
          TextTimelineViewBinderV3$a tc = this.c;
          Objects.requireNonNull(tc);
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, tc, TextTimelineViewBinderV3.class, str);
          if (obj != PatchProxyResult.class) {
          }else {
             obj = tc.r.getValue();
          }
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoid(objArray, obj, TextTTSFragmentV3.class, "15")) {
             TextTTSFragmentV3 s = obj.s;
             str = "editorDelegate";
             if (s == null) {
                a.S(str);
             }
             BaseFragment uBaseFragmen = s.q();
             String str1 = "editorDelegate.previewFragment";
             a.o(uBaseFragmen, str1);
             e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
             a.o(uoe, "editorDelegate.previewFr¡­anager.beginTransaction\(\)");
             uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
             if (obj.isAdded()) {
                uoe.E(obj).o();
             }else {
                TextTTSFragmentV3 s1 = obj.s;
                if (s1 == null) {
                   a.S(str);
                }
                BaseFragment uBaseFragmen1 = s1.q();
                a.o(uBaseFragmen1, str1);
                c childFragmen = uBaseFragmen1.getChildFragmentManager();
                Fragment uFragment = childFragmen.findFragmentByTag("TextTTSFragmentV3");
                if (uFragment != null) {
                   uoe.u(uFragment);
                }
                TextTTSFragmentV3 s2 = obj.s;
                if (s2 == null) {
                   a.S(str);
                }
                uoe.g(s2.m(), obj, "TextTTSFragmentV3");
                uoe.o();
             }
          }
       }
       return;
    }
}
