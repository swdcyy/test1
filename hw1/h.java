package hw1.h;
import java.util.HashMap;
import android.util.SparseIntArray;
import com.kuaishou.live.common.core.component.pk.ScoreTextAnimatorType;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import android.widget.TextView;
import android.animation.ObjectAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.PropertyValuesHolder;
import th0.d;
import android.animation.TimeInterpolator;

public class h	// class@002793
{
    public ObjectAnimator a;
    public ObjectAnimator b;
    public static HashMap c;
    public static SparseIntArray d;

    static {
       h.c = new HashMap();
       h.d = new SparseIntArray();
       ScoreTextAnimatorType sMALL = ScoreTextAnimatorType.SMALL;
       h.c.put(Integer.valueOf(sMALL.getScoreTextAnimatorType()), Float.valueOf(0x3fa66666));
       ScoreTextAnimatorType lARGE = ScoreTextAnimatorType.LARGE;
       h.c.put(Integer.valueOf(lARGE.getScoreTextAnimatorType()), Float.valueOf(0x3fd9999a));
       h.d.put(sMALL.getScoreTextAnimatorType(), 400);
       int scoreTextAni = lARGE.getScoreTextAnimatorType();
       h.d.put(scoreTextAni, 500);
    }
    public void h(){
       super();
    }
    public final ObjectAnimator a(TextView p0,ScoreTextAnimatorType p1){
       Float obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Float.valueOf(0x3fa66666);
       if (h.c.get(Integer.valueOf(p1.getScoreTextAnimatorType())) != null) {
          obj = h.c.get(Integer.valueOf(p1.getScoreTextAnimatorType()));
       }
       float[] uofloatArray = new float[]{0x3f800000,obj.floatValue(),0x3f800000};
       float[] uofloatArray1 = new float[]{0x3f800000,obj.floatValue(),0x3f800000};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", uofloatArray),PropertyValuesHolder.ofFloat("scaleY", uofloatArray1)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       objectAnimat.setDuration((long)h.d.get(p1.getScoreTextAnimatorType())).setInterpolator(new d());
       return objectAnimat;
    }
}
