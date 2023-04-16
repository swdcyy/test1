package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$c;
import ub.a;
import ud5.c;
import ud5.d;
import java.lang.String;
import bd.f;
import android.graphics.drawable.Animatable;
import id5.v;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import java.lang.Throwable;

public final class SlideVerticalAtlasPlayer$b$a$c extends a	// class@0008c5
{
    public final int b;
    public final c c;
    public final d d;

    public void SlideVerticalAtlasPlayer$b$a$c(int p0,c p1,d p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(String p0,f p1,Animatable p2){
       SlideVerticalAtlasPlayer$b$a$c tc;
       if (this.b == null) {
          tc = this.c;
          if (tc != null) {
             tc.b();
          }
       }
       tc = this.d;
       if (tc != null) {
          tc.a(this.b, true);
       }
       Object[] objArray = new Object[0];
       v.C().s("VerticalAtlasPlayer", "加载成功: "+this.b, objArray);
       return;
    }
    public void onFailure(String p0,Throwable p1){
       SlideVerticalAtlasPlayer$b$a$c tc;
       if (this.b == null) {
          tc = this.c;
          if (tc != null) {
             tc.onFailure(p1);
          }
       }
       tc = this.d;
       boolean b = false;
       if (tc != null) {
          tc.a(this.b, b);
       }
       Object[] objArray = new Object[b];
       v.C().s("VerticalAtlasPlayer", "加载失败: "+this.b, objArray);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       this.a(p0, p1, p2);
    }
}
