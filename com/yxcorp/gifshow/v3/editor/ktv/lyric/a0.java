package com.yxcorp.gifshow.v3.editor.ktv.lyric.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.a0$a;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.a0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import android.view.View;
import drc.s;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.widget.adv.model.f;

public class a0 extends PresenterV2	// class@000fd0
{
    public c p;
    public EditorDelegate q;
    public Set r;
    public f s;
    public EditDecorationContainerView$b t;
    public Boolean u;
    public EditDecorationContainerView v;
    public ExpandFoldHelperView w;
    public TextElementViewModel x;
    public final ExpandFoldHelperView$g y;
    public y z;

    public void a0(){
       super();
       this.y = new a0$a(this);
       this.z = new a0$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "3")) {
          return;
       }
       if (!this.u.booleanValue()) {
          this.w.setPreActionListener(this.y);
       }
       this.r.add(this.z);
       this.v.setDelegate(this.t);
       this.x = k1.c(this.q, this.u.booleanValue());
       this.v.e0();
       this.q.C().setOnClickListener(new s(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "4")) {
          return;
       }
       this.w.setPreActionListener(null);
       this.v.setDelegate(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a2eff);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.p = this.r8("WORKSPACE");
       this.q = this.r8("EDITOR_DELEGATE");
       this.r = this.r8("EDITOR_VIEW_LISTENERS");
       this.s = this.r8("TIME_LINE_SAVE_DATA");
       this.t = this.r8("SHOWING_DELEGATE");
       this.u = this.r8("IS_COVER_PANEL");
       this.v = this.r8("DECORATION_CONTAINER_VIEW");
       return;
    }
}
