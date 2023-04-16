package ica.c;
import java.lang.Object;
import com.kuaishou.edit.draft.FineTuningParam;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import ica.b;
import java.lang.Enum;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;

public final class c	// class@0027e0
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final float a(FineTuningParam p0,EditorFineTuningType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       a.p(p0, "fineTuningParam");
       a.p(p1, "editorFineTuningType");
       float f = 0;
       switch (b.a[p1.ordinal()]){
           case 1:
             f = p0.getBrightness();
             break;
           case 2:
             f = p0.getContrast();
             break;
           case 3:
             f = p0.getSaturation();
             break;
           case 4:
             f = p0.getSharpen();
             break;
           case 5:
             f = p0.getColorTemperature();
             break;
           case 6:
             f = p0.getClarity();
             break;
           default:
             i1.c(new RuntimeException("getDraftFineTuningParamFromType"));
       }
       return f;
    }
}
