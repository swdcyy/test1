package com.yxcorp.gifshow.v3.editor.text.vb.DefaultTextEditorFragmentVB;
import com.yxcorp.gifshow.v3.editor.text.vb.AbsTextEditorFragmentVB;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public final class DefaultTextEditorFragmentVB extends AbsTextEditorFragmentVB	// class@001507
{

    public void DefaultTextEditorFragmentVB(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public void onDestroy(){
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultTextEditorFragmentVB.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.e = p0;
       this.f = m1.f(p0, 0x7f0a0a70);
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultTextEditorFragmentVB.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d04c3, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­r_text, container, false\)");
       return view;
    }
}
