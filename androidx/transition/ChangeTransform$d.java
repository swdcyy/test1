package androidx.transition.ChangeTransform$d;
import androidx.transition.d;
import android.view.View;
import e3.d;
import androidx.transition.Transition;
import androidx.transition.Transition$f;
import e3.f;
import java.lang.Object;

public class ChangeTransform$d extends d	// class@0009b9
{
    public View a;
    public d b;

    public void ChangeTransform$d(View p0,d p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void b(Transition p0){
       p0.T(this);
       f.b(this.a);
       this.a.setTag(R.id.transition_transform, null);
       this.a.setTag(R.id.parent_matrix, null);
    }
    public void d(Transition p0){
       this.b.setVisibility(0);
    }
    public void e(Transition p0){
       this.b.setVisibility(4);
    }
}
