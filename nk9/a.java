package nk9.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import java.util.List;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.QComment;

public class a	// class@003192
{
    public QPhoto a;
    public String b;
    public EmotionInfo c;
    public QMedia d;
    public List e;
    public QComment f;
    public boolean g;
    public HashSet h;
    public boolean i;
    public int j;

    public void a(QPhoto p0,String p1,EmotionInfo p2,QMedia p3,List p4,HashSet p5,boolean p6,int p7){
       super();
       this.h = new HashSet();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
    }
    public boolean a(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null) {
          objArray = obj.trim();
       }
       boolean b = (TextUtils.x(objArray) || (TextUtils.x((this.b).trim()) && (this.c != null || this.d != null)))? true: false;
       return b;
    }
    public void b(QComment p0){
       this.f = p0;
    }
}
