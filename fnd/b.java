package fnd.b;
import and.a;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hnd.f;
import gnd.b;
import android.widget.TextView;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fnd.a;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.vb.SubtitleTimelineOperatorViewBinder$initViews$2;
import zmd.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import xld.a;
import nsd.r0;
import java.lang.Double;
import java.util.Arrays;
import java.lang.Boolean;
import jod.a;
import com.yxcorp.gifshow.widget.adv.model.a;
import java.lang.CharSequence;

public final class b extends a implements a	// class@000e4e
{
    public final f c;
    public final View d;
    public final View e;
    public final TextView f;
    public final String g;
    public final Fragment h;
    public final EditorDelegate i;
    public final a j;

    public void b(Fragment p0,View p1,EditorDelegate p2,a p3){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "delegate");
       a.p(p3, "hiddenAbility");
       super(p1);
       this.h = p0;
       this.i = p2;
       this.j = p3;
       this.c = b.a(p0);
       View view = p1.findViewById(R.id.cancel_button);
       this.d = view;
       View view1 = p1.findViewById(R.id.subtitle_timeline_clear);
       this.e = view1;
       p1 = p1.findViewById(R.id.subtitle_text_duration);
       a.o(p1, "rootView.findViewById\(R.id.subtitle_text_duration\)");
       this.f = p1;
       this.g = a1.p(0x7f104c30);
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
       }else {
          view.setOnClickListener(new a(this));
          view1.setOnClickListener(new SubtitleTimelineOperatorViewBinder$initViews$2(this));
       }
       return;
    }
    public void B(){
       PatchProxy.applyVoid(null, this, b.class, "2");
    }
    public void C(){
       PatchProxy.applyVoid(null, this, b.class, "3");
    }
    public final String D(a p0){
       Double uDouble;
       Double uDouble1;
       Object[] objArray;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.i().iterator();
       while (true) {
          uDouble = null;
          if (obj.hasNext()) {
             uDouble1 = obj.next();
             Object obj1 = (uDouble1.l0() == p0.o())? 1: null;
             if (!obj1) {
                continue ;
             }
          }else {
             uDouble1 = uDouble;
          }
          objArray = new Object[1];
          if (uDouble1 != null) {
             uDouble = Double.valueOf(uDouble1.j0());
             break ;
          }
          break ;
       }
       objArray[0] = uDouble;
       String str = String.format("%.1f", Arrays.copyOf(objArray, 1));
       a.o(str, "java.lang.String.format\(format, *args\)");
       return str;
    }
    public final Fragment E(){
       return this.h;
    }
    public void O7(a p0,a p1){
       boolean b;
       Double uDouble1;
       Double uDouble2;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "4")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       if (p0.o() == p1.o()) {
          Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, uob, "5");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = p0.r().b().iterator();
             while (true) {
                Double uDouble = null;
                if (obj.hasNext()) {
                   uDouble1 = obj.next();
                   boolean b1 = (uDouble1.e() == p0.o())? true: false;
                   if (!b1) {
                      continue ;
                   }
                }else {
                   uDouble1 = uDouble;
                }
                obj = p1.r().b().iterator();
                while (true) {
                   if (obj.hasNext()) {
                      uDouble2 = obj.next();
                      Object obj1 = (uDouble2.e() == p1.o())? 1: null;
                      if (!obj1) {
                         continue ;
                      }
                   }else {
                      uDouble2 = uDouble;
                   }
                   Double uDouble3 = (uDouble1 != null)? Double.valueOf(uDouble1.j()): uDouble;
                   if (uDouble2 != null) {
                      uDouble = Double.valueOf(uDouble2.j());
                   }
                   b = a.d(uDouble3, uDouble) ^ 1;
                }
             }
          }
          if (b) {
          label_00d0 :
             if (p0.o() == -1) {
                this.f.setText(a1.p(R.string.arg_RES_7f104b26));
             }else {
                this.f.setText(a1.r(R.string.arg_RES_7f104b2a, this.D(p0)));
             }
          }else if(p0.o() != -1 && (this.g).equals(this.f.getText())){
             this.f.setText(a1.r(R.string.arg_RES_7f104b2a, this.D(p0)));
          }
       }else {
          goto label_00d0 ;
       }
       return;
    }
}
