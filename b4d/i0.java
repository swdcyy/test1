package b4d.i0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.util.Collection;
import ekd.q;
import android.app.Activity;
import lnc.a1;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b4d.h0;
import android.view.View$OnLayoutChangeListener;
import com.kwai.feature.component.commonfragment.baseeditor.f;
import b4d.i0$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Boolean;

public class i0 extends PresenterV2	// class@000373
{
    public View$OnLayoutChangeListener p;
    public BaseEditorFragment$Arguments q;
    public EmotionFloatEditorFragment r;
    public boolean s;
    public boolean t;
    public EmojiEditText u;
    public RecyclerView v;

    public void i0(){
       super();
    }
    public void E8(){
       i0 oi0 = i0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi0, "3")) {
          return;
       }
       this.v.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
       if (!q.f(this.q.mHotWords)) {
          if (!PatchProxy.applyVoid(objArray, this, oi0, "4") && (a1.i(this.getActivity()) && this.getActivity().getResources().getConfiguration().orientation == 2)) {
             if (this.v.getParent() instanceof LinearLayout) {
                LinearLayout parent = this.v.getParent();
                parent.setGravity(80);
                parent.setClipToPadding(0);
             }
             h0 oh0 = new h0(this);
             this.p = oh0;
             this.v.addOnLayoutChangeListener(oh0);
          }
       label_006f :
          f uof = new f();
          uof.y = this.t;
          uof.r1(new i0$a(this));
          uof.W0(this.q.mHotWords);
          this.v.setAdapter(uof);
          this.v.setVisibility(0);
       }else {
          this.v.setVisibility(8);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "5")) {
          return;
       }
       i0 tp = this.p;
       if (tp != null) {
          this.v.removeOnLayoutChangeListener(tp);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a0ca8);
       this.v = m1.f(p0, 0x7f0a12ff);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       this.q = this.r8("args");
       this.r = this.r8("floateditor");
       this.s = this.r8("manualopen").booleanValue();
       this.t = this.r8("use_colorful_bg").booleanValue();
       return;
    }
}
