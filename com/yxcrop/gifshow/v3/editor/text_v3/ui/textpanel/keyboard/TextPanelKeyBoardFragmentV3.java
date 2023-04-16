package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.keyboard.TextPanelKeyBoardFragmentV3;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
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
import ag6.a;
import java.util.HashMap;

public final class TextPanelKeyBoardFragmentV3 extends BaseFragment	// class@000c5d
{
    public HashMap j;

    public void TextPanelKeyBoardFragmentV3(){
       super(null, null, null, null, 15, null);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextPanelKeyBoardFragmentV3.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d051a, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­ate_v3, container, false\)");
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, TextPanelKeyBoardFragmentV3.class, "3")) {
       }else {
          TextPanelKeyBoardFragmentV3 tj = this.j;
          if (tj != null) {
             tj.clear();
          }
       }
       return;
    }
}
