package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3;
import eod.d;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostFragmentV3;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$compositeDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import xod.f;
import androidx.fragment.app.Fragment;
import rod.m;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.ArrayList;
import ynd.g;
import java.util.LinkedHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$b;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$c;
import crd.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$d;
import io.reactivex.g;
import brd.t;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$e;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$f;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$g;
import erd.g;
import erd.a;
import crd.b;

public final class TextPanelTemplateHostViewBinderV3 extends d	// class@000c69
{
    public final p c;
    public final m d;
    public final ImageView e;
    public final ProgressBar f;
    public final View g;
    public final View h;
    public final List i;
    public final g j;
    public final Map k;
    public final TextPanelTemplateHostFragmentV3 l;

    public void TextPanelTemplateHostViewBinderV3(TextPanelTemplateHostFragmentV3 p0,View p1){
       f a;
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       super(p1);
       this.l = p0;
       this.c = s.c(TextPanelTemplateHostViewBinderV3$compositeDisposable$2.INSTANCE);
       a = f.a;
       this.d = a.f(p0);
       View view = p1.findViewById(R.id.origin_theme);
       a.o(view, "rootView.findViewById\(R.id.origin_theme\)");
       this.e = view;
       view = p1.findViewById(R.id.progress_bar);
       a.o(view, "rootView.findViewById\(R.id.progress_bar\)");
       this.f = view;
       view = p1.findViewById(R.id.refresh_layout);
       a.o(view, "rootView.findViewById\(R.id.refresh_layout\)");
       this.g = view;
       p1 = p1.findViewById(R.id.text_panel_tab_host_root);
       a.o(p1, "rootView.findViewById\(R.¡­text_panel_tab_host_root\)");
       this.h = p1;
       this.i = new ArrayList();
       this.j = a.h(p0);
       this.k = new LinkedHashMap();
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, TextPanelTemplateHostViewBinderV3.class, "2")) {
          return;
       }
       this.I();
       this.l.Oh(new TextPanelTemplateHostViewBinderV3$a(this));
       this.e.setOnClickListener(new TextPanelTemplateHostViewBinderV3$b(this));
       this.g.setOnClickListener(new TextPanelTemplateHostViewBinderV3$c(this));
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, TextPanelTemplateHostViewBinderV3.class, "4")) {
          return;
       }
       this.G().dispose();
       return;
    }
    public final a G(){
       Object obj = PatchProxy.apply(null, this, TextPanelTemplateHostViewBinderV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final Map H(){
       return this.k;
    }
    public final void I(){
       if (PatchProxy.applyVoid(null, this, TextPanelTemplateHostViewBinderV3.class, "3")) {
          return;
       }
       this.f.setVisibility(0);
       this.G().c(t.create(new TextPanelTemplateHostViewBinderV3$d(this)).subscribe(new TextPanelTemplateHostViewBinderV3$e(this), new TextPanelTemplateHostViewBinderV3$f(this), new TextPanelTemplateHostViewBinderV3$g(this)));
       return;
    }
}
