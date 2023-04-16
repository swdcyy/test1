package com.yxcorp.gifshow.v3.EditorActivity$e$a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.EditorActivity$e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.EditorActivity$e;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.v3.EditorActivity$PreviewTabInfo;
import android.view.ViewTreeObserver;
import android.widget.RadioButton;
import java.util.List;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import java.util.Objects;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import java.lang.Integer;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.RadioGroup;

public class EditorActivity$e$a$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000d15
{
    public final EditorActivity$e$a b;

    public void EditorActivity$e$a$a(EditorActivity$e$a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditorActivity$e$a$a.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().s("EditorActivity", "mTabViews VIDEO onGlobalLayout\(\) called", objArray1);
       EditorActivity$e c = this.b.b.c;
       c.P[c.K3(EditorActivity$PreviewTabInfo.VIDEO)].getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (this.b.b.b.size() <= 1) {
          this.b.b.c.N3().m.setIndicatorVisible(8);
       }
       AbsEditorActivityViewBinder m = this.b.b.c.N3().m;
       EditorActivity$e c1 = this.b.b.c;
       int id = c1.P[c1.e1].getId();
       Objects.requireNonNull(m);
       if (!PatchProxy.isSupport(PostRadioGroupWithIndicator.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(id), m, PostRadioGroupWithIndicator.class, "10")) {
          m.t = 0;
          if (!PatchProxy.isSupport(PostRadioGroupWithIndicator.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(id), m, PostRadioGroupWithIndicator.class, "9")) {
             m.m.setOnCheckedChangeListener(objArray);
             m.l(id);
             m.o(id, 0);
             m.m.setOnCheckedChangeListener(m);
          }
       }
       return;
    }
}
