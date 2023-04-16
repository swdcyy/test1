package com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3$a;
import tvc.g;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3;
import java.lang.Object;
import xld.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import amd.c;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import yld.l;
import xld.a;

public final class TextTTSFragmentV3$a extends g	// class@000b5e
{
    public final TextTTSFragmentV3 c;

    public void TextTTSFragmentV3$a(TextTTSFragmentV3 p0){
       this.c = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTTSFragmentV3$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          c uoc = this.a();
          if (uoc == null) {
             uoc = this.c.eh().u0();
          }
          Iterator iterator = this.c.q.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa instanceof l) {
                uoa.x(p0, uoc);
             }
          }
       }
       return;
    }
}
