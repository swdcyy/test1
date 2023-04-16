package com.yxcorp.gifshow.v3.editor.text.vb.AbsTextEditorFragmentVB;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;

public abstract class AbsTextEditorFragmentVB extends BaseViewBinder	// class@001506
{
    public View e;
    public RecyclerView f;

    public void AbsTextEditorFragmentVB(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public final RecyclerView y(){
       return this.f;
    }
}
