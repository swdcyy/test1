package a4d.m;
import erd.g;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.String;
import java.lang.Object;
import java.util.List;

public final class m implements g	// class@000090
{
    public final EmotionFloatEditorFragment b;
    public final boolean c;
    public final String d;

    public void m(EmotionFloatEditorFragment p0,boolean p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       EmotionFloatEditorFragment.ii(this.b, this.c, this.d, p0);
    }
}
