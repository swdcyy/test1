package ff.j;
import ff.g;
import android.view.animation.Animation;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.animation.Transformation;
import java.lang.Float;
import java.lang.Math;

public class j extends Animation implements g	// class@001ffc
{
    public final View b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;

    public void j(View p0,int p1,int p2,int p3,int p4){
       super();
       this.b = p0;
       this.b(p1, p2, p3, p4);
    }
    public void a(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, j.class, "2")) {
          return;
       }
       this.b(p0, p1, p2, p3);
       return;
    }
    public void applyTransformation(float p0,Transformation p1){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, j.class, "1")) {
          return;
       }
       float f = this.c + (this.e * p0);
       float f1 = this.d + (this.f * p0);
       int i = Math.round(f);
       int i1 = Math.round(f1);
       this.b.layout(i, i1, Math.round((f + ((float)this.g + ((float)this.i * p0)))), Math.round((f1 + ((float)this.h + ((float)this.j * p0)))));
       return;
    }
    public final void b(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, j.class, "3")) {
          return;
       }
       this.c = this.b.getX() - this.b.getTranslationX();
       this.d = this.b.getY() - this.b.getTranslationY();
       this.g = this.b.getWidth();
       int height = this.b.getHeight();
       this.h = height;
       this.e = (float)p0 - this.c;
       this.f = (float)p1 - this.d;
       this.i = p2 - this.g;
       this.j = p3 - height;
       return;
    }
    public boolean willChangeBounds(){
       return true;
    }
}
