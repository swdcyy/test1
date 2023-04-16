package h8a.e$b;
import androidx.recyclerview.widget.RecyclerView$r;
import h8a.e;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import xx9.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.widget.TextView;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import mrd.a;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public final class e$b extends RecyclerView$r	// class@0025e6
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       e r;
       String str1;
       CharSequence text;
       e v;
       if (PatchProxy.isSupport(e$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, e$b.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       e$b ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, e.class, "5") && ta.w != null) {
          e z = ta.z;
          if (z == null) {
             a.S("mNasaScreenCleanStatusCombination");
          }
          if (z.c()) {
             z = ta.w;
             RecyclerView$LayoutManager layoutManage = (z != null)? z.getLayoutManager(): objArray;
             if (layoutManage instanceof LinearLayoutManager) {
                objArray = layoutManage;
             }
             if (objArray != null) {
                z = ta.v;
                if (z == null) {
                   a.S("mPositionView");
                }
                if (z.getVisibility()) {
                   z = ta.v;
                   if (z == null) {
                      a.S("mPositionView");
                   }
                   z.setVisibility(0);
                }
                String str = "mPhoto";
                if (!objArray.h()) {
                   z = 1;
                }else {
                   z = objArray.E();
                   e r1 = ta.r;
                   if (r1 == null) {
                      a.S(str);
                   }
                   if (z == (r1.getAtlasList().size() - 1)) {
                      z = ta.r;
                      if (z == null) {
                         a.S(str);
                      }
                      z = z.getAtlasList().size();
                   }else {
                      z = ((objArray.i0() + objArray.c()) / 2) + 1;
                   }
                }
                if (z <= 0) {
                   z = 1;
                }
                if (ta.V8()) {
                   r = ta.r;
                   if (r == null) {
                      a.S(str);
                   }
                   int[] atlasIndices = r.getAtlasIndices();
                   a.m(atlasIndices);
                   int i = z - 1;
                   if (atlasIndices.length > i) {
                      z = ta.r;
                      if (z == null) {
                         a.S(str);
                      }
                      int[] atlasIndices1 = z.getAtlasIndices();
                      a.m(atlasIndices1);
                      atlasIndices1 = atlasIndices1[i] + 1;
                      r = ta.A;
                      if (r == null) {
                         a.S("mNasaLongPhotoIndicator");
                      }
                      r.onNext(Integer.valueOf((atlasIndices1 - 1)));
                      str1 = atlasIndices1+'/'+ta.W8();
                      r = ta.v;
                      if (r == null) {
                         a.S("mPositionView");
                      }
                      text = r.getText();
                      if (text != null && !text.equals(str1)) {
                         v = ta.v;
                         if (v == null) {
                            a.S("mPositionView");
                         }
                         v.setText(str1);
                      }
                   }
                }
                if (z >= ta.W8()) {
                   z = ta.W8();
                }
                r = ta.A;
                if (r == null) {
                   a.S("mNasaLongPhotoIndicator");
                }
                r.onNext(Integer.valueOf((z - 1)));
                str1 = z+'/'+ta.W8();
                r = ta.v;
                if (r == null) {
                   a.S("mPositionView");
                }
                text = r.getText();
                if (text != null && !text.equals(str1)) {
                   v = ta.v;
                   if (v == null) {
                      a.S("mPositionView");
                   }
                   v.setText(str1);
                }
             }
          }
       }
    label_0178 :
       return;
    }
}
