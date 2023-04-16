package l1.a;
import java.lang.Object;
import android.content.Context;
import l1.a$a;
import android.app.ActivityOptions;
import android.view.View;
import android.app.Activity;
import z1.e;
import android.util.Pair;
import android.os.Bundle;

public class a	// class@0024eb
{

    public void a(){
       super();
    }
    public static a a(Context p0,int p1,int p2){
       return new a$a(ActivityOptions.makeCustomAnimation(p0, p1, p2));
    }
    public static a b(View p0,int p1,int p2,int p3,int p4){
       return new a$a(ActivityOptions.makeScaleUpAnimation(p0, p1, p2, p3, p4));
    }
    public static a c(Activity p0,e[] p1){
       int i = 0;
       if (p1 != null) {
          i = new Pair[p1.length];
          for (int i1 = 0; i1 < p1.length; i1 = i1 + 1) {
             i[i1] = Pair.create(p1[i1].a, p1[i1].b);
          }
       }
       return new a$a(ActivityOptions.makeSceneTransitionAnimation(p0, i));
    }
    public Bundle d(){
       return null;
    }
}
