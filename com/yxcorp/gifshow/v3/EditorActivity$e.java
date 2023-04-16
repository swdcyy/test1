package com.yxcorp.gifshow.v3.EditorActivity$e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import android.view.ViewTreeObserver;
import android.view.View;
import faa.a;
import q87.c;
import java.lang.CharSequence;
import android.widget.RadioButton;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.v3.EditorActivity$e$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class EditorActivity$e implements ViewTreeObserver$OnPreDrawListener	// class@000d17
{
    public final List b;
    public final EditorActivity c;

    public void EditorActivity$e(EditorActivity p0,List p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onPreDraw(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, EditorActivity$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.c.N3().k.getViewTreeObserver().removeOnPreDrawListener(this);
       String str = "EditorActivity";
       if (this.c.N3().f == null) {
          objArray = new Object[0];
          a.D().A(str, "null rightBtn or null mTabViews", objArray);
          return 0;
       }else {
          this.c.N3().i.requestLayout();
          if (TextUtils.x(this.c.P[1].getText())) {
             objArray = new Object[0];
             a.D().A(str, "center of mTabViews is null", objArray);
             return 0;
          }else {
             this.c.N3().i.getViewTreeObserver().addOnGlobalLayoutListener(new EditorActivity$e$a(this));
             return 0;
          }
       }
    }
}
