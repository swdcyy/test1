package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.TextPanelFontFragmentV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
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
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.HashMap;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2;
import java.util.List;
import ynd.b;

public final class TextPanelFontFragmentV2 extends BaseFragment	// class@000b9d
{
    public final List j;
    public HashMap k;

    public void TextPanelFontFragmentV2(){
       super(null, null, null, null, 15, null);
       this.j = super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextPanelFontFragmentV2.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       return LayoutInflater.from(this.getContext()).inflate(0x7f0d15d6, null);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextPanelFontFragmentV2.class, "4")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(null, this, TextPanelFontFragmentV2.class, "6")) {
          TextPanelFontFragmentV2 tk = this.k;
          if (tk != null) {
             tk.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelFontFragmentV2.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.j.add(new TextFontViewBinderV2(this, p0));
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, TextPanelFontFragmentV2.class, "3")) {
          return;
       }
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (!uoa instanceof b) {
             uoa = null;
          }
          if (uoa != null) {
             uoa.u();
          }
       }
       return;
    }
}
