package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.style.TextPanelStyleFragmentV3;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.HashMap;
import vod.a;
import java.util.List;

public final class TextPanelStyleFragmentV3 extends Fragment	// class@000c5e
{
    public final List b;
    public HashMap c;

    public void TextPanelStyleFragmentV3(){
       super();
       this.b = new ArrayList();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextPanelStyleFragmentV3.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       return LayoutInflater.from(this.getContext()).inflate(0x7f0d15dd, null);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextPanelStyleFragmentV3.class, "3")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(null, this, TextPanelStyleFragmentV3.class, "5")) {
          TextPanelStyleFragmentV3 tc = this.c;
          if (tc != null) {
             tc.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelStyleFragmentV3.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.b.add(new a(this, p0));
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
}
