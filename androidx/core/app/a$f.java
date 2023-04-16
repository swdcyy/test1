package androidx.core.app.a$f;
import android.app.SharedElementCallback;
import androidx.core.app.g;
import android.view.View;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import java.util.Objects;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import androidx.core.app.a$f$a;
import androidx.core.app.g$a;

public class a$f extends SharedElementCallback	// class@0006fa
{
    public final g a;

    public void a$f(g p0){
       super();
       this.a = p0;
    }
    public Parcelable onCaptureSharedElementSnapshot(View p0,Matrix p1,RectF p2){
       return this.a.b(p0, p1, p2);
    }
    public View onCreateSnapshotView(Context p0,Parcelable p1){
       return this.a.c(p0, p1);
    }
    public void onMapSharedElements(List p0,Map p1){
       Objects.requireNonNull(this.a);
    }
    public void onRejectSharedElements(List p0){
       Objects.requireNonNull(this.a);
    }
    public void onSharedElementEnd(List p0,List p1,List p2){
       Objects.requireNonNull(this.a);
    }
    public void onSharedElementStart(List p0,List p1,List p2){
       Objects.requireNonNull(this.a);
    }
    public void onSharedElementsArrived(List p0,List p1,SharedElementCallback$OnSharedElementsReadyListener p2){
       this.a.d(p0, p1, new a$f$a(this, p2));
    }
}
