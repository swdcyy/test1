package com.kwai.live.gzone.accompanyplay.edit.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import android.view.View;
import android.widget.TextView;
import com.kwai.live.gzone.accompanyplay.edit.o;
import android.view.View$OnClickListener;
import n37.m;
import n37.n;
import com.kwai.live.gzone.accompanyplay.edit.n;

public class p extends PresenterV2	// class@000c14
{
    public n p;
    public TextView q;
    public View r;
    public FloatEditorFragment s;

    public void p(){
       super();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       p ts = this.s;
       if (ts != null) {
          ts.dismiss();
          this.s = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       TextView textView = p0.findViewById(R.id.live_gzone_accompany_fleet_rename_edit_text_view);
       this.q = textView;
       textView.setOnClickListener(new o(this));
       this.r = p0.findViewById(0x7f0a1db5);
       p0.findViewById(R.id.live_gzone_accompany_fleet_rename_negative_text_view).setOnClickListener(new m(this));
       this.r.setOnClickListener(new n(this));
       this.r.setEnabled(false);
       this.r.setAlpha(0x3f000000);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.p = this.q8(n.class);
       return;
    }
}
